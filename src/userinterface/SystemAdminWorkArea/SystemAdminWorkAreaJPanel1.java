/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author khushbu
 */
public class SystemAdminWorkAreaJPanel1 extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public SystemAdminWorkAreaJPanel1(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        manageHospital();
    }

    public void populateTree() {
        // Add the code for draw your system structure shown by JTree
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        manageDashboardPanel = new javax.swing.JPanel();
        iconDashboard = new javax.swing.JLabel();
        manageDashboard = new javax.swing.JLabel();
        manageHospitalPanel = new javax.swing.JPanel();
        iconHospital = new javax.swing.JLabel();
        manageHospital = new javax.swing.JLabel();
        manageShopPanel = new javax.swing.JPanel();
        iconShop = new javax.swing.JLabel();
        manageShop = new javax.swing.JLabel();
        manageFitnessPanel = new javax.swing.JPanel();
        iconFitness = new javax.swing.JLabel();
        manageFitness = new javax.swing.JLabel();
        manageUsersPanel = new javax.swing.JPanel();
        iconUsers = new javax.swing.JLabel();
        manageUsers = new javax.swing.JLabel();
        manageTypePanel = new javax.swing.JPanel();
        iconType = new javax.swing.JLabel();
        manageType = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        adminPanel.setBackground(new java.awt.Color(244, 249, 249));

        navbar.setBackground(new java.awt.Color(3, 80, 111));

        manageDashboardPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageDashboardPanel.setToolTipText("Manage Hospital");
        manageDashboardPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageDashboardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageDashboardPanelMousePressed(evt);
            }
        });

        iconDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        manageDashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageDashboard.setForeground(new java.awt.Color(255, 255, 255));
        manageDashboard.setText("Dashboard");
        manageDashboard.setToolTipText("Dashboard");
        manageDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageDashboardMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageDashboardPanelLayout = new javax.swing.GroupLayout(manageDashboardPanel);
        manageDashboardPanel.setLayout(manageDashboardPanelLayout);
        manageDashboardPanelLayout.setHorizontalGroup(
            manageDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        manageDashboardPanelLayout.setVerticalGroup(
            manageDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDashboardPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(manageDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        manageHospitalPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageHospitalPanel.setToolTipText("Manage Hospital");
        manageHospitalPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageHospitalPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHospitalPanelMousePressed(evt);
            }
        });

        iconHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        manageHospital.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageHospital.setForeground(new java.awt.Color(255, 255, 255));
        manageHospital.setText("Hospital");
        manageHospital.setToolTipText("Hospital");
        manageHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHospitalMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageHospitalPanelLayout = new javax.swing.GroupLayout(manageHospitalPanel);
        manageHospitalPanel.setLayout(manageHospitalPanelLayout);
        manageHospitalPanelLayout.setHorizontalGroup(
            manageHospitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageHospitalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        manageHospitalPanelLayout.setVerticalGroup(
            manageHospitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageHospitalPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageHospitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconHospital, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(manageHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        manageShopPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageShopPanel.setToolTipText("Manage Hospital");
        manageShopPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageShopPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageShopPanelMousePressed(evt);
            }
        });

        iconShop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        manageShop.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageShop.setForeground(new java.awt.Color(255, 255, 255));
        manageShop.setText("Shop");
        manageShop.setToolTipText("Shop");
        manageShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageShopMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageShopPanelLayout = new javax.swing.GroupLayout(manageShopPanel);
        manageShopPanel.setLayout(manageShopPanelLayout);
        manageShopPanelLayout.setHorizontalGroup(
            manageShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageShopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconShop, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageShop, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        manageShopPanelLayout.setVerticalGroup(
            manageShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageShopPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconShop, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(manageShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        manageFitnessPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageFitnessPanel.setToolTipText("Manage Fitness");
        manageFitnessPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageFitnessPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageFitnessPanelMousePressed(evt);
            }
        });

        iconFitness.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconFitness.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        manageFitness.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageFitness.setForeground(new java.awt.Color(255, 255, 255));
        manageFitness.setText("Fitness");
        manageFitness.setToolTipText("Fitness");
        manageFitness.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageFitnessMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageFitnessPanelLayout = new javax.swing.GroupLayout(manageFitnessPanel);
        manageFitnessPanel.setLayout(manageFitnessPanelLayout);
        manageFitnessPanelLayout.setHorizontalGroup(
            manageFitnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageFitnessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        manageFitnessPanelLayout.setVerticalGroup(
            manageFitnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageFitnessPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageFitnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconFitness, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(manageFitness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        manageUsersPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageUsersPanel.setToolTipText("Manage Users");
        manageUsersPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUsersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUsersPanelMousePressed(evt);
            }
        });

        iconUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        manageUsers.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageUsers.setForeground(new java.awt.Color(255, 255, 255));
        manageUsers.setText("Users");
        manageUsers.setToolTipText("Users");
        manageUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUsersMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageUsersPanelLayout = new javax.swing.GroupLayout(manageUsersPanel);
        manageUsersPanel.setLayout(manageUsersPanelLayout);
        manageUsersPanelLayout.setHorizontalGroup(
            manageUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUsersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        manageUsersPanelLayout.setVerticalGroup(
            manageUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUsersPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(manageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        manageTypePanel.setBackground(new java.awt.Color(3, 80, 111));
        manageTypePanel.setToolTipText("Manage Users");
        manageTypePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageTypePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageTypePanelMousePressed(evt);
            }
        });

        iconType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        manageType.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageType.setForeground(new java.awt.Color(255, 255, 255));
        manageType.setText("Type");
        manageType.setToolTipText("Users");
        manageType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageTypeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageTypePanelLayout = new javax.swing.GroupLayout(manageTypePanel);
        manageTypePanel.setLayout(manageTypePanelLayout);
        manageTypePanelLayout.setHorizontalGroup(
            manageTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageType, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        manageTypePanelLayout.setVerticalGroup(
            manageTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTypePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconType, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(manageType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(manageDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(manageHospitalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageShopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageFitnessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageUsersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageUsersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageFitnessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(manageDashboardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manageShopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manageHospitalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        mainPanel.setBackground(new java.awt.Color(244, 249, 249));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );

        add(adminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDashboardMousePressed

    }//GEN-LAST:event_manageDashboardMousePressed

    private void manageDashboardPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDashboardPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageDashboardPanelMousePressed

    private void manageHospitalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHospitalMousePressed
        // TODO add your handling code here:
        manageHospital();
    }//GEN-LAST:event_manageHospitalMousePressed

    private void manageHospitalPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHospitalPanelMousePressed
        // TODO add your handling code here:
        manageHospital();
    }//GEN-LAST:event_manageHospitalPanelMousePressed

    private void manageShopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageShopMousePressed
        // TODO add your handling code here:
        manageShop();
    }//GEN-LAST:event_manageShopMousePressed

    private void manageShopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageShopPanelMousePressed
        // TODO add your handling code here:
        manageShop();
    }//GEN-LAST:event_manageShopPanelMousePressed

    private void manageFitnessMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFitnessMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageFitnessMousePressed

    private void manageFitnessPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFitnessPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageFitnessPanelMousePressed

    private void manageUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUsersMousePressed
        // TODO add your handling code here:
        manageUser();
    }//GEN-LAST:event_manageUsersMousePressed

    private void manageUsersPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUsersPanelMousePressed
        // TODO add your handling code here:
        manageUser();
    }//GEN-LAST:event_manageUsersPanelMousePressed

    private void manageTypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageTypeMousePressed
        // TODO add your handling code here:
        manageType();
    }//GEN-LAST:event_manageTypeMousePressed

    private void manageTypePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageTypePanelMousePressed
        // TODO add your handling code here:
        manageType();
    }//GEN-LAST:event_manageTypePanelMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconFitness;
    private javax.swing.JLabel iconHospital;
    private javax.swing.JLabel iconShop;
    private javax.swing.JLabel iconType;
    private javax.swing.JLabel iconUsers;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel manageDashboard;
    private javax.swing.JPanel manageDashboardPanel;
    private javax.swing.JLabel manageFitness;
    private javax.swing.JPanel manageFitnessPanel;
    private javax.swing.JLabel manageHospital;
    private javax.swing.JPanel manageHospitalPanel;
    private javax.swing.JLabel manageShop;
    private javax.swing.JPanel manageShopPanel;
    private javax.swing.JLabel manageType;
    private javax.swing.JPanel manageTypePanel;
    private javax.swing.JLabel manageUsers;
    private javax.swing.JPanel manageUsersPanel;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables

    private void manageUser() {
        changeBtnBgs("user");
        ManageUserPanel manageUserPanel = new ManageUserPanel(mainPanel, ecosystem);
        mainPanel.add("ManageUserPanel", manageUserPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void manageHospital() {
        changeBtnBgs("hospital");
        ManageHospitalsPanel manageHospitals = new ManageHospitalsPanel(mainPanel, ecosystem);
        mainPanel.add("manageHospitalsJPanel", manageHospitals);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }
    private void manageType(){
        changeBtnBgs("type");
        ManageTypePanel manageTypes = new ManageTypePanel(mainPanel, ecosystem);
        mainPanel.add("manageTypessJPanel", manageTypes);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }
     private void manageShop(){
        changeBtnBgs("shop");
        ManageShopsPanel manageShops = new ManageShopsPanel(mainPanel, ecosystem);
        mainPanel.add("manageShopsJPanel", manageShops);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }
      private void managedeliveryMan(){
        changeBtnBgs("deliveryman");
        ManageDeliveryManPanel manageDeliveryMan = new ManageDeliveryManPanel(mainPanel, ecosystem);
        mainPanel.add("manageShopsJPanel", manageDeliveryMan);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void changeBtnBgs(String type) {
        Color activeColor = Color.WHITE;
        Color notActiveColor = Color.getColor("03506F");

        Color activeTxtColor = Color.BLACK;
        Color nonActiveTxtColor = Color.WHITE;

        manageFitnessPanel.setBackground(notActiveColor);
        manageDashboardPanel.setBackground(notActiveColor);
        manageShopPanel.setBackground(notActiveColor);
        manageUsersPanel.setBackground(notActiveColor);
        manageHospitalPanel.setBackground(notActiveColor);

        manageDashboard.setForeground(nonActiveTxtColor);
        manageHospital.setForeground(nonActiveTxtColor);
        manageFitness.setForeground(nonActiveTxtColor);
        manageShop.setForeground(nonActiveTxtColor);
        manageUsers.setForeground(nonActiveTxtColor);

        if ("dashboard".equalsIgnoreCase(type)) {
            manageDashboardPanel.setBackground(activeColor);
            manageDashboard.setForeground(activeTxtColor);
        } else if ("hospital".equalsIgnoreCase(type)) {
            manageHospitalPanel.setBackground(activeColor);
            manageHospital.setForeground(activeTxtColor);
        } else if ("shop".equalsIgnoreCase(type)) {
            manageShopPanel.setBackground(activeColor);
            manageShop.setForeground(activeTxtColor);
        } else if ("user".equalsIgnoreCase(type)) {
            manageUsersPanel.setBackground(activeColor);
            manageUsers.setForeground(activeTxtColor);
        } else if ("fitness".equalsIgnoreCase(type)) {
            manageFitnessPanel.setBackground(activeColor);
            manageFitness.setForeground(activeTxtColor);
        }else if ("type".equalsIgnoreCase(type)) {
            manageTypePanel.setBackground(activeColor);
            manageType.setForeground(activeTxtColor);
        } else if ("deliveryman".equalsIgnoreCase(type)) {
            manageTypePanel.setBackground(activeColor);
            manageType.setForeground(activeTxtColor);
        }
    }
}
