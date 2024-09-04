package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.MemberService;

@Controller
public class DeleteController {
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/delete")
	public String delete(@RequestParam("id") String id) {
		service.delete(id);
		return "redirect:/member/list";
	}
}



