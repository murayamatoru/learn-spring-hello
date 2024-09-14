package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("hello")
	public ModelAndView hello(ModelAndView mav) {
		mav.setViewName("HelloWorld");
		return mav;
	}
}
