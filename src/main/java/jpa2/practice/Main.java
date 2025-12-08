//package jpa2.practice;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Main {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//
//        try {
////            Order order = new Order();
////            order.addOrderItem(new OrderItem());
////            em.persist(order);
////
////            OrderItem orderItem = new OrderItem();
////            orderItem.setOrder(order);
////            em.persist(orderItem);
//
//            et.commit();
//        } catch(Exception e) {
//            System.err.println(e.getMessage());
//            et.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//    }
//}