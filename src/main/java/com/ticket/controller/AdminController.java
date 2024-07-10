package com.ticket.controller;

import com.ticket.dto.MemberListDto;
import com.ticket.repository.ContentRepository;
import com.ticket.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/admin")
@Log4j2
public class AdminController {

    private final ContentRepository contentRepository;
    private final MemberService memberService;

    @GetMapping(value = "/page")
    public String adminPage(Model model) {
        return "admin/setting";
    }

    @GetMapping(value = {"/members/{page}","/members"})
    public String getMemberList(@PathVariable("page") Optional<Integer> page,
                                Principal principal, Model model) {

        log.info("진입");

        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 10);

        log.info("pageable : " + pageable);

        Page<MemberListDto> MemberList = memberService.getMemberList(principal.getName(), pageable);

        log.info("MemberList : " + MemberList);

        model.addAttribute("memberList", MemberList);
        model.addAttribute("page",pageable.getPageNumber());
        model.addAttribute("maxPage",7);
        return "admin/memberList";
    }
}
