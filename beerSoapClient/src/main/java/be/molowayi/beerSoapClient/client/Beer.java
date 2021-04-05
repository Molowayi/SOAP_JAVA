
package be.molowayi.beerSoapClient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;


/**
 * <p>Classe Java pour beer complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="beer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alcohol" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="brewer" type="{http://beerSoapService.molowayi.be/}brewer" minOccurs="0"/>
 *         &lt;element name="category" type="{http://beerSoapService.molowayi.be/}category" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "image",
    "name",
    "price",
    "stock"
})
public class Beer {

    protected float alcohol;
    protected Brewer brewer;
    protected Category category;
    protected int id;
    protected byte[] image;
    protected String name;
    protected float price;
    protected int stock;

    /**
     * Obtient la valeur de la propri�t� alcohol.
     * 
     */
    public float getAlcohol() {
        return alcohol;
    }

    /**
     * D�finit la valeur de la propri�t� alcohol.
     * 
     */
    public void setAlcohol(float value) {
        this.alcohol = value;
    }

    /**
     * Obtient la valeur de la propri�t� brewer.
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
     * D�finit la valeur de la propri�t� brewer.
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
     * Obtient la valeur de la propri�t� category.
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
     * D�finit la valeur de la propri�t� category.
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
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� image.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * D�finit la valeur de la propri�t� image.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
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
     * D�finit la valeur de la propri�t� name.
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
     * Obtient la valeur de la propri�t� price.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * D�finit la valeur de la propri�t� price.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Obtient la valeur de la propri�t� stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * D�finit la valeur de la propri�t� stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "alcohol=" + alcohol +
                ", brewer=" + brewer +
                ", category=" + category +
                ", id=" + id +
                ", image=" + Arrays.toString(image) +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
