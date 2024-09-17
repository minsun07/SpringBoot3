package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                             //컨트롤러 선언
public class FirstController {

    @GetMapping("/hi")                  //URL 요청 접수
    public String niceToMeetYou(Model model){ // model객체 받아 오기
        model.addAttribute("username", "minsun");
        return "greetings";             //greetings.mustache 파일로 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "min");
        return "goodbye";
    }
}