/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Department;

import Business.Role.HospitalDepartmentRole;
import Business.Role.HospitalRole;
import Business.Shop.ShopDirectory;
import Business.Staff.StaffDirectory;
import java.util.UUID;

/**
 *
 * @author kunal
 */
public class HospitalDepartment extends Business.UserAccount.UserAccount {

    private String departmentID;
    private String departmentName;
    private String type;
    private String contact;
    private String email;
    private Double numberOfStaffs;
    private Double numberOfBeds;
    private StaffDirectory staffDirectory;

    public HospitalDepartment(String departmentName, String type, String contact, String email, Double numberOfBeds) {
        UUID uid = UUID.randomUUID();
        this.departmentID = uid.toString();
        this.departmentName = departmentName;
        this.type = type;
        this.contact = contact;
        this.email = email;
        this.numberOfBeds = numberOfBeds;
//        setPassword(password);
//        setUsername(userName);
//        setRole(new HospitalDepartmentRole());
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Double getNumberOfStaffs() {
        return numberOfStaffs;
    }

    public void setNumberOfStaffs(Double numberOfStaffs) {
        this.numberOfStaffs = numberOfStaffs;
    }

    public Double getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Double numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StaffDirectory getStaffDirectory() {
        if (staffDirectory == null) {
            staffDirectory = new StaffDirectory();
        }
        return staffDirectory;
    }

    public void setStaffDirectory(StaffDirectory staffDirectory) {
        this.staffDirectory = staffDirectory;
    }

    public String toString() {
        return departmentName;
    }

}
