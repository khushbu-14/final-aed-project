/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.FitnessCenter.FitnessCenter;
import Business.Shop.Shop;
import Business.Type.Type;
import Business.User.User;
import constants.Utils;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class AddFitnessPanel extends javax.swing.JPanel {

    private JPanel mainWorkArea;
    private EcoSystem ecosystem;

    Utils util;

    DefaultTableModel model;
    private FitnessCenter fc;

    Boolean isUpdatePage = false;

    /**
     * Creates new form AddUniversity
     *
     * @param mainWorkArea
     * @param ecosystem
     * @param user
     * @param isUpdatePage
     */
    public AddFitnessPanel(JPanel mainWorkArea, EcoSystem ecosystem, FitnessCenter fc, Boolean isUpdatePage) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.fc = fc;
        this.isUpdatePage = isUpdatePage;
        util = new Utils();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        splitPanel = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblUserAction = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        lblUsername1 = new javax.swing.JLabel();
        txtSUserName = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        txtSPassword = new javax.swing.JPasswordField();
        lblUsername2 = new javax.swing.JLabel();
        txtSName = new javax.swing.JTextField();
        txtSEmail = new javax.swing.JTextField();
        lblUsername3 = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblPhoneNumber1 = new javax.swing.JLabel();
        txtSAddress = new javax.swing.JTextField();
        lblPhoneNumber2 = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        errorContactNumber = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        errorZipcode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 244, 244));
        setLayout(new java.awt.BorderLayout());

        splitPanel.setDividerLocation(70);
        splitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("View university list");
        btnBack.setActionCommand("University");
        btnBack.setAlignmentY(0.0F);
        btnBack.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBack.setIconTextGap(10);
        btnBack.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUserAction.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblUserAction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserAction.setText("Add Fitness Center");
        lblUserAction.setToolTipText("Add Department");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(lblUserAction, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserAction, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitPanel.setTopComponent(topPanel);

        bottomPanel.setBackground(new java.awt.Color(243, 241, 249));

        btnSubmit.setBackground(new java.awt.Color(3, 80, 111));
        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnSubmit.setText("Add Fitness Center");
        btnSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblUsername1.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername1.setText("Username :");

        txtSUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPassword1.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword1.setText("Password :");

        txtSPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblUsername2.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername2.setText("Full Name :");

        txtSName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtSName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSNameKeyPressed(evt);
            }
        });

        txtSEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtSEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSEmailKeyPressed(evt);
            }
        });

        lblUsername3.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername3.setText("E-mail Id :");

        lblPhoneNumber.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Contact Number :");

        lblPhoneNumber1.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber1.setText("Address :");

        txtSAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPhoneNumber2.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber2.setText("Zipcode :");

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));

        txtContact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
        });

        errorContactNumber.setForeground(new java.awt.Color(255, 0, 0));

        txtZipcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyPressed(evt);
            }
        });

        errorZipcode.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(bottomPanelLayout.createSequentialGroup()
                                    .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(bottomPanelLayout.createSequentialGroup()
                                        .addComponent(txtSUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bottomPanelLayout.createSequentialGroup()
                                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtZipcode)
                                            .addComponent(errorZipcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(bottomPanelLayout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtSEmail)
                                                    .addComponent(lblUsername3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSAddress)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblUsername2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername1)
                    .addComponent(lblPassword1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                        .addComponent(lblUsername3)
                        .addGap(12, 12, 12)
                        .addComponent(txtSEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        splitPanel.setRightComponent(bottomPanel);

        add(splitPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void resetForm() {
        txtSUserName.setText("");
        txtSPassword.setText("");
        txtSAddress.setText("");
        txtSName.setText("");
        txtContact.setText("");
        txtSEmail.setText("");
        txtZipcode.setText(null);
        //jComboType.setSelectedItem("Select");
    }

    private void setData() {
        resetForm();
        //populateComboBox();
        if (isUpdatePage) {
            btnSubmit.setText("Update Fitness Center");
            lblUserAction.setText("Update Fitness Center");

            txtSUserName.setText(fc.getUsername());
            txtSPassword.setText(fc.getPassword());
            txtSAddress.setText(fc.getAddress());
            txtSName.setText(fc.getFitnessCenterName());
            txtContact.setText(fc.getContact());
            txtSEmail.setText(fc.getEmail());
            txtZipcode.setText(fc.getZipcode());
            //jComboType.setSelectedItem(fc.getShopType());
            txtSUserName.setEditable(false);

        } else {
            btnSubmit.setText("Add Fitness Center");
            lblUserAction.setText("Add Fitness Center");
            txtSUserName.setEditable(true);
        }
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFitnessPanel manageFitnessPanel = (ManageFitnessPanel) component;

        manageFitnessPanel.refreshTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String userName = txtSUserName.getText();
        char[] passwordCharArray = txtSPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        String name = txtSName.getText(),
                phoneNo = txtContact.getText(),
                email = txtSEmail.getText(),
                address = txtSAddress.getText(),
                zipcode = txtZipcode.getText();
        //String type = jComboType.getSelectedItem().toString();

        if (!util.isStringInputValid(userName)) {
            util.showErrorToast("Plesae enter valid user name");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid user name");
            // JOptionPane.showMessageDialog(this, "Plesae enter valid user name", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(password)) {
            util.showErrorToast("Plesae enter valid password");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid password");
            //  JOptionPane.showMessageDialog(this, "Plesae enter valid password", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(name)) {
            util.showErrorToast("Plesae enter valid name");
            //  JOptionPane.showMessageDialog(this, "Please enter valid name", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(email) || !util.isEmailValid(email)) {
            util.showErrorToast("Plesae enter valid email-id");
            //  JOptionPane.showMessageDialog(this, "Please enter valid email-id", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(phoneNo) || phoneNo.length() != 10) {
            util.showErrorToast("Plesae enter valid 10 digit phone number");
            //  JOptionPane.showMessageDialog(this, "Please enter valid 10 digit phone number", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(address)) {
            util.showErrorToast("Plesae enter valid address");
            // JOptionPane.showMessageDialog(this, "Please enter valid address", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(password)) {
            util.showErrorToast("Plesae enter valid password");
            // JOptionPane.showMessageDialog(this, "Please enter valid password", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isUpdatePage && (!util.isStringInputValid(userName) || !ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userName))) {
            util.showErrorToast("Plesae enter valid and unique username");
            //  JOptionPane.showMessageDialog(this, "Please enter valid and unique username", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(zipcode)) {
            //  JOptionPane.showMessageDialog(this, "Please enter valid Zipcode", "Error", JOptionPane.ERROR_MESSAGE);
            util.showErrorToast("Plesae enter valid and unique zipcode");
        } else if (util.countOfString(zipcode) < 5 || util.countOfString(zipcode) > 5) {
            //  JOptionPane.showMessageDialog(this, "Zipcode should be 5 characters only", "Error", JOptionPane.ERROR_MESSAGE);
            util.showErrorToast("Zipcode should be 5 characters only");

//        } else if (!util.isStringInputValid(type)) {
//            //  JOptionPane.showMessageDialog(this, "Please enter valid Zipcode", "Error", JOptionPane.ERROR_MESSAGE);
//            util.showErrorToast("Plesae select valid type");
//        } else if (type.toLowerCase().equals("select")) {
//            //  JOptionPane.showMessageDialog(this, "Please enter valid Zipcode", "Error", JOptionPane.ERROR_MESSAGE);
//            util.showErrorToast("Plesae select valid type");
//        } 
        } else {
            userName = userName.toLowerCase();
            String msg = name + " Your account created successfully!";
            if (isUpdatePage) {

                fc.setAddress(address);
                fc.setContact(phoneNo);
                fc.setEmail(email);
                fc.setFitnessCenterName(name);
                fc.setZipcode(zipcode);
                fc.setPassword(password);
                //shop.setShopType(type);

                ecosystem.getUserAccountDirectory().updateUserAccount(fc, userName, password);

                msg = name + " Your account updated successfully!";
            } else {

                FitnessCenter fcTemp = new FitnessCenter(userName, password, name, phoneNo, address, zipcode, email);
                ecosystem.getFitnessCenterDirectory().addNewFitnessCenter(fcTemp);
                ecosystem.getUserAccountDirectory().addUserAccount(fcTemp);
            }

            resetForm();

            JOptionPane.showMessageDialog(this, msg,
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            String emailSubject = "Care4U Account Information";
            String emailBodyMessage = "Hi, "+ msg;
            util.sendEmail(email, emailSubject, emailBodyMessage);
            util.setDatabase(ecosystem);


            backAction();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtSNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            txtSName.setEditable(false);
            JOptionPane.showMessageDialog(this, "Sorry! no numbers allowed");
        } else {
            txtSName.setEditable(true);
        }
    }//GEN-LAST:event_txtSNameKeyPressed

    private void txtSEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEmailKeyPressed
        // TODO add your handling code here:
        String val = txtSEmail.getText();

        if (!util.isEmailValid(val)) {
            errorEmail.setText("Enter valid e-mail");
        } else {
            errorEmail.setText("");
        }
    }//GEN-LAST:event_txtSEmailKeyPressed

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
                    errorContactNumber.setText("Enter 10 digit valid number");
                    txtContact.setEditable(false);
                } else {
                    errorContactNumber.setText("");
                    txtContact.setEditable(true);
                }
            }
        }
    }//GEN-LAST:event_txtContactKeyPressed

    private void txtZipcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txtZipcode.setEditable(true);
        } else {

            if (!Character.isDigit(c)) {
                txtZipcode.setEditable(false);
                errorZipcode.setText("Sorry! only numbers allowed");
                //            JOptionPane.showMessageDialog(this, "Sorry! only numbers allowed");
            } else {

                //                System.out.println(txtZipcode.getText() +" "+ txtZipcode.getText().length());
                if (txtZipcode.getText().length() > 4) {
                    //                errorContactNumber.setText("Enter 10 digit valid number");
                    txtZipcode.setEditable(false);
                } else {
                    errorZipcode.setText("");
                    txtZipcode.setEditable(true);
                }
            }
        }
    }//GEN-LAST:event_txtZipcodeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel errorContactNumber;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorZipcode;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblUserAction;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtSAddress;
    private javax.swing.JTextField txtSEmail;
    private javax.swing.JTextField txtSName;
    private javax.swing.JPasswordField txtSPassword;
    private javax.swing.JTextField txtSUserName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables

}
