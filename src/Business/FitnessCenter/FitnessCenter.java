/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FitnessCenter;

import Business.Role.HospitalRole;
import java.util.UUID;

/**
 *
 * @author singh
 */
public class FitnessCenter extends Business.UserAccount.UserAccount {
    
    private String fitnessCenterID;
    private String fitnessCenterName;
    private String contact;
    private String address;
    private String zipcode;
    private String email;

    public FitnessCenter(String username, String password, String fitnessCenterName, String contact, String address, String zipcode, String email) {
        UUID uid = UUID.randomUUID();
        this.fitnessCenterID = uid.toString();
        this.fitnessCenterName = fitnessCenterName;
        this.contact = contact;
        this.address = address;
        this.zipcode = zipcode;
        this.email = email;
        setPassword(password);
        setUsername(username);
        setRole(new HospitalRole());
    }

    public String getFitnessCenterID() {
        return fitnessCenterID;
    }

    public void setFitnessCenterID(String fitnessCenterID) {
        this.fitnessCenterID = fitnessCenterID;
    }

    public String getFitnessCenterName() {
        return fitnessCenterName;
    }

    public void setFitnessCenterName(String fitnessCenterName) {
        this.fitnessCenterName = fitnessCenterName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return fitnessCenterName;
    }
   
    
    
}


