package com.ticket.service;

import com.ticket.dto.MemberListDto;
import com.ticket.entity.Member;
import com.ticket.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public Member saveMember(Member member) {
        validateDuplicateMember(member);
        return memberRepository.save(member);
    }

    public void validateDuplicateMember(Member member) {
        Member findMember = memberRepository.findByEmail(member.getEmail());
        if(findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(email);

        if(member == null) {
            throw new UsernameNotFoundException(email);
        }

        return User.builder()
                .username(member.getEmail())
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
    }

    public Page<MemberListDto> getMemberList(String name, Pageable pageable) {

        log.info("진입2");

        List<Member> member =memberRepository.findAllDesc(pageable);

        log.info("member : " + member);

        Long totalCount = memberRepository.count();

        List<MemberListDto> memberListDtoList = new ArrayList<>();

        log.info("memberListDto : " + memberListDtoList);

        for(Member m : member) {
            MemberListDto memberListDto = new MemberListDto(m);
            memberListDtoList.add(memberListDto);
        }

        log.info("memberListDto : " + memberListDtoList);

        return new PageImpl<>(memberListDtoList, pageable, totalCount);
    }
}
