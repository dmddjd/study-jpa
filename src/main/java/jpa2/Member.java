//package jpa2;
//
//import javax.persistence.*;
//
//@Entity
//public class Member {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "MEMBER_ID")
//    private Long id;
//
//    @Column(name = "USER_NAME")
//    private String userName;
//
////    @Column(name = "TEAM_ID")
////    private Long teamId;
//
//    @ManyToOne
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
////    public Long getTeamId() {
////        return teamId;
////    }
////
////    public void setTeamId(Long teamId) {
////        this.teamId = teamId;
////    }
//
//    public Team getTeam() {
//        return team;
//    }
//
//    public void changeTeam(Team team) {
//        this.team = team;
//        team.getMembers().add(this);
//    }
//
//    @Override
//    public String toString() {
//        return "Member{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", team=" + team +
//                '}';
//    }
//}
