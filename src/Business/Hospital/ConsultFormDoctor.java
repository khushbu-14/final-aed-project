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
public class ConsultFormDoctor {
    private String docsPrescription;
    private String docsComment;
    private String nextConsulationDate;
    private String prescriptionDate;
    private String docsName;
    private String docsDesignation;
    
    
    
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

    public String getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(String prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public String getDocsName() {
        return docsName;
    }

    public void setDocsName(String docsName) {
        this.docsName = docsName;
    }

    public String getDocsDesignation() {
        return docsDesignation;
    }

    public void setDocsDesignation(String docsDesignation) {
        this.docsDesignation = docsDesignation;
    }

   
    
    
    @Override
    public String toString() {
        return docsComment;
    }
}
