package jpa3;

import javax.persistence.*;

@Entity
public class Orders {
    @Id @GeneratedValue
    private Long id;
    private int orderAmount;
    @Embedded
    private Address addreses;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }
}
