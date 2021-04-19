/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class MedicalProfile extends Business.User.User{
    private String gender;
    private String dob;
    private String bloodGroup;
    private String maritalStatus;
    private String height;
    private String weight;
    private String emergencyContact;
    private String location;
    private String smokingHabits;
    private String alcoholConsumption;
    private String activityLevel;
    private String foodPreferences;
    private String occupations;
    private ArrayList<String> allergyList;
    private ArrayList<String> chronicDiseaseList;
    private ArrayList<String> currentMedicationList;
    private ArrayList<String> pastMedicationList;
    private ArrayList<String> surgeryList;

    public MedicalProfile(String name, String contact, String email,String gender, String dob, String bloodGroup, String maritalStatus, String height, String weight, String emergencyContact, String location, String smokingHabits, String alcoholConsumption, String activityLevel, String foodPreferences, String occupations) {
        this.gender = gender;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.maritalStatus = maritalStatus;
        this.height = height;
        this.weight = weight;
        this.emergencyContact = emergencyContact;
        this.location = location;
        this.smokingHabits = smokingHabits;
        this.alcoholConsumption = alcoholConsumption;
        this.activityLevel = activityLevel;
        this.foodPreferences = foodPreferences;
        this.occupations = occupations;
        this.allergyList=new ArrayList<>();
        this.chronicDiseaseList = new ArrayList<>();
        this.currentMedicationList = new ArrayList<>();
        this.pastMedicationList = new ArrayList<>();
        this.surgeryList = new ArrayList<>();
        setName(name);
        setContact(contact);
        setEmail(email);
        
    }

    public MedicalProfile() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSmokingHabits() {
        return smokingHabits;
    }

    public void setSmokingHabits(String smokingHabits) {
        this.smokingHabits = smokingHabits;
    }

    public String getAlcoholConsumption() {
        return alcoholConsumption;
    }

    public void setAlcoholConsumption(String alcoholConsumption) {
        this.alcoholConsumption = alcoholConsumption;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(String foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public String getOccupations() {
        return occupations;
    }

    public void setOccupations(String occupations) {
        this.occupations = occupations;
    }

    public ArrayList<String> getAllergyList() {
         if(allergyList==null){
        allergyList= new ArrayList<>();
        }
        return allergyList;
    }

    public void setAllergyList(ArrayList<String> allergyList) {
        this.allergyList = allergyList;
    }

    public ArrayList<String> getChronicDiseaseList() {
         if(chronicDiseaseList==null){
        chronicDiseaseList= new ArrayList<>();
        }
        return chronicDiseaseList;
    }

    public void setChronicDiseaseList(ArrayList<String> chronicDiseaseList) {
        this.chronicDiseaseList = chronicDiseaseList;
    }

    public ArrayList<String> getCurrentMedicationList() {
         if(currentMedicationList==null){
        currentMedicationList= new ArrayList<>();
        }
        return currentMedicationList;
    }

    public void setCurrentMedicationList(ArrayList<String> currentMedicationList) {
        this.currentMedicationList = currentMedicationList;
    }

    public ArrayList<String> getPastMedicationList() {
        if(pastMedicationList==null){
        pastMedicationList= new ArrayList<>();
        }
        return pastMedicationList;
    }

    public void setPastMedicationList(ArrayList<String> pastMedicationList) {
        this.pastMedicationList = pastMedicationList;
    }

    public ArrayList<String> getSurgeriesyList() {
        if(surgeryList==null){
        surgeryList= new ArrayList<>();
        }
        return surgeryList;
    }

    public void setSurgeriesyList(ArrayList<String> surgeryList) {
        this.surgeryList = surgeryList;
    }
    
    public void addAllergies(String medC){
        allergyList.add(medC);
    }
    public void removeAllergies(String medC){
        allergyList.remove(medC);
    }
    
    public void addChronicDisease(String medC){
        chronicDiseaseList.add(medC);
    }
    public void removeChronicDisease(String medC){
        chronicDiseaseList.remove(medC);
    }
    
    public void addCurrentMedication(String medC){
        currentMedicationList.add(medC);
    }
    public void removeCurrentMedication(String medC){
        currentMedicationList.remove(medC);
    }
    
    public void addPastMedications(String medC){
        pastMedicationList.add(medC);
    }
    public void removePastMedications(String medC){
        pastMedicationList.remove(medC);
    }
    
    public void addSurgeries(String medC){
        surgeryList.add(medC);
    }
    public void removeSurgeries(String medC){
        surgeryList.remove(medC);
    }
    
}
