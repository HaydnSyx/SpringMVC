package com.springmvc.study.common;

public interface BaseServiceImpl {

	/** 带事务管理 */
	public Object handleWithTransaction(Object... obj) throws Exception;

	/** 不带事务管理 */
	public Object handleWithoutTransaction(Object... obj) throws Exception;
}
