package be.molowayi.beerSoapService.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Beers")
public class Beer implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Price")
    private float price;

    @Column(name = "Stock")
    private int stock;

    @Column(name = "Alcohol")
    private float alcohol;

    @Version
    @Column(name= "Version")
    private int version;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "Image")
    @Lob
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "BrewerId")
    private Brewer brewer;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brewer getBrewer() {
        return brewer;
    }

    public void setBrewer(Brewer brewer) {
        this.brewer = brewer;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(name).append(" ").append(alcohol).append(" ");
        b.append(stock).append(" ").append(price).append(" ");
        return b.toString();
    }
}
