package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@Controller
public class UpdateController {
	@Autowired private MemberService service;
	
	@GetMapping("/member/update")
	public String updateForm(@RequestParam("id") String id,Model model) {
		Member member= service.select(id);
		model.addAttribute("member", member);
		return "member/update";
	}
	@PostMapping("/member/update")
	public String update(Member member,Model model ) {
		try {
			service.update(member);
			model.addAttribute("result","회원수정성공!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			model.addAttribute("result","회원수정실패");
		}
		return "member/result";
	}
}











