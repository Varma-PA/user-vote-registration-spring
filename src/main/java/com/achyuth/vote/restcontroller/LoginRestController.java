package com.achyuth.vote.restcontroller;

import com.achyuth.vote.dto.LoginDTO;
import com.achyuth.vote.services.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginRestController {


//    @Autowired
    private LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<String> testLoginFunction(@RequestBody LoginDTO loginDTO){
        loginService.createLogin(loginDTO);
        return new ResponseEntity<>("Created", HttpStatus.OK);
    }

}
