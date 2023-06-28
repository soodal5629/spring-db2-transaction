package hello.springtx.propagation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String username;

    public Member() {} // jpa 특성상 기본 생성사 필요

    public Member(String username) {
        this.username = username;
    }
}
