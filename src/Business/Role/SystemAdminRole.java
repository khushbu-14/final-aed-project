/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel2;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel1;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel2;

/**
 *
 * @author kunal
 */
public class SystemAdminRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
//        return new SystemAdminWorkAreaJPanel1(userProcessContainer, system);
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }

}
