package com.springmvc.study.mybatis.service;

import java.text.SimpleDateFormat;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.study.common.service.BaseAbstractService;
import com.springmvc.study.db.dao.UserMapper;
import com.springmvc.study.db.model.User;
import com.springmvc.study.mybatis.model.UserModel;

@Service
public class MybatisDetailService extends BaseAbstractService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Object handle(Object... obj) throws Exception {

		final String id = (String) obj[0];

		User user = userMapper.selectByPrimaryKey(id);
		UserModel userModel = new UserModel();
		if (user != null) {
			BeanUtils.copyProperties(user, userModel);
			// 生日
			if (user.getBirthday() != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				userModel.setBirthday(sdf.format(user.getBirthday()));
			}
		}

		return userModel;
	}
}
