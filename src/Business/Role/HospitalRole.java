/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HospitalAdminRole.HospitalWorkAreaPanel;


public class HospitalRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new HospitalWorkAreaPanel(userProcessContainer,account,business);
    }

}
