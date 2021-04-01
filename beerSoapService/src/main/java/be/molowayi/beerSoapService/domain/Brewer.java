package be.molowayi.beerSoapService.domain;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for brewer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="brewer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turnover" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "brewer", propOrder = {
        "address",
        "city",
        "name",
        "turnover",
        "zipCode"
})
public class Brewer {

    protected String address;
    protected String city;
    protected String name;
    protected int turnover;
    protected String zipCode;

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the turnover property.
     *
     */
    public int getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     *
     */
    public void setTurnover(int value) {
        this.turnover = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
