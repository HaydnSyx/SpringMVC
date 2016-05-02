package com.springmvc.study.lottery.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.study.lottery.model.ActivityPrize;
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

		List<ActivityPrize> activityPrizeList = new ArrayList<ActivityPrize>();
		activityPrizeList.add(new ActivityPrize(1, "1年超级会员", "恭喜您获得了1年超级会员", 5d, 5));
		activityPrizeList.add(new ActivityPrize(2, "iphone6 plus", "恭喜您获得了iphone6 plus", 0d, 1));
		activityPrizeList.add(new ActivityPrize(3, "下载宝", "恭喜您获得了下载宝", 5000d, 5000));
		activityPrizeList.add(new ActivityPrize(4, "10元红包", "恭喜您获得了10元红包", 1000000d, 100000));
		activityPrizeList.add(new ActivityPrize(5, "1年白金会员", "恭喜您获得了1年白金会员", 1000d, 1000));
		activityPrizeList.add(new ActivityPrize(6, "15天迅雷会员", "恭喜您获得了15天迅雷会员", 3000d, 3000));
		activityPrizeList.add(new ActivityPrize(7, "赚钱宝", "恭喜您获得了赚钱宝", 3000d, 5000));
		activityPrizeList.add(new ActivityPrize(8, "50元红包", "恭喜您获得了50元红包", 500000d, 50000));

		List<Double> weightList = new ArrayList<Double>(activityPrizeList.size());
		for (ActivityPrize o : activityPrizeList) {
			double weight = o.getPrizeWeight();
			if (weight < 0) {
				weight = 0;
			}
			weightList.add(weight);
		}

		int index = LotteryUtil.lottery(weightList);
		if (index != -1) {
			LotteryUtil.changPrizeListAndWeight(activityPrizeList, weightList, index);
		}

		logger.debug("中奖物品索引：" + index);

		return index + 1;
	}
}
