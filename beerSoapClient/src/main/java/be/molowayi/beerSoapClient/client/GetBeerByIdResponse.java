
package be.molowayi.beerSoapClient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getBeerByIdResponse complex type.
 * 
 * <p>Le fragment de sch?ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getBeerByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://beerSoapService.molowayi.be/}beer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBeerByIdResponse", propOrder = {
    "_return"
})
public class GetBeerByIdResponse {

    @XmlElement(name = "return")
    protected Beer _return;

    /**
     * Obtient la valeur de la propri?t? return.
     * 
     * @return
     *     possible object is
     *     {@link Beer }
     *     
     */
    public Beer getReturn() {
        return _return;
    }

    /**
     * D?finit la valeur de la propri?t? return.
     * 
     * @param value
     *     allowed object is
     *     {@link Beer }
     *     
     */
    public void setReturn(Beer value) {
        this._return = value;
    }

}
