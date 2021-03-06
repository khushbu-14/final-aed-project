/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.Role.HospitalRole;
import javax.swing.JPanel;
import constants.Utils;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class ManageHospitalsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomer
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    Utils utils;

    public ManageHospitalsPanel(JPanel parentContainerPanel, EcoSystem ecosystem) {
        this.userProcessContainer = parentContainerPanel;
        this.ecosystem = ecosystem;
        utils = new Utils();
        initComponents();

        formPanel.setVisible(false);

        btnSave.setVisible(true);
        btnUpdateSave.setVisible(false);
        txtZipcode.setEditable(true);

        populateTable();
    }

    public void refreshTable() {
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalList = new javax.swing.JTable();
        formPanel = new javax.swing.JPanel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JFormattedTextField();
        lblAddress = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblUsername1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnUpdateSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnAddUser = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 249, 249));

        tblHospitalList.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblHospitalList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Username", "Password", "Phone number", "Address", "Zipcode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospitalList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblHospitalList.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(tblHospitalList);

        formPanel.setBackground(new java.awt.Color(244, 249, 249));

        lblPhoneNumber.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Hospital contact Number :");

        txtPhoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        try {
            txtPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        lblAddress.setBackground(new java.awt.Color(249, 244, 244));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddress.setText("Hospital Address :");

        txtZipcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipcodeActionPerformed(evt);
            }
        });

        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblName.setBackground(new java.awt.Color(249, 244, 244));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Hospital Name :");

        lblUsername.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Hospital ZipCode :");

        lblPassword.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Hospital Username :");

        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        btnSave.setBackground(new java.awt.Color(3, 80, 111));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnSave.setText("Submit");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnSave.setBorderPainted(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblUsername1.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername1.setText("Hospital Password :");

        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        btnUpdateSave.setBackground(new java.awt.Color(3, 80, 111));
        btnUpdateSave.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnUpdateSave.setText("Update");
        btnUpdateSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnUpdateSave.setBorderPainted(false);
        btnUpdateSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnUpdateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-1.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 1, true));
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUpdateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(15, 15, 15)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addGap(15, 15, 15)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(lblPhoneNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(15, 15, 15)
                        .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(15, 15, 15)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(lblUsername1)
                        .addGap(15, 15, 15)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText(" Manage Hospital");

        btnAddUser.setBackground(new java.awt.Color(255, 255, 255));
        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        btnAddUser.setText("Hospital");
        btnAddUser.setToolTipText("Add Hospital");
        btnAddUser.setAlignmentY(0.0F);
        btnAddUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        btnAddUser.setBorderPainted(false);
        btnAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddUser.setIconTextGap(10);
        btnAddUser.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete1.setForeground(new java.awt.Color(102, 102, 102));
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-1.png"))); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 1, true));
        btnDelete1.setBorderPainted(false);
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnUpdate1.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        btnUpdate1.setText("Update");
        btnUpdate1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnUpdate1.setBorderPainted(false);
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddUser, btnDelete1, btnUpdate1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddUser, btnDelete1, btnUpdate1});

    }// </editor-fold>//GEN-END:initComponents

    private int getSelectedRow() {
        int selectedRowIndex = tblHospitalList.getSelectedRow();
        return selectedRowIndex;
    }

    private Hospital getSelectedHospital() {
        int selectedRowIndex = tblHospitalList.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Oops! Please select a Hospital first.");
            return null;
        }

        Hospital h = (Hospital) tblHospitalList.getValueAt(selectedRowIndex, 1);

        return h;
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Hospital hosp = getSelectedHospital();

        if (hosp != null) {
            txtName.setText(hosp.getHospitalName());
            txtAddress.setText(hosp.getAddress());
            txtUsername.setText(hosp.getPassword());
            txtPhoneNumber.setText(hosp.getContact());
            txtZipcode.setText(hosp.getUsername());
            btnUpdateSave.setVisible(true);
            btnSave.setVisible(false);
            txtZipcode.setEditable(false);
            txtPassword.setText(hosp.getPassword());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Hospital hosp = getSelectedHospital();

        if (hosp != null) {
            resetForm();
            HospitalDirectory h = ecosystem.getHospitalDirectory();
            h.removeHospital(hosp);
            ecosystem.getUserAccountDirectory().removeUserAccount(hosp);

            JOptionPane.showMessageDialog(this, "Hospital deleted successfully!");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSaveActionPerformed
        // TODO add your handling code here:
        Hospital hosp = getSelectedHospital();

        if (hosp != null) {
            String name = txtName.getText().trim(),
                    address = txtAddress.getText().trim(),
                    password = txtUsername.getText().trim();

            String phoneNo = txtPhoneNumber.getText().trim();

            if (!utils.isStringInputValid(name)) {
                JOptionPane.showMessageDialog(this, "Please enter valid name");
            } else if (!utils.isStringInputValid(address)) {
                JOptionPane.showMessageDialog(this, "Please enter valid address");
            } else if (!utils.isStringInputValid(phoneNo) || phoneNo.length() != 10) {
                JOptionPane.showMessageDialog(this, "Please enter valid 10 digit phone number");
            } else if (!utils.isStringInputValid(password)) {
                JOptionPane.showMessageDialog(this, "Please enter valid password");
            } else {

                hosp.setHospitalName(name);
                hosp.setAddress(address);
                hosp.setPassword(password);
                hosp.setContact(phoneNo);

                populateTable();

                JOptionPane.showMessageDialog(this, name + " updated in the list successfully!");

                resetForm();
            }
        }
    }//GEN-LAST:event_btnUpdateSaveActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            txtName.setEditable(false);
            JOptionPane.showMessageDialog(this, "Sorry! no numbers allowed");
        } else {
            txtName.setEditable(true);
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipcodeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // validations

        String name = txtName.getText().trim(),
                address = txtAddress.getText().trim(),
                password = txtPassword.getText().trim(),
                username = txtUsername.getText().trim();
        String phoneNo = txtPhoneNumber.getText().trim();
        String zipcode = txtZipcode.getText().trim();

        if (!utils.isStringInputValid(name)) {
            JOptionPane.showMessageDialog(this, "Please enter valid name");
        } else if (!utils.isStringInputValid(address)) {
            JOptionPane.showMessageDialog(this, "Please enter valid address");
        } else if (!utils.isStringInputValid(phoneNo) || phoneNo.length() != 10) {
            JOptionPane.showMessageDialog(this, "Please enter valid 10 digit phone number");
        } else if (!utils.isStringInputValid(password)) {
            JOptionPane.showMessageDialog(this, "Please enter valid password");
        } else if (!utils.isStringInputValid(username) || !ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            JOptionPane.showMessageDialog(this, "Please enter valid unique username");
        } else if (!utils.isStringInputValid(zipcode)) {
            JOptionPane.showMessageDialog(this, "Please enter valid Zipcode");
        } else if (utils.countOfString(zipcode) < 5 || utils.countOfString(zipcode) > 5) {
            JOptionPane.showMessageDialog(this, "Zipcode should be 5 Characters Only");
        } else {
            username = username.toLowerCase();
            Hospital hospital = new Hospital(username, password, name, phoneNo, address, zipcode);
            //            Hospital temp = ecosystem.getHospitalDirectory().addNewHospital(name, phoneNo, address, zipcode, username, password);
            ecosystem.getHospitalDirectory().addNewHospital(hospital);
            ecosystem.getUserAccountDirectory().addUserAccount(hospital);
            //            ecosystem.getUserAccountDirectory().createUserAccount(username, password, null, new HospitalRole());
            //            hospitalId++;
            populateTable();
            resetForm();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // logic to go to next screen
        AddHospitalPanel addUser = new AddHospitalPanel(userProcessContainer, ecosystem, null, false);

        userProcessContainer.add("AddUserPanel", addUser);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        Hospital hosp = getSelectedHospital();

        if (hosp != null) {
            HospitalDirectory hd = ecosystem.getHospitalDirectory();

            hd.removeHospital(hosp);

            ecosystem.getUserAccountDirectory().removeUserAccount(hosp);

            JOptionPane.showMessageDialog(this, "Hospital deleted successfully!");
            populateTable();
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        Hospital hosp = getSelectedHospital();

        if (hosp != null) {
            AddHospitalPanel addHospital = new AddHospitalPanel(userProcessContainer, ecosystem, hosp, true);

            userProcessContainer.add("AddHospitalPanel", addHospital);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void resetForm() {
        txtName.setText(null);
        txtAddress.setText(null);
        txtUsername.setText(null);
        txtPhoneNumber.setText(null);
        txtZipcode.setText(null);
        txtPassword.setText(null);

        txtZipcode.setEditable(true);
        btnUpdateSave.setVisible(false);
        btnSave.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdateSave;
    private javax.swing.JPanel formPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JTable tblHospitalList;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JFormattedTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        HospitalDirectory hospitalDirectory = ecosystem.getHospitalDirectory();

        DefaultTableModel model = (DefaultTableModel) tblHospitalList.getModel();

        model.setRowCount(0);
        int count = 1;

        for (Hospital hospital : hospitalDirectory.getHospitalList()) {

            Object[] row = new Object[7];
            row[0] = "" + count++;
            row[1] = hospital;
            row[2] = hospital.getUsername();
            row[3] = hospital.getPassword();
            row[4] = hospital.getContact();
            row[5] = hospital.getAddress();
            row[6] = hospital.getZipcode();

            model.addRow(row);
        }
    }
}
