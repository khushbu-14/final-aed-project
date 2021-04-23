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
import java.text.DateFormat;
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
public class AddPersonalInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonalInfoPanel
     */
    private JPanel mainWorkArea;
    private EcoSystem ecosystem;

    Utils util;
    private User user;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

    public AddPersonalInfoPanel(JPanel mainWorkArea, EcoSystem ecosystem, User user) throws ParseException {
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.user = user;
        initComponents();
        util = new Utils();
        btnSave.setVisible(false);
        setData();
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
        lblPhoneNumber = new javax.swing.JLabel();
        lblUsername2 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtSEmail = new javax.swing.JTextField();
        lblUsername3 = new javax.swing.JLabel();
        errorContactNumber = new javax.swing.JLabel();
        txtSName = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        lblPhoneNumber2 = new javax.swing.JLabel();
        lblPhoneNumber1 = new javax.swing.JLabel();
        lblUsername4 = new javax.swing.JLabel();
        dobChooser = new com.toedter.calendar.JDateChooser();
        jComboBlood = new javax.swing.JComboBox<>();
        selectGenderCombo = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 241, 249));

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));

        lblPhoneNumber.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Contact Number :");

        lblUsername2.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername2.setText("Weight (in Kg)");

        txtContact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
        });

        txtSEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtSEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSEmailKeyPressed(evt);
            }
        });

        lblUsername3.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername3.setText("E-mail Id :");

        errorContactNumber.setForeground(new java.awt.Color(255, 0, 0));

        txtSName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblUsername1.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername1.setText("Full Name");

        txtWeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWeightKeyPressed(evt);
            }
        });

        txtHeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHeightKeyPressed(evt);
            }
        });

        lblPassword1.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword1.setText("Date of Birth:");

        lblPhoneNumber2.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber2.setText("Height (in cm):");

        lblPhoneNumber1.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber1.setText("Gender:");

        lblUsername4.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername4.setText("Blood group");

        jComboBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        selectGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "PreferNotToSay", "Male", "Female", "Other" }));

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

        btnSave.setBackground(new java.awt.Color(3, 80, 111));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnSave.setText("Submit");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(lblUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectGenderCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPhoneNumber2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHeight)
                                .addComponent(txtSName, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                            .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSEmail)
                            .addComponent(lblUsername3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWeight)
                            .addComponent(lblUsername2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dobChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBlood, 0, 225, Short.MAX_VALUE)
                            .addComponent(errorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1)
                    .addComponent(lblUsername1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dobChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername4)
                            .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectGenderCombo)
                            .addComponent(jComboBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername2)
                            .addComponent(lblPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername3)
                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setFields(Boolean bool) {
        txtSName.setEnabled(bool);
        selectGenderCombo.setEnabled(bool);
        txtHeight.setEnabled(bool);
        txtContact.setEnabled(bool);
        dobChooser.setEnabled(bool);
        jComboBlood.setEnabled(bool);
        txtWeight.setEnabled(bool);
        txtSEmail.setEnabled(bool);
    }

    private void setData() throws ParseException {
        txtSName.setText(user.getName());
        selectGenderCombo.setSelectedItem(user.getMedicalProfile().getGender());
        txtHeight.setText(user.getMedicalProfile().getHeight());
        txtContact.setText(user.getContact());
        String stringDate = user.getMedicalProfile().getDob();
        if (stringDate == null) {
            Date date1 = (Date) formatter.parse("01/01/1900");
            dobChooser.setDate(date1);
        } else {
            Date date = (Date) formatter.parse(stringDate);
            dobChooser.setDate(date);
        }
        if (user.getMedicalProfile().getBloodGroup() == null) {
            jComboBlood.setSelectedItem("NA");
        } else {
            jComboBlood.setSelectedItem(user.getMedicalProfile().getBloodGroup());
        }
        jComboBlood.setSelectedItem(user.getMedicalProfile().getBloodGroup());
        txtWeight.setText(user.getMedicalProfile().getWeight());
        txtSEmail.setText(user.getEmail());
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
    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txtContact.setEditable(true);
        } else {
            
            if (!Character.isDigit(c)) {
                txtContact.setEditable(false);
                errorContactNumber.setText("Sorry! only numbers allowed");
                //            JOptionPane.showMessageDialog(this, "Sorry! only numbers allowed");
            } else {
                if (txtContact.getText().length() > 9) {
                    txtContact.setEditable(false);
                    errorContactNumber.setText("Enter 10 digit valid number");
                } else {
                    txtContact.setEditable(true);
                    errorContactNumber.setText("");
                }
            }
        }
    }//GEN-LAST:event_txtContactKeyPressed

    private void txtSEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEmailKeyPressed
        // TODO add your handling code here:
        String val = txtSEmail.getText();

        if (!util.isEmailValid(val)) {
            errorEmail.setText("Enter valid e-mail");
        } else {
            errorEmail.setText("");
        }
    }//GEN-LAST:event_txtSEmailKeyPressed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtWeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txtContact.setEditable(true);
        } else {

            if (!Character.isDigit(c)) {
                txtContact.setText("");
                errorContactNumber.setText("Sorry! only numbers allowed");
                //            JOptionPane.showMessageDialog(this, "Sorry! only numbers allowed");
            }
        }
    }//GEN-LAST:event_txtWeightKeyPressed

    private void txtHeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txtHeight.setEditable(true);
        } else {

            if (!Character.isDigit(c)) {
                txtHeight.setText("");
                //                errorZipcode.setText("Sorry! only numbers allowed");
                JOptionPane.showMessageDialog(this, "Sorry! only numbers allowed");
            }
        }
    }//GEN-LAST:event_txtHeightKeyPressed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        setFields(true);
        btnSave.setVisible(true);
        btnEdit.setVisible(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtSName.getText(),
                height = txtHeight.getText(),
                gender = selectGenderCombo.getSelectedItem().toString(),
                contactNo = txtContact.getText(),
                bloodGroup = jComboBlood.getSelectedItem().toString(),
                weight = txtWeight.getText(),
                email = txtSEmail.getText();
        String dob = formatter.format(dobChooser.getDate());

        if (!util.isStringInputValid(name)) {
            util.showErrorToast("Plesae enter valid user name");

        } else if (!util.isStringInputValid(bloodGroup)) {
            util.showErrorToast("Plesae enter valid password");

        } else if (!util.isStringInputValid(weight)) {
            util.showErrorToast("Plesae enter valid weight");

        } else if (!util.isStringInputValid(height)) {
            util.showErrorToast("Plesae enter valid height");

        } else if (!util.isStringInputValid(email) || !util.isEmailValid(email)) {
            util.showErrorToast("Plesae enter valid email-id");

        } else if (!util.isStringInputValid(contactNo) || contactNo.length() != 10) {
            util.showErrorToast("Plesae enter valid 10 digit phone number");

        } else {
            user.setName(name);
            user.getMedicalProfile().setHeight(height);
            user.getMedicalProfile().setGender(gender);
            user.setContact(contactNo);
            user.getMedicalProfile().setBloodGroup(bloodGroup);
            user.getMedicalProfile().setWeight(weight);
            user.setEmail(email);
            user.getMedicalProfile().setDob(dob);
            JOptionPane.showMessageDialog(this, "Records Updates successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            setFields(false);
            btnSave.setVisible(false);
            btnEdit.setVisible(true);
             String emailSubject = "Care4U Account Information";
            String emailBodyMessage = "Hi, "+ user.getName()+" Records Updates successfully";
            util.sendEmail(user.getEmail(), emailSubject, emailBodyMessage, false);
            util.setDatabase(ecosystem);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dobChooser;
    private javax.swing.JLabel errorContactNumber;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JComboBox<String> jComboBlood;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JComboBox<String> selectGenderCombo;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtSEmail;
    private javax.swing.JTextField txtSName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
