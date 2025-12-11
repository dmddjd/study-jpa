//package jpa2.practice;
//
//import javax.persistence.*;
//
//@Entity
//public class Delivery extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String city;
//
//    private String zipcode;
//
//    private String street;
//
//    private DeliveryStatus status;
//
//    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
//    private Order order;
//}
