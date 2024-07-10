package com.ticket.dto;

import com.ticket.entity.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.format.DateTimeFormatter;

@Getter
@Setter
@ToString
public class MemberListDto {

    private Long memberId;
    private String email;
    private String name;
    private String nickname;

    public MemberListDto(Member member) {
        this.memberId = member.getId();
        this.email = member.getEmail();
        this.name = member.getName();
        this.nickname = member.getNickname();
    }
}
