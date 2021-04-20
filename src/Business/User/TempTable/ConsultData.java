/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User.TempTable;

/**
 *
 * @author kunal
 */
public class ConsultData {
    private String disease;
    private String severity;
    private String days;
    private String comments;

    public ConsultData(String disease, String severity, String days, String comments) {
        this.disease = disease;
        this.severity = severity;
        this.days = days;
        this.comments = comments;
    }



    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
