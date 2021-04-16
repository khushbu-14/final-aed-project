/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */

public abstract class Role {

    public enum RoleType {
        HospitalAdmin("HospitalAdmin"),
        Shops("Shops"),
        Users("Users"),
        FitnessCenterAdmin("FitnessCenterAdmin"),
        AmbulanceServiceAdmin("AmbulanceServiceAdmin"),
        SysAdmin("Sysadmin"),
        SysAdminReqHandler("SystemAdminReqHandler"),
        HospitalDepartment("HospitalDepartment"),
        FitnessDepartment("FitnessDepartment"),
        DeliveryMan("DeliveryMan");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
