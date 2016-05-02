package com.springmvc.study.lottery.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.study.lottery.model.PrizeSingle;
import com.springmvc.study.lottery.util.LotteryUtil;

@Controller
@RequestMapping("lottery")
public class LotteryController {

	private final static Logger logger = LoggerFactory.getLogger(LotteryController.class);

	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String lotteryInit() throws Exception {
		return "lottery/init";
	}

	@RequestMapping(value = "lottery", method = RequestMethod.POST)
	@ResponseBody
	public int lotteryDo() throws Exception {

		PrizeSingle prizeSingle = PrizeSingle.getInstance();
		
		List<Double> weightList = prizeSingle.getWeightList();

		int index = LotteryUtil.lottery(weightList);
		if (index != -1) {
			LotteryUtil.changPrizeListAndWeight(prizeSingle,index);
		}

		logger.debug("中奖物品索引：" + index);

		return index + 1;
	}
}
