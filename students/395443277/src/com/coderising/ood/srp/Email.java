package com.coderising.ood.srp;

import java.io.IOException;
import java.util.HashMap;

public class Email {
	
	private final String NAME_KEY = "NAME";
	private final String EMAIL_KEY = "EMAIL";

	private String toAddress = null;
	private String subject;
	private String message;

	protected void configureEMail(HashMap userInfo, String productDesc) throws IOException {
		toAddress = (String) userInfo.get(EMAIL_KEY);
		if (toAddress.length() > 0)
			setMessage(userInfo, productDesc);
	}

	protected void setMessage(HashMap userInfo, String productDesc) throws IOException {
		String name = (String) userInfo.get(NAME_KEY);

		subject = "您关注的产品降价了";
		message = "尊敬的 " + name + ", 您关注的产品 " + productDesc + " 降价了，欢迎购买!";
	}
}
