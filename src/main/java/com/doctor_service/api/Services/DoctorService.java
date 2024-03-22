package com.doctor_service.api.Services;


import com.doctor_service.api.Entity.Doctor;
import com.doctor_service.api.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }



    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    public void updateDoctor(Long id, Doctor updatedDoctor) {
        doctorRepository.save(updatedDoctor);
    }
}
