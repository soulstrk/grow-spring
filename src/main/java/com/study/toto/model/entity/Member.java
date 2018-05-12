package com.study.toto.model.entity;


import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Member")
public class Member {

    private Long no;
    private String name;
}

