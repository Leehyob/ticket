package com.ticket.controller;

import com.ticket.dto.ContentDto;
import com.ticket.dto.CrollingDto;
import com.ticket.entity.Content;
import com.ticket.entity.Main;
import com.ticket.service.CrollingService;
import com.ticket.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final CrollingService crollingService;
    private final MainService mainService;

    @GetMapping("/")
    public String main(Model model) throws Exception{

        String slide = "slide";
        String banner = "banner";

        List<Main> slideList = mainService.getList(slide);
        List<Main> bannerList = mainService.getList(banner);

        model.addAttribute("slide", slideList);
        model.addAttribute("banner", bannerList);

        return "/main";
    }

    /*@GetMapping("/test")
    public String test(Model model) throws Exception{
        return "/test";
    }*/
}
