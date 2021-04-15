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
public class HospitalDepartment extends Business.UserAccount.UserAccount {
    String departmentID;
    String departmentName;
    String type;
    String contact;
    Double numberOfStaffs;
    Double numberOfBeds;

    public HospitalDepartment(String departmentID, String departmentName, String type, String contact, Double numberOfStaffs, Double numberOfBeds) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.type = type;
        this.contact = contact;
        this.numberOfStaffs = numberOfStaffs;
        this.numberOfBeds = numberOfBeds;
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
     public String toString() {
        return departmentName;
    }
}
