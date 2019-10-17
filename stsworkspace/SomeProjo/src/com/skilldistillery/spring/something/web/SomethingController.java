package com.skilldistillery.spring.something.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SomethingController {

	@RequestMapping("something.do")
	public ModelAndView processData(@RequestParam("data") String s) {
		String allCaps = s.toUpperCase();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("form.jsp");
		mv.addObject("result", allCaps);
		return mv;
	}
}
