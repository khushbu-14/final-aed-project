/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import Business.Hospital.Department.HospitalDepartment;
import Business.Shop.Shop;
import Business.User.User;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class FcStaffDirectory {
    private ArrayList<FcStaff> staffList = new ArrayList<>();

    public ArrayList<FcStaff> getStaffList() {
//                if(staffList==null){
//        staffList = new ArrayList<>();
//        }
        return staffList;
    }

    public void setStaffList(ArrayList<FcStaff> staffList) {
        this.staffList = staffList;
    }

    
     
     public FcStaff addNewStaff(FcStaff fcstaff) {
        staffList.add(fcstaff);
        return fcstaff;
    }
      public void deleteStaff(FcStaff stf){
        if(staffList != null){
            staffList.remove(stf);
        }
    }
     
      public FcStaff getStaffByUserName(String userName){
         FcStaff staff = null;
         for(FcStaff st: staffList){
             if(st.getUsername() != null && st.getUsername().equals(userName)){
                 staff = st;
             }    
         }
         return staff;
     }
      public void updateStaffByUserName(String userName, String name,String designation,String contact, String address, String email,String password){
          FcStaff st = getStaffByUserName(userName);
          st.setName(name);
          st.setDesignation(designation);
          st.setContact(contact);
          st.setAddress(address);
          st.setEmail(email);
          st.setPassword(password);
      }
      
    
}
