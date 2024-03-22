package com.doctor_service.api.Controller;

import com.doctor_service.api.Entity.Doctor;
import com.doctor_service.api.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/{getting}")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @PostMapping("/creating")
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id, @RequestBody Doctor updatedDoctor) {
        doctorService.updateDoctor(id, updatedDoctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
    }
}
