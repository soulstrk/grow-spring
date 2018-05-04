package com.study.toto.dao;

import com.study.toto.model.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM member WHERE no = #{no}")
    Member findById(long no);

    Member findById2(long no);
}
