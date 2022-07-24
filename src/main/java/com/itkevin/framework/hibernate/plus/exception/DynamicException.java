package com.itkevin.framework.hibernate.plus.exception;

@SuppressWarnings("serial")
public class DynamicException extends RuntimeException {

	public DynamicException() {
		super();
	}

	public DynamicException(String msg) {
		super(msg);
	}

	public DynamicException(Exception exception) {
		 super(exception);
	}
}
