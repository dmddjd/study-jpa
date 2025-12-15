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
            Member member = new Member();
            member.setUserName("user1");
            member.setHomeAddress(new Address("city", "street", "zipcode"));
//            member.setWorkPeriod(new Period());

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
