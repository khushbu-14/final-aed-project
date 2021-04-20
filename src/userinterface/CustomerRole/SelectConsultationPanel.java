/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Shop.Product;
import Business.Shop.ProductDirectory;
import Business.Shop.Shop;
import Business.Staff.Staff;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderItem;
import Business.WorkQueue.OrderList;
import constants.Utils;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class SelectConsultationPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderMedicinePanel
     */
    private JPanel mainWorkArea;
    private EcoSystem ecosystem;
    private Staff shop;
    private User user;

    private UserAccount userAccount;

    private ArrayList<OrderItem> orderList = new ArrayList<OrderItem>();

    Utils utils;

    DefaultTableModel model;

    public SelectConsultationPanel(JPanel mainPanel, EcoSystem ecosystem, Staff shop, UserAccount userAccount) {
        this.mainWorkArea = mainPanel;
        this.ecosystem = ecosystem;
        this.shop = shop;
        this.userAccount = userAccount;
        this.user = (User) userAccount;
        utils = new Utils();
        initComponents();
        populateData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultaionSlot = new javax.swing.JTable();
        btnAddSlot = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        lblMsg = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();
        comboOrderShipmentType = new javax.swing.JComboBox<>();
        lblShipmentType = new javax.swing.JLabel();

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
        lblPageTitle.setText("Consultation Slot");

        tblConsultaionSlot.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblConsultaionSlot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr No.", "Date", "Start-time", "End-time"
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
        tblConsultaionSlot.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(tblConsultaionSlot);

        btnAddSlot.setBackground(new java.awt.Color(138, 177, 138));
        btnAddSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        btnAddSlot.setText("Add Slot");
        btnAddSlot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnAddSlot.setBorderPainted(false);
        btnAddSlot.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSlotActionPerformed(evt);
            }
        });

        txtMessage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblMsg.setBackground(new java.awt.Color(249, 244, 244));
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMsg.setText("Delivery Instructions / Message :");

        btnPlaceOrder.setBackground(new java.awt.Color(138, 177, 138));
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnPlaceOrder.setText("Book Slots");
        btnPlaceOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnPlaceOrder.setBorderPainted(false);
        btnPlaceOrder.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        comboOrderShipmentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        lblShipmentType.setBackground(new java.awt.Color(249, 244, 244));
        lblShipmentType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShipmentType.setText("Select order shipment type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblShipmentType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboOrderShipmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199)
                                .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblShipmentType)
                        .addGap(12, 12, 12)
                        .addComponent(comboOrderShipmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(lblMsg)
                .addGap(19, 19, 19)
                .addComponent(txtMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Product getSelectedSession() {
        int selectedRowIndex = tblConsultaionSlot.getSelectedRow();

        if (selectedRowIndex < 0) {
            utils.showErrorToast("Oops! Please select a Session first.");
            return null;
        }

        Product p = (Product) tblConsultaionSlot.getValueAt(selectedRowIndex, 1);

        return p;
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlotActionPerformed
//        // TODO add your handling code here:
//        Product p = getSelectedProduct();
//        int qty = 0;
//
//        if (p != null) {
//
//            String response = JOptionPane.showInputDialog("Please provide quantity for " + p.getProductName());
//
//            try {
//                qty = Integer.parseInt(response);
//            } catch (NumberFormatException e) {
//                utils.showErrorToast("Oops! Please provide valid quantity in numbers only");
//            }
//
//            if (qty > 0) {
//                OrderItem oi = new OrderItem(p, qty);
//
//                orderList.add(oi);
//
//                populateCartTable();
//            } else {
//                utils.showErrorToast("Only positive numbers allowed");
//            }
//        }
    }//GEN-LAST:event_btnAddSlotActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed

        if (orderList != null && !orderList.isEmpty()) {
            String orderShipmentType = comboOrderShipmentType.getSelectedItem().toString();

            if (utils.isStringInputValid(orderShipmentType) || orderShipmentType != null) {

                if (shop != null) {

                    String msg = txtMessage.getText();

                    String resultMsg = "";

                    if (!utils.isStringInputValid(msg)) {
                        msg = "";
                    }

                    OrderList newOrderList = new OrderList();
                    newOrderList.setOrderList(orderList);

                    //newOrderList.setShop(shop);
//                    newOrderList.setUserAccount(userAccount);
                    newOrderList.setUser(user);

                    newOrderList.setRequestDate(new Date());
                    newOrderList.setMessage(msg);

                    Boolean isPickup = orderShipmentType.equalsIgnoreCase("PICKUP");

                    newOrderList.setIsPickup(isPickup);

                    Boolean isPrescriptionNeeded = false;

                    for (OrderItem item : orderList) {
                        if (item.getProduct().getIsPrescriptionNeeded()) {
                            isPrescriptionNeeded = true;
                            break;
                        }
                    }

                    if (isPrescriptionNeeded) {
                        newOrderList.setStatus("PENDING");
                        resultMsg = "Since some products in your cart need prescription, a doctor will connect with you soon!";
                    } else {
                        newOrderList.setStatus("BOOKED");
                        resultMsg = "Yaayy! Your order is placed. Sit back and enjoy.";
                    }

                    newOrderList.setRequestType("USER-ORDER");

                    ecosystem.getWorkQueue().addWorkRequest(newOrderList);

                    JOptionPane.showMessageDialog(this, resultMsg);

                    openOrderHistory();
                } else {
                    utils.showErrorToast("Something went wrong! Please try again.");
                }
            } else {
                utils.showErrorToast("Please choose shipment type");
            }
        } else {
            utils.showErrorToast("Oops! Please add atleast 1 product in your cart to proceed.");
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSlot;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> comboOrderShipmentType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblShipmentType;
    private javax.swing.JTable tblConsultaionSlot;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables

    private void backAction() {
        mainWorkArea.remove(this);

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void populateData() {

        comboOrderShipmentType.removeAllItems();

        comboOrderShipmentType.addItem("PICKUP");

        comboOrderShipmentType.addItem("DELIVERY");

        //ProductDirectory pd = shop.getProductDirectory();

        DefaultTableModel model = (DefaultTableModel) tblConsultaionSlot.getModel();

        int count = 1;
        model.setRowCount(0);

//        for (Product p : pd.getProductList()) {
//            Object[] row = new Object[6];
//
//            String prescriptionTxt = p.getIsPrescriptionNeeded() ? "Yes" : "No";
//
//            row[0] = "" + count++;
//            row[1] = p;
//            row[2] = p.getPrice();
//            row[3] = p.getIsPrescriptionNeeded();
//            row[4] = prescriptionTxt;
//            row[5] = p.getCalories();
//
//            model.addRow(row);
//        }
    }

    private void populateCartTable() {
//        DefaultTableModel model = (DefaultTableModel) tblConsultationAddedSlot.getModel();
//
//        int count = 1;
//        int qtyTotal = 0;
//        double sumTotal = 0;
//
//        model.setRowCount(0);
//
//        for (OrderItem item : orderList) {
//
//            int qty = item.getQuantity();
//            double price = item.getProduct().getPrice();
//
//            double totalPrice = price * qty;
//
//            qtyTotal += qty;
//            sumTotal += totalPrice;
//
//            Object[] row = new Object[5];
//            row[0] = "" + count++;
//            row[1] = item;
//            row[2] = price;
//            row[3] = totalPrice;
//            row[4] = qty;
//
//            model.addRow(row);
//
//        }
//
//        DecimalFormat df = new DecimalFormat("###.###");
//
//        txtTotalPrice.setText(String.valueOf(df.format(sumTotal)));
//        txtTotalQuantity.setText(String.valueOf(qtyTotal));
    }

    private void openOrderHistory() {

        ManageUserOrderHistory manageUserOrderHistory = new ManageUserOrderHistory(mainWorkArea, ecosystem, userAccount);

        mainWorkArea.add("ManageOrderHistory", manageUserOrderHistory);

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }
}
