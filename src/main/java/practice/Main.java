package practice;

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

            /*
             영속성 컨텍스트
             - 엔티티 객체를 1차 캐시로 관리하는 저장소
             - JPA에서 데이터를 데이터베이스에 바로 보내지 않고, 영속성 컨텍스트에 먼저 저장
             - 커밋 시점에 데이터베이스에 반영
             */
            // 비영속(new/transient) : 영속성 컨텍스트와 전혀 관련 없는 상태
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("user101");

            // 영속(managed) : 영속성 컨텍스트애 의해 관리되는 상태
//            em.persist(member);

            // 준영속(detach) : 영속성 컨텍스트에서 분리된 상태(관리되지 않는 상태)
//            em.detach(member);

            // 삭제(remove) : 데이터베이스에서 삭제된 상태
//            em.remove(member);

            // 영속 엔티티 동일성 보장
//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);
//            System.out.println("findMember1.id : " + findMember1.getId());
//            System.out.println("findMember2.id : " + findMember2.getId());
//            System.out.println("result : " + (findMember1 == findMember2));

            // 엔티티 등록 - 쓰기 지연
//            Member member1 = new Member(102L, "user102");
//            Member member2 = new Member(103L, "user103");
//            em.persist(member1);
//            em.persist(member2);
//            System.out.println("===================");

            // 엔티티 수정 - 변경 감지
//            Member member = em.find(Member.class, 102L);
//            member.setName("USER102");
//            System.out.println("===================");

//            Member member= em.find(Member.class, 103L);
//            em.remove(member);
//            System.out.println("===================");

            /*
             Flush
             - 영속성 컨텍스트의 변경 내용을 데이터베이스에 반영
             - 엔티티를 영속성 컨텍스트에서 비우지 않음
             - 트랜잭션 commit 또는 JPQL 실행 시 자동으로 호출
             */
//            Member member = new Member(1L, "user1", 1);
//            em.persist(member);
//            em.flush();
//            System.out.println("===================");

            // IDENTITY 전략은 em.persist() 시점에 즉시 INSERT SQL을 실행
//            Member member = new Member();
//            member.setUserName("user1");
//            System.out.println("===================");
//            em.persist(member);
//            System.out.println("member.id : " + member.getId());
//            System.out.println("===================");

            et.commit();
        } catch (Exception e) {
            et.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
