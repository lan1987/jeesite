/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.customerinfo.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.customerinfo.entity.DemoCustomer;

/**
 * 客户信息DAO接口
 * @author lan
 * @version 2018-09-29
 */
@MyBatisDao
public interface DemoCustomerDao extends CrudDao<DemoCustomer> {
	
}