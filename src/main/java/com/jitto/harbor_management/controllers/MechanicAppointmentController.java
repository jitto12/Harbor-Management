package com.jitto.harbor_management.controllers;

import com.jitto.harbor_management.models.MechanicAppointmentModel;
import com.jitto.harbor_management.services.MechanicAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MechanicAppointmentController {

    @Autowired
    private MechanicAppointmentService mechanicAppointmentService;

    @PostMapping("/addAppointment")
    public ResponseEntity<?> addAppointment(@RequestBody MechanicAppointmentModel appointment){
        return mechanicAppointmentService.addAppointment(appointment);
    }

    @GetMapping("/getappointments")
    public List<MechanicAppointmentModel> getAppointments(){
        return  mechanicAppointmentService.getAllAppointments();
    }
}
