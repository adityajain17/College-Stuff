/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

/**
 *
 * @author User
 */
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class JavaEmail
{
    Session mailSession;
 
    public static void main(String args[]) throws AddressException, MessagingException
    {
        JavaEmail javaEmail = new JavaEmail();
        javaEmail.setMailServerProperties();
        javaEmail.draftEmailMessage();
        javaEmail.sendEmail();
    }
 
    public  void setMailServerProperties()
    {
        Properties emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.port", "587");
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");
        mailSession = Session.getDefaultInstance(emailProperties, null);
    }
 
    public MimeMessage draftEmailMessage() throws AddressException, MessagingException
    {
        String[] toEmails = { "adtjn9@gmail.com" };
        String emailSubject = "Test email subject";
        String emailBody = "<p>Aditya Jain</p>\n" +
"<p><strong>My name is Aditya Jain</strong></p>";
        MimeMessage emailMessage = new MimeMessage(mailSession);
        /**
         * Set the mail recipients
         * */
        for (int i = 0; i < toEmails.length; i++)
        {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        emailMessage.setSubject(emailSubject);
        /**
         * If sending HTML mail
         * */
        emailMessage.setContent(emailBody, "text/html");
        /**
         * If sending only text mail
         * */
        //emailMessage.setText(emailBody);// for a text email
        return emailMessage;
    }
 
    public void sendEmail() throws AddressException, MessagingException
    {
        /**
         * Sender's credentials
         * */
        String fromUser = "aditya.jain@vitap.ac.in";
        String fromUserEmailPassword = "Adityajain7@";
 
        String emailHost = "smtp.gmail.com";
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        /**
         * Draft the message
         * */
        MimeMessage emailMessage = draftEmailMessage();
        /**
         * Send the mail
         * */
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }
}