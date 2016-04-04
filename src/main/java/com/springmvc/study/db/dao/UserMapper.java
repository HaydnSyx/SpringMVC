package com.springmvc.study.db.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springmvc.study.db.model.User;

@Repository
public interface UserMapper {

	int deleteByPrimaryKey(String id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKeyWithBLOBs(User record);

	int updateByPrimaryKey(User record);

	List<User> findAll();
}