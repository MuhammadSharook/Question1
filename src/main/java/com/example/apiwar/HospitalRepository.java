package com.example.apiwar;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class HospitalRepository {

    Map<String,Doctor> doctorDb = new HashMap<>();
    Map<String,Appointment> appointmentDb = new HashMap<>();
    Map<String,Hospital> hospitalDb = new HashMap<>();
    Map<String, List<String>> doctorAppointmentsDb = new HashMap<>();
    Map<String, List<String>> centerDoctorsDb = new HashMap<>();
}
