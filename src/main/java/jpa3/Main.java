package jpa3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
            // 기본 값 타입
//            int a1 = 10;
//            int b1 = a1;
//            a1 = 20;
//            System.out.println("a1 : " + a1);
//            System.out.println("b1 : " + b1);
//
//            Integer a2 = 10;
//            Integer b2 = a2;
//            a2 = 20;
//
//            System.out.println("a2 : " + a2);
//            System.out.println("b2 : " + b2);

            // 임베디드 타입
//            Address address = new Address("city", "street", "zipcode");
//
//            Member member1 = new Member();
//            member1.setUserName("member1");
//            member1.setHomeAddress(address);
//            em.persist(member1);

//            Address copyAddress = new Address(address.getCity(), address.getStreet(), address.getZipcode());
//            Member member2 = new Member();
//            member2.setUserName("member1");
//            member2.setHomeAddress(copyAddress);
//            em.persist(member2);

//            member1.getHomeAddress().setCity("newCity");

            // 값 타입 비교
            int a = 10;
            int b = 10;
            System.out.println("a == b : " + (a == b));

            Address address1 = new Address("city", "street", "zipcode");
            Address address2 = new Address("city", "street", "zipcode");

            System.out.println("address1 == address2 : " + (address1 == address2));
            System.out.println("address1 equals address2 : " + (address1.equals(address2)));

            et.commit();
        } catch (Exception e){
            e.printStackTrace();
            et.rollback();
        } finally{
            em.close();
        }
        emf.close();
    }
}
