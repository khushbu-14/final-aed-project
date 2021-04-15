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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */

public class ManageHospitalAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomer
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    Utils utils;
    int hospitalId = 1;

    public ManageHospitalAdminPanel(JPanel parentContainerPanel, EcoSystem ecosystem) {
        this.userProcessContainer = parentContainerPanel;
        this.ecosystem = ecosystem;
        utils = new Utils();
        initComponents();

        btnSave.setVisible(true);
        btnUpdateSave.setVisible(false);
        txtZipcode.setEditable(true);

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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JFormattedTextField();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtZipcode = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        btnUpdateSave = new javax.swing.JButton();
        lblUsername1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

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

        lblName.setBackground(new java.awt.Color(249, 244, 244));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Hospital Name :");

        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

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

        lblAddress.setBackground(new java.awt.Color(249, 244, 244));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddress.setText("Hospital Address :");

        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPhoneNumber.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Hospital contact Number :");

        txtPhoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        try {
            txtPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPassword.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Hospital Username :");

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

        txtZipcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblUsername.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Hospital ZipCode :");

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

        lblUsername1.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername1.setText("Hospital Password :");

        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(15, 15, 15)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addGap(15, 15, 15)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoneNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(15, 15, 15)
                        .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(15, 15, 15)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername1)
                        .addGap(15, 15, 15)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
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
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//        Restaurant r = getSelectedRestaurant();
//
//        if (r != null) {
//            resetForm();
//            RestaurantDirectory rd = ecosystem.getRestaurantDirectory();
//            rd.removeRestaurant(r);
//
//            ecosystem.getUserAccountDirectory().removeUserAccount(r);
//
//            JOptionPane.showMessageDialog(this, "Restaurant deleted successfully!");
//            populateTable();
//        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void resetForm() {
        txtName.setText(null);
        txtAddress.setText(null);
        txtUsername.setText(null);
        txtPhoneNumber.setText(null);
        txtZipcode.setText(null);

        txtZipcode.setEditable(true);
        btnUpdateSave.setVisible(false);
        btnSave.setVisible(true);
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // validations

        String name = txtName.getText().trim(),
                address = txtAddress.getText().trim(),
                password = txtUsername.getText().trim(),
                username = txtZipcode.getText().trim();
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
            JOptionPane.showMessageDialog(this, "Please enter valid and unique username");
        } else if (!utils.isStringInputValid(zipcode)) {
            JOptionPane.showMessageDialog(this, "Please enter valid Zipcode");
        } else if (utils.countOfString(zipcode) < 5 || utils.countOfString(zipcode) > 5) {
            JOptionPane.showMessageDialog(this, "Zipcode should be 5 Characters Only");
        } else {
            username = username.toLowerCase();
            ecosystem.getHospitalDirectory().addNewHospital(String.valueOf(hospitalId), name, phoneNo, address, zipcode, username, password);

//            ecosystem.getUserAccountDirectory().addUserAccount(hospital);
            ecosystem.getUserAccountDirectory().createUserAccount(username, password, null, new HospitalRole());
            hospitalId++;
            populateTable();
            resetForm();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSaveActionPerformed
        // TODO add your handling code here:
//
//        Restaurant r = getSelectedRestaurant();
//
//        if (r != null) {
//            String name = txtName.getText().trim(),
//                    address = txtAddress.getText().trim(),
//                    password = txtUsername.getText().trim();
//
//            String phoneNo = txtPhoneNumber.getText().trim();
//
//            if (!utils.isStringInputValid(name)) {
//                JOptionPane.showMessageDialog(this, "Please enter valid name");
//            } else if (!utils.isStringInputValid(address)) {
//                JOptionPane.showMessageDialog(this, "Please enter valid address");
//            } else if (!utils.isStringInputValid(phoneNo) || phoneNo.length() != 10) {
//                JOptionPane.showMessageDialog(this, "Please enter valid 10 digit phone number");
//            } else if (!utils.isStringInputValid(password)) {
//                JOptionPane.showMessageDialog(this, "Please enter valid password");
//            } else {
//
//                r.setName(name);
//                r.setAddress(address);
//                r.setPassword(password);
//                r.setPhone(phoneNo);
//
//                populateTable();
//
//                JOptionPane.showMessageDialog(this, name + " updated in the list successfully!");
//
//                resetForm();
//            }
//        }
    }//GEN-LAST:event_btnUpdateSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
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
        for (Hospital hospital : hospitalDirectory.getHospitalList()) {
            Object[] row = new Object[7];
            row[0] = hospital.getHospitalID();
            row[1] = hospital.getHospitalName();
            row[2] = hospital.getUsername();
            row[3] = hospital.getPassword();
            row[4] = hospital.getContact();
            row[5] = hospital.getAddress();
            row[6] = hospital.getZipcode();

            model.addRow(row);

        }
    }
}
