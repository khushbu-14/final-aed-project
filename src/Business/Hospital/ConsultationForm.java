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
    private Boolean isFever;
    private Boolean isCough;
    private Boolean isBodyPain;
    private Boolean isBreathingIssue;
    private Boolean isOther;
    private String feverRange;
    private String feverDays;
    private String coughSeverity;
    private String coughDays;
    private String bodyPainSeverity;
    private String bodyPainDays;
    private String breathingSeverity;
    private String breathingDays;
    private String otherMessage;
    private String docsPrescription;
    private String docsComment;
    private String nextConsulationDate;

    public ConsultationForm(Boolean isFever, Boolean isCough, Boolean isBodyPain, Boolean isBreathingIssue, Boolean isOther, String feverRange, String feverDays, String coughSeverity, String coughDays, String bodyPainSeverity, String bodyPainDays, String breathingSeverity, String breathingDays, String otherMessage, String docsPrescription, String docsComment, String nextConsulationDate) {
        this.isFever = isFever;
        this.isCough = isCough;
        this.isBodyPain = isBodyPain;
        this.isBreathingIssue = isBreathingIssue;
        this.isOther = isOther;
        this.feverRange = feverRange;
        this.feverDays = feverDays;
        this.coughSeverity = coughSeverity;
        this.coughDays = coughDays;
        this.bodyPainSeverity = bodyPainSeverity;
        this.bodyPainDays = bodyPainDays;
        this.breathingSeverity = breathingSeverity;
        this.breathingDays = breathingDays;
        this.otherMessage = otherMessage;
        this.docsPrescription = docsPrescription;
        this.docsComment = docsComment;
        this.nextConsulationDate = nextConsulationDate;
    }

    public Boolean getIsFever() {
        return isFever;
    }

    public void setIsFever(Boolean isFever) {
        this.isFever = isFever;
    }

    public Boolean getIsCough() {
        return isCough;
    }

    public void setIsCough(Boolean isCough) {
        this.isCough = isCough;
    }

    public Boolean getIsBodyPain() {
        return isBodyPain;
    }

    public void setIsBodyPain(Boolean isBodyPain) {
        this.isBodyPain = isBodyPain;
    }

    public Boolean getIsBreathingIssue() {
        return isBreathingIssue;
    }

    public void setIsBreathingIssue(Boolean isBreathingIssue) {
        this.isBreathingIssue = isBreathingIssue;
    }

    public Boolean getIsOther() {
        return isOther;
    }

    public void setIsOther(Boolean isOther) {
        this.isOther = isOther;
    }

    public String getFeverRange() {
        return feverRange;
    }

    public void setFeverRange(String feverRange) {
        this.feverRange = feverRange;
    }

    public String getFeverDays() {
        return feverDays;
    }

    public void setFeverDays(String feverDays) {
        this.feverDays = feverDays;
    }

    public String getCoughSeverity() {
        return coughSeverity;
    }

    public void setCoughSeverity(String coughSeverity) {
        this.coughSeverity = coughSeverity;
    }

    public String getCoughDays() {
        return coughDays;
    }

    public void setCoughDays(String coughDays) {
        this.coughDays = coughDays;
    }

    public String getBodyPainSeverity() {
        return bodyPainSeverity;
    }

    public void setBodyPainSeverity(String bodyPainSeverity) {
        this.bodyPainSeverity = bodyPainSeverity;
    }

    public String getBodyPainDays() {
        return bodyPainDays;
    }

    public void setBodyPainDays(String bodyPainDays) {
        this.bodyPainDays = bodyPainDays;
    }

    public String getBreathingSeverity() {
        return breathingSeverity;
    }

    public void setBreathingSeverity(String breathingSeverity) {
        this.breathingSeverity = breathingSeverity;
    }

    public String getBreathingDays() {
        return breathingDays;
    }

    public void setBreathingDays(String breathingDays) {
        this.breathingDays = breathingDays;
    }

    public String getOtherMessage() {
        return otherMessage;
    }

    public void setOtherMessage(String otherMessage) {
        this.otherMessage = otherMessage;
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
    
}
