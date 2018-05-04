package com.study.toto.service;

import com.study.toto.dao.MemberMapper;
import com.study.toto.model.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    public Member findMember(long no) {
        return memberMapper.findById2(no);
    }
}
