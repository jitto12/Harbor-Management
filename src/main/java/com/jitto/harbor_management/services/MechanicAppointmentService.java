package com.jitto.harbor_management.services;

import com.jitto.harbor_management.models.MechanicAppointmentModel;
import com.jitto.harbor_management.repositorys.MechanicAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MechanicAppointmentService {

    @Autowired
    private MechanicAppointmentRepository mechanicAppointmentRepository;

    public ResponseEntity<?> addAppointment(MechanicAppointmentModel appointment){
        Map<String, String> response = new HashMap();
        MechanicAppointmentModel mechanicAppointmentModel = mechanicAppointmentRepository.findByBoatNumber(appointment.getBoatNumber());
        if(mechanicAppointmentModel == null){
            mechanicAppointmentRepository.save(appointment);
            response.put("message","Appointment Added");
        }else {
            response.put("message","The Boat you Entered is Already Appointmented,If you Want to Update the Appointment Form, go to DashBoard");
        }
        return ResponseEntity.ok(response);
    }

    public List<MechanicAppointmentModel> getAllAppointments(){
        return mechanicAppointmentRepository.findAll();
    }
}
