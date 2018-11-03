package com.product.dao;

import org.apache.ibatis.annotations.Mapper;

import com.product.base.BaseDao;
import com.product.domain.UserDO;

/**
 * 用户表
 */
@Mapper
public interface UserDao extends BaseDao<UserDO> {

}
