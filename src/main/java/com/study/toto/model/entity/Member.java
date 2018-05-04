package com.study.toto.model.entity;


import org.apache.ibatis.type.Alias;

// TODO 2 모델 정의

@Alias("Member")
public class Member {

    private Long no;
    private String name;

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

