//package practice;
//
//import javax.persistence.*;
//
//@Entity
//public class OrderItem extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "order_item_id")
//    private Long id;
//
////    @Column(name = "order_id")
////    private Long orderId;
////
////    @Column(name = "item_id")
////    private Long itemId;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id")
//    private Orders order;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "item_id")
//    private Items item;
//
//    private int orderPrice;
//
//    private int count;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
////    public Long getOrderId() {
////        return orderId;
////    }
////
////    public void setOrderId(Long orderId) {
////        this.orderId = orderId;
////    }
////
////    public Long getItemId() {
////        return itemId;
////    }
////
////    public void setItemId(Long itemId) {
////        this.itemId = itemId;
////    }
//
//    public Orders getOrder() {
//        return order;
//    }
//
//    public void setOrder(Orders order) {
//        this.order = order;
//    }
//
//    public Items getItem() {
//        return item;
//    }
//
//    public void setItem(Items item) {
//        this.item = item;
//    }
//
//    public int getOrderPrice() {
//        return orderPrice;
//    }
//
//    public void setOrderPrice(int orderPrice) {
//        this.orderPrice = orderPrice;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//}