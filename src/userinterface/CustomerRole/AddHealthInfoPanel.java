/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.User.User;
import constants.Utils;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ManageUserPanel;

/**
 *
 * @author khushbu
 */
public class AddHealthInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonalInfoPanel
     */
    private JPanel mainWorkArea;
    private EcoSystem ecosystem;

    Utils util;
    private User user;

    public AddHealthInfoPanel(JPanel mainWorkArea, EcoSystem ecosystem, User user) throws ParseException {
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.user = user;
        initComponents();
        util = new Utils();
        setData();
        btnSubmit.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorEmail = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblUsername5 = new javax.swing.JLabel();
        jComboMaritalStatus = new javax.swing.JComboBox<>();
        lblUsername6 = new javax.swing.JLabel();
        jComboSmokingHabbits = new javax.swing.JComboBox<>();
        lblUsername7 = new javax.swing.JLabel();
        jComboAlcohol = new javax.swing.JComboBox<>();
        jComboActivity = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboOccupation = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboFood = new javax.swing.JComboBox<>();
        errorContactNumber = new javax.swing.JLabel();
        txtContactEmergency = new javax.swing.JTextField();
        lblPhoneNumber3 = new javax.swing.JLabel();
        jComboCity = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 241, 249));

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));

        btnEdit.setBackground(new java.awt.Color(3, 80, 111));
        btnEdit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblUsername5.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername5.setText("Marital Status:");

        jComboMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "Single", "Married", "Other" }));

        lblUsername6.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername6.setText("Smoking habbits:");

        jComboSmokingHabbits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "I don't smoke", "I used to, but I've quit", "1-2/day", "3-5/day", "5-10/day", ">10/day" }));

        lblUsername7.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername7.setText("Alcohol consumption:");

        jComboAlcohol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "Non-drinker", "Rare", "Social", "Regular", "Heavy" }));

        jComboActivity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "Sedentary (low)", "Moderately active (Normal)", "Active (High)", "Athletic (Very High)" }));

        jLabel1.setText("Activity Level:");

        jComboOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "IT Professional", "Medical professional", "Banking professional", "Education", "Student", "Home-maker", "Other" }));

        jLabel3.setText("Occupation:");

        jLabel2.setText("Food Preference:");

        jComboFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "Vegetarian", "Non-Vegetarian", "Eggetarian", "Vegan" }));

        errorContactNumber.setForeground(new java.awt.Color(255, 0, 0));

        txtContactEmergency.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtContactEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactEmergencyActionPerformed(evt);
            }
        });
        txtContactEmergency.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactEmergencyKeyPressed(evt);
            }
        });

        lblPhoneNumber3.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber3.setText("EmergencyContact  Number :");

        jComboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "Boston", "Syracuse", "New York", "San Francisco", "New Jersey", "Chicago", "San Diego", "Dallas", "San Jose", "Houston" }));

        jLabel4.setText("Location:");

        btnSubmit.setBackground(new java.awt.Color(3, 80, 111));
        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorEmail)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoneNumber3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtContactEmergency)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboOccupation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboMaritalStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboAlcohol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboSmokingHabbits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboActivity, 0, 230, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboFood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUsername6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboSmokingHabbits, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboActivity)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboFood)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoneNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContactEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboCity)))
                .addGap(7, 7, 7)
                .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setFields(Boolean bool){
    jComboMaritalStatus.setEnabled(bool);
    jComboSmokingHabbits.setEnabled(bool);
    jComboAlcohol.setEnabled(bool);
    txtContactEmergency.setEnabled(bool);
    jComboActivity.setEnabled(bool);
    jComboFood.setEnabled(bool);
    jComboOccupation.setEnabled(bool);
    jComboCity.setEnabled(bool);   
}
    
       private void setData() throws ParseException {
        jComboMaritalStatus.setSelectedItem(user.getMedicalProfile().getMaritalStatus());
        jComboSmokingHabbits.setSelectedItem(user.getMedicalProfile().getSmokingHabits());
        jComboAlcohol.setSelectedItem(user.getMedicalProfile().getAlcoholConsumption());
        txtContactEmergency.setText(user.getMedicalProfile().getEmergencyContact());
        jComboActivity.setSelectedItem(user.getMedicalProfile().getActivityLevel());
        jComboFood.setSelectedItem(user.getMedicalProfile().getFoodPreferences());
        jComboOccupation.setSelectedItem(user.getMedicalProfile().getOccupations());
        jComboCity.setSelectedItem(user.getMedicalProfile().getLocation());
        setFields(false);       

    }
       
    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageUserPanel manageUserPanel = (ManageUserPanel) component;

        manageUserPanel.refreshTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         setFields(true);
         btnSubmit.setVisible(true);
         btnEdit.setVisible(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtContactEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactEmergencyActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtContactEmergencyActionPerformed

    private void txtContactEmergencyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactEmergencyKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txtContactEmergency.setEditable(true);
        } else {
            
            if (!Character.isDigit(c)) {
                txtContactEmergency.setEditable(false);
                errorContactNumber.setText("Sorry! only numbers allowed");
                //            JOptionPane.showMessageDialog(this, "Sorry! only numbers allowed");
            } else {
                if (txtContactEmergency.getText().length() > 9) {
                    txtContactEmergency.setEditable(false);
                    errorContactNumber.setText("Enter 10 digit valid number");
                } else {
                    txtContactEmergency.setEditable(true);
                    errorContactNumber.setText("");
                }
            }
        }
    }//GEN-LAST:event_txtContactEmergencyKeyPressed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String 
                maritalStatus = jComboMaritalStatus.getSelectedItem().toString(),
                smokingHabbits = jComboSmokingHabbits.getSelectedItem().toString(),
                alcoholConsuption = jComboAlcohol.getSelectedItem().toString(),
                emergencyContact = txtContactEmergency.getText(),
                activityLevel = jComboActivity.getSelectedItem().toString(),
                foodPreference = jComboFood.getSelectedItem().toString(),
                occupation = jComboOccupation.getSelectedItem().toString(),
                location = jComboCity.getSelectedItem().toString();

        if (maritalStatus.toLowerCase().equals("selct")) {
            util.showErrorToast("Plesae enter valid Marital status");
            
        }  else if (smokingHabbits.toLowerCase().equals("selct")) {
            util.showErrorToast("Plesae enter valid Smoking heights");
            
        } else if (alcoholConsuption.toLowerCase().equals("selct")) {
            util.showErrorToast("Plesae enter valid Alcohol consumptions");
            
        } else if (activityLevel.toLowerCase().equals("selct")) {
            util.showErrorToast("Plesae enter valid Activity level");
            
        } else if (foodPreference.toLowerCase().equals("selct")) {
            util.showErrorToast("Plesae enter valid Food Preference");
            
        } else if (occupation.toLowerCase().equals("selct")) {
            util.showErrorToast("Plesae enter valid Occupation");
            
        } else if (location.toLowerCase().equals("selct")) {
            util.showErrorToast("Plesae enter valid location");
            
        } else if (util.countOfString(txtContactEmergency.getText())>10 || util.countOfString(txtContactEmergency.getText())<10) {
            util.showErrorToast("Emergency Contact number must be equal to 10 digits only");
            
        } else { 
        user.getMedicalProfile().setMaritalStatus(maritalStatus);
        user.getMedicalProfile().setSmokingHabits(smokingHabbits);
        user.getMedicalProfile().setAlcoholConsumption(alcoholConsuption);
        user.getMedicalProfile().setEmergencyContact(emergencyContact);
        user.getMedicalProfile().setActivityLevel(activityLevel);
        user.getMedicalProfile().setFoodPreferences(foodPreference);
        user.getMedicalProfile().setOccupations(occupation);
        user.getMedicalProfile().setLocation(location);
        JOptionPane.showMessageDialog(this, "Records Updates successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
         setFields(false);
         btnSubmit.setVisible(false);
         btnEdit.setVisible(true);
            String emailSubject = "Care4U Account Information";
            String emailBodyMessage = "Hi, "+ user.getName()+" Records Updates successfully";
            util.sendEmail(user.getEmail(), emailSubject, emailBodyMessage);
            util.setDatabase(ecosystem);
        }
       
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel errorContactNumber;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JComboBox<String> jComboActivity;
    private javax.swing.JComboBox<String> jComboAlcohol;
    private javax.swing.JComboBox<String> jComboCity;
    private javax.swing.JComboBox<String> jComboFood;
    private javax.swing.JComboBox<String> jComboMaritalStatus;
    private javax.swing.JComboBox<String> jComboOccupation;
    private javax.swing.JComboBox<String> jComboSmokingHabbits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPhoneNumber3;
    private javax.swing.JLabel lblUsername5;
    private javax.swing.JLabel lblUsername6;
    private javax.swing.JLabel lblUsername7;
    private javax.swing.JTextField txtContactEmergency;
    // End of variables declaration//GEN-END:variables
}
