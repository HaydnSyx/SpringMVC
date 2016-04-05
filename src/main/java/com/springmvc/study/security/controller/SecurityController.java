package com.springmvc.study.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("security")
public class SecurityController {

	@RequestMapping(value = "init", method = RequestMethod.GET)
	public ModelAndView securityInit() {
		ModelAndView mv = new ModelAndView("security/init");
		return mv;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView securityLogin(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView("security/login");
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}

		return model;
	}
}
