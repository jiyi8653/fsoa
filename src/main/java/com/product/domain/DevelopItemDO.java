package com.product.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 端表
 */
public class DevelopItemDO implements Serializable {

	private static final long serialVersionUID = 1L;

	// 主键id
	private Integer id;
	private String itemName;
	private Date createTime;

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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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
