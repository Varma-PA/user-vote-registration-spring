package com.achyuth.vote.services.login;

import com.achyuth.vote.dto.LoginDTO;
import com.achyuth.vote.entities.Login;
import com.achyuth.vote.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

//    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    public void setLoginRepository(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    public void createLogin(LoginDTO loginDTO){
        Login login = new Login();
        login.setUsername(loginDTO.getUsername());
        login.setPassword(loginDTO.getPassword());
        System.out.println(login.toString());
        loginRepository.save(login);
    }
}
