package com.achyuth.vote.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "LoginTable")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LoginId")
    private Integer loginId;


    @Column(name = "Password")
    private String password;

    @OneToOne
    @JoinColumn(name = "UserId")
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Login login = (Login) o;
        return loginId != null && Objects.equals(loginId, login.loginId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
