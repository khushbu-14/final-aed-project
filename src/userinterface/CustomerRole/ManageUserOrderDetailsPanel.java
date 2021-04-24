/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
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
public class ManageUserOrderDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderDetailsPanel
     */
    JPanel mainWorkArea;
    UserAccount userAccount;
    EcoSystem ecosystem;
    OrderList orderListData;
    Utils utils;

    public ManageUserOrderDetailsPanel(JPanel mainWorkArea, UserAccount userAccount, EcoSystem ecosystem, OrderList orderListData) {
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
        lblTotalPrice1 = new javax.swing.JLabel();
        lblPageTitle = new javax.swing.JLabel();
        btnUpdateMessage = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblTotalQty = new javax.swing.JLabel();
        lblRestaurantName5 = new javax.swing.JLabel();
        lblRestaurantNameLable1 = new javax.swing.JLabel();
        lblLastStatusDate = new javax.swing.JLabel();
        lblRestaurantName6 = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblDoctorName1 = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCustomerContact1 = new javax.swing.JLabel();
        lblShopName = new javax.swing.JLabel();
        lblDeliveryManName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblCustomerAddress1 = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        lblCustomerAddress3 = new javax.swing.JLabel();
        assignDoctorPanel2 = new javax.swing.JPanel();
        lblShipmentType2 = new javax.swing.JLabel();
        lblShipmentTypeName2 = new javax.swing.JLabel();
        btnPickupOrder = new javax.swing.JButton();

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

        lblTotalPrice1.setBackground(new java.awt.Color(249, 244, 244));
        lblTotalPrice1.setForeground(new java.awt.Color(102, 102, 102));
        lblTotalPrice1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPrice1.setText("Message :");

        lblPageTitle.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/box.png"))); // NOI18N
        lblPageTitle.setText("Order Details");

        btnUpdateMessage.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        btnUpdateMessage.setText("Update");
        btnUpdateMessage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnUpdateMessage.setBorderPainted(false);
        btnUpdateMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMessageActionPerformed(evt);
            }
        });

        txtMessage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });

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

        lblDoctorName1.setBackground(new java.awt.Color(249, 244, 244));
        lblDoctorName1.setForeground(new java.awt.Color(102, 102, 102));
        lblDoctorName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDoctorName1.setText("Doctor Name :");

        lblDoctorName.setBackground(new java.awt.Color(249, 244, 244));
        lblDoctorName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDoctorName.setText("NA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(lblDoctorName1)
                .addGap(10, 10, 10)
                .addComponent(lblDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

        assignDoctorPanel2.setBackground(new java.awt.Color(221, 248, 249));

        lblShipmentType2.setBackground(new java.awt.Color(249, 244, 244));
        lblShipmentType2.setForeground(new java.awt.Color(102, 102, 102));
        lblShipmentType2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShipmentType2.setText("Shipment Type :");

        lblShipmentTypeName2.setBackground(new java.awt.Color(249, 244, 244));
        lblShipmentTypeName2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShipmentTypeName2.setText("NA");

        javax.swing.GroupLayout assignDoctorPanel2Layout = new javax.swing.GroupLayout(assignDoctorPanel2);
        assignDoctorPanel2.setLayout(assignDoctorPanel2Layout);
        assignDoctorPanel2Layout.setHorizontalGroup(
            assignDoctorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignDoctorPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(assignDoctorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblShipmentTypeName2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShipmentType2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        assignDoctorPanel2Layout.setVerticalGroup(
            assignDoctorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignDoctorPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblShipmentType2)
                .addGap(10, 10, 10)
                .addComponent(lblShipmentTypeName2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnPickupOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnPickupOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_1.png"))); // NOI18N
        btnPickupOrder.setText("Pickup Order");
        btnPickupOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnPickupOrder.setBorderPainted(false);
        btnPickupOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupOrderActionPerformed(evt);
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
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275)
                        .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnUpdateMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPickupOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(assignDoctorPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTotalPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(24, 24, 24)))
                        .addGap(0, 551, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(assignDoctorPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(lblTotalPrice1)
                        .addGap(15, 15, 15)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnUpdateMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnPickupOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMessageActionPerformed
        // TODO add your handling code here:
        String msg = txtMessage.getText().trim();

        if (utils.isStringInputValid(msg) && !msg.equalsIgnoreCase(orderListData.getMessage())) {
            orderListData.setMessage(msg);
            JOptionPane.showMessageDialog(this, "Message updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter some new message / comments.");
        }
        utils.setDatabase(ecosystem);
    }//GEN-LAST:event_btnUpdateMessageActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void btnPickupOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupOrderActionPerformed
        // TODO add your handling code here:
        orderListData.setStatus("COMPLETED");
        lblOrderStatus.setText("COMPLETED");
        orderListData.setResolveDate(new Date());
        btnPickupOrder.setVisible(false);
        
        JOptionPane.showMessageDialog(null, "Hey thanks for shopping with us!");
        utils.setDatabase(ecosystem);
    }//GEN-LAST:event_btnPickupOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assignDoctorPanel2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPickupOrder;
    private javax.swing.JButton btnUpdateMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustomerAddress1;
    private javax.swing.JLabel lblCustomerAddress3;
    private javax.swing.JLabel lblCustomerContact1;
    private javax.swing.JLabel lblDeliveryManName;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblDoctorName1;
    private javax.swing.JLabel lblLastStatusDate;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRestaurantName5;
    private javax.swing.JLabel lblRestaurantName6;
    private javax.swing.JLabel lblRestaurantNameLable1;
    private javax.swing.JLabel lblShipmentType2;
    private javax.swing.JLabel lblShipmentTypeName2;
    private javax.swing.JLabel lblShopName;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTotalPrice1;
    private javax.swing.JLabel lblTotalQty;
    private javax.swing.JTable tblCart;
    private javax.swing.JTextField txtMessage;
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

        ManageUserOrderHistory manageUserOrderHistory = (ManageUserOrderHistory) component;

        manageUserOrderHistory.populateTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void renderData() {

        btnPickupOrder.setVisible(false);
//        lblAssignedFitness.setVisible(false);
//        lblAssignedFitnessName.setVisible(false);
        lblShopName.setText(orderListData.getShop().getShopName());
        // lblDataOrderId.setText(orderListData.getOrderId());
        String deliveryManName = "NA";

        lblShipmentTypeName2.setText(orderListData.getIsPickup() ? "PICKUP" : "DELIVERY");

        if (orderListData.getDeliveryMan() != null) {
            deliveryManName = orderListData.getDeliveryMan().getName();
        }

        lblDeliveryManName.setText(deliveryManName);

        lblRequestDate.setText(orderListData.getRequestDate().toString());
        lblOrderStatus.setText(orderListData.getStatus());
        // lblMsg.setText(orderListData.getMessage());
        txtMessage.setText(orderListData.getMessage());

        String orderStatus = orderListData.getStatus();

        if (orderListData.getStaff() != null) {
            lblDoctorName.setVisible(true);
            lblDoctorName1.setVisible(true);
            lblDoctorName.setText(orderListData.getStaff().getName());
        } else {
            lblDoctorName.setVisible(false);
            lblDoctorName1.setVisible(false);
        }

        switch (orderStatus) {

            case "SHOP REJECTED":
            case "STAFF REJECTED":
            case "DELIVERY MAN ASSIGNED":
            case "COMPLETED":
                btnUpdateMessage.setVisible(false);
                txtMessage.setEditable(false);
                break;

            case "READY FOR PICKUP":
                btnUpdateMessage.setVisible(false);
                txtMessage.setEditable(false);
                btnPickupOrder.setVisible(true);
                break;

            default:
                btnUpdateMessage.setVisible(true);
                txtMessage.setEditable(true);
                break;
        }

        if (orderListData.getResolveDate() != null) {
            lblLastStatusDate.setText(orderListData.getResolveDate().toString());
        } else {
            lblLastStatusDate.setText(orderListData.getRequestDate().toString());
        }

        populateTable();
    }
}
