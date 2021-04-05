
package be.molowayi.beerSoapClient.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.molowayi.beerSoapClient.client package. 
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

    private final static QName _GetBeerById_QNAME = new QName("http://beerSoapService.molowayi.be/", "getBeerById");
    private final static QName _InvalidBeerException_QNAME = new QName("http://beerSoapService.molowayi.be/", "InvalidBeerException");
    private final static QName _OrderBeerResponse_QNAME = new QName("http://beerSoapService.molowayi.be/", "orderBeerResponse");
    private final static QName _OrderBeer_QNAME = new QName("http://beerSoapService.molowayi.be/", "orderBeer");
    private final static QName _InvalidNumberException_QNAME = new QName("http://beerSoapService.molowayi.be/", "InvalidNumberException");
    private final static QName _GetBeerByIdResponse_QNAME = new QName("http://beerSoapService.molowayi.be/", "getBeerByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.molowayi.beerSoapClient.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBeerByIdResponse }
     * 
     */
    public GetBeerByIdResponse createGetBeerByIdResponse() {
        return new GetBeerByIdResponse();
    }

    /**
     * Create an instance of {@link InvalidNumberException }
     * 
     */
    public InvalidNumberException createInvalidNumberException() {
        return new InvalidNumberException();
    }

    /**
     * Create an instance of {@link InvalidBeerException }
     * 
     */
    public InvalidBeerException createInvalidBeerException() {
        return new InvalidBeerException();
    }

    /**
     * Create an instance of {@link OrderBeerResponse }
     * 
     */
    public OrderBeerResponse createOrderBeerResponse() {
        return new OrderBeerResponse();
    }

    /**
     * Create an instance of {@link GetBeerById }
     * 
     */
    public GetBeerById createGetBeerById() {
        return new GetBeerById();
    }

    /**
     * Create an instance of {@link OrderBeer }
     * 
     */
    public OrderBeer createOrderBeer() {
        return new OrderBeer();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link Beer }
     * 
     */
    public Beer createBeer() {
        return new Beer();
    }

    /**
     * Create an instance of {@link Brewer }
     * 
     */
    public Brewer createBrewer() {
        return new Brewer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeerById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beerSoapService.molowayi.be/", name = "getBeerById")
    public JAXBElement<GetBeerById> createGetBeerById(GetBeerById value) {
        return new JAXBElement<GetBeerById>(_GetBeerById_QNAME, GetBeerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidBeerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beerSoapService.molowayi.be/", name = "InvalidBeerException")
    public JAXBElement<InvalidBeerException> createInvalidBeerException(InvalidBeerException value) {
        return new JAXBElement<InvalidBeerException>(_InvalidBeerException_QNAME, InvalidBeerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBeerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beerSoapService.molowayi.be/", name = "orderBeerResponse")
    public JAXBElement<OrderBeerResponse> createOrderBeerResponse(OrderBeerResponse value) {
        return new JAXBElement<OrderBeerResponse>(_OrderBeerResponse_QNAME, OrderBeerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBeer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beerSoapService.molowayi.be/", name = "orderBeer")
    public JAXBElement<OrderBeer> createOrderBeer(OrderBeer value) {
        return new JAXBElement<OrderBeer>(_OrderBeer_QNAME, OrderBeer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidNumberException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beerSoapService.molowayi.be/", name = "InvalidNumberException")
    public JAXBElement<InvalidNumberException> createInvalidNumberException(InvalidNumberException value) {
        return new JAXBElement<InvalidNumberException>(_InvalidNumberException_QNAME, InvalidNumberException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeerByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beerSoapService.molowayi.be/", name = "getBeerByIdResponse")
    public JAXBElement<GetBeerByIdResponse> createGetBeerByIdResponse(GetBeerByIdResponse value) {
        return new JAXBElement<GetBeerByIdResponse>(_GetBeerByIdResponse_QNAME, GetBeerByIdResponse.class, null, value);
    }

}
