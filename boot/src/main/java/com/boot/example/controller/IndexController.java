package com.boot.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String index(Model model) throws Exception {
		model.addAttribute("serverTime", System.currentTimeMillis());
		model.addAttribute("mode", System.getProperty("mode"));
		return "index";
	}
}
