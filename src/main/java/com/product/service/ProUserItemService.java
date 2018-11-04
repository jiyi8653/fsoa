package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.base.BaseDao;
import com.product.base.BaseService;
import com.product.dao.ProUserItemDao;
import com.product.dao.ProjectDao;
import com.product.dao.UserDao;
import com.product.domain.ProUserItemDO;
import com.product.domain.ProjectDO;
import com.product.domain.UserDO;

/**
 * 项目用户端关联表
 */
@Service
public class ProUserItemService extends BaseService<ProUserItemDO> {

	@Autowired
	private ProUserItemDao proUserItemDOMapper;

	@Override
	protected BaseDao<ProUserItemDO> getMapper() {
		return proUserItemDOMapper;
	}

	

}
