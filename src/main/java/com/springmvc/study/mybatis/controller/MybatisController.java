package com.springmvc.study.mybatis.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.springmvc.study.common.BaseServiceImpl;
import com.springmvc.study.mybatis.model.UserModel;
import com.springmvc.study.util.CommonUtil;

@Controller
@RequestMapping("mybatis")
public class MybatisController {

	@Autowired
	private BaseServiceImpl mybatisInitService;

	// json测试页面初始化
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "init", method = RequestMethod.GET)
	public ModelAndView mybatisInit(String page) throws Exception {
		ModelAndView mv = new ModelAndView("mybatis/init");
		PageInfo pageInfo = (PageInfo) mybatisInitService.handleWithoutTransaction();
		mv.addObject("userList", pageInfo.getList());
		mv.addObject("total", pageInfo.getTotal());
		return mv;
	}

	@Autowired
	private BaseServiceImpl mybatisDetailService;

	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView mybatisEdit(String id) throws Exception {
		ModelAndView mv = new ModelAndView("mybatis/detail");

		UserModel userModel = new UserModel();

		if (!CommonUtil.isEmpty(id)) {
			userModel = (UserModel) mybatisDetailService.handleWithoutTransaction(id);
		}

		Map<String, String> sexMap = new HashMap<String, String>();
		sexMap.put("1", "男");
		sexMap.put("2", "女");
		userModel.setSexMap(sexMap);
		mv.addObject("userModel", userModel);

		return mv;
	}

	@Autowired
	private BaseServiceImpl mybatisSaveService;

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String mybatisSave(@ModelAttribute UserModel userModel) throws Exception {

		mybatisSaveService.handleWithTransaction(userModel);

		return "redirect:/mybatis/init";
	}

	@Autowired
	private BaseServiceImpl mybatisDeleteService;

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	@ResponseBody
	public void mybatisDel(@PathVariable String id) throws Exception {
		mybatisDeleteService.handleWithTransaction(id);
	}
}
