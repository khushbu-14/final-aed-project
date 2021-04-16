/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FitnessCenter;

import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class FitnessCenterDirectory {
    
    private ArrayList<FitnessCenter> fitnessCenterList = new ArrayList<>();

    public ArrayList<FitnessCenter> getFitnessCenterList() {
        return fitnessCenterList;
    }

    public void setFitnessCenterList(ArrayList<FitnessCenter> fitnessCenterList) {
        this.fitnessCenterList = fitnessCenterList;
    }
    
   

    public FitnessCenter addNewFitnessCenter(FitnessCenter fitnessCenter) {
        fitnessCenterList.add(fitnessCenter);
        return fitnessCenter;
    }

    public void removeFitnessCenter(FitnessCenter f) {
        if (fitnessCenterList != null) {
            fitnessCenterList.remove(f);
        }
    }

    public FitnessCenter getFitnessCenterById(String id) {
        FitnessCenter fitnessCenter = null;
        for (FitnessCenter fit : fitnessCenterList) {
            if (fit.getFitnessCenterID().equals(id)) {
                fitnessCenter = fit;
            }
        }
        return fitnessCenter;
    }

    public FitnessCenter getFitnessCenterByUserName(String userName) {
        FitnessCenter fitnessCenter = null;
        for (FitnessCenter fit : fitnessCenterList) {
            if (fit.getUsername().equals(userName)) {
                fitnessCenter = fit;
            }
        }
        return fitnessCenter;
    }

    public void updateFitnessCenterByUserName(String userName, String fitnessCenterName, String contact, String address, String zipcode, String password) {
        FitnessCenter fit = getFitnessCenterByUserName(userName);
        fit.setFitnessCenterName(fitnessCenterName);
        fit.setContact(contact);
        fit.setAddress(address);
        fit.setZipcode(zipcode);
        fit.setPassword(password);
    }
    
}
