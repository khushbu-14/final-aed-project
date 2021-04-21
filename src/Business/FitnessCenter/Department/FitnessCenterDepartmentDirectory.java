/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FitnessCenter.Department;

import Business.FitnessCenter.Department.FitnessCenterDepartment;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class FitnessCenterDepartmentDirectory {
    
    private ArrayList<FitnessCenterDepartment> departmentList = new ArrayList<>();

    public ArrayList<FitnessCenterDepartment> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<FitnessCenterDepartment> departmentList) {
        this.departmentList = departmentList;
    }
    
    public FitnessCenterDepartment addNewFitnessCenterDepartment(FitnessCenterDepartment fitdept) {
        departmentList.add(fitdept);
        return fitdept;
    }
    
    public void deleteFitnessCenterDepartment(FitnessCenterDepartment fitDept){
        if(departmentList != null){
            departmentList.remove(fitDept);
        }
    }
    
         public FitnessCenterDepartment getFitnessCenterDepartmentById(String id){
         FitnessCenterDepartment fitDept = null;
         for(FitnessCenterDepartment fitD: departmentList){
             if(fitD.getDepartmentID().equals(id)){
                 fitDept = fitD;
             }    
         }
         return fitDept;
     }
      public FitnessCenterDepartment getFitnessCenterDepartmentByUserName(String userName){
         FitnessCenterDepartment fitDept = null;
         for(FitnessCenterDepartment fitD: departmentList){
             if(fitD.getUsername().equals(userName)){
                 fitDept = fitD;
             }    
         }
         return fitDept;
     }
      
      public FitnessCenterDepartment getFitnessCenterDepartmentByName(String name){
         FitnessCenterDepartment fitDept = null;
         for(FitnessCenterDepartment fitD: departmentList){
             if(fitD.getDepartmentName().equals(name)){
                 fitDept = fitD;
             }    
         }
         return fitDept;
     }
      
      
       public void updateFitnessCenterDepartmentByUserName(String userName,String departmentName, String contact,String password){
          FitnessCenterDepartment fit = getFitnessCenterDepartmentByUserName(userName);
          fit.setDepartmentName(departmentName);
          //hosp.setType(type);
          fit.setContact(contact);
          fit.setPassword(password);
//          fit.setSchedule(schedule);
//          fit.setLocation(location);
//          fit.setIsRemote(isRemote);
          
      }
    
}
