/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import Business.User.User;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class StaffDirectory {
    private ArrayList<Staff> staffList;

    public ArrayList<Staff> getStaffList() {
        if(staffList==null){
        staffList = new ArrayList<>();
        }
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }
    
    public Staff addNewStaff(String name,String designation,String contact, String address, String email, String userName, String password ){
        Staff staff = new Staff(name,designation,contact,address,email);
        staff.setUsername(userName);
        staff.setPassword(password);
        staffList.add(staff);
        return staff;
    }

     public void deleteStaff(String userName){
         Staff staff=null;
         for(Staff st: staffList){
         if(st.getUsername().equals(userName)){
             staff=st;
         }
         }
         staffList.remove(staff);
     }
     
     
      public Staff getStaffByUserName(String userName){
         Staff staff = null;
         for(Staff st: staffList){
             if(st.getUsername().equals(userName)){
                 staff = st;
             }    
         }
         return staff;
     }
      public void updateStaffByUserName(String userName, String name,String designation,String contact, String address, String email,String password){
          Staff st = getStaffByUserName(userName);
          st.setName(name);
          st.setDesignation(designation);
          st.setContact(contact);
          st.setAddress(address);
          st.setEmail(email);
          st.setPassword(password);
      }
      
    
}
