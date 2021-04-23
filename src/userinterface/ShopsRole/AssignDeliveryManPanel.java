/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ShopsRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Department.HospitalDepartmentDirectory;
import Business.Hospital.Hospital;
import Business.Staff.Staff;
import Business.Staff.StaffDirectory;
import Business.WorkQueue.OrderList;
import constants.Utils;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class AssignDeliveryManPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignStaffPanel
     */
    JPanel mainWorkArea;
    Utils utils;
    OrderList orderListData;
    EcoSystem ecosystem;

    public AssignDeliveryManPanel(JPanel mainWorkArea, EcoSystem ecosystem, OrderList orderListData) {
        this.mainWorkArea = mainWorkArea;
        this.orderListData = orderListData;
        this.ecosystem = ecosystem;
        this.utils = new Utils();
        initComponents();
        renderData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblPageTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        btnAssignDeliveryMan = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 249, 249));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("");
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

        lblPageTitle.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N
        lblPageTitle.setText("Assign Delivery Man");

        tblDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr No.", "Name", "Contact Number", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryMan.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane2.setViewportView(tblDeliveryMan);

        btnAssignDeliveryMan.setBackground(new java.awt.Color(3, 80, 111));
        btnAssignDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAssignDeliveryMan.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignDeliveryMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnAssignDeliveryMan.setText("Confirm");
        btnAssignDeliveryMan.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssignDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssignDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        // TODO add your handling code here:

        DeliveryMan deliveryMan = getSelectedRow();

        if (deliveryMan != null) {
            orderListData.setDeliveryMan(deliveryMan);

            JOptionPane.showMessageDialog(this, deliveryMan.getName() + " assigned to order successfully!",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            
            backAction();
            orderListData.setStatus("DELIVERY MAN ASSIGNED");
            String emailSubject = "Care4U Order Information";
            String emailBodyMessage = "Hi, "+ deliveryMan.getName()+" Order from "+orderListData.getSender()+" has been Assigned to you";
            utils.sendEmail(deliveryMan.getEmail(), emailSubject, emailBodyMessage);
            utils.setDatabase(ecosystem);

        }
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JTable tblDeliveryMan;
    // End of variables declaration//GEN-END:variables

    private DeliveryMan getSelectedRow() {
        int selectedRowIndex = tblDeliveryMan.getSelectedRow();

        if (selectedRowIndex < 0) {
            utils.showErrorToast("Oops! Please select a delivery man first.");
            return null;
        }

        DeliveryMan deliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRowIndex, 1);

        return deliveryMan;
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];

        ManageShopOrderDetailsPanel manageShopOrderDetailsPanel = (ManageShopOrderDetailsPanel) component;
        manageShopOrderDetailsPanel.renderData();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void renderData() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();

        int count = 1;
        model.setRowCount(0);

        if (ecosystem.getDeliveryManDirectory() != null) {
            for (DeliveryMan dm : ecosystem.getDeliveryManDirectory().getDeliveryManList()) {
                if (dm != null) {
                    Object[] row = new Object[4];
                    row[0] = "" + count++;
                    row[1] = dm;
                    row[2] = dm.getContact();
                    row[3] = dm.getEmail();

                    model.addRow(row);
                }
            }
        }

//        if (ecosystem.getHospitalDirectory() != null) {
//            for (Hospital h : ecosystem.getHospitalDirectory().getHospitalList()) {
//                if (h != null) {
//                    HospitalDepartmentDirectory hd = h.getDepartmentDirectory();
//                    if (hd != null) {
//                        for (HospitalDepartment dept : hd.getDepartmentList()) {
//                            if (dept != null) {
//                                StaffDirectory sd = dept.getStaffDirectory();
//                                if (sd != null) {
//                                    for (Staff staff : sd.getStaffList()) {
//                                       
//                                        Object[] row = new Object[5];
//                                        row[0] = "" + count++;
//                                        row[1] = staff;
//                                        row[2] = staff.getDesignation();
//                                        row[3] = h;
//                                        row[4] = dept;
//
//                                        model.addRow(row);
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
    }
}
