package com.study.toto.controller;

import com.study.toto.model.entity.Member;
import com.study.toto.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @Autowired
    MemberService memberService;

    @GetMapping("/")
    public String hello() {
        return "hi";
    }

    @GetMapping("/members/{no}")
    public Member findMember(@PathVariable("no") Long no) {
        return memberService.findMember(no);
    }
}
