package com.springmvc.study.ehcache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ehcache")
public class EhcacheController {

	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String ehcacheInit() throws Exception {

		return "ehcache/init";
	}
}
