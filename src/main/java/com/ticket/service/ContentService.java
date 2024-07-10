package com.ticket.service;

import com.ticket.dto.ContentDtlDto;
import com.ticket.dto.ContentDto;
import com.ticket.dto.TimeTableDto;
import com.ticket.entity.*;
import com.ticket.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class ContentService {

    private final ContentRepository contentRepository;
    private final TheaterRepository theaterRepository;
    private final ActorRepository actorRepository;
    private final ContentImgRepository contentImgRepository;
    private final TimeTableRepository timeTableRepository;
    private final SeatRepository seatRepository;
    private final SeatByDateRepository seatByDateRepository;

    public List<ContentDto> getContentByGenre(String genre) {

        List<Content> contents = contentRepository.findByGenre(genre);

        List<ContentDto> contentDtos = new ArrayList<ContentDto>();
        for(Content content : contents) {
            if(content.getGenre().equals(genre)) {


                ContentDto contentDto = new ContentDto();
                contentDto.setContentName(content.getContentName());
                contentDto.setPrice(content.getPrice());
                contentDto.setGenre(content.getGenre());
                contentDto.setPosterUrl(content.getPosterUrl());
                contentDto.setDate(content.getDate());
                contentDto.setContentId(content.getId());


                if(content.getTheaterCode()!=null){
                    Theater theater = theaterRepository.findById(content.getTheaterCode());
                    contentDto.setTheater(theater.getName());
                }
                log.info("contentDto : " + contentDto);

                contentDtos.add(contentDto);
            }
        }
        log.info("contentDtos : " + contentDtos);
        return contentDtos;
    }

    public ContentDtlDto getContentDetail(Long contentId) {

        ContentDtlDto contentDtlDto = new ContentDtlDto();
        Content content = contentRepository.findById(contentId).orElseThrow(EntityNotFoundException::new);
        List<Actor> actors = actorRepository.findByContentId(contentId);
        List<ContentImg> contentImgs = contentImgRepository.findByContentId(contentId);

        Theater theater = theaterRepository.findById(content.getTheaterCode());

        contentDtlDto.setContentId(content.getId());
        contentDtlDto.setContentName(content.getContentName());
        contentDtlDto.setRuntime(content.getRuntime());
        contentDtlDto.setPrice(content.getPrice());
        contentDtlDto.setGenre(content.getGenre());
        contentDtlDto.setPosterUrl(content.getPosterUrl());
        contentDtlDto.setDate(content.getDate());
        contentDtlDto.setTheaterName(theater.getName());
        contentDtlDto.setAgeLimit(content.getAgeLimit());

        contentDtlDto.setActorList(actors);
        contentDtlDto.setContentImgList(contentImgs);

        log.info("contentDtlDto service: " + contentDtlDto);

        return contentDtlDto;
    }

    public List<TimeTableDto> getTimeTable(String date) throws ParseException {

        List<TimeTableDto> timeTableDtos = new ArrayList<>();
        List<TimeTable> timeTable = timeTableRepository.findByDate(date);

        for(TimeTable timeTable1 : timeTable) {

            TimeTableDto timeTableDto = new TimeTableDto();

            log.info("timetable : " + timeTable);

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            String formatTime = sdf.format(timeTable1.getTime());

            log.info("formatTime : " + formatTime);

            log.info("timeTableDto : " + timeTable);

            timeTableDto.setDate(timeTable1.getDate());
            timeTableDto.setTime(formatTime);
            timeTableDto.setActorName(timeTable1.getActorName());

            timeTableDtos.add(timeTableDto);
        }

        return timeTableDtos;
    }

    public List<Seat> getSeats(String date){

        log.info(date);

        List<SeatByDate> getSeatsCode = seatByDateRepository.findByDate(date);

        log.info(getSeatsCode);

        List<Seat> getSeats = new ArrayList<>();

        for(SeatByDate seatByDate : getSeatsCode) {
            Long code = seatByDate.getSeat().getId();
            Seat seat = seatRepository.findById(code).orElse(null);
            getSeats.add(seat);
        }

        return getSeats;
    }

    public String getSeatsImage(Long contentCode){

        ContentDtlDto contentDtlDto = getContentDetail(contentCode);

        log.info("contentDtlDto : " + contentDtlDto);

        String seatsImage = theaterRepository.findByName(contentDtlDto.getTheaterName()).getTheater_seat();

        return seatsImage;
    }





}
