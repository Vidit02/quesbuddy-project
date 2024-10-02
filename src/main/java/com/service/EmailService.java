package com.service;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
//import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import com.bean.Customer;
import com.bean.UserBean;

//import javax.mail.internet.MimeMultipart;
public class EmailService {
	public void welcomeEmail(String email,String otp) {
		final String from = "vrajnpatel3333@gmail.com";
		final String appPassword = "yewsmbwrxnqryvpv"; 

		Properties prop = System.getProperties();

		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.ssl.enable", "false");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from, appPassword);
			}
		});

		session.setDebug(true);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("Your OTP For Reset Password");
			String a="<body marginheight=\"0\" topmargin=\"0\" marginwidth=\"0\" style=\"margin: 0px; background-color: #f2f3f8;\" leftmargin=\"0\">\r\n"
					+ "        <!--100% body table-->\r\n"
					+ "        <table cellspacing=\"0\" border=\"0\" cellpadding=\"0\" width=\"100%\" bgcolor=\"#f2f3f8\" style=\"@import url(https://fonts.googleapis.com/css?family=Rubik:300,400,500,700|Open+Sans:300,400,600,700); font-family: 'Open Sans', sans-serif;\">\r\n"
					+ "          <tr>\r\n"
					+ "            <td>\r\n"
					+ "              <table style=\"background-color: #f2f3f8; max-width:670px;  margin:0 auto;\" width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:80px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"text-align:center;\">\r\n"
					+ "                    <a href=\"https://rakeshmandal.com\" title=\"logo\" target=\"_blank\">\r\n"
					+ "                      <img width=\"300\" src=\"https://i.postimg.cc/grFTHdB3/Logomain-4.png\" title=\"logo\" alt=\"logo\">\r\n"
					+ "                    </a>\r\n"
					+ "                  </td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:20px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td>\r\n"
					+ "                    <table width=\"95%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"max-width:670px;background:#fff; border-radius:3px; text-align:center;-webkit-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);-moz-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);box-shadow:0 6px 18px 0 rgba(0,0,0,.06);\">\r\n"
					+ "                      <tr>\r\n"
					+ "                        <td style=\"height:40px;\">&nbsp;</td>\r\n"
					+ "                      </tr>\r\n"
					+ "                      <tr>\r\n"
					+ "                        <td style=\"padding:0 35px;\">\r\n"
					+ "                          <h1 style=\"color:#1e1e2d; font-weight:500; margin:0;font-size:32px;font-family:'Rubik',sans-serif;\">Your OTP for Reset Password</h1>\r\n"
					+ "                          <span style=\"display:inline-block; vertical-align:middle; margin:29px 0 26px; border-bottom:1px solid #cecece; width:100px;\"></span>\r\n"
					+ "                          <p style=\"color:#dc4061; font-size:25px;line-height:24px; margin-bottom:40px;\">\r\n"
					+								otp
					+ "                            \r\n"
					+ "                          </p>\r\n"
					+ "                          <p style=\"color:#455056; font-size:15px;line-height:24px; margin:0;\">\r\n"
					+ "                            Kindly Copy this OTP and Paste QuesBuddy website for the Reset Password.\r\n"
					+ "                          </p>\r\n"
					+ "                          <p style=\"color:red; font-size:15px;line-height:14px; margin-top:14;\">\r\n"
					+ "                            OTP is valid only 60 seconds.\r\n"
					+ "                          </p>\r\n"
					+ "                        </td>\r\n"
					+ "                      </tr>\r\n"
					+ "                      <tr>\r\n"
					+ "                        <td style=\"height:40px;\">&nbsp;</td>\r\n"
					+ "                      </tr>\r\n"
					+ "                    </table>\r\n"
					+ "                  </td>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:20px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"text-align:center;\">\r\n"
					+ "                    <p style=\"font-size:14px; color:rgba(69, 80, 86, 0.7411764705882353); line-height:18px; margin:0 0 0;\">&copy; <strong>www.QuesBuddy.com</strong></p>\r\n"
					+ "                  </td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:80px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "              </table>\r\n"
					+ "            </td>\r\n"
					+ "          </tr>\r\n"
					+ "        </table>\r\n"
					+ "        <!--/100% body table-->\r\n"
					+ "      \r\n"
					+ "</body>";
			message.setContent(a, "text/html");
			
			
			Transport.send(message);

			System.out.println("email sent.............");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("something went wrong...........");
		}
	}
	
	public void buyCourseEmail(Customer c,UserBean user) {
		final String from = "vrajnpatel3333@gmail.com";
		final String appPassword = "yewsmbwrxnqryvpv"; 

		Properties prop = System.getProperties();

		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.ssl.enable", "false");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from, appPassword);
			}
		});

		session.setDebug(true);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getEmail()));
			message.setSubject("Congratulations! Course Added Successfully");
			String a="<body marginheight=\"0\" topmargin=\"0\" marginwidth=\"0\" style=\"margin: 0px; background-color: #f2f3f8;\" leftmargin=\"0\">\r\n"
					+ "        <!--100% body table-->\r\n"
					+ "        <table cellspacing=\"0\" border=\"0\" cellpadding=\"0\" width=\"100%\" bgcolor=\"#f2f3f8\" style=\"@import url(https://fonts.googleapis.com/css?family=Rubik:300,400,500,700|Open+Sans:300,400,600,700); font-family: 'Open Sans', sans-serif;\">\r\n"
					+ "          <tr>\r\n"
					+ "            <td>\r\n"
					+ "              <table style=\"background-color: #f2f3f8; max-width:670px;  margin:0 auto;\" width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:80px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"text-align:center;\">\r\n"
					+ "                    <a href=\"https://rakeshmandal.com\" title=\"logo\" target=\"_blank\">\r\n"
					+ "                      <img width=\"300\" src=\"https://i.postimg.cc/grFTHdB3/Logomain-4.png\" title=\"logo\" alt=\"logo\">\r\n"
					+ "                    </a>\r\n"
					+ "                  </td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:20px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td>\r\n"
					+ "                    <table width=\"95%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"max-width:670px;background:#fff; border-radius:3px; text-align:center;-webkit-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);-moz-box-shadow:0 6px 18px 0 rgba(0,0,0,.06);box-shadow:0 6px 18px 0 rgba(0,0,0,.06);\">\r\n"
					+ "                      <tr>\r\n"
					+ "                        <td style=\"height:40px;\">&nbsp;</td>\r\n"
					+ "                      </tr>\r\n"
					+ "                      <tr>\r\n"
					+ "                        <td style=\"padding:0 35px; \" >\r\n"
					+ "                          <h1 style=\"color:#1e1e2d; font-weight:500; margin:0;font-size:32px;font-family:'Rubik',sans-serif;\">Congrats for Move your Career on the Best Direction</h1>\r\n"
					+ "                          <span style=\"display:inline-block; vertical-align:middle; margin:29px 0 26px; border-bottom:1px solid #cecece; width:100px;\"></span>\r\n"
					+ "                          <p style=\"color:#dc4061; font-size:25px;line-height:24px; margin-bottom:40px;\">\r\n"
					+ "                            You are successfully added a New Course from QuesBuddy\r\n"
					+ "                          </p>\r\n"
					+ "                          \r\n"
					+ "                          \r\n"
					+ "                          \r\n"
					+ "                        </td>\r\n"
					+ "                      </tr>\r\n"
					+ "                      <tr>\r\n"
					+ "                        <td style=\"height:40px;\">&nbsp;</td>\r\n"
					+ "                      </tr>\r\n"
					+ "                    </table>\r\n"
					+ "                  </td>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:20px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"text-align:center;\">\r\n"
					+ "                    <p style=\"font-size:14px; color:rgba(69, 80, 86, 0.7411764705882353); line-height:18px; margin:0 0 0;\">&copy; <strong>www.QuesBuddy.com</strong></p>\r\n"
					+ "                  </td>\r\n"
					+ "                </tr>\r\n"
					+ "                <tr>\r\n"
					+ "                  <td style=\"height:80px;\">&nbsp;</td>\r\n"
					+ "                </tr>\r\n"
					+ "              </table>\r\n"
					+ "            </td>\r\n"
					+ "          </tr>\r\n"
					+ "        </table>\r\n"
					+ "        <!--/100% body table-->\r\n"
					+ "      \r\n"
					+ "</body>";
			message.setContent(a, "text/html");
			
			
			Transport.send(message);

			System.out.println("email sent.............");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("something went wrong...........");
		}
	}
	
	
	
}
