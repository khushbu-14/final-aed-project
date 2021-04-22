/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import Business.Role.FitnessDepartmentRole;
import Business.Role.FitnessStaffRole;
import java.util.UUID;

/**
 *
 * @author singh
 */
public class Sessions extends Business.UserAccount.UserAccount {
    
    private String sessionID;
    private String name;
    private String sessionDate;
    private String startTime;
    private String endTime;
    private String isRemote;
    private String location;
    private String regStatus;
    private String finduser;
    
    public Sessions( String name, String sessionDate, String startTime, String endTime, String isRemote, String location){
    
        //String userName, String password,
        UUID uid = UUID.randomUUID();
        this.sessionID = uid.toString();
        this.name = name;
        this.sessionDate=sessionDate;
        this.startTime=startTime;
        this.endTime=endTime;
        this.isRemote= isRemote;
        this.location = location;
       //setPassword(password);
       // setUsername(userName);
        setRole(new FitnessStaffRole());
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(String isRemote) {
        this.isRemote = isRemote;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public String getFinduser() {
        return finduser;
    }

    public void setFinduser(String finduser) {
        this.finduser = finduser;
    }
    
    
    
     @Override
    public String toString() {
        return name;
    }
    
    
}
