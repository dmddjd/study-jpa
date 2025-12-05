//package jpa2.practice;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "ORDERS")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "order_id")
//    private Long id;
//
////    @Column(name = "member_id")
////    private Long memberId;
//
//    @ManyToOne
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    private LocalDateTime orderDateTime;
//
//    @Enumerated(EnumType.STRING)
//    private OrderStatus status;
//
//    @OneToMany(mappedBy = "order")
//    private List<OrderItem> orderItems = new ArrayList<>();
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
////    public Long getMemberId() {
////        return memberId;
////    }
////
////    public void setMemberId(Long memberId) {
////        this.memberId = memberId;
////    }
//
//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
//
//    public LocalDateTime getOrderDateTime() {
//        return orderDateTime;
//    }
//
//    public void setOrderDateTime(LocalDateTime orderDateTime) {
//        this.orderDateTime = orderDateTime;
//    }
//
//    public OrderStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(OrderStatus status) {
//        this.status = status;
//    }
//
//    public void addOrderItem(OrderItem orderItem) {
//        orderItems.add(orderItem);
//        orderItem.setOrder(this);
//    }
//}
