/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessStaffRole;

import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.FitnessCenter.Department.FitnessCenterDepartment;
import Business.FitnessCenter.FitnessCenter;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Hospital;
import Business.Staff.FcStaff;
import Business.Staff.Sessions;
import Business.Staff.SessionsMedStaff;
import Business.Staff.Staff;
import Business.User.User;
import Business.User.UserDirectory;
import Business.UserAccount.UserAccount;
import constants.Utils;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class ManageUserFitRegRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserPanel
     */
    UserDirectory userDirectory;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Utils utils;
    User user;
    Sessions sessions;

    public ManageUserFitRegRequestPanel(JPanel parentContainerPanel, EcoSystem ecosystem, UserAccount userAccount) {
        this.userProcessContainer = parentContainerPanel;
        this.ecosystem = ecosystem;
        utils = new Utils();
        this.userAccount = userAccount;
        initComponents();
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
        tblSession = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnAcceptOrder1 = new javax.swing.JButton();
        btnManageSessions = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 249, 249));

        tblSession.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblSession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr No", "Patient Name", "Session Name", "Date", "Start-time", "End-time", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSession.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSession.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(tblSession);

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-1.png"))); // NOI18N
        btnDelete.setText("Cancel Registration");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 1, true));
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText(" Manage Registrations Requests");

        btnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnRefresh.setBorderPainted(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAcceptOrder1.setBackground(new java.awt.Color(255, 255, 255));
        btnAcceptOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnAcceptOrder1.setText("Accept Registration");
        btnAcceptOrder1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnAcceptOrder1.setBorderPainted(false);
        btnAcceptOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrder1ActionPerformed(evt);
            }
        });

        btnManageSessions.setText("Manage Sessions");
        btnManageSessions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSessionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageSessions, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnAcceptOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageSessions, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcceptOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(409, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private int getSelectedRow() {  
       int selectedRowIndex = tblSession.getSelectedRow();
        return selectedRowIndex;
    }

    
    private User getSelectedUserSession() {
        int selectedRowIndex = tblSession.getSelectedRow();

        if (selectedRowIndex < 0) {
            utils.showErrorToast("Oops! Please select a request first.");
            return null;
        }
        User user = (User) tblSession.getValueAt(selectedRowIndex, 1);
        return user;    
    }
    
    
    private Sessions getSelectedSession() {
        int selectedRowIndex = tblSession.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Oops! Please select a session request first.");
            return null;
        }
        Sessions sess = (Sessions) tblSession.getValueAt(selectedRowIndex, 2);
        return sess;
        
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Sessions u = getSelectedSession();
        if (u != null) {
//            User ud = ecosystem.getUserDirectory().getUserByUserName(userAccount.getUsername());
//            ud.getSessionDirectory().getSessionByUserName(userAccount.getUsername());
            u.setRegStatus("REJECTED");
            JOptionPane.showMessageDialog(this, "Registration rejected!");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void refreshTable() {
        populateTable();
    }

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblSession.getModel();

         ArrayList<FitnessCenter> fitnessCenterList = ecosystem.getFitnessCenterDirectory().getFitnessCenterList();
         for(FitnessCenter fc: fitnessCenterList){
         ArrayList<FitnessCenterDepartment> deptList = fc.getFcdepartmentDirectory().getDepartmentList();
         for(FitnessCenterDepartment fcd: deptList){
         FcStaff staff = fcd.getStaffDirectory().getStaffByUserName(userAccount.getUsername());
         if(staff != null){
             int count = 1;
                            model.setRowCount(0);
                            for (Sessions req : staff.getRegisterSessDir().getSession()) {
                                user = ecosystem.getUserDirectory().getUserByUserName(req.getFinduser());
                                Object[] row = new Object[7];
                                row[0] = "" + count++;
                                row[1] = user;
                                row[2] = req;
                                row[3] = req.getSessionDate();
                                row[4] = req.getStartTime();
                                row[5] = req.getEndTime();
                                row[6] = req.getRegStatus();
                                model.addRow(row);
         }
         
         }  
         }
         }  
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAcceptOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrder1ActionPerformed
        // TODO add your handling code here:
        
       Sessions u = getSelectedSession();
        if (u != null) {
//            User ud = ecosystem.getUserDirectory().getUserByUserName(userAccount.getUsername());
//            ud.getSessionDirectory().getSessionByUserName(userAccount.getUsername());
            u.setRegStatus("Accepted");
            JOptionPane.showMessageDialog(this, "Registration Accepted!");
            populateTable();
        }
    }//GEN-LAST:event_btnAcceptOrder1ActionPerformed

    private void btnManageSessionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSessionsActionPerformed
        // TODO add your handling code here:
        //ManageStaffConsultationDetailsPanel viewSessionDetailsPanel = new ManageStaffConsultationDetailsPanel(mainWorkArea, userAccount, ecosystem, user,sess );
        ManageSessionsPanel newReg = new ManageSessionsPanel(userProcessContainer, ecosystem,userAccount);
        userProcessContainer.add("NewRegistration", newReg);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSessionsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnManageSessions;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSession;
    // End of variables declaration//GEN-END:variables

private void changeBtns() {
        String status = sessions.getRegStatus().toUpperCase();

        if (status.equalsIgnoreCase("REJECTED") || status.equalsIgnoreCase("APPROVED")) {
            btnAcceptOrder1.setVisible(false);
            btnDelete.setVisible(false);

        } else {
            btnAcceptOrder1.setVisible(true);
            btnDelete.setVisible(true);
        }
    }




}