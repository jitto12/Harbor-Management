package com.jitto.harbor_management.services;

import com.jitto.harbor_management.models.LoginRegisterModel;
import com.jitto.harbor_management.repositorys.LoginRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginRegisterService {

    @Autowired
    private LoginRegisterRepository loginRegisterRepository;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    //Registering User
    public ResponseEntity<?> registerUser(LoginRegisterModel details){
        LoginRegisterModel loginRegisterModel = loginRegisterRepository.findByUsername(details.getUsername());
        LoginRegisterModel loginRegisterModel1 = loginRegisterRepository.findByPhoneNumber(details.getPhoneNumber());
        Map<String, String> response = new HashMap<>();

        if(details.getPassword().length()<8){
            response.put("message","Password Should be atleast 8 charcters!!!");
        }
        else if(loginRegisterModel==null && loginRegisterModel1==null){
            details.setPassword(encoder.encode(details.getPassword()));
            loginRegisterRepository.save(details);
            response.put("message","User Registered Successfully.");
        }else{
            response.put("message", "User Already Exist!!!");
        }
        return ResponseEntity.ok(response);
    }

    //Login User
    public ResponseEntity<?> loginUser(LoginRegisterModel credentials){
        LoginRegisterModel loginRegisterModel = loginRegisterRepository.findByUsername(credentials.getUsername());
        Map<String, String> response = new HashMap<>();
        if (loginRegisterModel == null){
            response.put("message", "User not found!");
            return ResponseEntity.ok(response);
        }

        if (encoder.matches(credentials.getPassword(), loginRegisterModel.getPassword())){
            response.put("message", "Login Successfull.");
        }else {
            response.put("message", "Invalid Credentials!!!");
        }
        return ResponseEntity.ok(response);
    }
}
