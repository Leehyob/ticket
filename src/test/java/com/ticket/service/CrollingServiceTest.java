package com.ticket.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
@Log4j2
class CrollingServiceTest {

    @Autowired
    private CrollingService crollingService;

    @Test
    public void test() throws IOException {
        crollingService.getContentsDatas();
    }
}