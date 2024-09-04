package com.example.demo.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {
	private String id;
	private String pwd;
	private String email;
	private int age;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date regdate;
}









