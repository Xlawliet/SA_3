
package Client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MessagingException_QNAME = new QName("http://example/", "MessagingException");
    private final static QName _GeneralSecurityException_QNAME = new QName("http://example/", "GeneralSecurityException");
    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://example/", "sayHelloWorldFrom");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://example/", "sayHelloWorldFromResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessagingException }
     * 
     */
    public MessagingException createMessagingException() {
        return new MessagingException();
    }

    /**
     * Create an instance of {@link GeneralSecurityException }
     * 
     */
    public GeneralSecurityException createGeneralSecurityException() {
        return new GeneralSecurityException();
    }

    /**
     * Create an instance of {@link SayHelloWorldFromResponse }
     * 
     */
    public SayHelloWorldFromResponse createSayHelloWorldFromResponse() {
        return new SayHelloWorldFromResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessagingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "MessagingException")
    public JAXBElement<MessagingException> createMessagingException(MessagingException value) {
        return new JAXBElement<MessagingException>(_MessagingException_QNAME, MessagingException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralSecurityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "GeneralSecurityException")
    public JAXBElement<GeneralSecurityException> createGeneralSecurityException(GeneralSecurityException value) {
        return new JAXBElement<GeneralSecurityException>(_GeneralSecurityException_QNAME, GeneralSecurityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "sayHelloWorldFromResponse")
    public JAXBElement<SayHelloWorldFromResponse> createSayHelloWorldFromResponse(SayHelloWorldFromResponse value) {
        return new JAXBElement<SayHelloWorldFromResponse>(_SayHelloWorldFromResponse_QNAME, SayHelloWorldFromResponse.class, null, value);
    }

}
