package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/login")
	public String login(String name) {
		System.out.println("====================");
		System.out.println("name: "+name);
		return "/index.html";
	}
}
