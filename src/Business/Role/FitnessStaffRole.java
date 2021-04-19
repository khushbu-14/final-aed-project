/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FitnessStaffRole.FitnessStaffWorkAreaPanel;

/**
 *
 * @author khushbu
 */
public class FitnessStaffRole extends Role {

//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
//        return new CustomerAreaJPanel(userProcessContainer, account);
//    }
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
//        return new CustomerAdminWorkAreaPanel(userProcessContainer, account, business);
        return new FitnessStaffWorkAreaPanel(userProcessContainer, account, business);

    }
}
