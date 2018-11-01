package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.base.BaseDao;
import com.product.base.BaseService;
import com.product.dao.UserDao;
import com.product.domain.UserDO;

/**
 * 用户表
 */
@Service
public class UserService extends BaseService<UserDO> {

	@Autowired
	private UserDao userMapper;

	@Override
	protected BaseDao<UserDO> getMapper() {
		return userMapper;
	}

}
