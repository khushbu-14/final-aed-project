/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.HospitalAdminRole.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;


public class HospitalRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer);
    }

}
