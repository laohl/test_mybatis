package com.mybatis.dao;

import com.mybatis.bean.User;

public interface UserMapper {
	public User findUserById(Integer id) throws Exception;
}
