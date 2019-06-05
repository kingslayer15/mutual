package com.thumb.utility.email;

import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * 发送邮件工具类
 * @Author:
 * @Date：
 */
//@Component 将工具类注入spring容器中
@Component
public class SendEmailUtil {

     /*
      *发送邮件
      * @param toEmail 目的地
      * @param code 唯一激活码
      * @return
      */
    public static int send_email(String toEmail,String code) throws IOException, AddressException, MessagingException{

        String to = toEmail;
        String subject = "邮箱验证";
        String content = "邮箱注册验证码:" + code;

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.163.com");
        properties.put("mail.smtp.port", "25");
        properties.put("mail.smtp.auth", "true");

        //发送者的邮箱和授权码
        Authenticator authenticator = new Email_Authenticator("newwaylau@163.com", "123456qwe");
        Session sendMailSession = javax.mail.Session.getDefaultInstance(properties, authenticator);
        MimeMessage mailMessage = new MimeMessage(sendMailSession);
        //邮箱的发送者
        try {
            mailMessage.setFrom(new InternetAddress("newwaylau@163.com"));
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        //邮箱接收
        // Message.RecipientType.TO属性表示接收者的类型为TO
        mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        //发送邮件的标题
        mailMessage.setSubject(subject, "UTF-8");
        //发送邮件的日期
        mailMessage.setSentDate(new Date());

        //MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
        Multipart mainPart = new MimeMultipart();

        //创建一个包含HTML内容的MimeBodyPart
        BodyPart html = new MimeBodyPart();
        //设置邮件的内容的格式和字节码
        html.setContent(content.trim(), "text/html; charset=utf-8");
        mainPart.addBodyPart(html);
        mailMessage.setContent(mainPart);
        Transport.send(mailMessage);
        return 1;
    }
}

