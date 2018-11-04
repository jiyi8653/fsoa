package com.product.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目用户端关联表
 */
public class ProUserItemDO implements Serializable {

	private static final long serialVersionUID = 1L;

	// 主键id
	private Integer id;
	private Integer pId;
	private Integer uId;
	private Integer dId;
	private Date createTime;

	public UserDO userDO;
	public DevelopItemDO developItemDO; 
	/**
	 * 设置：主键id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取：主键id
	 */
	public Integer getId() {
		return id;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
