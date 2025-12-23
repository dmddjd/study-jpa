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
            Team team = new Team();
            team.setTeamName("team1");
            em.persist(team);

            Member member = new Member();
            member.setUserName("user1");
            member.setAge(10);
            member.setTeam(team);
            member.setType(MemberType.ADMIN);
            em.persist(member);

//            for (int i = 0; i < 100; i++) {
//                Member member = new Member();
//                member.setUserName("user" + (i+1));
//                member.setAge(i+1);
//                em.persist(member);
//            }

            em.flush();
            em.clear();

//            TypedQuery<Member> query = em.createQuery("select m from Member m where m.userName = :userName",Member.class);
//            TypedQuery<String> query = em.createQuery("select m.userName from Member m",String.class);
//            Query query = em.createQuery("select m.userName, m.age from Member m");

            // getResultList
//            List<Member> resultList = query.getResultList();
//            for (Member result : resultList) {
//                System.out.println("result : " + result);
//            }

            // getSingleResult
//            Member singleResult = query.getSingleResult();
//            System.out.println("singleResult : " + singleResult);

//            query.setParameter("userName", "user1");
//            Member singleResult = query.getSingleResult();
//            System.out.println("singleResult : " + singleResult.getUserName());

            // 프로젝션
//            List<Object[]> resultList = em.createQuery("select distinct m.userName, m.age from Member m").getResultList();

//            Member findMember = result.get(0);
//            System.out.println("before : " + findMember.getAge());
//            findMember.setAge(20);
//            System.out.println("after : " + findMember.getAge());

//            Object[] result = resultList.get(0);
//            System.out.println("userName : " + result[0]);
//            System.out.println("age : " + result[1]);

            // new 타입으로 데이터 조회
            // 패키지명을 포함한 전체 클래스명 입력
            // 순서와 타입이 일치하는 생성자 필요
//            List<MemberDTO> result = em.createQuery("select new jpa3.MemberDTO(m.userName, m.age) from Member m", MemberDTO.class).getResultList();
//
//            MemberDTO memberDTO = result.get(0);
//            System.out.println("userName : " + memberDTO.getUserName());
//            System.out.println("age : " + memberDTO.getAge());

            // 페이징
            // setFirstResult(int startPosition) : 조회 시작 위치
            // setMaxResults(int maxResult) : 조회할 데이터 수
//            List<Member> result = em.createQuery("select m from Member m order by m.age desc",Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            System.out.println("result.size : " + result.size());
//            for (Member results : result) {
//                System.out.println("results : " + results);
//            }

            // 조인
            // 내부조인
//            String query = "select m from Member m inner join m.team t";
            // 외부조인
//            String query = "select m from Member m left join m.team t";
            // 세타조인
//            String query = "select m from Member m, Team t where m.userName = t.teamName";

            // 조인 - on절 : 연관관계 없는 엔티티 외부 조인
//            String query = "select m from Member m left join m.team t on t.teamName = m.userName";
//            String query = "select m from Member m left join Team t on m.userName = t.teamName";
//            List<Member> result = em.createQuery(query,Member.class).getResultList();
//            System.out.println("result : " + result);

            String query = "select m.userName, 'HELLO', true from Member m " + "where m.type = jpa3.MemberType.USER";
            List<Object[]> result = em.createQuery(query).getResultList();

            for (Object[] objects : result) {
                System.out.println("object : " + objects[0]);
                System.out.println("object : " + objects[1]);
                System.out.println("object : " + objects[2]);
            }
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
