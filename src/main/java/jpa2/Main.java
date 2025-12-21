//package jpa2;
//
//import javax.persistence.*;
//
//public class Main {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//
//        try {
////            // 객체지향스럽지 못한 코드
//////            Team team = new Team();
//////            team.setTeamName("TeamA");
//////            em.persist(team);
//////
//////            Member member = new Member();
//////            member.setUserName("Member1");
//////            member.setTeamId(team.getId());
//////            em.persist(member);
//////
//////            Member findMember = em.find(Member.class, member.getId());
//////            Long findTeamId = findMember.getTeamId();
//////            Team findTeam = em.find(Team.class, findTeamId);
////
////            // 연관관계
////            Team team = new Team();
////            team.setTeamName("TeamA");
////            em.persist(team);
////
////            Member member = new Member();
////            member.setUserName("UserA");
////            member.changeTeam(team);
////            em.persist(member);
////
////            // 순수 객체 상태를 고려하여 항상 양쪽에 값을 설정
////            // tip : setter 메서드에 로직 추가
//////            team.getMembers().add(member);
////
////            em.flush();
////            em.clear();
////
//////            Member findMember = em.find(Member.class, member.getId());
//////            Team findTeam = findMember.getTeam();
//////            System.out.println("findTeam : " + findTeam.getTeamName());
//////
//////            List<Member> members = findMember.getTeam().getMembers();
//////            for (Member m : members) {
//////                System.out.println("m : " + m.getUserName());
//////            }
////
////            Team findTeam = em.find(Team.class, team.getId());
////            List<Member> members = findTeam.getMembers();
////            for (Member m : members) {
////                System.out.println("m : " + m.getUserName());
////            }
////
////            // ※ 양방향 매핑시 무한 루프에 주의(ex : toString, lombok, JSON)
//////            System.out.println("members = " + findTeam.toString());
////
////            // ※ 주인이 아닌 쪽에서 데이터를 수정해도 데이터베이스에 반영되지 않음
//////            Member member = new Member();
//////            member.setUserName("UserA");
//////            em.persist(member);
//////
//////            Team team = new Team();
//////            team.setTeamName("TeamA");
//////            team.getMembers().add(member);
//////            em.persist(team);
//////
//////            em.flush();
////            em.close();
//
////        Member member = new Member();
////        member.setUserName("member1");
////        em.persist(member);
////
////        Team team = new Team();
////        team.setTeamName("team1");
////        team.getMembers().add(member);
////        em.persist(team);
//
////        Movie movie = new Movie();
////        movie.setDirector("director1");
////        movie.setActor("actor1");
////        movie.setName("movie1");
////        movie.setPrice(10000);
////
////        em.persist(movie);
////
////        em.flush();
////        em.clear();
////
////        Items findItems = em.find(Items.class, movie.getId());
////        System.out.println("findItems : " + findItems);
////
//
////        Member member = new Member();
////        member.setUserName("userA");
////        member.setCreatedBy("memberA");
////        member.setCreatedDate(LocalDateTime.now());
////        em.persist(member);
////
////        em.flush();
////        em.clear();
//
//            // 프록시
////            Member member1 = new Member();
////            member1.setUserName("member1");
////            em.persist(member1);
////
////            Member member2 = new Member();
////            member2.setUserName("member2");
////            em.persist(member2);
//
////            Member refMember = em.getReference(Member.class, member1.getId());
////            System.out.println("refMember : " + refMember.getClass());
//////            Hibernate.initialize(refMember); // 강제 초기화
////            System.out.println("isLoaded : " + emf.getPersistenceUnitUtil().isLoaded(refMember));
//
//            // 즉시 로딩과 지연 로딩
////            Team team1 = new Team();
////            team1.setTeamName("team1");
////            member1.setTeam(team1);
////            em.persist(team1);
////
////            Team team2 = new Team();
////            team2.setTeamName("team2");
////            member2.setTeam(team2);
////            em.persist(team2);
////
////            em.flush();
////            em.clear();
//
////            Member m = em.find(Member.class, member1.getId());
////            System.out.println("m : " + m.getTeam().getClass());
////
////            System.out.println("============");
////            System.out.println("teamName : " + m.getTeam().getTeamName());
////            System.out.println("============");
//
////            List<Member> members = em.createQuery("select m from Member m join fetch m.team", Member.class)
////                    .getResultList();
//
//            // 영속성 전이 CASCADE
////            Child child1 = new Child();
////            Child child2 = new Child();
////
////            Parent parent = new Parent();
////            parent.addChild(child1);
////            parent.addChild(child2);
////
//////            em.persist(child1);
//////            em.persist(child2);
////            em.persist(parent);
////
////            em.flush();
////            em.clear();
//
////            // 고아 객체
////            Parent findParent = em.find(Parent.class, parent.getId());
//////            findParent.getChildList().remove(0);
////            em.remove(findParent);
//
//            et.commit();
//        } catch(Exception e) {
//            et.rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//        }
//        emf.close();
//    }
//}