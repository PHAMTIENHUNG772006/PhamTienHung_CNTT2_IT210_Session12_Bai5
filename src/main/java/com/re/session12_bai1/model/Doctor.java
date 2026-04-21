package com.re.session12_bai1.model;

import java.time.LocalDate;

public class Doctor {
    private String id;
    private String name;
    private String specialization;
    private int experience;
    private String phone;
    private String address;
    private LocalDate startDate;
    private String avatar;


    public Doctor() {
    }


    public Doctor(String id, String name, String specialization, int experience, String phone, String address, LocalDate startDate, String avatar) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.phone = phone;
        this.address = address;
        this.startDate = startDate;
        this.avatar = avatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}