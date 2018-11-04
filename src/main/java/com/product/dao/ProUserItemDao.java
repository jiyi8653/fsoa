package com.product.dao;

import org.apache.ibatis.annotations.Mapper;

import com.product.base.BaseDao;
import com.product.domain.ProUserItemDO;

/**
 * 项目用户端关联表
 */
@Mapper
public interface ProUserItemDao extends BaseDao<ProUserItemDO> {

}
