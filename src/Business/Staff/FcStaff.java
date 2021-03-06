/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import Business.FitnessCenter.Department.FitnessCenterDepartment;
import Business.FitnessCenter.FitnessCenter;
import Business.Hospital.Department.HospitalDepartment;
import Business.Role.FitnessDepartmentRole;
import Business.Role.FitnessStaffRole;
import Business.Role.HospitalDepartmentRole;
import Business.Role.ShopsRole;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class FcStaff extends Business.UserAccount.UserAccount {

    private String name;
    private String designation;
    private String contact;
    private String address;
    private String email;
    private String zipcode;
    private FitnessCenterDepartment department;
    private SessionsDirectory sdir;
    private SessionsDirectory registerSessDir;

    public FcStaff(String userName, String password, String name, String designation, String contact, String address, String email, String zipcode, FitnessCenterDepartment department) {
        this.name = name;
        this.designation = designation;
        this.contact = contact;
        this.address = address;
        this.email = email;
        this.zipcode = zipcode;
        this.department = department;
        setPassword(password);
        setUsername(userName);
        setRole(new FitnessStaffRole());
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

    public FitnessCenterDepartment getDepartment() {
        return department;
    }

    public void setDepartment(FitnessCenterDepartment department) {
        this.department = department;
    }

    public SessionsDirectory getSdir() {
        if (sdir == null) {
            sdir = new SessionsDirectory();
        }
        return sdir;
    }

    public void setSdir(SessionsDirectory sdir) {
        this.sdir = sdir;
    }

    public SessionsDirectory getRegisterSessDir() {
                if(registerSessDir==null){
       registerSessDir = new SessionsDirectory();
       }
        return registerSessDir;
    }

    public void setRegisterSessDir(SessionsDirectory registerSessDir) {
        this.registerSessDir = registerSessDir;
    }
    
    
    
     @Override
    public String toString() {
        return name;
    }

}
