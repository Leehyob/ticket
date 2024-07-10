package com.ticket.service;

import com.ticket.dto.MemberFormDto;
import com.ticket.entity.Member;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Log4j2
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Member createMember() {
        MemberFormDto memberFormDto = new MemberFormDto();

        memberFormDto.setEmail("dlgyqls11@nate.com");
        memberFormDto.setPassword("1234");
        memberFormDto.setAge(20);
        memberFormDto.setPhone("01025521653");
        memberFormDto.setName("이효빈");
        memberFormDto.setNickname("몽몽");
        memberFormDto.setAddress("경기도 수원시 팔달구");


        return Member.createMember(memberFormDto,passwordEncoder);
    }

    @Test
    @DisplayName("회원가입 테스트")
    public void saveMemberTest(){
        Member member = createMember();

        log.info(" member : " + member);

        Member savedMember = memberService.saveMember(member);

        log.info(savedMember);
    }

}