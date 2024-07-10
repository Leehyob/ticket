package com.ticket.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class CrollingService3Test {

    @Autowired
    private CrollingService3 crollingService3;

    @Test
    public void test() throws IOException {
        crollingService3.getContentsDatas();
    }

}