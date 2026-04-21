package com.re.session12_bai1.controller;

import com.re.session12_bai1.model.Doctor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    @Value("${app.name}")
    private String appName;

    private List<Doctor> doctors = new ArrayList<>();

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("doctors", doctors);
        model.addAttribute("appName", appName);
        return "list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Doctor doctor) {
        doctors.removeIf(d -> d.getId().equals(doctor.getId()));
        doctors.add(doctor);
        return "redirect:/doctors/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        Doctor d = doctors.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);

        model.addAttribute("doctor", d);
        return "form";
    }

    @GetMapping("/search")
    public String search(@RequestParam String phone, Model model) {
        List<Doctor> result = doctors.stream()
                .filter(d -> d.getPhone() != null && d.getPhone().contains(phone))
                .toList();

        model.addAttribute("doctors", result);
        model.addAttribute("appName", appName);
        return "list";
    }
}