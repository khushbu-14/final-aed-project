/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Registration;

import Business.FitnessCenter.Department.FitnessCenterDepartment;
import Business.FitnessCenter.FitnessCenterDirectory;
import Business.Role.FitnessDepartmentRole;
import Business.Role.UserRole;
import Business.Staff.FcStaff;
import Business.Staff.Sessions;
import Business.Staff.SessionsDirectory;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author singh
 */
public class Registration extends Business.UserAccount.UserAccount {
    
    private String regID;
    private FitnessCenterDirectory fcdir;
    private FcStaff fcstaff;
    private Sessions sessions;

    /**
     *
     * @param userName
     * @param password
     * @param fcdir
     */
    
    
    public Registration(String userName, String password, Sessions sessions) {
        UUID uid = UUID.randomUUID();
        this.regID = uid.toString();
        this.fcdir = fcdir;
        this.fcstaff= fcstaff;
        this.sessions = sessions; 
       setPassword(password);
        setUsername(userName);
        setRole(new UserRole());

    
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    public FitnessCenterDirectory getFcdir() {
        return fcdir;
    }

    public void setFcdir(FitnessCenterDirectory fcdir) {
        this.fcdir = fcdir;
    }

    public FcStaff getFcstaff() {
        return fcstaff;
    }

    public void setFcstaff(FcStaff fcstaff) {
        this.fcstaff = fcstaff;
    }

    public Sessions getSessions() {
        return sessions;
    }

    public void setSessions(Sessions sessions) {
        this.sessions = sessions;
    }



    
    
}
