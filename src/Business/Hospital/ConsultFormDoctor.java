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
        return docsComment;
    }
}
