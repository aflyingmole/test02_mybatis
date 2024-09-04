package com.example.demo.mybatis;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Member;

@Mapper
public interface MemberMapper {
	int insert(Member member);
	List<Member> list(HashMap<String,Object> map);
	int count();
	int update(Member dto);
	int delete(String id);
	Member select(String id);
}
