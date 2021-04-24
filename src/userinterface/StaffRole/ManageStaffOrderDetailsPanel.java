/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import userinterface.ShopsRole.*;
import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Department.HospitalDepartmentDirectory;
import Business.Hospital.Hospital;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderItem;
import Business.WorkQueue.OrderList;
import constants.Utils;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class ManageStaffOrderDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderDetailsPanel
     */
    JPanel mainWorkArea;
    UserAccount userAccount;
    EcoSystem ecosystem;
    OrderList orderListData;
    Utils utils;

    public ManageStaffOrderDetailsPanel(JPanel mainWorkArea, UserAccount userAccount, EcoSystem ecosystem, OrderList orderListData) {
        this.mainWorkArea = mainWorkArea;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.orderListData = orderListData;
        utils = new Utils();
        initComponents();
        renderData();
//        populateTable();
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
        tblCart = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblPageTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTotalQty = new javax.swing.JLabel();
        lblRestaurantName5 = new javax.swing.JLabel();
        lblRestaurantNameLable1 = new javax.swing.JLabel();
        lblLastStatusDate = new javax.swing.JLabel();
        lblRestaurantName6 = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblRestaurantName7 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCustomerContact1 = new javax.swing.JLabel();
        lblShopName = new javax.swing.JLabel();
        lblDeliveryManName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblCustomerAddress1 = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        lblCustomerAddress3 = new javax.swing.JLabel();
        assignDoctorPanel = new javax.swing.JPanel();
        lblShipmentType = new javax.swing.JLabel();
        lblShipmentTypeName = new javax.swing.JLabel();
        lblAssignedStaff = new javax.swing.JLabel();
        lblAssignedStaffName = new javax.swing.JLabel();
        lblAssignedFitnessName = new javax.swing.JLabel();
        lblAssignedFitness = new javax.swing.JLabel();
        btnViewPatientDetails = new javax.swing.JButton();
        btnRejectOrder = new javax.swing.JButton();
        btnAssignFitness = new javax.swing.JButton();
        btnAcceptOrder1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 249, 249));

        tblCart.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sr No.", "Product Name", "Unit Price", "Total Price", "Quantity", "Prescription Needed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane2.setViewportView(tblCart);

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
        lblPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/profile.png"))); // NOI18N
        lblPageTitle.setText("Consultation Details");

        jPanel3.setBackground(new java.awt.Color(221, 248, 249));

        lblTotalQty.setBackground(new java.awt.Color(249, 244, 244));
        lblTotalQty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalQty.setText("NA");

        lblRestaurantName5.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantName5.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName5.setText("Total Price :");

        lblRestaurantNameLable1.setBackground(new java.awt.Color(204, 255, 204));
        lblRestaurantNameLable1.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantNameLable1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantNameLable1.setText("Total Quantity :");

        lblLastStatusDate.setBackground(new java.awt.Color(249, 244, 244));
        lblLastStatusDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLastStatusDate.setText("NA");

        lblRestaurantName6.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantName6.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName6.setText("Last Status Update Date :");

        lblTotalPrice.setBackground(new java.awt.Color(249, 244, 244));
        lblTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPrice.setText("NA");

        lblRestaurantName7.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantName7.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName7.setText("Message :");

        lblMessage.setBackground(new java.awt.Color(249, 244, 244));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMessage.setText("NA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalQty, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantNameLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastStatusDate, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRestaurantNameLable1)
                .addGap(10, 10, 10)
                .addComponent(lblTotalQty, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRestaurantName5)
                .addGap(10, 10, 10)
                .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRestaurantName6)
                .addGap(10, 10, 10)
                .addComponent(lblLastStatusDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRestaurantName7)
                .addGap(10, 10, 10)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(221, 248, 249));

        lblCustomerContact1.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerContact1.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerContact1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerContact1.setText("Delivery Man Name :");

        lblShopName.setBackground(new java.awt.Color(249, 244, 244));
        lblShopName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShopName.setText("NA");

        lblDeliveryManName.setBackground(new java.awt.Color(249, 244, 244));
        lblDeliveryManName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDeliveryManName.setText("NA");

        lblName1.setBackground(new java.awt.Color(249, 244, 244));
        lblName1.setForeground(new java.awt.Color(102, 102, 102));
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName1.setText("Shop Name :");

        lblRequestDate.setBackground(new java.awt.Color(249, 244, 244));
        lblRequestDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRequestDate.setText("NA");

        lblCustomerAddress1.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerAddress1.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerAddress1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerAddress1.setText("Request Date :");

        lblOrderStatus.setBackground(new java.awt.Color(249, 244, 244));
        lblOrderStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrderStatus.setText("NA");

        lblCustomerAddress3.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerAddress3.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerAddress3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerAddress3.setText("Order Status :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequestDate, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeliveryManName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName1)
                .addGap(10, 10, 10)
                .addComponent(lblShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCustomerContact1)
                .addGap(10, 10, 10)
                .addComponent(lblDeliveryManName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCustomerAddress1)
                .addGap(10, 10, 10)
                .addComponent(lblRequestDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCustomerAddress3)
                .addGap(10, 10, 10)
                .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        assignDoctorPanel.setBackground(new java.awt.Color(221, 248, 249));

        lblShipmentType.setBackground(new java.awt.Color(249, 244, 244));
        lblShipmentType.setForeground(new java.awt.Color(102, 102, 102));
        lblShipmentType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShipmentType.setText("Shiptment Type :");

        lblShipmentTypeName.setBackground(new java.awt.Color(249, 244, 244));
        lblShipmentTypeName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShipmentTypeName.setText("NA");

        lblAssignedStaff.setBackground(new java.awt.Color(249, 244, 244));
        lblAssignedStaff.setForeground(new java.awt.Color(102, 102, 102));
        lblAssignedStaff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAssignedStaff.setText("Assigned Staff Name :");

        lblAssignedStaffName.setBackground(new java.awt.Color(249, 244, 244));
        lblAssignedStaffName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAssignedStaffName.setText("NA");

        lblAssignedFitnessName.setBackground(new java.awt.Color(249, 244, 244));
        lblAssignedFitnessName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAssignedFitnessName.setText("NA");

        lblAssignedFitness.setBackground(new java.awt.Color(249, 244, 244));
        lblAssignedFitness.setForeground(new java.awt.Color(102, 102, 102));
        lblAssignedFitness.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAssignedFitness.setText("Assigned Fitness Session :");

        javax.swing.GroupLayout assignDoctorPanelLayout = new javax.swing.GroupLayout(assignDoctorPanel);
        assignDoctorPanel.setLayout(assignDoctorPanelLayout);
        assignDoctorPanelLayout.setHorizontalGroup(
            assignDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignDoctorPanelLayout.createSequentialGroup()
                .addGroup(assignDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(assignDoctorPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(assignDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblShipmentTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblShipmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignDoctorPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(assignDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAssignedStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAssignedStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAssignedFitnessName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAssignedFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        assignDoctorPanelLayout.setVerticalGroup(
            assignDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignDoctorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblShipmentType)
                .addGap(10, 10, 10)
                .addComponent(lblShipmentTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblAssignedStaff)
                .addGap(10, 10, 10)
                .addComponent(lblAssignedStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblAssignedFitness)
                .addGap(10, 10, 10)
                .addComponent(lblAssignedFitnessName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnViewPatientDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnViewPatientDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/view-details.png"))); // NOI18N
        btnViewPatientDetails.setText("View Patient Details");
        btnViewPatientDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnViewPatientDetails.setBorderPainted(false);
        btnViewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientDetailsActionPerformed(evt);
            }
        });

        btnRejectOrder.setBackground(new java.awt.Color(255, 204, 204));
        btnRejectOrder.setForeground(new java.awt.Color(102, 102, 102));
        btnRejectOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-1.png"))); // NOI18N
        btnRejectOrder.setText("Reject");
        btnRejectOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 1, true));
        btnRejectOrder.setBorderPainted(false);
        btnRejectOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectOrderActionPerformed(evt);
            }
        });

        btnAssignFitness.setBackground(new java.awt.Color(3, 80, 111));
        btnAssignFitness.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAssignFitness.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignFitness.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnAssignFitness.setText("Assign Fitness Centre");
        btnAssignFitness.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAssignFitness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignFitnessActionPerformed(evt);
            }
        });

        btnAcceptOrder1.setBackground(new java.awt.Color(255, 255, 255));
        btnAcceptOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnAcceptOrder1.setText("Approve");
        btnAcceptOrder1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnAcceptOrder1.setBorderPainted(false);
        btnAcceptOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(assignDoctorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAcceptOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRejectOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAssignFitness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewPatientDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(0, 539, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRejectOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcceptOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAssignFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientDetailsActionPerformed
        // TODO add your handling code here:

        User u = orderListData.getUser();

        UserReport userReport = new UserReport(mainWorkArea, ecosystem, u);

        mainWorkArea.add("userReport", userReport);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);

    }//GEN-LAST:event_btnViewPatientDetailsActionPerformed

    private void btnRejectOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectOrderActionPerformed
        orderListData.setStatus("STAFF REJECTED");
        orderListData.setResolveDate(new Date());
        changeBtns();
        JOptionPane.showMessageDialog(null, "Order rejected successfully!");
        lblOrderStatus.setText("STAFF REJECTED");
        utils.setDatabase(ecosystem);
    }//GEN-LAST:event_btnRejectOrderActionPerformed

    private void btnAssignFitnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignFitnessActionPerformed
        // TODO add your handling code here:
//        AssignStaffPanel assignStaffPanel = new AssignStaffPanel(mainWorkArea, ecosystem, orderListData);
//        mainWorkArea.add("AssignStaffPanel", assignStaffPanel);
//        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//        layout.next(mainWorkArea);

        User user = orderListData.getUser();
        ManageUserFitnessRegistrationPanel orderMedicinePanel = new ManageUserFitnessRegistrationPanel(mainWorkArea, ecosystem, user, "DOCTOR");

        mainWorkArea.add("manageHospitalsJPanel", orderMedicinePanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnAssignFitnessActionPerformed

    private void btnAcceptOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcceptOrder1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assignDoctorPanel;
    private javax.swing.JButton btnAcceptOrder1;
    private javax.swing.JButton btnAssignFitness;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRejectOrder;
    private javax.swing.JButton btnViewPatientDetails;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAssignedFitness;
    private javax.swing.JLabel lblAssignedFitnessName;
    private javax.swing.JLabel lblAssignedStaff;
    private javax.swing.JLabel lblAssignedStaffName;
    private javax.swing.JLabel lblCustomerAddress1;
    private javax.swing.JLabel lblCustomerAddress3;
    private javax.swing.JLabel lblCustomerContact1;
    private javax.swing.JLabel lblDeliveryManName;
    private javax.swing.JLabel lblLastStatusDate;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRestaurantName5;
    private javax.swing.JLabel lblRestaurantName6;
    private javax.swing.JLabel lblRestaurantName7;
    private javax.swing.JLabel lblRestaurantNameLable1;
    private javax.swing.JLabel lblShipmentType;
    private javax.swing.JLabel lblShipmentTypeName;
    private javax.swing.JLabel lblShopName;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTotalQty;
    private javax.swing.JTable tblCart;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();

        int count = 1;
        int qtyTotal = 0;
        double sumTotal = 0;

        model.setRowCount(0);
        for (OrderItem item : orderListData.getOrderList()) {

            int qty = item.getQuantity();
            double price = item.getProduct().getPrice();
            String prescription = item.getProduct().getIsPrescriptionNeeded() ? "Yes" : "No";

            Object[] row = new Object[6];
            row[0] = "" + count++;
            row[1] = item;
            row[2] = price;
            row[3] = String.valueOf(price * qty);
            row[4] = String.valueOf(qty);
            row[5] = prescription;

            qtyTotal += qty;
            sumTotal += price * qty;

            model.addRow(row);
        }

        lblTotalPrice.setText(String.valueOf(sumTotal));
        lblTotalQty.setText(String.valueOf(qtyTotal));
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];

        ManageDirectConsultationsHistory manageDirectConsultationsHistory = (ManageDirectConsultationsHistory) component;

        // ManageShopOrderHistory manageShopOrderHistory = (ManageShopOrderHistory) component;
        // ManageUserOrderHistory manageUserOrderHistory = (ManageUserOrderHistory) component;
        manageDirectConsultationsHistory.populateTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    public void renderData() {

        lblAssignedFitness.setVisible(false);
        lblAssignedFitnessName.setVisible(false);

        lblShopName.setText(orderListData.getShop().getShopName());
        // lblDataOrderId.setText(orderListData.getOrderId());
        String deliveryManName = "NA";

        if (orderListData.getDeliveryMan() != null) {
            deliveryManName = orderListData.getDeliveryMan().getName();
        }

        lblDeliveryManName.setText(deliveryManName);

        lblRequestDate.setText(orderListData.getRequestDate().toString());
        lblOrderStatus.setText(orderListData.getStatus());
        // lblMsg.setText(orderListData.getMessage());
        lblMessage.setText(orderListData.getMessage());

        lblShipmentTypeName.setText(orderListData.getIsPickup() ? "PICKUP" : "DELIVERY");

//        String orderStatus = orderListData.getStatus();
        changeBtns();

        if (orderListData.getStaff() != null) {
            lblAssignedStaffName.setVisible(true);
            lblAssignedStaff.setVisible(true);

            lblAssignedStaffName.setText(orderListData.getStaff().getName());
        } else {
            lblAssignedStaffName.setVisible(false);
            lblAssignedStaff.setVisible(false);
        }

        if (orderListData.getResolveDate() != null) {
            lblLastStatusDate.setText(orderListData.getResolveDate().toString());
        } else {
            lblLastStatusDate.setText(orderListData.getRequestDate().toString());
        }

        populateTable();
    }

    private void changeBtns() {
        String status = orderListData.getStatus().toUpperCase();

        if (status.equalsIgnoreCase("STAFF REJECTED") || status.equalsIgnoreCase("STAFF APPROVED")) {
            btnViewPatientDetails.setVisible(false);
            btnRejectOrder.setVisible(false);

        } else {
            btnViewPatientDetails.setVisible(true);
            btnRejectOrder.setVisible(true);
        }
    }
}
