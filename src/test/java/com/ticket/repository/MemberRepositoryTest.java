package com.ticket.repository;

import com.ticket.constant.Role;
import com.ticket.entity.Member;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void createUser(){


        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        for(int i=4; i<=30; i++){
            Member member = new Member();

            member.setName("test" + i);
            member.setEmail("test" + i + "@gmail.com");
            member.setPassword(passwordEncoder.encode("12341234"));
            member.setAge(10+i);
            member.setPhone("010-0000-1111");
            member.setAddress("수원시 영통구");
            member.setRole(Role.USER);

            log.info(member);
            memberRepository.save(member);
        }
    }

}