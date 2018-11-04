package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.base.BaseDao;
import com.product.base.BaseService;
import com.product.dao.DevelopItemDao;
import com.product.dao.ProjectDao;
import com.product.dao.UserDao;
import com.product.domain.DevelopItemDO;
import com.product.domain.ProjectDO;
import com.product.domain.UserDO;

/**
 * 端表
 */
@Service
public class DevelopItemService extends BaseService<DevelopItemDO> {

	@Autowired
	private DevelopItemDao developItemMapper;

	@Override
	protected BaseDao<DevelopItemDO> getMapper() {
		return developItemMapper;
	}

	

}
