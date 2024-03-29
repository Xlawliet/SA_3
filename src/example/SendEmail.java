package example;


import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class SendEmail {


    public void send(String ReceCount,String text) throws MessagingException, GeneralSecurityException {
        Properties prop = new Properties();
        //设置QQ邮件服务器
        prop.setProperty("mail.host", "smtp.qq.com");
        //邮件发送协议
        prop.setProperty("mail.transport.protocol", "smtp");
        //需要验证用户名密码
        prop.setProperty("mail.smtp.auth", "true");

        String UserCount="434927530@qq.com";
        String Userkey="zdoqsefqztqhbjaf";

        //关于QQ邮箱，还要设置SSL加密，加上以下代码即可
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.socketFactory", sf);

        //使用JavaMail发送邮件的5个步骤
        //1.txt、创建定义整个应用程序所需的环境信息的Session对象
        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                //发件人邮件用户名、授权码
                return new PasswordAuthentication("434927530@qq.com", "zdoqsefqztqhbjaf"); }
        });

        //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
        session.setDebug(true);

        //2、通过session得到transport对象
        Transport ts = session.getTransport();

        //3、使用邮箱的用户名和授权码连上邮件服务器
        ts.connect("smtp.qq.com", "434927530@qq.com", "zdoqsefqztqhbjaf");

        //4，创建邮件
        //4-1.txt，创建邮件对象
        MimeMessage message = new MimeMessage(session);

        //4-2，指明邮件的发件人
        message.setFrom(new InternetAddress("434927530@qq.com"));

        //4-3，指明邮件的收件人
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(ReceCount));

        //4-4，邮件标题
        message.setSubject("Hello");

        //4-5，邮件文本内容
        message.setContent(text, "text/html;charset=UTF-8");

        //4-6，发送邮件
        ts.sendMessage(message, message.getAllRecipients());

        //5，关闭连接
        ts.close();
    }

}

