package com.skilldistillery.videostorerest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

	@GetMapping(path = "/")
	public String home() {
		return "index.html";

	}

}
