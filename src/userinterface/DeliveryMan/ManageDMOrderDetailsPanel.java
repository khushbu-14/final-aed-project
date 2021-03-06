/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryMan;

import userinterface.StaffRole.*;
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
public class ManageDMOrderDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderDetailsPanel
     */
    JPanel mainWorkArea;
    UserAccount userAccount;
    EcoSystem ecosystem;
    OrderList orderListData;
    Utils utils;

    public ManageDMOrderDetailsPanel(JPanel mainWorkArea, UserAccount userAccount, EcoSystem ecosystem, OrderList orderListData) {
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
        jPanel2 = new javax.swing.JPanel();
        lblShopName = new javax.swing.JLabel();
        lblRestaurantName2 = new javax.swing.JLabel();
        lblRestaurantNameLable = new javax.swing.JLabel();
        lblShopAddress = new javax.swing.JLabel();
        lblRestaurantName1 = new javax.swing.JLabel();
        lblShopContact = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCustomerContact1 = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnPickupOrder = new javax.swing.JButton();
        btnMarkDeliver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblCustomerContact2 = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerContact = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblCustomerAddress = new javax.swing.JLabel();
        lblCustomerAddress3 = new javax.swing.JLabel();

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
        lblPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/box.png"))); // NOI18N
        lblPageTitle.setText("Order Details");

        jPanel2.setBackground(new java.awt.Color(221, 248, 249));

        lblShopName.setBackground(new java.awt.Color(249, 244, 244));
        lblShopName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShopName.setText("NA");

        lblRestaurantName2.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantName2.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName2.setText("Shop Contact :");

        lblRestaurantNameLable.setBackground(new java.awt.Color(204, 255, 204));
        lblRestaurantNameLable.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantNameLable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantNameLable.setText("Shop Name :");

        lblShopAddress.setBackground(new java.awt.Color(249, 244, 244));
        lblShopAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShopAddress.setText("NA");

        lblRestaurantName1.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantName1.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName1.setText("Shop Address :");

        lblShopContact.setBackground(new java.awt.Color(249, 244, 244));
        lblShopContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShopContact.setText("NA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShopAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShopContact, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRestaurantNameLable)
                .addGap(15, 15, 15)
                .addComponent(lblShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRestaurantName2)
                .addGap(15, 15, 15)
                .addComponent(lblShopContact, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRestaurantName1)
                .addGap(15, 15, 15)
                .addComponent(lblShopAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(221, 248, 249));

        lblCustomerContact1.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerContact1.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerContact1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerContact1.setText("Message :");

        lblOrderStatus.setBackground(new java.awt.Color(249, 244, 244));
        lblOrderStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrderStatus.setText("NA");

        lblMessage.setBackground(new java.awt.Color(249, 244, 244));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMessage.setText("NA");

        lblName.setBackground(new java.awt.Color(249, 244, 244));
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Order Status :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName)
                .addGap(15, 15, 15)
                .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCustomerContact1)
                .addGap(15, 15, 15)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
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

        btnMarkDeliver.setBackground(new java.awt.Color(255, 255, 255));
        btnMarkDeliver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_1.png"))); // NOI18N
        btnMarkDeliver.setText("Mark Delivered");
        btnMarkDeliver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnMarkDeliver.setBorderPainted(false);
        btnMarkDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkDeliverActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(221, 248, 249));

        lblCustomerContact2.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerContact2.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerContact2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerContact2.setText("Customer Contact :");

        lblCustomerName.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerName.setText("NA");

        lblCustomerContact.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerContact.setText("NA");

        lblName1.setBackground(new java.awt.Color(249, 244, 244));
        lblName1.setForeground(new java.awt.Color(102, 102, 102));
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName1.setText("Customer Name :");

        lblCustomerAddress.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerAddress.setText("NA");

        lblCustomerAddress3.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerAddress3.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerAddress3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerAddress3.setText("Customer Address :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName1)
                .addGap(15, 15, 15)
                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCustomerContact2)
                .addGap(15, 15, 15)
                .addComponent(lblCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCustomerAddress3)
                .addGap(15, 15, 15)
                .addComponent(lblCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                            .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 376, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPickupOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMarkDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 539, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPickupOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMarkDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPickupOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupOrderActionPerformed
        // TODO add your handling code here:
        orderListData.setStatus("OUT FOR DELIVERY");
        lblOrderStatus.setText("OUT FOR DELIVERY");
        orderListData.setResolveDate(new Date());
        changeBtns();
        JOptionPane.showMessageDialog(null, "Order pickup successful!");
        String emailSubject = "Care4U Order Information";
        String emailBodyMessage = "Hi, " + orderListData.getUser().getName() + " Your Order is out for delivery";
        utils.sendEmail(orderListData.getUser().getEmail(), emailSubject, emailBodyMessage);
        utils.setDatabase(ecosystem);
    }//GEN-LAST:event_btnPickupOrderActionPerformed

    private void btnMarkDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkDeliverActionPerformed
        // TODO add your handling code here:
        orderListData.setStatus("COMPLETED");
        lblOrderStatus.setText("COMPLETED");
        Date currentDate = new Date();
        orderListData.setResolveDate(currentDate);
        changeBtns();
        JOptionPane.showMessageDialog(null, "Hey thanks for delivering the order to customer successfully!");
        String emailSubject = "Care4U Order Information | Order Delivered";

        String emailBodyMessage = "Hi, " + orderListData.getUser().getName() + " Your Order have been successfully delivered";

        //  String emailBodyMessage = "Hi, " + orderListData.getUser().getName() + " Your Order have been successfully delivered";
        utils.sendEmail(orderListData.getUser().getEmail(), emailSubject, emailBodyMessage);

        // email to shop
        utils.sendEmail(orderListData.getShop().getEmail(), emailSubject, "Order of " + orderListData.getUser().getName() + " is delivered at " + currentDate);
        
        utils.setDatabase(ecosystem);
    }//GEN-LAST:event_btnMarkDeliverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMarkDeliver;
    private javax.swing.JButton btnPickupOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomerAddress3;
    private javax.swing.JLabel lblCustomerContact;
    private javax.swing.JLabel lblCustomerContact1;
    private javax.swing.JLabel lblCustomerContact2;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblRestaurantName1;
    private javax.swing.JLabel lblRestaurantName2;
    private javax.swing.JLabel lblRestaurantNameLable;
    private javax.swing.JLabel lblShopAddress;
    private javax.swing.JLabel lblShopContact;
    private javax.swing.JLabel lblShopName;
    private javax.swing.JTable tblCart;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();

        int count = 1;
//        int qtyTotal = 0;
//        double sumTotal = 0;

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

//            qtyTotal += qty;
//            sumTotal += price * qty;
            model.addRow(row);
        }

//        lblTotalPrice.setText(String.valueOf(sumTotal));
//        lblTotalQty.setText(String.valueOf(qtyTotal));
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];

        ManageDeliveryManOrderHistory manageDeliveryManOrderHistory = (ManageDeliveryManOrderHistory) component;

//        ManageDirectConsultationsHistory manageDirectConsultationsHistory = (ManageDirectConsultationsHistory) component;
        // ManageShopOrderHistory manageShopOrderHistory = (ManageShopOrderHistory) component;
        // ManageUserOrderHistory manageUserOrderHistory = (ManageUserOrderHistory) component;
        manageDeliveryManOrderHistory.populateTable();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    public void renderData() {

        lblShopName.setText(orderListData.getShop().getShopName());
        lblShopAddress.setText(orderListData.getShop().getAddress());
        lblShopContact.setText(orderListData.getShop().getContactNo());

        lblCustomerAddress.setText(orderListData.getUser().getAddress());
        lblCustomerContact.setText(orderListData.getUser().getContact());
        lblCustomerName.setText(orderListData.getUser().getName());

        lblOrderStatus.setText(orderListData.getStatus());
        lblMessage.setText(orderListData.getMessage());

        changeBtns();

        populateTable();
    }

    private void changeBtns() {
        String status = orderListData.getStatus().toUpperCase();

        if (status.equalsIgnoreCase("OUT FOR DELIVERY")) {
            btnMarkDeliver.setVisible(true);
            btnPickupOrder.setVisible(false);
        } else if (status.equalsIgnoreCase("COMPLETED")) {
            btnMarkDeliver.setVisible(false);
            btnPickupOrder.setVisible(false);
        } else {
            btnMarkDeliver.setVisible(false);
            btnPickupOrder.setVisible(true);
        }
    }
}
