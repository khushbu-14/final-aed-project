/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author khushbu
 */
public class Utils {

    public Utils() {
    }

    public Boolean isStringInputValid(String value) {
        Boolean result = false;
        if (value != null && !"".equals(value.trim())) {
            result = true;
        }
        return result;
    }

    public Boolean isFloatInputValid(float value) {
        Boolean result = false;
        if (value > 0 && value < 100) {
            result = true;
        }
        return result;
    }

    public int countOfString(String val) {
        int count = 0;
        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public Boolean isEmailValid(String email) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        Boolean res = matcher.matches();

        return res;
    }

    public void showErrorToast(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
