package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.base.BaseDao;
import com.product.base.BaseService;
import com.product.dao.ProjectDao;
import com.product.dao.UserDao;
import com.product.domain.ProjectDO;
import com.product.domain.UserDO;

/**
 * 项目表
 */
@Service
public class ProjectService extends BaseService<ProjectDO> {

	@Autowired
	private ProjectDao projectMapper;

	@Override
	protected BaseDao<ProjectDO> getMapper() {
		return projectMapper;
	}

	

}
