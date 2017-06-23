package com.coderising.ood.srp;

import java.io.File;

public class PromotionMail {

	protected String sendMailQuery = null;

	protected String smtpHost = null;
	protected String altSmtpHost = null;
	protected String fromAddress = null;
	
	protected String subject = null;
	protected String message = null;
	protected String loadQuery = null;

	private static Configuration config;
	private Product product = null;

	public static void main(String[] args) throws Exception {

		File f = new File(
				"D:\\java_learning\\coding2017\\students\\395443277\\src\\com\\coderising\\ood\\srp\\product_promotion.txt");
		boolean emailDebug = false;

		PromotionMail pe = new PromotionMail(f, emailDebug);
		//
		// sendEMails(mailDebug, loadMailingList());
	}

	public PromotionMail(File file, boolean mailDebug) throws Exception {

		// 读取配置文件， 文件中只有一行用空格隔开， 例如 P8756 iPhone8
		String[] fileData = FileUtil.readFile(file);

		// set product info
		product = new Product();
		product.setProductID(fileData[0]);
		product.setProductDesc(fileData[1]);

		System.out.println("产品ID = " + product.getproductID() + "\n");
		System.out.println("产品描述 = " + product.getProductDesc() + "\n");

		config = new Configuration();

		smtpHost = config.setSMTPHost();
		altSmtpHost = config.setAltSMTPHost();

		fromAddress = config.setFromAddress();

		loadQuery = config.setLoadQuery(product.getproductID());
	}

}
