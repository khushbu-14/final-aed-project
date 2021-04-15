/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class HospitalDepartmentDirectory {
    private ArrayList<HospitalDepartment> departmentList;

    public ArrayList<HospitalDepartment> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<HospitalDepartment> departmentList) {
        this.departmentList = departmentList;
    }
    
    public HospitalDepartment addNewHospitalDepartment(String departmentID, String departmentName,String type, String contact, int numberOfStaffs, int numberOfBeds, String userId, String password ){
        HospitalDepartment hospitalDept = new HospitalDepartment(departmentID,departmentName,type,contact,numberOfStaffs,numberOfBeds);
        hospitalDept.setUsername(userId);
        hospitalDept.setPassword(password);
        departmentList.add(hospitalDept);
        return hospitalDept;
    }

     public void deleteHospitalDepartment(String userName){
         HospitalDepartment hospitalDept=null;
         for(HospitalDepartment hospD: departmentList){
         if(hospD.getUsername().equals(userName)){
             hospitalDept=hospD;
         }
         }
         departmentList.remove(hospitalDept);
     }
     
     
     public HospitalDepartment getHospitalDepartmentById(String id){
         HospitalDepartment hospitalDept = null;
         for(HospitalDepartment hospD: departmentList){
             if(hospD.getDepartmentID().equals(id)){
                 hospitalDept = hospD;
             }    
         }
         return hospitalDept;
     }
      public HospitalDepartment getHospitalDepartmentByUsserName(String userName){
         HospitalDepartment hospitalDept = null;
         for(HospitalDepartment hospD: departmentList){
             if(hospD.getUsername().equals(userName)){
                 hospitalDept = hospD;
             }    
         }
         return hospitalDept;
     }
}
