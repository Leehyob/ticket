package com.ticket.controller;

import com.ticket.dto.ContentDtlDto;
import com.ticket.dto.ContentDto;
import com.ticket.dto.TimeTableDto;
import com.ticket.entity.Actor;
import com.ticket.entity.ContentImg;
import com.ticket.entity.Seat;
import com.ticket.entity.Theater;
import com.ticket.repository.SeatByDateRepository;
import com.ticket.repository.SeatRepository;
import com.ticket.repository.TheaterRepository;
import com.ticket.service.ContentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/contents")
public class ContentController {

    private final ContentService contentService;
    private final TheaterRepository theaterRepository;
    private final SeatRepository seatRepository;

    @GetMapping(value = "/genre/{genre}")
    public String getContent(@PathVariable("genre") String genre, Model model) {

        List<ContentDto> contentDto = contentService.getContentByGenre(genre);

        int startIndex = 10;
        int endIndex = 19;

        List<ContentDto> paginatedContents = contentDto.stream()
                .skip(startIndex)
                .limit(endIndex - startIndex + 1)
                .collect(Collectors.toList());

        model.addAttribute("banner",paginatedContents);
        model.addAttribute("contents", contentDto);
        model.addAttribute("genre",genre+" ");
        return "/content/contentMain";
    }

    @GetMapping("/detail/{contentId}")
    public String contentDetail(@PathVariable("contentId") Long contentId, Model model) {

        log.info("contentId : " + contentId);

        ContentDtlDto contentDtlDto = contentService.getContentDetail(contentId);

        log.info("cotnentDtlDto : " + contentDtlDto);

        model.addAttribute("detail", contentDtlDto);

        log.info("contentDtlDto : " + contentDtlDto.getContentId());

        return "/content/contentDetail";
    }

    @GetMapping("/calendar")
    public @ResponseBody ResponseEntity<List<TimeTableDto>> getContentCalendar(
            @RequestParam("date") String date, Model model
            ) throws ParseException {

        log.info(date);

        List<TimeTableDto> calendar = contentService.getTimeTable(date);

        model.addAttribute("calendar",calendar);

        log.info("dto : " + calendar);

        return new ResponseEntity<List<TimeTableDto>>(calendar, HttpStatus.OK);
    }

    @GetMapping("/booking")
    public String contentBooking(String date, Long contentCode,Model model) {

        List<Seat> seats = contentService.getSeats(date);

        log.info("seat : " + seats);

        String seat = contentService.getSeatsImage(contentCode);

        model.addAttribute("seats",seats);
        model.addAttribute("seatImage",seat);

        return "/content/contentBooking";
    }



}
