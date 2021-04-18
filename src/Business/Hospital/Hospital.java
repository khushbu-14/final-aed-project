/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Hospital.Department.HospitalDepartmentDirectory;
import Business.Role.HospitalRole;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author kunal
 */
public class Hospital extends Business.UserAccount.UserAccount {

    private String hospitalID;
    private String hospitalName;
    private String contact;
    private String address;
    private String zipcode;
    private HospitalDepartmentDirectory departmentDirectory;

    public Hospital(String username, String password, String hospitalName, String contact, String address, String zipcode) {
        UUID uid = UUID.randomUUID();
        this.hospitalID = uid.toString();
        this.hospitalName = hospitalName;
        this.contact = contact;
        this.address = address;
        this.zipcode = zipcode;
        setPassword(password);
        setUsername(username);
        setRole(new HospitalRole());
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

    public HospitalDepartmentDirectory getDepartmentDirectory() {
        if (departmentDirectory == null) {
            departmentDirectory = new HospitalDepartmentDirectory();
        }
        return departmentDirectory;
    }

    public void setDepartmentDirectory(HospitalDepartmentDirectory departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }

}
