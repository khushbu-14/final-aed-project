/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User.MedicalConditions;

/**
 *
 * @author kunal
 */
public class CurrentMedications {
    private Test name;

    public CurrentMedications(Test name) {
        this.name = name;
    }
    
    public Test getName() {
        return name;
    }

    public void setName(Test name) {
        this.name = name;
    }
    
    
    
}
