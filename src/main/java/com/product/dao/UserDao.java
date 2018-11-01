package com.product.dao;

import org.apache.ibatis.annotations.Mapper;

import com.product.base.BaseDao;
import com.product.domain.UserDO;

/**
 * 用户表
 * 
 * @author zhuyifa
 * @email 1992lcg@163.com
 * @date 2018-03-22 18:38:14
 */
@Mapper
public interface UserDao extends BaseDao<UserDO> {

}
