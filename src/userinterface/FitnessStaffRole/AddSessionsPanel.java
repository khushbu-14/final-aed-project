/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessStaffRole;

import userinterface.StaffRole.*;
import userinterface.FitnessDepartmentRole.*;
import userinterface.SystemAdminWorkArea.*;
import Business.EcoSystem;
import Business.FitnessCenter.Department.FitnessCenterDepartment;
import Business.FitnessCenter.FitnessCenter;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Hospital;
import Business.Shop.Product;
import Business.Shop.Shop;
import Business.Staff.FcStaff;
import Business.Staff.FcStaffDirectory;
import Business.Staff.Sessions;
import Business.Staff.SessionsMedStaff;
import Business.Staff.Staff;
import Business.User.User;
import Business.UserAccount.UserAccount;
import constants.Utils;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Boolean flag = true;
    static LocalDateTime now;
    Date date;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

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
        date = new Date();
        Date date1 = new Date();
        jDateChooser1.setMinSelectableDate(date);
        try {
            //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
            date = formatter.parse(formatter.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(AddSessionsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        now = LocalDateTime.now();
        jDateChooser1.setDate(date1);
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
        jComboType = new javax.swing.JComboBox<>();
        lblUsername5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jComboStartTime = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

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
        lblUserAction.setText("Add Session");
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
        btnSignup.setText("Add Slot");
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
        lblUsername2.setText("Slot Name :");

        lblPassword2.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword2.setText("Time:");

        jComboType.setBackground(new java.awt.Color(255, 255, 255));
        jComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Both" }));
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

        jComboStartTime.setBackground(new java.awt.Color(255, 255, 255));
        jComboStartTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00-09:00", "09:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00", "18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00", "22:00-23:00" }));
        jComboStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStartTimeActionPerformed(evt);
            }
        });

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
                            .addComponent(lblPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE)))
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
                .addComponent(lblPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
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
                .addGap(40, 40, 40)
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
                .addContainerGap(82, Short.MAX_VALUE))
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

        // SimpleDateFormat DateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.US);
        // personalinfo.setDateOfIssue(DateFormat.format(txtDateOfIssue.getDate()));
        //  personalinfo.setDateOfExpiration(DateFormat.format(txtDateOfExpiration.getDate()));
    }

    static Boolean testTime(String time2) {
        //2021-04-20T22:23:33.154423500
        String time = now.toString();
        time = time.split("T")[1].split(":")[0];
        int timeNow = Integer.parseInt(time);
        int timeSelected = Integer.parseInt(time2);
        if (timeSelected <= timeNow) {
            return false;
        } else {
            return true;
        }
    }

    private void setData() {
        resetForm();
//        populateComboBox();
        if (isUpdatePage) {
            btnSignup.setText("Update Session");
            lblUserAction.setText("Update Sesiion");

            txtSName.setText(sessions.getName());
            jComboStartTime.setSelectedItem(sessions.getSessionDate());
            jComboStartTime.setSelectedItem(sessions.getStartTime());
            //sessions.setIsRemote(isRemote);
            jComboType.setSelectedItem(sessions.getIsRemote());
            txtLocation.setText(sessions.getLocation());

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
        flag = true;
        String name = txtSName.getText();
        String loc = txtLocation.getText();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.US);
        String d = formatter.format(jDateChooser1.getDate());
        Date d1 = jDateChooser1.getDate();
        Date date2 = null;
        try {
            date2 = formatter.parse(formatter.format(d1));
        } catch (ParseException ex) {
            Logger.getLogger(AddSessionsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(d1);
        String isRemote = jComboType.getSelectedItem().toString();
        String time = jComboStartTime.getSelectedItem().toString();
        String startTime = time.split("-")[0];
        String endTime = time.split("-")[1];
        if (!util.isStringInputValid(name)) {
            util.showErrorToast("Plesae enter valid session name");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid user name");
            // JOptionPane.showMessageDialog(this, "Plesae enter valid user name", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(loc)) {
            util.showErrorToast("Plesae enter valid location");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid password");
            //  JOptionPane.showMessageDialog(this, "Plesae enter valid password", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (startTime.equalsIgnoreCase("select")) {
            util.showErrorToast("Plesae select valid start time");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid password");
            //  JOptionPane.showMessageDialog(this, "Plesae enter valid password", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (endTime.equalsIgnoreCase("select")) {
            util.showErrorToast("Plesae select valid end time");
            //  JOptionPane.showMessageDialog(null, "Plesae enter valid password");
            //  JOptionPane.showMessageDialog(this, "Plesae enter valid password", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!util.isStringInputValid(d)) {
            util.showErrorToast("Plesae select valid date");
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

                msg = name + " updated successfully!";
                JOptionPane.showMessageDialog(this, msg,
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                backAction();
            } else {
                boolean decision = false;
                Sessions session = new Sessions(name, d, startTime, endTime, isRemote, loc, "Created");
                ArrayList<FitnessCenter> fitnessCenterList = ecosystem.getFitnessCenterDirectory().getFitnessCenterList();
                for (FitnessCenter fc : fitnessCenterList) {
                    ArrayList<FitnessCenterDepartment> f1 = fc.getFcdepartmentDirectory().getDepartmentList();
                    for (FitnessCenterDepartment fcd : f1) {
                        FcStaff staff = fcd.getStaffDirectory().getStaffByUserName(userAcount.getUsername());
                        if(staff != null){
                            ArrayList<Sessions> sessList = staff.getSdir().getSession();
                        for (Sessions s : sessList) {
                            if (s.getSessionDate().equalsIgnoreCase(d) && s.getStartTime().equalsIgnoreCase(startTime)) {
                                flag = false;
                            }
                        }
                        if (flag) {
                            Boolean f = testTime(startTime.split(":")[0]);
                            if (date2.equals(date)) {
                                if (f) {
                                    staff.getSdir().addSession(session);
                                    JOptionPane.showMessageDialog(this, "Session Added successfully!");
                                    resetForm();
                                    backAction();
                                    util.setDatabase(ecosystem);
                                } else {
                                    util.showErrorToast("Please select future time slots");
                                }

                            } else {
                                session.setFinduser(staff.getUsername());
                                staff.getSdir().addSession(session);
                                JOptionPane.showMessageDialog(this, "Session Added successfully!");
                                resetForm();
                                backAction();
                                util.setDatabase(ecosystem);
                            }

                        } else {
                            util.showErrorToast("Session already Present");
                        }
                        
                        }
                        

                    }
                }
            }

        }


    }//GEN-LAST:event_btnSignupActionPerformed

    private void txtSNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSNameKeyPressed
        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//        if (Character.isDigit(c)) {
//            txtSName.setEditable(false);
//            JOptionPane.showMessageDialog(this, "Sorry! no numbers allowed");
//        } else {
//            txtSName.setEditable(true);
//        }
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
    private javax.swing.JComboBox<String> jComboStartTime;
    private javax.swing.JComboBox<String> jComboType;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblUserAction;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername5;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
//    public void populateComboBox() {
//        List<String> enterpriseList = Arrays.asList("Yes", "No");
//        for (String i : enterpriseList) {
//            jComboType.addItem(i);
//        }
//    }
}
