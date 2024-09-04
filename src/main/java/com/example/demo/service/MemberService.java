package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Member;
import com.example.demo.mybatis.MemberMapper;

@Service
public class MemberService {
	@Autowired
	private MemberMapper mapper;
	public int insert(Member member) {
		return mapper.insert(member);
	}
	public int count() {
		return mapper.count();
	}
	public List<Member> list(HashMap<String,Object> map){
		return mapper.list(map);
	}
	public int delete(String id) {
		return mapper.delete(id);
	}
	public Member select(String id) {
		return mapper.select(id);
	}
	
	public int update(Member member) {
		return mapper.update(member);
	}
	
}






