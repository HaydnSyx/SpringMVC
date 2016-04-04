package com.springmvc.study.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.study.model.LoginModel;
import com.springmvc.study.model.RegisterModel;

@RestController
@RequestMapping(value = "test")
public class TestController {

	// login测试页面初始化
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView loginInit(LoginModel loginModel) {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("loginModel", loginModel);
		return mv;
	}

	// login测试页面提交
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Object loginSumbit(@Valid @ModelAttribute LoginModel loginModel, BindingResult result) {
		if (result.hasErrors()) {
			return loginInit(loginModel);
		}
		if (loginModel.getName() == null || "".equals(loginModel.getName())) {
			return "redict:test/register/init";
		}
		return "success";
	}

	// register测试页面初始化
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView registerInit(@ModelAttribute RegisterModel registerModel) {
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("registerModel", registerModel);
		return mv;
	}

	// json测试页面初始化
	@RequestMapping(value = "json/init", method = RequestMethod.GET)
	public ModelAndView jsonInit() {
		ModelAndView mv = new ModelAndView("json");
		return mv;
	}

	// json测试页面学习
	@RequestMapping(value = "json/study", method = RequestMethod.POST)
	@ResponseBody
	public Object jsonStudy() throws Exception {
		// 新建model
		RegisterModel registerModel = new RegisterModel();
		// 姓名
		registerModel.setName("小明");
		// 年龄
		registerModel.setAge(24);
		// 出生年月
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		registerModel.setBirthday(sdf.parse("1992-01-01"));
		// 资产
		registerModel.setMoney(1234567.89);
		// 已婚
		registerModel.setMaritalStatus(true);
		// 上过的学校
		List<String> schoolList = new ArrayList<String>();
		schoolList.add("小学");
		schoolList.add("中学");
		schoolList.add("大学");
		registerModel.setSchoolList(schoolList);

		return registerModel;
	}
}
