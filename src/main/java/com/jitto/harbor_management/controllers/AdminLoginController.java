package com.jitto.harbor_management.controllers;

import com.jitto.harbor_management.models.AdminLoginModel;
import com.jitto.harbor_management.services.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminLoginController {

    @Autowired
    private AdminLoginService adminLoginService;

    @PostMapping("/adminlogin")
    public ResponseEntity<?> adminLogin(@RequestBody AdminLoginModel adminLoginModel){
        return adminLoginService.adminLogin(adminLoginModel);
    }

    @PostMapping("/adminlogin1")
    public ResponseEntity<?> adminLogin1(@RequestBody AdminLoginModel adminLoginModel){
        return adminLoginService.adminLogin(adminLoginModel);
    }
}
