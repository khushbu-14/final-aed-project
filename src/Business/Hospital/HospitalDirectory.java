/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Shop.Shop;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospitalList() {
        if(hospitalList==null){
        hospitalList = new ArrayList<>();
        }
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
     public Hospital addNewHospital(String hospitalID, String hospitalName, String contact, String address, String zipcode, String userId, String password ){
        Hospital hospital = new Hospital(hospitalID,hospitalName,contact,address,zipcode);
        hospital.setUsername(userId);
        hospital.setPassword(password);
        hospitalList.add(hospital);
        return hospital;
    }

     public void deleteHospital(String userName){
         Hospital hospital=null;
         for(Hospital hosp: hospitalList){
         if(hosp.getUsername().equals(userName)){
             hospital=hosp;
         }
         }
         hospitalList.remove(hospital);
     }
     
     
     public Hospital getHospitalById(String id){
         Hospital hospital = null;
         for(Hospital hosp: hospitalList){
             if(hosp.getHospitalID().equals(id)){
                 hospital = hosp;
             }    
         }
         return hospital;
     }
      public Hospital getHospitalByUserName(String userName){
         Hospital hospital = null;
         for(Hospital hosp: hospitalList){
             if(hosp.getUsername().equals(userName)){
                 hospital = hosp;
             }    
         }
         return hospital;
     }
      
      public void updateHospitalByUserName(String userName,String hospitalName, String contact, String address, String zipcode, String password){
          Hospital hosp = getHospitalByUserName(userName);
          hosp.setHospitalName(hospitalName);
          hosp.setContact(contact);
          hosp.setAddress(address);
          hosp.setZipcode(zipcode);
          hosp.setPassword(password);
      }
}
