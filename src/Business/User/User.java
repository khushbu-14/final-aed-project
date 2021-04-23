/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.AmbulanceService.AmbulanceDirectory;
import Business.AmbulanceService.ServiceDirectory;
import Business.Hospital.ConsultationForm;
import Business.Role.UserRole;
import Business.Staff.SessionsDirectory;
import Business.Staff.SessionsMedStaffDirectory;

/**
 *
 * @author kunal
 */
public class User extends Business.UserAccount.UserAccount {

    private String name;
    private String contact;
    private String email;
    private String address;
    private String zipcode;
    private MedicalProfile medicalProfile;
    private SessionsMedStaffDirectory consultationSessions;
    private SessionsDirectory sessionRegDirectory;
    private ServiceDirectory ambulanceServiceDirectory;

    public User(String username, String password, String name, String contact, String email, String address, String zipcode) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.zipcode = zipcode;
        setPassword(password);
        setUsername(username);
        setRole(new UserRole());
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public MedicalProfile getMedicalProfile() {
        if (medicalProfile == null) {
            medicalProfile = new MedicalProfile();
        }
        return medicalProfile;
    }

    public void setMedicalProfile(MedicalProfile medicalProfile) {
        this.medicalProfile = medicalProfile;
    }

    @Override
    public String toString() {
        return name;
    }

    public SessionsMedStaffDirectory getConsultationSessions() {
        if (consultationSessions == null) {
            consultationSessions = new SessionsMedStaffDirectory();
        }
        return consultationSessions;
    }

    public void setConsultationSessions(SessionsMedStaffDirectory consultationSessions) {
        this.consultationSessions = consultationSessions;
    }

    public SessionsDirectory getSessionDirectory() {
        if (sessionRegDirectory == null) {
            sessionRegDirectory = new SessionsDirectory();
        }
        return sessionRegDirectory;
    }

    public void setSessionDirectory(SessionsDirectory sessionDirectory) {
        this.sessionRegDirectory = sessionDirectory;
    }

    public ServiceDirectory getAmbulanceServiceDirectory() {
        if(ambulanceServiceDirectory==null){
        ambulanceServiceDirectory = new ServiceDirectory();
        }
        return ambulanceServiceDirectory;
    }

    public void setAmbulanceServiceDirectory(ServiceDirectory ambulanceServiceDirectory) {
        this.ambulanceServiceDirectory = ambulanceServiceDirectory;
    }
}
