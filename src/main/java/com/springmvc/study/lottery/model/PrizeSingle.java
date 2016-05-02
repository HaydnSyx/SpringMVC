package com.springmvc.study.lottery.model;

import java.util.ArrayList;
import java.util.List;

public class PrizeSingle {

	private List<ActivityPrize> activityPrizeList = new ArrayList<ActivityPrize>();
	private List<Double> weightList = new ArrayList<Double>(activityPrizeList.size());

	// 初始化数据
	{
		activityPrizeList.add(new ActivityPrize(1, "1年超级会员", "恭喜您获得了1年超级会员", 5d, 5));
		activityPrizeList.add(new ActivityPrize(2, "iphone6 plus", "恭喜您获得了iphone6 plus", 0d, 1));
		activityPrizeList.add(new ActivityPrize(3, "下载宝", "恭喜您获得了下载宝", 5000d, 5000));
		activityPrizeList.add(new ActivityPrize(4, "10元红包", "恭喜您获得了10元红包", 1000000d, 100000));
		activityPrizeList.add(new ActivityPrize(5, "1年白金会员", "恭喜您获得了1年白金会员", 1000d, 1000));
		activityPrizeList.add(new ActivityPrize(6, "15天迅雷会员", "恭喜您获得了15天迅雷会员", 3000d, 3000));
		activityPrizeList.add(new ActivityPrize(7, "赚钱宝", "恭喜您获得了赚钱宝", 3000d, 5000));
		activityPrizeList.add(new ActivityPrize(8, "50元红包", "恭喜您获得了50元红包", 500000d, 50000));

		for (ActivityPrize o : activityPrizeList) {
			double weight = o.getPrizeWeight();
			if (weight < 0) {
				weight = 0;
			}
			weightList.add(weight);
		}
	}

	private static final PrizeSingle prizeSingle = new PrizeSingle();

	private PrizeSingle() {
	}

	public static PrizeSingle getInstance() {
		return prizeSingle;
	}

	public List<ActivityPrize> getActivityPrizeList() {
		return activityPrizeList;
	}

	public List<Double> getWeightList() {
		return weightList;
	}

	public void setActivityPrizeList(List<ActivityPrize> activityPrizeList) {
		this.activityPrizeList = activityPrizeList;
	}

	public void setWeightList(List<Double> weightList) {
		this.weightList = weightList;
	}
}
