package be.molowayi.beerSoapService.domain;


import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alcohol" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="brewer" type="{http://web.beers.spring.noelvaes.eu/}brewer" minOccurs="0"/>
 *         &lt;element name="category" type="{http://web.beers.spring.noelvaes.eu/}category" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beer", propOrder = {
        "alcohol",
        "brewer",
        "category",
        "id",
        "name",
        "price",
        "stock"
})
@Entity()
public class Beer {

    protected float alcohol;
    protected Brewer brewer;
    protected Category category;
    protected int id;
    protected String name;
    protected float price;
    protected int stock;

    /**
     * Gets the value of the alcohol property.
     *
     */
    public float getAlcohol() {
        return alcohol;
    }

    /**
     * Sets the value of the alcohol property.
     *
     */
    public void setAlcohol(float value) {
        this.alcohol = value;
    }

    /**
     * Gets the value of the brewer property.
     *
     * @return
     *     possible object is
     *     {@link Brewer }
     *
     */
    public Brewer getBrewer() {
        return brewer;
    }

    /**
     * Sets the value of the brewer property.
     *
     * @param value
     *     allowed object is
     *     {@link Brewer }
     *
     */
    public void setBrewer(Brewer value) {
        this.brewer = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return
     *     possible object is
     *     {@link Category }
     *
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *     allowed object is
     *     {@link Category }
     *
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the id property.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the price property.
     *
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the stock property.
     *
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     *
     */
    public void setStock(int value) {
        this.stock = value;
    }

}
