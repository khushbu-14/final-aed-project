/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

//import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.User.User;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public void updateUserAccount(UserAccount userAccount, String username, String password) {
        userAccount.setUsername(username);
        userAccount.setPassword(password);
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equalsIgnoreCase(username)) {
                return false;
            }
        }
        return true;
    }

    public UserAccount addUserAccount(UserAccount userAccount) {
        userAccountList.add(userAccount);
        return userAccount;
    }

    public void removeUserAccount(UserAccount user) {
        userAccountList.remove(user);
    }
}
