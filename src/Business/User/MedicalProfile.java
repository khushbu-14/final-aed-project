/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.User.MedicalConditions.Allergies;
import Business.User.MedicalConditions.ChronicDisease;
import Business.User.MedicalConditions.CurrentMedications;
import Business.User.MedicalConditions.PastMedications;
import Business.User.MedicalConditions.Surgeries;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class MedicalProfile {
    private String name;
    private String contact;
    private String email;
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
    private ArrayList<Allergies> allergyList;
    private ArrayList<ChronicDisease> chronicDiseaseList;
    private ArrayList<CurrentMedications> currentMedicationList;
    private ArrayList<PastMedications> pastMedicationList;
    private ArrayList<Surgeries> surgeriesyList;

    public MedicalProfile(String name, String contact, String email, String gender, String dob, String bloodGroup, String maritalStatus, String height, String weight, String emergencyContact, String location, String smokingHabits, String alcoholConsumption, String activityLevel, String foodPreferences, String occupations) {
        this.name = name;
        this.contact = contact;
        this.email = email;
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
        this.surgeriesyList=new ArrayList<>();
        this.chronicDiseaseList = new ArrayList<>();
        this.currentMedicationList = new ArrayList<>();
        this.pastMedicationList = new ArrayList<>();
        this.surgeriesyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public ArrayList<Allergies> getAllergyList() {
         if(allergyList==null){
        allergyList= new ArrayList<>();
        }
        return allergyList;
    }

    public void setAllergyList(ArrayList<Allergies> allergyList) {
        this.allergyList = allergyList;
    }

    public ArrayList<ChronicDisease> getChronicDiseaseList() {
         if(chronicDiseaseList==null){
        chronicDiseaseList= new ArrayList<>();
        }
        return chronicDiseaseList;
    }

    public void setChronicDiseaseList(ArrayList<ChronicDisease> chronicDiseaseList) {
        this.chronicDiseaseList = chronicDiseaseList;
    }

    public ArrayList<CurrentMedications> getCurrentMedicationList() {
         if(currentMedicationList==null){
        currentMedicationList= new ArrayList<>();
        }
        return currentMedicationList;
    }

    public void setCurrentMedicationList(ArrayList<CurrentMedications> currentMedicationList) {
        this.currentMedicationList = currentMedicationList;
    }

    public ArrayList<PastMedications> getPastMedicationList() {
        if(pastMedicationList==null){
        pastMedicationList= new ArrayList<>();
        }
        return pastMedicationList;
    }

    public void setPastMedicationList(ArrayList<PastMedications> pastMedicationList) {
        this.pastMedicationList = pastMedicationList;
    }

    public ArrayList<Surgeries> getSurgeriesyList() {
        if(surgeriesyList==null){
        surgeriesyList= new ArrayList<>();
        }
        return surgeriesyList;
    }

    public void setSurgeriesyList(ArrayList<Surgeries> surgeriesyList) {
        this.surgeriesyList = surgeriesyList;
    }
    
    
    
    
    public void addAllergies(Allergies medC){
        allergyList.add(medC);
    }
    public void removeAllergies(Allergies medC){
        allergyList.remove(medC);
    }
    
    public void addChronicDisease(ChronicDisease medC){
        chronicDiseaseList.add(medC);
    }
    public void removeChronicDisease(ChronicDisease medC){
        chronicDiseaseList.remove(medC);
    }
    
    public void addCurrentMedication(CurrentMedications medC){
        currentMedicationList.add(medC);
    }
    public void removeCurrentMedication(CurrentMedications medC){
        currentMedicationList.remove(medC);
    }
    
    public void addPastMedications(PastMedications medC){
        pastMedicationList.add(medC);
    }
    public void removePastMedications(PastMedications medC){
        pastMedicationList.remove(medC);
    }
    
    public void addSurgeries(Surgeries medC){
        surgeriesyList.add(medC);
    }
    public void removeSurgeries(Surgeries medC){
        surgeriesyList.remove(medC);
    }
    
}
