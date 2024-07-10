package com.ticket.service;

import com.ticket.dto.ContentDto;
import com.ticket.dto.CrollingDto;
import com.ticket.entity.Content;
import com.ticket.entity.Theater;
import com.ticket.repository.ContentRepository;
import com.ticket.repository.TheaterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class CrollingService {

    private final ContentRepository contentRepository;

    private final TheaterRepository theaterRepository;

    private static String ticket_URL = "https://tickets.interpark.com/contents/genre/musical";

    public List<Content> getContentsDatas() throws IOException {
        log.info("크롤링 시작");
        Document document = Jsoup.connect(ticket_URL).get();

        log.info("Document 로드 성공");

        // 페이지 구조 확인 후 수정된 선택자 사용
        Elements contents = document.select("a.TicketItem_ticketItem__H51Vs");

        log.info("콘텐츠 선택 성공: " + contents.size() + " 개의 요소 발견");


        List<Content> contentList = new ArrayList<Content>();

        for (Element content : contents) {
            String title = content.select("li.TicketItem_goodsName__Ju76j").text();
            String place = content.select("li.TicketItem_placeName__ls_9C").text();
           String date = content.select("li.TicketItem_playDate__5ePr2").text();
            String posterUrl = content.select("img.TicketItem_image__U6xq6").attr("abs:src");

            log.info("콘텐츠 발견 - 제목: " + title + ", 장소: " + place + ", 날짜: " + date + ", 이미지 URL: " + posterUrl);

            if (!title.isEmpty() && !place.isEmpty() && !date.isEmpty() && !posterUrl.isEmpty()) {
                /*CrollingDto musical = CrollingDto.builder()
                        .title(title)
                        .place(place)
                        .date(date)
                        .posterUrl(posterUrl)
                        .build();*/

                Content musical = new Content();
                musical.setContentName(title);
                musical.setPosterUrl(posterUrl);
                musical.setDate(date);
                musical.setPrice(100000);
                musical.setGenre("뮤지컬");

                Theater theater = new Theater();

                if(!theaterRepository.existsByName(place)){
                    theater.setName(place);
                    theaterRepository.save(theater);
                    musical.setTheaterCode(theater.getId());
                } else if (theaterRepository.existsByName(place)) {
                    theater = theaterRepository.findByName(place);
                    musical.setTheaterCode(theater.getId());
                }

                contentRepository.save(musical);

                log.info("DTO 생성 - 제목: " + musical.getContentName());

                log.info("뮤지컬 추가: " + musical);
            } else {
                log.warn("필드가 비어 있는 콘텐츠가 있습니다.");
            }

            log.info(content);
        }
        log.info("contentList : " + contentList);
        return contentList;
    }
}
