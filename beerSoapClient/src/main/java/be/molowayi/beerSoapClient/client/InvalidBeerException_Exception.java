
package be.molowayi.beerSoapClient.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidBeerException", targetNamespace = "http://beerSoapService.molowayi.be/")
public class InvalidBeerException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidBeerException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidBeerException_Exception(String message, InvalidBeerException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidBeerException_Exception(String message, InvalidBeerException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: be.molowayi.beerSoapClient.client.InvalidBeerException
     */
    public InvalidBeerException getFaultInfo() {
        return faultInfo;
    }

}