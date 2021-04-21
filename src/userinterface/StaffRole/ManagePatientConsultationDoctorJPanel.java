/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Hospital;
import Business.Staff.SessionsMedStaff;
import Business.Staff.Staff;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderList;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class ManagePatientConsultationDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserOrderHistory
     */
    private List<WorkRequest> workRequestList;

    JPanel mainWorkArea;
    EcoSystem ecosystem;
    UserAccount userAccount;

    public ManagePatientConsultationDoctorJPanel(JPanel mainWorkArea, EcoSystem ecosystem, UserAccount userAccount) {
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsultation = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 249, 249));

        tblConsultation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblConsultation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr No.", "Patient Name", "Session Name", "Date", "Start-time", "End-time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsultation.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblConsultation.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane2.setViewportView(tblConsultation);

        btnViewDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/view-details.png"))); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnViewDetails.setBorderPainted(false);
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private WorkRequest getSelectedRow() {
        int selectedRowIndex = tblConsultation.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Oops! Please select a consultation first.");
            return null;
        }

        WorkRequest request = (WorkRequest) tblConsultation.getValueAt(selectedRowIndex, 1);

        return request;
    }

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        WorkRequest request = getSelectedRow();

        if (request != null && request instanceof OrderList) {
            OrderList orderListData = (OrderList) request;

            ManageStaffOrderDetailsPanel manageStaffOrderDetailsPanel = new ManageStaffOrderDetailsPanel(mainWorkArea, userAccount, ecosystem, orderListData);

            // ManageUserOrderDetailsPanel manageUserOrderDetailsPanel = new ManageUserOrderDetailsPanel(mainWorkArea, userAccount, ecosystem, orderListData);
            mainWorkArea.add("manageStaffOrderDetailsPanel", manageStaffOrderDetailsPanel);
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.next(mainWorkArea);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblConsultation;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblConsultation.getModel();
        ArrayList<Hospital> hosp = ecosystem.getHospitalDirectory().getHospitalList();
        for(Hospital h:hosp){
            ArrayList<HospitalDepartment> hd = h.getDepartmentDirectory().getDepartmentList();
            for(HospitalDepartment d: hd){
                ArrayList<Staff> staff = d.getStaffDirectory().getStaffList();
                for(Staff s:staff){
                    if(s.getUsername().equalsIgnoreCase(userAccount.getUsername())){
                    
                            int count = 1;
                            model.setRowCount(0);

                            for (SessionsMedStaff req : s.getConsultationDirectory().getSession()) {
                                Object[] row = new Object[7];
                                row[0] = "" + count++;
                                row[1] = s.getName();
                                row[2] = req;
                                row[3] = req.getSessionDate();
                                row[4] = req.getStartTime();
                                row[5] = req.getEndTime();
                                row[6] = "New Order";
                                model.addRow(row);

        }
                        
                    }
                }
            }
        }

//        int count = 1;
//
//        model.setRowCount(0);
//
//        for (WorkRequest req : workRequestList) {
//            Object[] row = new Object[5];
//            row[0] = "" + count++;
//            row[1] = req;
//            row[2] = req.getShop().getShopName();
//            row[3] = req.getStatus();
//            row[4] = req.getRequestDate();
//
//            model.addRow(row);
//
//        }
    }
}
