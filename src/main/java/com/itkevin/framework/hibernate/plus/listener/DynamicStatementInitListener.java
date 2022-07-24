package com.itkevin.framework.hibernate.plus.listener;

import com.itkevin.framework.hibernate.plus.builder.DynamicHibernateStatementBuilder;
import com.itkevin.framework.hibernate.plus.builder.NoneDynamicHibernateStatementBuilder;
import com.itkevin.framework.hibernate.plus.utils.SpringContextHolder;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class DynamicStatementInitListener implements ApplicationListener<ContextRefreshedEvent> {

	protected DynamicHibernateStatementBuilder dynamicStatementBuilder = SpringContextHolder.getApplicationContext()
			.getBean(DynamicHibernateStatementBuilder.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			if (this.dynamicStatementBuilder == null) {
				this.dynamicStatementBuilder = new NoneDynamicHibernateStatementBuilder();
			}
			dynamicStatementBuilder.init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}