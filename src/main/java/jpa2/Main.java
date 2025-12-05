package jpa2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        try {
//            // 객체지향스럽지 못한 코드
////            Team team = new Team();
////            team.setTeamName("TeamA");
////            em.persist(team);
////
////            Member member = new Member();
////            member.setUserName("Member1");
////            member.setTeamId(team.getId());
////            em.persist(member);
////
////            Member findMember = em.find(Member.class, member.getId());
////            Long findTeamId = findMember.getTeamId();
////            Team findTeam = em.find(Team.class, findTeamId);
//
//            // 연관관계
//            Team team = new Team();
//            team.setTeamName("TeamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUserName("UserA");
//            member.changeTeam(team);
//            em.persist(member);
//
//            // 순수 객체 상태를 고려하여 항상 양쪽에 값을 설정
//            // tip : setter 메서드에 로직 추가
////            team.getMembers().add(member);
//
//            em.flush();
//            em.clear();
//
////            Member findMember = em.find(Member.class, member.getId());
////            Team findTeam = findMember.getTeam();
////            System.out.println("findTeam : " + findTeam.getTeamName());
////
////            List<Member> members = findMember.getTeam().getMembers();
////            for (Member m : members) {
////                System.out.println("m : " + m.getUserName());
////            }
//
//            Team findTeam = em.find(Team.class, team.getId());
//            List<Member> members = findTeam.getMembers();
//            for (Member m : members) {
//                System.out.println("m : " + m.getUserName());
//            }
//
//            // ※ 양방향 매핑시 무한 루프에 주의(ex : toString, lombok, JSON)
////            System.out.println("members = " + findTeam.toString());
//
//            // ※ 주인이 아닌 쪽에서 데이터를 수정해도 데이터베이스에 반영되지 않음
////            Member member = new Member();
////            member.setUserName("UserA");
////            em.persist(member);
////
////            Team team = new Team();
////            team.setTeamName("TeamA");
////            team.getMembers().add(member);
////            em.persist(team);
////
////            em.flush();
////            em.close();

        Member member = new Member();
        member.setUserName("member1");
        em.persist(member);

        Team team = new Team();
        team.setTeamName("team1");
//        member.setTeam(team);
//        team.getMembers().add(member);
        member.setTeam(team);
        em.persist(team);

        et.commit();
        } catch (Exception e){
            System.err.println(e.getMessage());
            et.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
