package com.springmvc.study.db.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.springmvc.study.db.model.User;

@Repository
public interface UserMapper {

	int deleteByPrimaryKey(String id);

	int insert(User record);

	@TriggersRemove(cacheName = "mallListCache", removeAll = true)
	int insertSelective(User record);

	User selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKeyWithBLOBs(User record);

	int updateByPrimaryKey(User record);

	@Cacheable(cacheName = "mallListCache")
	List<User> findAll();
}