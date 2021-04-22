/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FitnessCenter.Department;

import Business.Role.FitnessDepartmentRole;
import Business.Staff.FcStaffDirectory;
import java.util.UUID;

/**
 *
 * @author singh
 */
public class FitnessCenterDepartment extends Business.UserAccount.UserAccount {
    
    private String departmentID;
    private String departmentName;
    private String type;
    private String contact;
    private String schedule;
    private String location;
    private String isRemote;
    private FcStaffDirectory staffDirectory;

   
    
      public FitnessCenterDepartment(String departmentName, String type, String contact) {
        UUID uid = UUID.randomUUID();
        this.departmentID = uid.toString();
        this.departmentName = departmentName;
        this.type = type;
        this.contact = contact;
        //this.email = email;
        //this.numberOfBeds = numberOfBeds;
//        setPassword(password);
//        setUsername(userName);
//        setRole(new FitnessDepartmentRole());
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

//    public String getSchedule() {
//        return schedule;
//    }
//
//    public void setSchedule(String schedule) {
//        this.schedule = schedule;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getIsRemote() {
//        return isRemote;
//    }
//
//    public void setIsRemote(String isRemote) {
//        this.isRemote = isRemote;
//    }

    public FcStaffDirectory getStaffDirectory() {
        if(staffDirectory == null){
        staffDirectory = new FcStaffDirectory();
        }
        return staffDirectory;
    }

    public void setStaffDirectory(FcStaffDirectory staffDirectory) {
        this.staffDirectory = staffDirectory;
    }
    
    
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return departmentName;
    }
    
}
