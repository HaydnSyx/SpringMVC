package com.springmvc.study.common.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.study.common.BaseServiceImpl;

public abstract class BaseAbstractService implements BaseServiceImpl {

	public abstract Object handle(Object... obj) throws Exception;

	/** 配置带事务管理注解 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = { Exception.class,
			Exception.class })
	public Object handleWithTransaction(Object... obj) throws Exception {
		return handle(obj);
	}

	/** 配置不带事务管理注解 */
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, isolation = Isolation.DEFAULT)
	public Object handleWithoutTransaction(Object... obj) throws Exception {
		return handle(obj);
	}
}
