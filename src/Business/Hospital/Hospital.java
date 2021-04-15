/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author kunal
 */
public class Hospital extends Business.UserAccount.UserAccount{
    String hospitalID;
    String hospitalName;
    String contact;
    String address;
    String zipcode;

    public Hospital(String hospitalID, String hospitalName, String contact, String address, String zipcode) {
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
        this.contact = contact;
        this.address = address;
        this.zipcode = zipcode;
    }

    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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
    
     @Override
    public String toString() {
        return hospitalName;
    }
}