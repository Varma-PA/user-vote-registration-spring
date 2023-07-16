package com.achyuth.vote.repository;

import com.achyuth.vote.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(""+
            "SELECT CASE WHEN COUNT(u) > 0 THEN " +
            "TRUE ELSE FALSE END "+
            "FROM User u "+
            "WHERE u.email = ?1"
    )
    Boolean selectIfEmailExists(String email);

}
