package com.achyuth.vote.services.users;

import com.achyuth.vote.dto.users.CreateUserDTO;
import com.achyuth.vote.entities.Login;
import com.achyuth.vote.entities.User;
import com.achyuth.vote.repository.LoginRepository;
import com.achyuth.vote.repository.UserRepository;
import com.achyuth.vote.services.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    private LoginRepository loginRepository;

    private LoginService loginService;

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    public void setLoginRepository(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public User createUser(CreateUserDTO createUserDTO){

        Login login = new Login();
        login.setPassword(createUserDTO.getPassword());
        User user = new User();
        user.setFirstName(createUserDTO.getFirstName());
        user.setLastName(createUserDTO.getLastName());
        user.setEmail(createUserDTO.getEmail());
        return loginService.createLogin(user, login);
    }



}
