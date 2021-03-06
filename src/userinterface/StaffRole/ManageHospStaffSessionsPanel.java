/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import userinterface.FitnessDepartmentRole.*;
import Business.EcoSystem;
import Business.FitnessCenter.Department.FitnessCenterDepartment;
import Business.FitnessCenter.Department.FitnessCenterDepartmentDirectory;
import Business.FitnessCenter.FitnessCenter;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Hospital;
import Business.Staff.FcStaff;
import Business.Staff.Sessions;
import Business.Staff.SessionsMedStaff;
import Business.Staff.Staff;
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
public class ManageHospStaffSessionsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserPanel
     */
    UserDirectory userDirectory;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Utils utils;
    UserAccount userAccount;

    public ManageHospStaffSessionsPanel(JPanel parentContainerPanel, EcoSystem ecosystem,UserAccount userAccount) {
        this.userProcessContainer = parentContainerPanel;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        utils = new Utils();

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
        tblDepartmentList = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 249, 249));

        tblDepartmentList.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblDepartmentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr No", "Slot Name", "Date", "Start Time", "End Time", "Remote", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDepartmentList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDepartmentList.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(tblDepartmentList);

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

        btnAddUser.setBackground(new java.awt.Color(255, 255, 255));
        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        btnAddUser.setText("Slots");
        btnAddUser.setToolTipText("Add User");
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

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText(" Manage Availability");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddUser, btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddUser, btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private int getSelectedRow() {
        int selectedRowIndex = tblDepartmentList.getSelectedRow();
        return selectedRowIndex;
    }

    private SessionsMedStaff getSelectedStaff() {
        int selectedRowIndex = tblDepartmentList.getSelectedRow();

        if (selectedRowIndex < 0) {
            utils.showErrorToast("Oops! Please select a Fitness Center Staff first.");
            return null;
        }

        SessionsMedStaff u = (SessionsMedStaff) tblDepartmentList.getValueAt(selectedRowIndex, 1);

        return u;
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        SessionsMedStaff u = getSelectedStaff();

        if (u != null) {
            AddHospStaffSessionsPanel addSession = new AddHospStaffSessionsPanel(userProcessContainer, ecosystem, u, true, userAccount);

            userProcessContainer.add("AddSession", addSession);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        SessionsMedStaff u = getSelectedStaff();

        if (u != null) {
            ArrayList<Hospital> hospitalList = ecosystem.getHospitalDirectory().getHospitalList();
            for(Hospital fc: hospitalList){
            ArrayList<HospitalDepartment> hospitalDepartmentList= fc.getDepartmentDirectory().getDepartmentList();                   
            for(HospitalDepartment hd :hospitalDepartmentList) {
                Staff staff = hd.getStaffDirectory().getStaffByUserName(userAccount.getUsername());
                staff.getSessionDirectory().removeSession(u);
            }

           
            populateTable();
 //       }
            }
             JOptionPane.showMessageDialog(this, "Session deleted successfully!");
             utils.setDatabase(ecosystem);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void refreshTable() {
        populateTable();
    }

    private void populateTable() {
        //FitnessCenter hospital = ecosystem.getHospitalDirectory().getHospitalByUserName(userAccount.getUsername());
        //HospitalDepartmentDirectory hdd = hospital.getDepartmentDirectory();
        
       // FitnessCenter fc = ecosystem.getFitnessCenterDirectory().getFitnessCenterByUserName(userAccount.getUsername());
       // FitnessCenterDepartmentDirectory fcd = fc.getFcdepartmentDirectory();

        ArrayList<Hospital> hospitalList = ecosystem.getHospitalDirectory().getHospitalList();
        for(Hospital fc: hospitalList){
            ArrayList<HospitalDepartment> hospitalDepartmentList= fc.getDepartmentDirectory().getDepartmentList();                   
            for(HospitalDepartment hd :hospitalDepartmentList) {
               //ArrayList<FcStaff> fcstaff= fcd.getStaffDirectory().getStaffList();
                Staff staff = hd.getStaffDirectory().getStaffByUserName(userAccount.getUsername());
                if (staff != null) {
                    DefaultTableModel model = (DefaultTableModel) tblDepartmentList.getModel();
                    model.setRowCount(0);
                    int count = 1;
                //ArrayList<Sessions> s =  staff.getSdir().getSession();
                
                    for(SessionsMedStaff st : staff.getSessionDirectory().getSession()){
                          
                                Object[] row = new Object[7];
                                row[0] = "" + count++;
                                row[1] = st;
                                row[2] = st.getSessionDate();
                                row[3] = st.getStartTime();
                                row[4] = st.getEndTime();
                                row[5] = st.getIsRemote();
                                row[6] = st.getLocation();
                               // ArrayList<Sessions> sess = ;
                                model.addRow(row);
                            }
                    } 
                }
            }
        
    }

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // logic to go to next screen
        AddHospStaffSessionsPanel addStaff = new AddHospStaffSessionsPanel(userProcessContainer, ecosystem, null, false,userAccount);

        userProcessContainer.add("AddShopPanel", addStaff);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDepartmentList;
    // End of variables declaration//GEN-END:variables
}
