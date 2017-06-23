package com.coderising.ood.srp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MailUtil {

	public static void sendEmail(String toAddress, String fromAddress, String subject, String message, String smtpHost,
			boolean debug) {
		// 假装发了一封邮件
		StringBuilder buffer = new StringBuilder();
		buffer.append("From:").append(fromAddress).append("\n");
		buffer.append("To:").append(toAddress).append("\n");
		buffer.append("Subject:").append(subject).append("\n");
		buffer.append("Content:").append(message).append("\n");
		System.out.println(buffer.toString());

		// configure
		
		
		// send message
		
	}

	protected void sendEMails(boolean debug, List mailingList) throws IOException {

		System.out.println("开始发送邮件");

		if (mailingList != null) {
			Iterator iter = mailingList.iterator();
			while (iter.hasNext()) {
				sendEmail();
				
//				configureEMail((HashMap) iter.next());
//				try {
//					if (toAddress.length() > 0)
//						MailUtil.sendEmail(toAddress, fromAddress, subject, message, smtpHost, debug);
//				} catch (Exception e) {
//
//					try {
//						MailUtil.sendEmail(toAddress, fromAddress, subject, message, altSmtpHost, debug);
//
//					} catch (Exception e2) {
//						System.out.println("通过备用 SMTP服务器发送邮件失败: " + e2.getMessage());
//					}
//				}
			}

		}

		else {
			System.out.println("没有邮件发送");

		}

	}
}
