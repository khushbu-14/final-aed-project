/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User.TempTable;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class ConsultDataDirectory {
    ArrayList<ConsultData> consultDataList = new ArrayList<>();

    public ArrayList<ConsultData> getConsultDataList() {
        return consultDataList;
    }

    public void setConsultDataList(ArrayList<ConsultData> consultDataList) {
        this.consultDataList = consultDataList;
    }

   public void addData(ConsultData data){
       consultDataList.add(data);
       }
   
     public void removeData(ConsultData data) {
        if (consultDataList != null) {
            consultDataList.remove(data);
        }
     }
}
