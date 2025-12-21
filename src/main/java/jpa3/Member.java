package jpa3;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String userName;

    // Period
//    private LocalDateTime startDate;
//    private LocalDateTime endDate;
    @Embedded
    private Period workPeriod;

    // Address
//    private String city;
//    private String street;
//    private String zipcode;
    @Embedded
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column = @Column(name = "work_city")),
            @AttributeOverride(name="street", column = @Column(name = "work_street")),
            @AttributeOverride(name="zipcode", column = @Column(name = "work_zipcode"))
    })

    private Address workAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Period getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(Period workPeriod) {
        this.workPeriod = workPeriod;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
}
