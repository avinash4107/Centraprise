package com.centraprise.hrmodule.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/login")
	public String showLogin(Model model, HttpServletRequest request) {
		String errorStatus = request.getParameter("error");
		if ("fail".equals(errorStatus)) {
			model.addAttribute("error", "User name and password are invalid");
		}
		return "login";
	}
}
