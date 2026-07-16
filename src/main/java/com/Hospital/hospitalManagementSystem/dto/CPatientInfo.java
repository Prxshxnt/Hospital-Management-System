package com.Hospital.hospitalManagementSystem.dto;

public class CPatientInfo {

    private final Long id;
    private final String email;   // also fix: lowercase 'e'

    public CPatientInfo(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId()      { return id; }
    public String getEmail() { return email; }
}