/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ShopsRole;

import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.Shop.Shop;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class ShopWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;

    public ShopWorkAreaPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        initComponents();
        manageDashboard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBar = new javax.swing.JPanel();
        manageDashboardPanel = new javax.swing.JPanel();
        iconDashboard = new javax.swing.JLabel();
        manageDashboard = new javax.swing.JLabel();
        border = new javax.swing.JPanel();
        manageProductPanel = new javax.swing.JPanel();
        iconProducts = new javax.swing.JLabel();
        manageProducts = new javax.swing.JLabel();
        border1 = new javax.swing.JPanel();
        managePersonalInfoPanel = new javax.swing.JPanel();
        iconDashboard4 = new javax.swing.JLabel();
        managePersonalInfo = new javax.swing.JLabel();
        border4 = new javax.swing.JPanel();
        manageOrdersPanel = new javax.swing.JPanel();
        iconDashboard6 = new javax.swing.JLabel();
        manageOrders = new javax.swing.JLabel();
        border6 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(244, 249, 249));
        setPreferredSize(new java.awt.Dimension(1243, 653));

        sideBar.setBackground(new java.awt.Color(3, 80, 111));

        manageDashboardPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageDashboardPanel.setToolTipText("Manage Hospital");
        manageDashboardPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageDashboardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageDashboardPanelMousePressed(evt);
            }
        });

        iconDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/dashboard.png"))); // NOI18N
        iconDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconDashboardMousePressed(evt);
            }
        });

        manageDashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageDashboard.setForeground(new java.awt.Color(255, 255, 255));
        manageDashboard.setText("Dashboard");
        manageDashboard.setToolTipText("Dashboard");
        manageDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageDashboardMousePressed(evt);
            }
        });

        border.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout manageDashboardPanelLayout = new javax.swing.GroupLayout(manageDashboardPanel);
        manageDashboardPanel.setLayout(manageDashboardPanelLayout);
        manageDashboardPanelLayout.setHorizontalGroup(
            manageDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDashboardPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageDashboardPanelLayout.createSequentialGroup()
                        .addComponent(border, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageDashboardPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        manageDashboardPanelLayout.setVerticalGroup(
            manageDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDashboardPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        manageProductPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageProductPanel.setToolTipText("Manage Hospital");
        manageProductPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageProductPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProductPanelMousePressed(evt);
            }
        });

        iconProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/pills.png"))); // NOI18N

        manageProducts.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageProducts.setForeground(new java.awt.Color(255, 255, 255));
        manageProducts.setText("Manage Products");
        manageProducts.setToolTipText("Dashboard");
        manageProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProductsMousePressed(evt);
            }
        });

        border1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border1.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout border1Layout = new javax.swing.GroupLayout(border1);
        border1.setLayout(border1Layout);
        border1Layout.setHorizontalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        border1Layout.setVerticalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout manageProductPanelLayout = new javax.swing.GroupLayout(manageProductPanel);
        manageProductPanel.setLayout(manageProductPanelLayout);
        manageProductPanelLayout.setHorizontalGroup(
            manageProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProductPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageProductPanelLayout.createSequentialGroup()
                        .addComponent(border1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageProductPanelLayout.createSequentialGroup()
                        .addComponent(iconProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        manageProductPanelLayout.setVerticalGroup(
            manageProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProductPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        managePersonalInfoPanel.setBackground(new java.awt.Color(3, 80, 111));
        managePersonalInfoPanel.setToolTipText("Manage Hospital");
        managePersonalInfoPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managePersonalInfoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managePersonalInfoPanelMousePressed(evt);
            }
        });

        iconDashboard4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/profile.png"))); // NOI18N

        managePersonalInfo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        managePersonalInfo.setForeground(new java.awt.Color(255, 255, 255));
        managePersonalInfo.setText("Information");
        managePersonalInfo.setToolTipText("Dashboard");
        managePersonalInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managePersonalInfoMousePressed(evt);
            }
        });

        border4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border4.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout border4Layout = new javax.swing.GroupLayout(border4);
        border4.setLayout(border4Layout);
        border4Layout.setHorizontalGroup(
            border4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        border4Layout.setVerticalGroup(
            border4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout managePersonalInfoPanelLayout = new javax.swing.GroupLayout(managePersonalInfoPanel);
        managePersonalInfoPanel.setLayout(managePersonalInfoPanelLayout);
        managePersonalInfoPanelLayout.setHorizontalGroup(
            managePersonalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePersonalInfoPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(managePersonalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managePersonalInfoPanelLayout.createSequentialGroup()
                        .addComponent(border4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(managePersonalInfoPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(managePersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        managePersonalInfoPanelLayout.setVerticalGroup(
            managePersonalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePersonalInfoPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(managePersonalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(managePersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(border4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        manageOrdersPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageOrdersPanel.setToolTipText("Manage Hospital");
        manageOrdersPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrdersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersPanelMousePressed(evt);
            }
        });

        iconDashboard6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/box.png"))); // NOI18N

        manageOrders.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageOrders.setForeground(new java.awt.Color(255, 255, 255));
        manageOrders.setText("Order History");
        manageOrders.setToolTipText("Dashboard");
        manageOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersMousePressed(evt);
            }
        });

        border6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border6.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout border6Layout = new javax.swing.GroupLayout(border6);
        border6.setLayout(border6Layout);
        border6Layout.setHorizontalGroup(
            border6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        border6Layout.setVerticalGroup(
            border6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout manageOrdersPanelLayout = new javax.swing.GroupLayout(manageOrdersPanel);
        manageOrdersPanel.setLayout(manageOrdersPanelLayout);
        manageOrdersPanelLayout.setHorizontalGroup(
            manageOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersPanelLayout.createSequentialGroup()
                        .addComponent(border6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageOrdersPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        manageOrdersPanelLayout.setVerticalGroup(
            manageOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(border6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageProductPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managePersonalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageOrdersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(manageDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageProductPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(managePersonalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageOrdersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(244, 249, 249));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDashboardMousePressed

        manageDashboard();
    }//GEN-LAST:event_manageDashboardMousePressed

    private void manageDashboardPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDashboardPanelMousePressed
        // TODO add your handling code here:
        manageDashboard();
    }//GEN-LAST:event_manageDashboardPanelMousePressed

    private void manageProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProductsMousePressed
        // TODO add your handling code here:
        manageProducts();
    }//GEN-LAST:event_manageProductsMousePressed

    private void manageProductPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProductPanelMousePressed
        // TODO add your handling code here:
        manageProducts();
    }//GEN-LAST:event_manageProductPanelMousePressed

    private void managePersonalInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePersonalInfoMousePressed
        // TODO add your handling code here:
        managePersonalInfo();
    }//GEN-LAST:event_managePersonalInfoMousePressed

    private void managePersonalInfoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePersonalInfoPanelMousePressed
        // TODO add your handling code here:
        managePersonalInfo();
    }//GEN-LAST:event_managePersonalInfoPanelMousePressed

    private void manageOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersMousePressed
        // TODO add your handling code here:
        manageOrderHistory();
    }//GEN-LAST:event_manageOrdersMousePressed

    private void manageOrdersPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersPanelMousePressed
        // TODO add your handling code here:
        manageOrderHistory();
    }//GEN-LAST:event_manageOrdersPanelMousePressed

    private void iconDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDashboardMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iconDashboardMousePressed

    private void manageProducts() {
        changeBtnBgs("manage-products");

        ManageProductPanel prodcutPanel = new ManageProductPanel(mainPanel, ecosystem, userAccount);

        mainPanel.add("manageProductsJPanel", prodcutPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void manageOrderHistory() {
        changeBtnBgs("order-history");

        ManageShopOrderHistory manageShopOrderHistory = new ManageShopOrderHistory(mainPanel, ecosystem, userAccount);

        mainPanel.add("manageShopOrderHistory", manageShopOrderHistory);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void changeBtnBgs(String type) {
        Color activeColor = Color.WHITE;
        Color notActiveColor = Color.getColor("03506F");

        Color activeTxtColor = Color.BLACK;
        Color nonActiveTxtColor = Color.WHITE;

//        manageAppointmentsPanel.setBackground(notActiveColor);
        manageDashboardPanel.setBackground(notActiveColor);
        manageProductPanel.setBackground(notActiveColor);
//        manageOrderFitnessPanel.setBackground(notActiveColor);
//        manageOrderMedicinePanel.setBackground(notActiveColor);
        managePersonalInfoPanel.setBackground(notActiveColor);
//        manageSessionsPanel.setBackground(notActiveColor);
        manageOrdersPanel.setBackground(notActiveColor);

        manageDashboard.setForeground(nonActiveTxtColor);
//        manageAppointments.setForeground(nonActiveTxtColor);
        manageProducts.setForeground(nonActiveTxtColor);
//        manageOrderFitness.setForeground(nonActiveTxtColor);
//        manageOrderMedicine.setForeground(nonActiveTxtColor);
        manageOrders.setForeground(nonActiveTxtColor);
        managePersonalInfo.setForeground(nonActiveTxtColor);
//        manageSessions.setForeground(nonActiveTxtColor);

        if ("manage-products".equalsIgnoreCase(type)) {
            manageProductPanel.setBackground(activeColor);
            manageProducts.setForeground(activeTxtColor);
        } else if ("order-history".equalsIgnoreCase(type)) {
            manageOrdersPanel.setBackground(activeColor);
            manageOrders.setForeground(activeTxtColor);
        } else if ("dashboard".equalsIgnoreCase(type)) {
            manageDashboardPanel.setBackground(activeColor);
            manageDashboard.setForeground(activeTxtColor);
        } else if ("personal".equalsIgnoreCase(type)) {
            managePersonalInfoPanel.setBackground(activeColor);
            managePersonalInfo.setForeground(activeTxtColor);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel border;
    private javax.swing.JPanel border1;
    private javax.swing.JPanel border4;
    private javax.swing.JPanel border6;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconDashboard4;
    private javax.swing.JLabel iconDashboard6;
    private javax.swing.JLabel iconProducts;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel manageDashboard;
    private javax.swing.JPanel manageDashboardPanel;
    private javax.swing.JLabel manageOrders;
    private javax.swing.JPanel manageOrdersPanel;
    private javax.swing.JLabel managePersonalInfo;
    private javax.swing.JPanel managePersonalInfoPanel;
    private javax.swing.JPanel manageProductPanel;
    private javax.swing.JLabel manageProducts;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables

    private void manageDashboard() {
        changeBtnBgs("dashboard");

//        Shop shop = (Shop) userAccount;
        ShopDashboard shopDashboard = new ShopDashboard(mainPanel, ecosystem, userAccount);

        // ManageProductPanel prodcutPanel = new ManageProductPanel(mainPanel, ecosystem, userAccount);
        mainPanel.add("shopDashboard", shopDashboard);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void managePersonalInfo() {
        changeBtnBgs("personal");
        Shop shop = (Shop) userAccount;
        ShopInformationPanel shopInformationPanel = new ShopInformationPanel(mainPanel, ecosystem, shop, true);
        
        mainPanel.add("shopInformationPanel", shopInformationPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

}
