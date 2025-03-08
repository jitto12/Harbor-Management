package com.jitto.harbor_management.controllers;

import com.jitto.harbor_management.models.LoginRegisterModel;
import com.jitto.harbor_management.services.LoginRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRegisterController {

    @Autowired
    private LoginRegisterService loginRegisterService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody LoginRegisterModel details){
        return loginRegisterService.registerUser(details);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRegisterModel credentials){
        return loginRegisterService.loginUser(credentials);
    }
}
