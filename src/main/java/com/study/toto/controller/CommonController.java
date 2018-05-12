package com.study.toto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/doyoung")
    public String getIndex() {
        return "doyoung";
    }

    @GetMapping("/main")
    public String getMain() {
        return "main";
    }
}
