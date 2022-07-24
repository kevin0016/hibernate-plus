package com.itkevin.framework.hibernate.plus.utils;


import com.itkevin.framework.hibernate.plus.data.StatementType;

public class Utils {
	public static String getCacheKeyByType(String statementId, StatementType type) {
		String key = "[KEY_" + type + "_DYNAMIC" + statementId + "]";
		return key.toLowerCase();
	}

	public static void main(String[] args) {
		System.out.println(Utils.getCacheKeyByType("test", StatementType.HQL_QUERY));
	}
}
