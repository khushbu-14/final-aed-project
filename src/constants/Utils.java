/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

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
}
