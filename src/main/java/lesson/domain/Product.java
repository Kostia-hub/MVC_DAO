package lesson.domain;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private String price;

//    @ManyToMany //сделал связь "многие ко многим" разные продукты могут лежать в разных корзинах
//    @JoinTable(name = "products_in_cards",
//            joinColumns = @JoinColumn(name = "products_id"),
//            inverseJoinColumns = @JoinColumn(name = "card_id"))
//    private List<Card> cards;

    public Product() {
    }

    public Product(Long id, String title, String price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public List<Card> getCards() {
//        return cards;
//    }
//
//    public void setCards(List<Card> cards) {
//        this.cards = cards;
//    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(title, product.title) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}