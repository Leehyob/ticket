package com.ticket.service;

import com.ticket.entity.Actor;
import com.ticket.entity.Content;
import com.ticket.entity.Theater;
import com.ticket.repository.ActorRepository;
import com.ticket.repository.ContentImgRepository;
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
public class CrollingService2 {

    private final ContentRepository contentRepository;

    private final ActorRepository actorRepository;

    private static String ticket_URL = "https://tickets.interpark.com/goods/24006741";

    public List<Actor> getContentsDatas() throws IOException {
        log.info("크롤링 시작");
        Document document = Jsoup.connect(ticket_URL).get();

        log.info("Document 로드 성공");

        // 페이지 구조 확인 후 수정된 선택자 사용
        Elements actors = document.select("div.productWrapper .detail .casting");

        log.info("콘텐츠 선택 성공: " + actors.size() + " 개의 요소 발견");


        List<Actor> actorList = new ArrayList<>();

        for (Element actor : actors) {
            String actorName = actor.select("div.productWrapper .detail .casting .castingActor").text();
            String actImgUrl = actor.select("img.productWrapper .detail .casting .castingImage").text();
           String nameOfRole = actor.select("div.productWrapper .detail .casting .castingName").text();

            log.info("콘텐츠 발견 - : " + actorName +  actImgUrl +  nameOfRole );

            if (!actorName.isEmpty() && !actImgUrl.isEmpty() && !nameOfRole.isEmpty()) {
                /*CrollingDto musical = CrollingDto.builder()
                        .title(title)
                        .place(place)
                        .date(date)
                        .posterUrl(posterUrl)
                        .build();*/

                Actor actor1 = new Actor();
                actor1.setActorName(actorName);
                actor1.setActImgUrl(actImgUrl);
                actor1.setNameOfRole(nameOfRole);
                actor1.setContent(contentRepository.findById(260));

                Theater theater = new Theater();


                actorRepository.save(actor1);

                log.info("DTO 생성 - 제목: " + actor1.getActorName());

                log.info("뮤지컬 추가: " + actor1);
            } else {
                log.warn("필드가 비어 있는 콘텐츠가 있습니다.");
            }

            log.info(actor);
        }
        log.info("contentList : " + actorList);
        return actorList;
    }
}
