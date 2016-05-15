package com.springmvc.study.jsstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("jsstudy")
public class JSController {
	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String ehcacheInit() throws Exception {
		return "jsstudy/init";
	}
}
