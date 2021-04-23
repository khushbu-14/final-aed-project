/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import userinterface.SystemAdminWorkArea.*;
import Business.EcoSystem;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Hospital;
import Business.Shop.Shop;
import Business.Type.Type;
import Business.User.User;
import Business.UserAccount.UserAccount;
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
public class AddDepartmentPanel extends javax.swing.JPanel {

    private JPanel mainWorkArea;
    private EcoSystem ecosystem;
    private UserAccount userAccount;

    Utils util;

    DefaultTableModel model;
    private HospitalDepartment department;

    Boolean isUpdatePage = false;

    /**
     * Creates new form AddUniversity
     *
     * @param mainWorkArea
     * @param ecosystem
     * @param user
     * @param isUpdatePage
     */
    public AddDepartmentPanel(JPanel mainWorkArea, EcoSystem ecosystem, HospitalDepartment department, Boolean isUpdatePage, UserAccount userAccount) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.department = department;
        this.isUpdatePage = isUpdatePage;
        this.userAccount = userAccount;
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
        lblUsername2 = new javax.swing.JLabel();
        txtSEmail = new javax.swing.JTextField();
        NumberOfBeds = new javax.swing.JTextField();
        lblUsername3 = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblPhoneNumber1 = new javax.swing.JLabel();
        txtSName = new javax.swing.JTextField();
        errorEmail = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        errorContactNumber = new javax.swing.JLabel();
        jComboType = new javax.swing.JComboBox<>();
        lblUsername4 = new javax.swing.JLabel();

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
        lblUserAction.setText("Add Department");
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
        btnSubmit.setText("Add Department");
        btnSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblUsername2.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername2.setText("Email id:");

        txtSEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtSEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSEmailKeyPressed(evt);
            }
        });

        NumberOfBeds.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        NumberOfBeds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NumberOfBedsKeyPressed(evt);
            }
        });

        lblUsername3.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername3.setText("Number Of Beds:");

        lblPhoneNumber.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Contact Number :");

        lblPhoneNumber1.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber1.setText("Department Name:");

        txtSName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtSName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNameActionPerformed(evt);
            }
        });

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));

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

        errorContactNumber.setForeground(new java.awt.Color(255, 0, 0));

        jComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTypeActionPerformed(evt);
            }
        });

        lblUsername4.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername4.setText("Select Type:");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bottomPanelLayout.createSequentialGroup()
                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblUsername4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblUsername2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                                .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(348, 348, 348))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtContact)))
                                .addGap(100, 100, 100)
                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NumberOfBeds)
                                    .addComponent(lblUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername4))
                .addGap(12, 12, 12)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblUsername2)
                .addGap(12, 12, 12)
                .addComponent(txtSEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(lblUsername3)
                        .addGap(12, 12, 12)
                        .addComponent(NumberOfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        splitPanel.setRightComponent(bottomPanel);

        add(splitPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void resetForm() {
        txtSName.setText("");
        txtSEmail.setText("");
        txtContact.setText("");
        NumberOfBeds.setText("");
        jComboType.setSelectedItem("Select");
    }

    private void setData() {
        resetForm();
        populateComboBox();
        if (isUpdatePage) {
            btnSubmit.setText("Update Department");
            lblUserAction.setText("Update Department");

            txtSName.setText(department.getDepartmentName());
            txtSEmail.setText(department.getEmail());
            txtContact.setText(department.getContact());
            NumberOfBeds.setText(department.getNumberOfBeds().toString());
            jComboType.setSelectedItem(department.getType());

        } else {
            btnSubmit.setText("Add Department");
            lblUserAction.setText("Add Department");
        }
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDepartmentPanel manageDepartmentPanel = (ManageDepartmentPanel) component;

        manageDepartmentPanel.refreshTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        String email = txtSEmail.getText(),
                phoneNo = txtContact.getText(),
                name = txtSName.getText();
        String type = jComboType.getSelectedItem().toString();
        String numofB = NumberOfBeds.getText();

        if (!util.isStringInputValid(name)) {
            util.showErrorToast("Plesae enter valid name");
            //  JOptionPane.showMessageDialog(this, "Please enter valid name", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(email) || !util.isEmailValid(email)) {
            util.showErrorToast("Plesae enter valid email-id");
            //  JOptionPane.showMessageDialog(this, "Please enter valid email-id", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(phoneNo) || phoneNo.length() != 10) {
            util.showErrorToast("Plesae enter valid 10 digit phone number");
            //  JOptionPane.showMessageDialog(this, "Please enter valid 10 digit phone number", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(type)) {
            //  JOptionPane.showMessageDialog(this, "Please enter valid Zipcode", "Error", JOptionPane.ERROR_MESSAGE);
            util.showErrorToast("Plesae select valid type");
        } else if (type.toLowerCase().equals("select")) {
            //  JOptionPane.showMessageDialog(this, "Please enter valid Zipcode", "Error", JOptionPane.ERROR_MESSAGE);
            util.showErrorToast("Plesae select valid type");
        } else if (!util.isStringInputValid(numofB)) {
            //  JOptionPane.showMessageDialog(this, "Please enter valid Zipcode", "Error", JOptionPane.ERROR_MESSAGE);
            util.showErrorToast("Plesae enter number of beds");
        } else {
            Double numberOfBeds = Double.parseDouble(numofB);
            String msg = name + " Your account created successfully!";
            if (isUpdatePage) {

                department.setContact(phoneNo);
                department.setEmail(email);
                department.setDepartmentName(name);
                department.setType(type);
                department.setNumberOfBeds(numberOfBeds);

//                ecosystem.getUserAccountDirectory().updateUserAccount(department, userName, password);
                msg = name + " Your account updated successfully!";
            } else {
                HospitalDepartment departmemntTemp = new HospitalDepartment(name, type, phoneNo, email, numberOfBeds);
                Hospital hosp = ecosystem.getHospitalDirectory().getHospitalByUserName(userAccount.getUsername());
                hosp.getDepartmentDirectory().addNewHospitalDepartment(departmemntTemp);
                ecosystem.getUserAccountDirectory().addUserAccount(departmemntTemp);
            }
            resetForm();

            JOptionPane.showMessageDialog(this, msg,
                    "Success", JOptionPane.INFORMATION_MESSAGE);

            String emailSubject = "Care4U Order Information";
            String emailBodyMessage = "Hi, " + msg;
            util.sendEmail(email, emailSubject, emailBodyMessage, false);
            util.setDatabase(ecosystem);
            backAction();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtSEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEmailKeyPressed
        // TODO add your handling code here:
        String val = txtSEmail.getText();

        if (!util.isEmailValid(val)) {
            errorEmail.setText("Enter valid e-mail");
        } else {
            errorEmail.setText("");
        }
    }//GEN-LAST:event_txtSEmailKeyPressed

    private void NumberOfBedsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumberOfBedsKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txtContact.setEditable(true);
        } else {
            if (!Character.isDigit(c)) {
                txtSName.setEditable(false);
                JOptionPane.showMessageDialog(this, "Sorry! only numbers are allowed");
                NumberOfBeds.setText("");
            } else {
                NumberOfBeds.setEditable(true);
            }
        }
    }//GEN-LAST:event_NumberOfBedsKeyPressed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txtContact.setEditable(true);
        } else {

            if (!Character.isDigit(c)) {
                txtContact.setEditable(false);
                errorContactNumber.setText("Sorry! only numbers allowed");
//                txtContact.setText("");
//            JOptionPane.showMessageDialog(this, "Sorry! only numbers allowed");
            } else {
                if (txtContact.getText().length() > 9) {
                    errorContactNumber.setText("Enter 10 digit valid number");
                    txtContact.setEditable(false);
//                    txtContact.setText("");
                } else {
                    errorContactNumber.setText("");
                    txtContact.setEditable(true);
                }
            }
        }
    }//GEN-LAST:event_txtContactKeyPressed

    private void jComboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTypeActionPerformed

    private void txtSNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNameActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NumberOfBeds;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel errorContactNumber;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JComboBox<String> jComboType;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblUserAction;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtSEmail;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables

    public void populateComboBox() {
        for (Type t : ecosystem.getTypeDirectory().getTypeList()) {
            if (t.getParent().toLowerCase().equals("hospital department")) {
                jComboType.addItem(t.getType());
            }

        }
    }
}
