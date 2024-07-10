package com.ticket.service;

import com.ticket.dto.ContentDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class ContentServiceTest {

    @Autowired
    private ContentService contentService;

    @Test
    public void test() {

        String genre = "뮤지컬";

        List<ContentDto> dto = contentService.getContentByGenre(genre);

        for(ContentDto dto1 : dto) {
            log.info(dto1.toString());
        }

    }

}