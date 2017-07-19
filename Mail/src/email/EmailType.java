package email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailType {

    
    
    
    //Simple, MultiPart, Html, ImageHtml
    public static Email getEmail(String type){
        Email email=null;
        switch (type) {
            case "Simple":
               email = new  SimpleEmail();
                break;
            case "MultiPart":
                email = new  MultiPartEmail();
                 break;
            case "Html":
                email = new  HtmlEmail();
                 break;
            case "ImageHtml":
                email = new  ImageHtmlEmail();
                 break;
            default:
                email = new  SimpleEmail();
                break;
        }
        return  init(email);
    }
    
    //配置email初始信息
    private static Email init(Email email) {
        email.setHostName("mail.iflytek.com");
        email.setCharset("utf-8");
        email.setAuthentication("lldeng2@iflytek.com", "lovedr1314!");
        return email;
    }
    
    public static void sendMail( String to, String subject,
            String body) throws EmailException {
        Email email = getEmail("Simple");
        email.setFrom("lldeng2@iflytek.com");
        email.addTo(to);
        email.setSubject(subject);
        email.setMsg(body);
        email.send();
    }
    
    public static void main(String[] args) throws EmailException {
        //sendMail( "hychen7@iflytek.com", "大家对基督教的", "基督教");
        System.out.println("\\");
    }
}
