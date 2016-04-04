package com.springmvc.study.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.study.common.service.BaseAbstractService;
import com.springmvc.study.db.dao.UserMapper;

@Service
public class MybatisDeleteService extends BaseAbstractService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Object handle(Object... obj) throws Exception {

		final String id = (String) obj[0];

		userMapper.deleteByPrimaryKey(id);

		return null;
	}
}
