/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AmbulanceService;

import Business.Role.AmbulanceServiceRole;
import Business.Role.HospitalDepartmentRole;
import java.util.UUID;

/**
 *
 * @author kunal
 */
public class AmbulanceService extends Business.UserAccount.UserAccount{
    private String id;
    private String name;
    private String contact;
    private String address;
    private String zipcode;
    private String email;
    private ServiceDirectory serviceDirectory;
    public AmbulanceService(String userName, String password, String name, String contact, String email, String address, String zipcode) {
        UUID uid = UUID.randomUUID();
        this.id = uid.toString();
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.zipcode = zipcode;
        this.email = email;
        setPassword(password);
        setUsername(userName);
        setRole(new AmbulanceServiceRole());
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public ServiceDirectory getServiceDirectory() {
        if(serviceDirectory == null){
        serviceDirectory = new ServiceDirectory();
        }
        return serviceDirectory;
    }

    public void setServiceDirectory(ServiceDirectory serviceDirectory) {
        this.serviceDirectory = serviceDirectory;
    }
    
    
    
     @Override
    public String toString() {
        return name;
    }
    
    
}
