package com.springmvc.study.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springmvc.study.common.service.BaseAbstractService;
import com.springmvc.study.db.dao.UserMapper;
import com.springmvc.study.db.model.User;

@Service
public class MybatisInitService extends BaseAbstractService {

	@Autowired
	private UserMapper userMapper;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object handle(Object... obj) throws Exception {

		// 使用分页插件
		PageHelper.startPage(0, 0);
		List<User> userList = userMapper.selectAll();
		// 用PageInfo对结果进行包装
		PageInfo page = new PageInfo(userList);

		return page;
	}
}
