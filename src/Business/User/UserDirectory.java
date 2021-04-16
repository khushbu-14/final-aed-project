/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Staff.Staff;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class UserDirectory {

//    ArrayList<User> userList;
    ArrayList<User> userList = new ArrayList<User>();

    public ArrayList<User> getUserList() {
//        if (userList == null) {
//            userList = new ArrayList<>();
//        }
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

//    public User addNewUser(String name, String contact, String address, String email, String userName, String password) {
//        User user = new User(name, contact, address, email);
//        user.setUsername(userName);
//        user.setPassword(password);
//        userList.add(user);
//        return user;
//    }
    
    public void addNewUser(User user) {
        userList.add(user);
    }

//     public void deleteUser(String userName) {
//         User user = null;
//         for (User us : userList) {
//             if (us.getUsername().equals(userName)) {
//                 user = us;
//             }
//         }
//         userList.remove(user);
//     }
//     public User getUserByUserName(String userName) {
//         User user = null;
//         for (User usr : userList) {
//             if (usr.getUsername().equals(userName)) {
//                 user = usr;
//             }
//         }
//         return user;
//     }
//     public void deleteUser(String userName){
//         User user=null;
//         for(User us: userList){
//         if(us.getUsername().equals(userName)){
//             user=us;
//         }
//         }
//         userList.remove(user);
//     }
    public void deleteUser(User usr) {
        if (userList != null) {
            userList.remove(usr);
        }
    }

    public User getUserByUserName(String userName) {
        User user = null;
        for (User usr : userList) {
            if (usr.getUsername().equals(userName)) {
                user = usr;
            }
        }
        return user;
    }

    public void updateUserByUserName(String userName, String name, String contact, String address, String email, String password) {
        User usr = getUserByUserName(userName);
        usr.setName(name);
        usr.setContact(contact);
        usr.setAddress(address);
        usr.setEmail(email);
        usr.setPassword(password);
    }
}
