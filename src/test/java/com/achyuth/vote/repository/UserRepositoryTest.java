package com.achyuth.vote.repository;

import com.achyuth.vote.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void selectIfEmailExists() {

        User user = new User();
        user.setFirstName("Achyuth");
        user.setLastName("Varma");
        user.setEmail("test@email.com");

        userRepository.save(user);

        boolean exists = userRepository.selectIfEmailExists("test@email.com");

        assertEquals(exists, true);

    }
}