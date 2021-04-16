/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Type;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class TypeDirectory {
    
     private ArrayList<Type> typeList = new ArrayList<>();

    public ArrayList<Type> getTypeList() {
        return typeList;
    }

    public void setTypeList(ArrayList<Type> typeList) {
        this.typeList = typeList;
    }
    
     public Type addNewType(Type type) {
        typeList.add(type);
        return type;
    }
      public void deleteType(Type type){
        if(typeList != null){
            typeList.remove(type);
        }
    }
       
    
}
