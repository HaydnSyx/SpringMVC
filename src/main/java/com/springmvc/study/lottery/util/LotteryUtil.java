package com.springmvc.study.lottery.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.springmvc.study.lottery.model.ActivityPrize;

public class LotteryUtil {
	/**
	 * 抽奖
	 *
	 * @return 物品的索引
	 */
	public static int lottery(List<Double> weightList) {
		if (weightList == null || weightList.isEmpty()) {
			return -1;
		}
		int size = weightList.size();
		// 计算总概率，这样可以保证不一定总概率是1
		double sumRate = 0d;
		for (double rate : weightList) {
			sumRate += rate;
		}
		// 所有奖品已经抽完
		if (sumRate == 0) {
			return -1;
		}
		// 计算每个物品在总概率的基础下的概率情况
		List<Double> sortOrignalRates = new ArrayList<Double>(size);
		Double tempSumRate = 0d;
		for (double rate : weightList) {
			tempSumRate += rate;
			sortOrignalRates.add(tempSumRate / sumRate);
		}

		// 根据区块值来获取抽取到的物品索引
		double nextDouble = Math.random();
		sortOrignalRates.add(nextDouble);
		Collections.sort(sortOrignalRates);

		return sortOrignalRates.indexOf(nextDouble);
	}

	public static synchronized void changPrizeListAndWeight(List<ActivityPrize> activityPrizeList,
			List<Double> weightList, int index) {
		ActivityPrize o = activityPrizeList.get(index);
		long prizeNum = o.getPrizeNum();
		// 修改奖品数量
		o.setPrizeNum(--prizeNum);
		activityPrizeList.set(index, o);
		// 当奖品抽完时，将此奖品的权重将为0
		if (prizeNum == 0) {
			weightList.set(index, 0d);
		}
	}
}
