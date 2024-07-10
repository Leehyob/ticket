package com.ticket.service;

import com.ticket.entity.Actor;
import com.ticket.entity.ContentImg;
import com.ticket.entity.Theater;
import com.ticket.repository.ActorRepository;
import com.ticket.repository.ContentImgRepository;
import com.ticket.repository.ContentRepository;
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
public class CrollingService3 {

    private final ContentRepository contentRepository;

    private final ContentImgRepository contentImgRepository;

    private static String ticket_URL = "https://tickets.interpark.com/goods/24008147";

    public List<ContentImg> getContentsDatas() throws IOException {
        log.info("크롤링 시작");
        Document document = Jsoup.connect(ticket_URL).get();
        String html = Jsoup.connect(ticket_URL).get().text();
        log.info("로드 : " + html);
        log.info("Document 로드 성공");

        // 페이지 구조 확인 후 수정된 선택자 사용
        Elements contentImgs = document.select("div.contents");

        log.info("콘텐츠 선택 성공: " + contentImgs.size() + " 개의 요소 발견");


        List<ContentImg> contentImgList = new ArrayList<>();

        for (Element image : contentImgs) {
            String contentImg = image.select("img").text();

            log.info("콘텐츠 발견 - : " +  contentImg );

            if (!contentImg.isEmpty()) {
                /*CrollingDto musical = CrollingDto.builder()
                        .title(title)
                        .place(place)
                        .date(date)
                        .posterUrl(posterUrl)
                        .build();*/
                int i = 0;

                ContentImg image1 = new ContentImg();
                image1.setContentImgUrl(contentImg);
                image1.setContent(contentRepository.findById(260));
                image1.setContentImgName("image"+ (i+1));

                contentImgRepository.save(image1);
                contentImgList.add(image1);
                log.info("DTO 생성 - 제목: " + image1.getContentImgUrl());

                log.info("뮤지컬 추가: " + image1);
            } else {
                log.warn("필드가 비어 있는 콘텐츠가 있습니다.");
            }

            log.info(image);
        }
        log.info("contentList : " + contentImgList);
        return contentImgList;
    }
}
