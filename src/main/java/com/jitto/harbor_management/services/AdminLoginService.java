package com.jitto.harbor_management.services;

import com.jitto.harbor_management.models.AdminLoginModel;
import com.jitto.harbor_management.repositorys.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminLoginService {

    @Autowired
    private AdminLoginRepository adminLoginRepository;

    public ResponseEntity<?> adminLogin(AdminLoginModel credentials){
        AdminLoginModel adminLoginModel1 = adminLoginRepository.findByUserName(credentials.getUserName());
        Map<String,String> response = new HashMap<>();
        if (adminLoginModel1 == null){
            response.put("message","Username Not Found");
            return ResponseEntity.ok(response);
        }
        if (credentials.getPassword().equals(adminLoginModel1.getPassword())){
            response.put("message","Verified");
        }else{
            response.put("message","Not Verified");
        }
        return ResponseEntity.ok(response);
    }
}
