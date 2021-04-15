/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AmbulanceService;

import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class AmbulanceDirectory {
    private ArrayList<AmbulanceService> ambulanceList = new ArrayList<>();

    public ArrayList<AmbulanceService> getHospitalList() {
//        if(ambulanceList==null){
//        ambulanceList = new ArrayList<>();
//        }
        return ambulanceList;
    }

    public void setHospitalList(ArrayList<AmbulanceService> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }
     public AmbulanceService addNewAmbulanceService(AmbulanceService ambulanceService) {
        ambulanceList.add(ambulanceService);
        return ambulanceService;
    }
    
//     public AmbulanceService addNewAmbulanceService(String name, String contact, String address, String email, String userId, String password ){
//        AmbulanceService amb = new AmbulanceService(name,contact,address,email);
//        amb.setUsername(userId);
//        amb.setPassword(password);
//        ambulanceList.add(amb);
//        return amb;
//    }

//     public void deleteHospital(String userName){
//         Hospital hospital=null;
//         for(Hospital hosp: ambulanceList){
//         if(hosp.getUsername().equals(userName)){
//             hospital=hosp;
//         }
//         }
//         ambulanceList.remove(hospital);
//     }
     public void deleteAmbulanceService(AmbulanceService amb){
        if(ambulanceList != null){
            ambulanceList.remove(amb);
        }
    }
     
     public AmbulanceService getAmbulanceServiceById(String id){
         AmbulanceService amb = null;
         for(AmbulanceService ambi: ambulanceList){
             if(ambi.getId().equals(id)){
                 amb = ambi;
             }    
         }
         return amb;
     }
      public AmbulanceService getAmbulanceServiceByUserName(String userName){
         AmbulanceService amb = null;
         for(AmbulanceService ambi: ambulanceList){
             if(ambi.getUsername().equals(userName)){
                 amb = ambi;
             }    
         }
         return amb;
     }
      
      public void updateAmbulanceServiceByUserName(String userName,String name, String contact, String address,String email, String password){
          AmbulanceService amb = getAmbulanceServiceByUserName(userName);
          amb.setName(name);
          amb.setContact(contact);
          amb.setAddress(address);
          amb.setEmail(email);
          amb.setPassword(password);
      }
    
}
