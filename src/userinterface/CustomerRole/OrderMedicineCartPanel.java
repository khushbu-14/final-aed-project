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
public class OrderMedicineCartPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderMedicinePanel
     */
    private JPanel mainWorkArea;
    private EcoSystem ecosystem;
    private Shop shop;
    private User user;
    private Staff staff;
    String userType;

    private UserAccount userAccount;

    private ArrayList<OrderItem> orderList = new ArrayList<OrderItem>();

    Utils utils;

    DefaultTableModel model;

    public OrderMedicineCartPanel(JPanel mainPanel, EcoSystem ecosystem, Shop shop, UserAccount userAccount, String userType) {
        this.mainWorkArea = mainPanel;
        this.ecosystem = ecosystem;
        this.shop = shop;
        this.userType = userType;
        this.userAccount = userAccount;
        if (userType.equalsIgnoreCase("USER")) {
            this.user = (User) userAccount;
        }else{
            this.staff = (Staff) userAccount;
        }
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
        tblProductsList = new javax.swing.JTable();
        btnAddProduct = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        txtMessage = new javax.swing.JTextField();
        lblMsg = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        btnPlaceOrder = new javax.swing.JButton();
        txtTotalQuantity = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
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
        lblPageTitle.setText("Cart");

        tblProductsList.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblProductsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sr No.", "Name", "Price", "Prescription Needed", "Description", "Calories"
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
        tblProductsList.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(tblProductsList);

        btnAddProduct.setBackground(new java.awt.Color(138, 177, 138));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        btnAddProduct.setText("Add Product");
        btnAddProduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnAddProduct.setBorderPainted(false);
        btnAddProduct.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        tblCart.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sr No.", "Name", "Unit Price", "Total Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        txtMessage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblMsg.setBackground(new java.awt.Color(249, 244, 244));
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMsg.setText("Delivery Instructions / Message :");

        lblPrice.setBackground(new java.awt.Color(249, 244, 244));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrice.setText("Total Price");

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTotalPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        btnPlaceOrder.setBackground(new java.awt.Color(138, 177, 138));
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnPlaceOrder.setBorderPainted(false);
        btnPlaceOrder.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        txtTotalQuantity.setEditable(false);
        txtTotalQuantity.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTotalQuantity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblQty.setBackground(new java.awt.Color(249, 244, 244));
        lblQty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQty.setText("Total Quantity");

        comboOrderShipmentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        lblShipmentType.setBackground(new java.awt.Color(249, 244, 244));
        lblShipmentType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShipmentType.setText("Select order shipment type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblShipmentType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboOrderShipmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblShipmentType)
                        .addGap(12, 12, 12)
                        .addComponent(comboOrderShipmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(lblQty)
                    .addComponent(lblMsg))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtTotalPrice)
                    .addComponent(txtMessage)
                    .addComponent(txtTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Product getSelectedProduct() {
        int selectedRowIndex = tblProductsList.getSelectedRow();

        if (selectedRowIndex < 0) {
            utils.showErrorToast("Oops! Please select a product first.");
            return null;
        }

        Product p = (Product) tblProductsList.getValueAt(selectedRowIndex, 1);

        return p;
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        Product p = getSelectedProduct();
        int qty = 0;

        if (p != null) {

            String response = JOptionPane.showInputDialog("Please provide quantity for " + p.getProductName());

            try {
                qty = Integer.parseInt(response);
            } catch (NumberFormatException e) {
                utils.showErrorToast("Oops! Please provide valid quantity in numbers only");
            }

            if (qty > 0) {
                OrderItem oi = new OrderItem(p, qty);

                orderList.add(oi);

                populateCartTable();
            } else {
                utils.showErrorToast("Only positive numbers allowed");
            }
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

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

                    newOrderList.setShop(shop);
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
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> comboOrderShipmentType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblShipmentType;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProductsList;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtTotalQuantity;
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

        ProductDirectory pd = shop.getProductDirectory();

        DefaultTableModel model = (DefaultTableModel) tblProductsList.getModel();

        int count = 1;
        model.setRowCount(0);

        for (Product p : pd.getProductList()) {
            Object[] row = new Object[6];

            String prescriptionTxt = p.getIsPrescriptionNeeded() ? "Yes" : "No";

            row[0] = "" + count++;
            row[1] = p;
            row[2] = p.getPrice();
            row[3] = p.getIsPrescriptionNeeded();
            row[4] = prescriptionTxt;
            row[5] = p.getCalories();

            model.addRow(row);
        }
    }

    private void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();

        int count = 1;
        int qtyTotal = 0;
        double sumTotal = 0;

        model.setRowCount(0);

        for (OrderItem item : orderList) {

            int qty = item.getQuantity();
            double price = item.getProduct().getPrice();

            double totalPrice = price * qty;

            qtyTotal += qty;
            sumTotal += totalPrice;

            Object[] row = new Object[5];
            row[0] = "" + count++;
            row[1] = item;
            row[2] = price;
            row[3] = totalPrice;
            row[4] = qty;

            model.addRow(row);

        }

        DecimalFormat df = new DecimalFormat("###.###");

        txtTotalPrice.setText(String.valueOf(df.format(sumTotal)));
        txtTotalQuantity.setText(String.valueOf(qtyTotal));
    }

    private void openOrderHistory() {

        ManageUserOrderHistory manageUserOrderHistory = new ManageUserOrderHistory(mainWorkArea, ecosystem, userAccount);

        mainWorkArea.add("ManageOrderHistory", manageUserOrderHistory);

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }
}
