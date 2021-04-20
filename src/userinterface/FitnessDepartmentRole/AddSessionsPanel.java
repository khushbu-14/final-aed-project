/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessDepartmentRole;

import userinterface.SystemAdminWorkArea.*;
import Business.EcoSystem;
import Business.FitnessCenter.Department.FitnessCenterDepartment;
import Business.FitnessCenter.FitnessCenter;
import Business.Shop.Product;
import Business.Shop.Shop;
import Business.Staff.FcStaff;
import Business.Staff.FcStaffDirectory;
import Business.Staff.Sessions;
import Business.User.User;
import Business.UserAccount.UserAccount;
import constants.Utils;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class AddSessionsPanel extends javax.swing.JPanel {

    private JPanel mainWorkArea;
    private EcoSystem ecosystem;

    Utils util;

    DefaultTableModel model;
    //private Product product;
    private Sessions sessions;
    UserAccount userAcount;

    Boolean isUpdatePage = false;

    /**
     * Creates new form AddUniversity
     *
     * @param mainWorkArea
     * @param ecosystem
     * @param product
     * @param isUpdatePage
     */
    public AddSessionsPanel(JPanel mainWorkArea, EcoSystem ecosystem, Sessions sessions, Boolean isUpdatePage, UserAccount userAcount) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.sessions = sessions;
        this.isUpdatePage = isUpdatePage;
        this.userAcount = userAcount;
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
        lblPassword1 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtSName = new javax.swing.JTextField();
        lblUsername2 = new javax.swing.JLabel();
        lblPassword2 = new javax.swing.JLabel();
        lblUsername4 = new javax.swing.JLabel();
        jComboType = new javax.swing.JComboBox<>();
        lblUsername5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jComboStartTime = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboEndTime = new javax.swing.JComboBox<>();

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
        lblUserAction.setText("Add Product");
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
                .addContainerGap(385, Short.MAX_VALUE))
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

        lblPassword1.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword1.setText("Date:");

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
        txtSName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNameActionPerformed(evt);
            }
        });
        txtSName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSNameKeyPressed(evt);
            }
        });

        lblUsername2.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername2.setText("Session Name :");

        lblPassword2.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword2.setText("Start Time:");

        lblUsername4.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername4.setText("Description:");

        jComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTypeActionPerformed(evt);
            }
        });

        lblUsername5.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername5.setText("Is this an online session?");

        jLabel1.setText("Location:");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jComboStartTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0600", "0630", "0700", "0730", "0800", "0830", "0900", "0930", "1000", "1300", "1100", "1130", "1200", "1230", "1300", "1330", "1400", "1430", "1500", "1530", "1600", "1630", "1700", "1730", "1800", "1830", "1900", "1930", "2000", "2030", "2100" }));
        jComboStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStartTimeActionPerformed(evt);
            }
        });

        jComboEndTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0700", "0730", "0800", "0830", "0900", "0930", "1000", "1300", "1100", "1130", "1200", "1230", "1300", "1330", "1400", "1430", "1500", "1530", "1600", "1630", "1700", "1730", "1800", "1830", "1900", "1930", "2000", "2030", "2100" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsername5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLocation)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblUsername2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addGap(0, 19, Short.MAX_VALUE))
                                    .addComponent(lblPassword2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(100, 100, 100))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 19, Short.MAX_VALUE)))))
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPassword1, lblUsername2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPassword1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPassword2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLocation)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(168, 168, 168))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        splitPanel.setRightComponent(bottomPanel);

        add(splitPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void resetForm() {
        txtSName.setText("");
        txtLocation.setText("");
        jDateChooser1.setDate(null);
        jComboType.setSelectedItem("Select");
        jComboStartTime.setSelectedItem("Select");
        jComboEndTime.setSelectedItem("Select");
        
        
       // SimpleDateFormat DateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.US);
       // personalinfo.setDateOfIssue(DateFormat.format(txtDateOfIssue.getDate()));
      //  personalinfo.setDateOfExpiration(DateFormat.format(txtDateOfExpiration.getDate()));
        
    }

    private void setData() {
        resetForm();
        populateComboBox();
        if (isUpdatePage) {
            btnSignup.setText("Update Session");
            lblUserAction.setText("Update Sesiion");

            txtSName.setText(sessions.getName());
            jComboStartTime.setSelectedItem(sessions.getSessionDate());
                jComboStartTime.setSelectedItem(sessions.getStartTime());
                jComboEndTime.setSelectedItem(sessions.getEndTime());
                //sessions.setIsRemote(isRemote);
                jComboType.setSelectedItem(sessions.getIsRemote());
                txtLocation.setText(sessions.getLocation());

//            if (sessions.getIsRemote().equals("Yes")) {
//                jComboType.setSelectedItem("Yes");
//                txtLocation.setText("online");
//            } else {
//                jComboType.setSelectedItem("No");
//                txtLocation.setEditable(true);
//            }

        } else {
            btnSignup.setText("Add Session");
            lblUserAction.setText("Add Session");
        }
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
       ManageSessionsPanel manageProductPanel = (ManageSessionsPanel) component;

       manageProductPanel.refreshTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:

        String name = txtSName.getText();        
        String loc = txtLocation.getText();
        //Double calories = 0.0d;
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.US);
        String d = dateFormat.format(jDateChooser1.getDate());
        

//        if (util.isStringInputValid(calorieInput)) {
//            calories = Double.parseDouble(calorieInput);
//        }

        //  Double calories = Double.parseDouble(txtCalories.getText()),
//        Double price = Double.parseDouble(txtPrice.getText());
        String isRemote = jComboType.getSelectedItem().toString();
        String startTime = jComboStartTime.getSelectedItem().toString();
        String endTime = jComboEndTime.getSelectedItem().toString();

        if (!util.isStringInputValid(name)) {
            util.showErrorToast("Plesae enter valid product name");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid user name");
            // JOptionPane.showMessageDialog(this, "Plesae enter valid user name", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        else if (!util.isStringInputValid(loc)) {
            util.showErrorToast("Plesae enter valid description");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid password");
            //  JOptionPane.showMessageDialog(this, "Plesae enter valid password", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        else if (!util.isStringInputValid(isRemote)) {
            util.showErrorToast("Plesae enter valid description");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid password");
            //  JOptionPane.showMessageDialog(this, "Plesae enter valid password", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String msg = name + "  created successfully!";
            if (isUpdatePage) {

                sessions.setName(name);
                sessions.setSessionDate(d);
                sessions.setStartTime(startTime);
                sessions.setEndTime(endTime);
                sessions.setIsRemote(isRemote);
                sessions.setLocation(loc);
//                if (isRemote.equals("Yes")) {
//                    sessions.setIsRemote(isRemote);
//                    //txtLocation.setText("online");
//                    //sessions.setLocation(loc);
//                } else {
//                    sessions.setIsRemote(isRemote);
//                    sessions.setLocation(loc);
//                }

                msg = name + " updated successfully!";
            } else {
                boolean decision = false;
                Sessions product1 = new Sessions( name, d, startTime, endTime, isRemote, loc);
                //Shop shp = ecosystem.getShopDirectory().getShopByUserName(userAcount.getUsername());
                //shp.getProductDirectory().addNewProduct(product1);
            
            //ArrayList<Sessions> sessList = new ArrayList<>();
            ArrayList<FitnessCenter> fitnessCenterList = ecosystem.getFitnessCenterDirectory().getFitnessCenterList();
                for(FitnessCenter fc: fitnessCenterList){
                    ArrayList<FitnessCenterDepartment> f= fc.getFcdepartmentDirectory().getDepartmentList();
                    for(FitnessCenterDepartment fcd :f) {
                        ArrayList<FcStaff> fcstaff= fcd.getStaffDirectory().getStaffList();
                            for(FcStaff staff : fcstaff){
                                staff.getSdir().addSession(product1);
                      
                    //departmentList.add(fcd);
                            }
                    }
                }
            }

            resetForm();

            JOptionPane.showMessageDialog(this, msg,
                    "Success", JOptionPane.INFORMATION_MESSAGE);

            backAction();
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

    private void jComboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTypeActionPerformed

    private void txtSNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNameActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void jComboStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStartTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboStartTimeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboEndTime;
    private javax.swing.JComboBox<String> jComboStartTime;
    private javax.swing.JComboBox<String> jComboType;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblUserAction;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel lblUsername5;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
    public void populateComboBox() {
        List<String> enterpriseList = Arrays.asList("Yes", "No");
        for (String i : enterpriseList) {
            jComboType.addItem(i);
        }
    }
}
