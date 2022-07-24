package com.itkevin.framework.hibernate.plus.builder;

import java.io.IOException;

/**
 * 动态sql/hql语句组装器
 * 
 * @author kevin
 * 
 */
public interface DynamicHibernateStatementBuilder {

	/**
	 * 初始化
	 * 
	 * @throws java.io.IOException
	 */
	public void init() throws IOException;
}