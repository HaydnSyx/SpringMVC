package com.springmvc.study.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.study.common.service.BaseAbstractService;
import com.springmvc.study.db.dao.UserMapper;
import com.springmvc.study.db.model.User;

@Service
public class MybatisInitService extends BaseAbstractService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Object handle(Object... obj) throws Exception {

		List<User> userList = userMapper.findAll();

		return userList;
	}
}
