package com.product.dao;

import org.apache.ibatis.annotations.Mapper;

import com.product.base.BaseDao;
import com.product.domain.ProjectDO;

/**
 * 项目表
 */
@Mapper
public interface ProjectDao extends BaseDao<ProjectDO> {

}
