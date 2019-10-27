package example;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.mail.MessagingException;
import javax.xml.ws.Endpoint;
import java.security.GeneralSecurityException;
@WebService
public class HelloWorld {

  public static void main(String[] args) throws GeneralSecurityException, MessagingException {
    String url="http://127.0.0.1:9091/Service/HelloWorld";
    Endpoint.publish(url,new HelloWorld());
//    HelloWorld h= new HelloWorld();
//    h.sayHelloWorldFrom("zwzhang4115@qq.com","123");
  }

  @WebMethod
  public void sayHelloWorldFrom(String from,String cont) throws GeneralSecurityException, MessagingException {
      SendEmail s=new SendEmail();
      s.send(from,cont);



    System.out.println(from+" "+cont);



  }

}
