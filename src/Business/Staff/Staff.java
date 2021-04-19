/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import Business.Hospital.Department.HospitalDepartment;
import Business.Role.HospitalDepartmentRole;
import Business.Role.StaffRole;

/**
 *
 * @author kunal
 */
public class Staff extends Business.UserAccount.UserAccount {

    private String name;
    private String designation;
    private String contact;
    private String address;
    private String email;
    private String zipcode;
    private HospitalDepartment department;

    public Staff(String userName, String password, String name, String designation, String contact, String address, String email, String zipcode, HospitalDepartment department) {
        this.name = name;
        this.designation = designation;
        this.contact = contact;
        this.address = address;
        this.email = email;
        this.zipcode = zipcode;
        this.department = department;
        setPassword(password);
        setUsername(userName);
        setRole(new StaffRole());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public HospitalDepartment getDepartment() {
        return department;
    }

    public void setDepartment(HospitalDepartment department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}
