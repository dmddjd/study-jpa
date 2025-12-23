package jpa3;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
            Member member = new Member();
            member.setUserName("user1");
            member.setAge(10);
            em.persist(member);

            TypedQuery<Member> query1 = em.createQuery("select m from Member m where m.userName = :userName",Member.class);
//            TypedQuery<String> query2 = em.createQuery("select m.userName from Member m",String.class);
//            Query query3 = em.createQuery("select m.userName, m.age from Member m");

            // getResultList
//            List<Member> resultList1 = query1.getResultList();
//            for (Member result1 : resultList1) {
//                System.out.println("result1 : " + result1);
//            }

            // getSingleResult
//            Member result2 = query1.getSingleResult();
//            System.out.println("result2 : " + result2);

            query1.setParameter("userName", "user1");
            Member singleResult = query1.getSingleResult();
            System.out.println("singleResult : " + singleResult.getUserName());



            et.commit();
        }catch(Exception e) {
            e.printStackTrace();
            et.rollback();
        }finally{
            em.close();
        }
        emf.close();
    }
}
