package com.springmvc.study.lottery.model;
/**
 * 活动奖品
 *
 */
public class ActivityPrize {

	/** 奖品索引 */
	private int prizeIndex;
	/** 奖品名称 */
	private String prizeName;
	/** 奖品信息 */
	private String prizeMessage;
	/** 奖品权重 */
	private double prizeWeight;
	/** 奖品数量 */
	private long prizeNum;

	/** 中奖标志位 */
	// private boolean flag;

	public ActivityPrize(int prizeIndex, String prizeName, String prizeMessage, double prizeWeight, long prizeNum) {
		this.prizeIndex = prizeIndex;
		this.prizeName = prizeName;
		this.prizeMessage = prizeMessage;
		this.prizeWeight = prizeWeight;
		this.prizeNum = prizeNum;
	}
	
	public int getPrizeIndex() {
		return prizeIndex;
	}

	public void setPrizeIndex(int prizeIndex) {
		this.prizeIndex = prizeIndex;
	}

	public String getPrizeName() {
		return prizeName;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public double getPrizeWeight() {
		return prizeWeight;
	}

	public void setPrizeWeight(double prizeWeight) {
		this.prizeWeight = prizeWeight;
	}

	public long getPrizeNum() {
		return prizeNum;
	}

	public void setPrizeNum(long prizeNum) {
		this.prizeNum = prizeNum;
	}

	public String getPrizeMessage() {
		return prizeMessage;
	}

	public void setPrizeMessage(String prizeMessage) {
		this.prizeMessage = prizeMessage;
	}
}
