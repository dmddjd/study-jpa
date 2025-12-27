package jpa3;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
//            Team team = new Team();
//            team.setTeamName("team1");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUserName("user1");
//            member.setAge(10);
//            member.setTeam(team);
//            member.setType(MemberType.ADMIN);
//            em.persist(member);

//            for (int i = 0; i < 100; i++) {
//                Member member = new Member();
//                member.setUserName("user" + (i+1));
//                member.setAge(i+1);
//                em.persist(member);
//            }

//            em.flush();
//            em.clear();

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

//            String query = "select m.userName, 'HELLO', true from Member m" + " where m.type = :memberType";
//            List<Object[]> result = em.createQuery(query).setParameter("memberType",MemberType.ADMIN).getResultList();
//
//            for (Object[] objects : result) {
//                System.out.println("object : " + objects[0]);
//                System.out.println("object : " + objects[1]);
//                System.out.println("object : " + objects[2]);
//            }

            // CASE
//            String query = "select " +
//                    "case when m.age <= 10 then '학생요금' " +
//                    "when m.age >= 60 then '경로요금' " +
//                    "else '일반요금' end " +
//                    "from Member m";
//            String query = "select coalesce(m.userName,'이름 없는 회원') from Member m";
//            String query = "select nullif(m.userName, '관리자') from Member m";
//            String query = "select substring(m.userName,2,3) from Member m";
//            List<String> result = em.createQuery(query,String.class).getResultList();
//
//            for (String s : result) {
//                System.out.println("s : " + s);
//            }

            Team team1 = new Team();
            team1.setTeamName("팀1");
            em.persist(team1);

            Team team2 = new Team();
            team2.setTeamName("팀2");
            em.persist(team2);

            Member member1 = new Member();
            member1.setUserName("관리자1");
            member1.setTeam(team1);
            em.persist(member1);

            Member member2 = new Member();
            member2.setUserName("관리자2");
            member2.setTeam(team2);
            em.persist(member2);

            em.flush();
            em.clear();

            // 경로 표현식
            // 1. 상태 필드
            // 경로 탐색의 끝, 탐색 불가
//            String query = "select m.userName from Member m";

            // 2. 단일 값 연관 필드
            // 묵시적 내부 조인 발생
            // 탐색 가능
//            String query = "select m.team.teamName from Member m";

            // 3. 컬렉션 값 연관 필드
            // 묵시적 내부 조인 발생
            // 탐색 불가
//            String query = "select t.members from Team t";
            String query = "select m.userName from Team t join t.members m";

//            Collection result = em.createQuery(query, Collection.class).getResultList();
            List<String> result = em.createQuery(query, String.class).getResultList();

            for (Object s : result) {
                System.out.println("s : " + s);
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
