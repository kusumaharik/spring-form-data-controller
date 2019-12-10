package com.howtodoinjava.app.controller;

public class AccountForm {

	private String username;
	private AccountNotificationType notifyType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AccountNotificationType getNotifyType() {
		return notifyType;
	}

	public void setNotifyType(AccountNotificationType notifyType) {
		this.notifyType = notifyType;
	}

}
