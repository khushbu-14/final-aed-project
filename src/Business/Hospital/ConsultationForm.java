/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author kunal
 */
public class ConsultationForm {
    private String diseaseName;
    private String range;
    private String days;
    private String message;
    private String docsPrescription;
    private String docsComment;
    private String nextConsulationDate;

    public ConsultationForm(String diseaseName, String range, String days, String message) {
        this.diseaseName = diseaseName;
        this.range = range;
        this.days = days;
        this.message = message;
    }

    
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDocsPrescription() {
        return docsPrescription;
    }

    public void setDocsPrescription(String docsPrescription) {
        this.docsPrescription = docsPrescription;
    }

    public String getDocsComment() {
        return docsComment;
    }

    public void setDocsComment(String docsComment) {
        this.docsComment = docsComment;
    }

    public String getNextConsulationDate() {
        return nextConsulationDate;
    }

    public void setNextConsulationDate(String nextConsulationDate) {
        this.nextConsulationDate = nextConsulationDate;
    }

     @Override
    public String toString() {
        return diseaseName;
    }
}
