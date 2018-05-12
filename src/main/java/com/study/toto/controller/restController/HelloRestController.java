package com.study.toto.controller.restController;

import com.study.toto.model.entity.Member;
import com.study.toto.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @Autowired
    MemberService memberService;
    
    @GetMapping("/healthCheck")
    public String hello() {
        return "I'm alive!";
    }

    @GetMapping("/members/{no}")
    public Member findMember(@PathVariable("no") Long no) {
        return memberService.findMember(no);
    }
}
