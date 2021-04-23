/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.AmbulanceService.AmbulanceService;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import constants.Utils;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */

public class AddDeliverymanPanel extends javax.swing.JPanel {

    private JPanel mainWorkArea;
    private EcoSystem ecosystem;

    Utils util;

    DefaultTableModel model;
    private DeliveryMan dlvm;

    Boolean isUpdatePage = false;

    /**
     * Creates new form AddUniversity
     *
     * @param mainWorkArea
     * @param ecosystem
     * @param user
     * @param isUpdatePage
     */
    public AddDeliverymanPanel(JPanel mainWorkArea, EcoSystem ecosystem, DeliveryMan dlvm, Boolean isUpdatePage) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.dlvm = dlvm;
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
        lblUserAction.setText("Add DeliveryMan");
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
                .addContainerGap(440, Short.MAX_VALUE))
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
        btnSignup.setText("Register DeliveryMan");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSAddress, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSUserName)
                                        .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(100, 100, 100)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSEmail)
                                        .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
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
                .addComponent(lblPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtSAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(errorContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtSEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(43, Short.MAX_VALUE))
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
    }

    private void setData() {
        resetForm();

        if (isUpdatePage) {
            btnSignup.setText("Update DeliveryMan");
            lblUserAction.setText("Update DeliveryMan");

            txtSUserName.setText(dlvm.getUsername());
            txtSPassword.setText(dlvm.getPassword());
            txtSAddress.setText(dlvm.getAddress());
            txtSName.setText(dlvm.getName());
            txtContact.setText(dlvm.getContact());
            txtSEmail.setText(dlvm.getEmail());
            txtZipcode.setText(dlvm.getZipcode());

            txtSUserName.setEditable(false);

        } else {
            btnSignup.setText("Add DeliveryMan");
            lblUserAction.setText("Add DeliveryMan");
            txtSUserName.setEditable(true);
        }
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliverymanPanel manageDeliverymanPanel = (ManageDeliverymanPanel) component;

        manageDeliverymanPanel.refreshTable();

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
                zipcode = txtZipcode.getText();

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

        } else {
            userName = userName.toLowerCase();
            String msg = name + " Your account created successfully!";
            if (isUpdatePage) {

                dlvm.setAddress(address);
                dlvm.setContact(phoneNo);
                dlvm.setEmail(email);
                dlvm.setName(name);
                dlvm.setZipcode(zipcode);
                dlvm.setPassword(password);

                ecosystem.getUserAccountDirectory().updateUserAccount(dlvm, userName, password);

                msg = name + " Your account updated successfully!";
            } else {

                DeliveryMan dlvTemp = new DeliveryMan(userName, password, name, phoneNo, address, zipcode, email);
                ecosystem.getDeliveryManDirectory().addNewDeliveryMan(dlvTemp);
                ecosystem.getUserAccountDirectory().addUserAccount(dlvTemp);
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
                if (txtContact.getText().length() > 10) {
                    txtContact.setEditable(false);
                    errorContactNumber.setText("Enter 10 digit valid number");
                } else {
                    txtContact.setEditable(true);
                    errorContactNumber.setText("");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel errorContactNumber;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JPanel jPanel1;
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
