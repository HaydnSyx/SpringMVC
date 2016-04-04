package com.springmvc.study.mybatis.service;

import java.text.SimpleDateFormat;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.study.common.service.BaseAbstractService;
import com.springmvc.study.db.dao.UserMapper;
import com.springmvc.study.db.model.User;
import com.springmvc.study.mybatis.model.UserModel;
import com.springmvc.study.util.CommonUtil;
import com.springmvc.study.util.CustomUUID;

@Service
public class MybatisSaveService extends BaseAbstractService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Object handle(Object... obj) throws Exception {

		UserModel userModel = (UserModel) obj[0];
		// 查询
		User user = new User();
		// 复制
		BeanUtils.copyProperties(userModel, user);
		// 生日
		if (!CommonUtil.isEmpty(userModel.getBirthday())) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			user.setBirthday(sdf.parse(userModel.getBirthday()));
		}
		// 密码
		if (!CommonUtil.isEmpty(userModel.getPassword())) {
			user.setPassword(CommonUtil.md5Encode(userModel.getPassword()));
		}
		// 添加
		if (CommonUtil.isEmpty(userModel.getId())) {
			// 设置主键
			user.setId(CustomUUID.getId());

			userMapper.insertSelective(user);
		}
		// 修改
		else {
			userMapper.updateByPrimaryKeySelective(user);
		}

		return null;
	}
}
