package com.japcdev.coursesapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("toDelete")
	public String delete(HttpServletRequest request) {
		request.setAttribute("url", "delete");
		return "search";
	}
	
	@GetMapping(value="toRecover")
	public String recover(HttpServletRequest request) {
		request.setAttribute("url", "recover");
		return "search";
	}
	@GetMapping(value="toUpdate")
	public String update(HttpServletRequest request) {
		request.setAttribute("url", "recoverUpdate");
		return "search";
	}
}
