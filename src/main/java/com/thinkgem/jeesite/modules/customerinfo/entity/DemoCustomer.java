/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.customerinfo.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 客户信息Entity
 * @author lan
 * @version 2018-09-29
 */
public class DemoCustomer extends DataEntity<DemoCustomer> {
	
	private static final long serialVersionUID = 1L;
	private String customename;		// 客户名称
	
	public DemoCustomer() {
		super();
	}

	public DemoCustomer(String id){
		super(id);
	}

	@Length(min=0, max=255, message="客户名称长度必须介于 0 和 255 之间")
	public String getCustomename() {
		return customename;
	}

	public void setCustomename(String customename) {
		this.customename = customename;
	}
	
}