package com.achyuth.vote.repository;

import com.achyuth.vote.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
