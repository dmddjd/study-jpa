package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // jpa 연결
public class Member {
    @Id // jpa에게 pk를 알려줘야 함
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
