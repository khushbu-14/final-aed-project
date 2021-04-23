/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AmbulanceService;

import Business.User.User;

/**
 *
 * @author kunal
 */
public class Service {

    private String name;
    private String contact;
    private String status;
    private String oxygenAvailability;
    private String ambulanceType;
    private String customerName;
    private User user;
    private String companyIdentifier;
    private String userStatus;

    public Service(String name, String contact, String oxygenAvailability, String ambulanceType) {
        this.name = name;
        this.contact = contact;
        this.oxygenAvailability = oxygenAvailability;
        this.ambulanceType = ambulanceType;

    }

    public Service() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOxygenAvailability() {
        return oxygenAvailability;
    }

    public void setOxygenAvailability(String oxygenAvailability) {
        this.oxygenAvailability = oxygenAvailability;
    }

    public String getAmbulanceType() {
        return ambulanceType;
    }

    public void setAmbulanceType(String ambulanceType) {
        this.ambulanceType = ambulanceType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

    public void setCompanyIdentifier(String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    
    @Override
    public String toString() {
        return name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
