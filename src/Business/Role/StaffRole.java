/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.StaffRole.StaffWorkAreaPanel;

/**
 *
 * @author khushbu
 */
public class StaffRole extends Role {

    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
//        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
//    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new StaffWorkAreaPanel(userProcessContainer, account, business);
    }
}
