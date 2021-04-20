/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Registration;

import Business.WorkQueue.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class RegistrationDirectory {
    private ArrayList<Registration> regList = new ArrayList<Registration>();

    public ArrayList<Registration> getRegList() {
        
        return regList;
    }

    public void setRegList(ArrayList<Registration> regList) {
        this.regList = regList;
    }
    
    
    
    
}
