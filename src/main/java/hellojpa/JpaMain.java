package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
            // persist : 데이터 삽입
//            Member insertMember = new Member();
//            insertMember.setId(2L);
//            insertMember.setName("user2");
//            em.persist(insertMember);

            // find : 데이터 조회
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.id : " + findMember.getId());
//            System.out.println("findMember.name : " + findMember.getName());

            // setName : 데이터 수정
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("USER1");

            // remove : 데이터 삭제
//            Member findMember = em.find(Member.class, 1L);
//            em.remove(findMember);

            /*
            JPQL
            - JPA는 SQL을 추상화한 객체 지향 쿼리 언어
            - SQL과 문법 비슷 (SELECT, FROM, WHERE, GROUP BY, HAVING, JOIN 지원)
            - SQL : 데이터베이스 테이블을 대상으로 하는 쿼리
            - JPQL : 엔티티 객체를 대상으로 하는 쿼리
             */
//            List<Member> result = em.createQuery("select m from Member as m where m.id = 1", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            for (Member member : result) {
//                System.out.println("member.name : " + member.getName());
//            }

            et.commit();
        } catch (Exception e) {
            et.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
