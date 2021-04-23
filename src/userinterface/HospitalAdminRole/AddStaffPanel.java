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
import Business.Staff.Staff;
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
public class AddStaffPanel extends javax.swing.JPanel {

    private JPanel mainWorkArea;
    private EcoSystem ecosystem;

    Utils util;

    DefaultTableModel model;

    private UserAccount userAccount;
    Boolean isUpdatePage = false;
    private Staff staff;

    /**
     * Creates new form AddUniversity
     *
     * @param mainWorkArea
     * @param ecosystem
     * @param user
     * @param isUpdatePage
     */
    public AddStaffPanel(JPanel mainWorkArea, EcoSystem ecosystem, Staff staff, Boolean isUpdatePage, UserAccount userAccount) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.staff = staff;
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
        jPanel1 = new javax.swing.JPanel();
        txtZipcode = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        txtSAddress = new javax.swing.JTextField();
        lblPhoneNumber2 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtSName = new javax.swing.JTextField();
        lblPhoneNumber1 = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtSPassword = new javax.swing.JPasswordField();
        lblUsername2 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtSEmail = new javax.swing.JTextField();
        lblUsername3 = new javax.swing.JLabel();
        errorContactNumber = new javax.swing.JLabel();
        txtSUserName = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JTextField();
        lblUsername4 = new javax.swing.JLabel();
        jComboType = new javax.swing.JComboBox<>();
        lblUsername5 = new javax.swing.JLabel();

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
        lblUserAction.setText("Add Staff");
        lblUserAction.setToolTipText("Add Department");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(lblUserAction, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
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

        jPanel1.setBackground(new java.awt.Color(243, 241, 249));

        txtZipcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyPressed(evt);
            }
        });

        lblPassword1.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword1.setText("Password :");

        txtSAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblPhoneNumber2.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber2.setText("Zipcode :");

        btnSignup.setBackground(new java.awt.Color(3, 80, 111));
        btnSignup.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnSignup.setText("Register User");
        btnSignup.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        txtSName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtSName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSNameKeyPressed(evt);
            }
        });

        lblPhoneNumber1.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber1.setText("Address :");

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));

        lblPhoneNumber.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Contact Number :");

        lblUsername2.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername2.setText("Full Name :");

        txtContact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
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

        txtSUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblUsername1.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername1.setText("Username :");

        txtDesignation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignationActionPerformed(evt);
            }
        });
        txtDesignation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDesignationKeyPressed(evt);
            }
        });

        lblUsername4.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername4.setText("Designation:");

        jComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTypeActionPerformed(evt);
            }
        });

        lblUsername5.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername5.setText("Select Department:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSUserName)
                                .addComponent(lblUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                            .addComponent(txtSAddress, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDesignation)
                                .addComponent(lblUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNumber2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtZipcode))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSName)
                            .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblUsername3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblUsername5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtContact)
                                .addComponent(errorContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(100, 100, 100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtSEmail)
                                .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSignup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContact, txtSEmail, txtSName, txtSPassword, txtSUserName, txtZipcode});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPassword1, lblPhoneNumber, lblPhoneNumber2, lblUsername1, lblUsername2, lblUsername3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPassword1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtSAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUsername5)
                                .addGap(12, 12, 12)
                                .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(264, 264, 264))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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
        txtZipcode.setText("");
        txtDesignation.setText("");
        jComboType.setSelectedItem("Select");
    }

    private void setData() {
        resetForm();
        populateComboBox();
        if (isUpdatePage) {
            btnSignup.setText("Update Staff");
            lblUserAction.setText("Update Staff");

            txtSUserName.setText(staff.getUsername());
            txtSPassword.setText(staff.getPassword());
            txtSAddress.setText(staff.getAddress());
            txtSName.setText(staff.getName());
            txtContact.setText(staff.getContact());
            txtSEmail.setText(staff.getEmail());
            txtZipcode.setText(staff.getZipcode());
            txtDesignation.setText(staff.getDesignation());
            jComboType.setSelectedItem(staff.getDepartment().getDepartmentName());
            txtSUserName.setEditable(false);

        } else {
            btnSignup.setText("Add Staff");
            lblUserAction.setText("Add Staff");
            txtSUserName.setEditable(true);
        }
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageStaffPanel managestaffPanel = (ManageStaffPanel) component;

        managestaffPanel.refreshTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        String userName = txtSUserName.getText();
        char[] passwordCharArray = txtSPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        String name = txtSName.getText(),
                phoneNo = txtContact.getText(),
                email = txtSEmail.getText(),
                address = txtSAddress.getText(),
                zipcode = txtZipcode.getText(),
                designation = txtDesignation.getText(),
                type = jComboType.getSelectedItem().toString();

        Hospital hospital = ecosystem.getHospitalDirectory().getHospitalByUserName(userAccount.getUsername());
        HospitalDepartment department = hospital.getDepartmentDirectory().getHospitalDepartmentByName(type);

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

        } else if (!util.isStringInputValid(designation)) {
            util.showErrorToast("Plesae enter valid Designation");
            // JOptionPane.showMessageDialog(this, "Please enter valid address", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(type)) {
            util.showErrorToast("Plesae Select valid type");
            // JOptionPane.showMessageDialog(this, "Please enter valid address", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (type.toLowerCase().equals("select")) {
            util.showErrorToast("Plesae Select valid type");
            // JOptionPane.showMessageDialog(this, "Please enter valid address", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            userName = userName.toLowerCase();
            String msg = name + " Your account created successfully!";
            if (isUpdatePage) {

                staff.setAddress(address);
                staff.setContact(phoneNo);
                staff.setEmail(email);
                staff.setName(name);
                staff.setZipcode(zipcode);
                staff.setPassword(password);
                staff.setDesignation(designation);
                staff.setDepartment(department);

                ecosystem.getUserAccountDirectory().updateUserAccount(staff, userName, password);

                msg = name + " Your account updated successfully!";
            } else {

                Staff staffTemp = new Staff(userName, password, name, designation, phoneNo, address, email, zipcode, department);
                department.getStaffDirectory().addNewStaff(staffTemp);
                ecosystem.getUserAccountDirectory().addUserAccount(staffTemp);

            }

            resetForm();

            JOptionPane.showMessageDialog(this, msg,
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            backAction();
             String emailSubject = "Care4U Account Information";
            String emailBodyMessage = "Hi, "+ msg;
            util.sendEmail(email, emailSubject, emailBodyMessage);
            util.setDatabase(ecosystem); 
        }
    }//GEN-LAST:event_btnSignupActionPerformed

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
//                errorContactNumber.setText("Enter 10 digit valid number");
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
//                errorZipcode.setText("Sorry! only numbers allowed");
                JOptionPane.showMessageDialog(this, "Sorry! only numbers allowed");
            } else {
//                System.out.println(txtZipcode.getText() +" "+ txtZipcode.getText().length());
                if (txtZipcode.getText().length() > 4) {
//                errorContactNumber.setText("Enter 10 digit valid number");
                    txtZipcode.setEditable(false);
                } else {
//                    errorZipcode.setText("");
                    txtZipcode.setEditable(true);
                }
            }
        }
    }//GEN-LAST:event_txtZipcodeKeyPressed

    private void txtDesignationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesignationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationKeyPressed

    private void txtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationActionPerformed

    private void jComboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel errorContactNumber;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JComboBox<String> jComboType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblUserAction;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel lblUsername5;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtSAddress;
    private javax.swing.JTextField txtSEmail;
    private javax.swing.JTextField txtSName;
    private javax.swing.JPasswordField txtSPassword;
    private javax.swing.JTextField txtSUserName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
         public void populateComboBox() {
        Hospital hosp = ecosystem.getHospitalDirectory().getHospitalByUserName(userAccount.getUsername());
        for (HospitalDepartment hd : hosp.getDepartmentDirectory().getDepartmentList()) {
            jComboType.addItem(hd.getDepartmentName());
        }
    }

}
