//package jpa2;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Entity
//public class Member extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "MEMBER_ID")
//    private Long id;
//
//    @Column(name = "USER_NAME")
//    private String userName;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn
//    private Team team;
//
//    @OneToOne
//    @JoinColumn(name = "LOCKER_ID")
//    private Locker locker;
//
//    @OneToMany(mappedBy = "member")
//    private List<MemberProduct> memberProducts = new ArrayList<>();
//
//    // Period
////    private LocalDateTime startDate;
////    private LocalDateTime endDate;
////    @Embedded
////    private Period workPeriod;
//
//    // Address
////    private String city;
////    private String street;
////    private String zipcode;
//    @Embedded
//    private Address homeAddress;
//
////    @Embedded
////    @AttributeOverrides({
////            @AttributeOverride(name="city", column = @Column(name = "work_city")),
////            @AttributeOverride(name="street", column = @Column(name = "work_street")),
////            @AttributeOverride(name="zipcode", column = @Column(name = "work_zipcode"))
////    })
////
////    private Address workAddress;
//
//    @ElementCollection
//    @CollectionTable(name = "favorite_food", joinColumns = @JoinColumn(name = "member_id"))
//    private Set<String> favoriteFoods = new HashSet<>();
//
////    @ElementCollection
////    @CollectionTable(name = "address", joinColumns = @JoinColumn(name = "member_id"))
////    private List<Address> addressHistory = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "member_id")
//    private List<AddressEntity> addressHistory = new ArrayList<>();
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
//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }
////
////    public Period getWorkPeriod() {
////        return workPeriod;
////    }
////
////    public void setWorkPeriod(Period workPeriod) {
////        this.workPeriod = workPeriod;
////    }
//
//    public Address getHomeAddress() {
//        return homeAddress;
//    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//
//    public Set<String> getFavoriteFoods() {
//        return favoriteFoods;
//    }
//
//    public void setFavoriteFoods(Set<String> favoriteFoods) {
//        this.favoriteFoods = favoriteFoods;
//    }
//
////    public List<Address> getAddressHistory() {
////        return addressHistory;
////    }
////
////    public void setAddressHistory(List<Address> addressHistory) {
////        this.addressHistory = addressHistory;
////    }
//
//    public List<AddressEntity> getAddressHistory() {
//        return addressHistory;
//    }
//
//    public void setAddressHistory(List<AddressEntity> addressHistory) {
//        this.addressHistory = addressHistory;
//    }
//}
