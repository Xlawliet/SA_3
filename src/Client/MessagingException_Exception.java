
package Client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MessagingException", targetNamespace = "http://example/")
public class MessagingException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MessagingException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MessagingException_Exception(String message, MessagingException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MessagingException_Exception(String message, MessagingException faultInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: Client.MessagingException
     */
    public MessagingException getFaultInfo() {
        return faultInfo;
    }

}
