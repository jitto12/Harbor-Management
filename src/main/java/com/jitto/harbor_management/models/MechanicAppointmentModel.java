package com.jitto.harbor_management.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Mechanic_Appointment_details")
public class MechanicAppointmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Customer_Name")
    private String name;
    @Column(name = "Phone_Number")
    private long phoneNumber;
    @Column(name = "Boat_Name")
    private String boatName;
    @Column(name = "Boat_Type")
    private String boatType;
    @Column(name = "Register_Number")
    private String boatNumber;
    @Column(name = "Service_Type")
    private String serviceType;
    @Column(name = "Prefered_Date")
    private String prefferedDate;
    @Column(name = "Preffred_Time")
    private String prefferedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getBoatType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getBoatNumber() {
        return boatNumber;
    }

    public void setBoatNumber(String boatNumber) {
        this.boatNumber = boatNumber;
    }

    public String getPrefferedDate() {
        return prefferedDate;
    }

    public void setPrefferedDate(String prefferedDate) {
        this.prefferedDate = prefferedDate;
    }

    public String getPrefferedTime() {
        return prefferedTime;
    }

    public void setPrefferedTime(String prefferedTime) {
        this.prefferedTime = prefferedTime;
    }

    public MechanicAppointmentModel(String name, long phoneNumber, String boatName, String boatType, String boatNumber, String serviceType, String prefferedDate, String prefferedTime) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.boatName = boatName;
        this.boatType = boatType;
        this.boatNumber = boatNumber;
        this.serviceType = serviceType;
        this.prefferedDate = prefferedDate;
        this.prefferedTime = prefferedTime;
    }

    public MechanicAppointmentModel() {
    }
}
