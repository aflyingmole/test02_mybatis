package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@SpringBootTest
public class MemberServiceTest {
	
	@Autowired
	private MemberService service;
	
	@Test
	void insert() {
		for(int i=0;i<10;i++) {
		  int n=service.insert(new Member("aaa"+i,"1234"+i,"aaaa@", 10, null));
		}
	//	assertThat(n).isEqualTo(1);
		//System.out.println("회원등록==>" + n);
		
	}
	
	@Test
	void list() {
		HashMap<String,Object> map=new HashMap<>();
		map.put("startRow",1);
		map.put("endRow", 5);
		List<Member> list=service.list(map);
		list.forEach(m->{
			System.out.println(m);
		});
	}
	@Test
	void count() {
		int n=service.count();
		assertThat(n).isEqualTo(2);
		//System.out.println("회원등록==>" + n);
		
	}
}








