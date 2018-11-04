package com.product.vo;

import java.util.List;

import com.product.domain.ProUserItemDO;
import com.product.domain.ProjectDO;

public class ProjectVo {
	private ProjectDO project;
	private List<ProUserItemDO> proUserItem;
	public ProjectDO getProject() {
		return project;
	}
	public void setProject(ProjectDO project) {
		this.project = project;
	}
	public List<ProUserItemDO> getProUserItem() {
		return proUserItem;
	}
	public void setProUserItem(List<ProUserItemDO> proUserItem) {
		this.proUserItem = proUserItem;
	}

}
