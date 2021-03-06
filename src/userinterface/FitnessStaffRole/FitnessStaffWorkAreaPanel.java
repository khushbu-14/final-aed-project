/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessStaffRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class FitnessStaffWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;

    public FitnessStaffWorkAreaPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
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
        manageSessionsPanel = new javax.swing.JPanel();
        iconDashboard7 = new javax.swing.JLabel();
        manageSessions = new javax.swing.JLabel();
        border7 = new javax.swing.JPanel();
        manageSessionsRegPanel = new javax.swing.JPanel();
        iconDashboard8 = new javax.swing.JLabel();
        manageSessionsReg = new javax.swing.JLabel();
        border8 = new javax.swing.JPanel();
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

        manageSessionsPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageSessionsPanel.setToolTipText("Session / Events");
        manageSessionsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageSessionsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSessionsPanelMousePressed(evt);
            }
        });

        iconDashboard7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/students-teacher-and-blackboard.png"))); // NOI18N

        manageSessions.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageSessions.setForeground(new java.awt.Color(255, 255, 255));
        manageSessions.setText("Session / Events");
        manageSessions.setToolTipText("Session / Events");
        manageSessions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSessionsMousePressed(evt);
            }
        });

        border7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border7.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout border7Layout = new javax.swing.GroupLayout(border7);
        border7.setLayout(border7Layout);
        border7Layout.setHorizontalGroup(
            border7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        border7Layout.setVerticalGroup(
            border7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout manageSessionsPanelLayout = new javax.swing.GroupLayout(manageSessionsPanel);
        manageSessionsPanel.setLayout(manageSessionsPanelLayout);
        manageSessionsPanelLayout.setHorizontalGroup(
            manageSessionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSessionsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageSessionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageSessionsPanelLayout.createSequentialGroup()
                        .addComponent(border7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageSessionsPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageSessions, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        manageSessionsPanelLayout.setVerticalGroup(
            manageSessionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSessionsPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageSessionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageSessions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard7, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(border7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        manageSessionsRegPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageSessionsRegPanel.setToolTipText("Session Registrations");
        manageSessionsRegPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageSessionsRegPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSessionsRegPanelMousePressed(evt);
            }
        });

        iconDashboard8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/profile.png"))); // NOI18N

        manageSessionsReg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageSessionsReg.setForeground(new java.awt.Color(255, 255, 255));
        manageSessionsReg.setText("Session Registrations");
        manageSessionsReg.setToolTipText("Session Registrations");
        manageSessionsReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSessionsRegMousePressed(evt);
            }
        });

        border8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border8.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout border8Layout = new javax.swing.GroupLayout(border8);
        border8.setLayout(border8Layout);
        border8Layout.setHorizontalGroup(
            border8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        border8Layout.setVerticalGroup(
            border8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout manageSessionsRegPanelLayout = new javax.swing.GroupLayout(manageSessionsRegPanel);
        manageSessionsRegPanel.setLayout(manageSessionsRegPanelLayout);
        manageSessionsRegPanelLayout.setHorizontalGroup(
            manageSessionsRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSessionsRegPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageSessionsRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageSessionsRegPanelLayout.createSequentialGroup()
                        .addComponent(border8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageSessionsRegPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard8, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageSessionsReg, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        manageSessionsRegPanelLayout.setVerticalGroup(
            manageSessionsRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSessionsRegPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageSessionsRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageSessionsReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard8, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(border8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageSessionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageSessionsRegPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(manageDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageSessionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageSessionsRegPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
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

    private void manageSessionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSessionsMousePressed
        // TODO add your handling code here:
        manageSessions();
    }//GEN-LAST:event_manageSessionsMousePressed

    private void manageSessionsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSessionsPanelMousePressed
        // TODO add your handling code here:
        manageSessions();
    }//GEN-LAST:event_manageSessionsPanelMousePressed

    private void manageSessionsRegMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSessionsRegMousePressed
        // TODO add your handling code here:
        manageRequests();
    }//GEN-LAST:event_manageSessionsRegMousePressed

    private void manageSessionsRegPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSessionsRegPanelMousePressed
        // TODO add your handling code here:
        manageRequests();
    }//GEN-LAST:event_manageSessionsRegPanelMousePressed

//    private void manageDepartments() {
//        changeBtnBgs("manageDepartments");
//        ManageFcDepartmentPanel manageDepartmentPanel = new ManageFcDepartmentPanel(mainPanel, ecosystem, userAccount);
//        mainPanel.add("manageDepartmentPanel", manageDepartmentPanel);
//        CardLayout layout = (CardLayout) mainPanel.getLayout();
//        layout.next(mainPanel);
//    }
    private void manageSessions() {
        changeBtnBgs("sessions");
        ManageSessionsPanel manageStaffPanel = new ManageSessionsPanel(mainPanel, ecosystem, userAccount);
        mainPanel.add("manageStaffPanel", manageStaffPanel);
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
//        manageAddDepartmentPanel.setBackground(notActiveColor);
//        manageOrderFitnessPanel.setBackground(notActiveColor);
//        manageAddStaffPanel.setBackground(notActiveColor);
        manageSessionsRegPanel.setBackground(notActiveColor);
        manageSessionsPanel.setBackground(notActiveColor);

        manageDashboard.setForeground(nonActiveTxtColor);
        manageSessionsReg.setForeground(nonActiveTxtColor);
//        manageDepartments.setForeground(nonActiveTxtColor);
//        manageOrderFitness.setForeground(nonActiveTxtColor);
//        manageStaffs.setForeground(nonActiveTxtColor);
//        manageOrders.setForeground(nonActiveTxtColor);
//        managePersonalInfo.setForeground(nonActiveTxtColor);
        manageSessions.setForeground(nonActiveTxtColor);

//        if ("manageDepartments".equalsIgnoreCase(type)) {
//            manageAddDepartmentPanel.setBackground(activeColor);
//            manageDepartments.setForeground(activeTxtColor);
//        } else 
        if ("sessions".equalsIgnoreCase(type)) {
            manageSessionsPanel.setBackground(activeColor);
            manageSessions.setForeground(activeTxtColor);
        } else if ("dashboard".equalsIgnoreCase(type)) {
            manageDashboardPanel.setBackground(activeColor);
            manageDashboard.setForeground(activeTxtColor);
        } else if ("reg".equalsIgnoreCase(type)) {
            manageSessionsRegPanel.setBackground(activeColor);
            manageSessionsReg.setForeground(activeTxtColor);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel border;
    private javax.swing.JPanel border7;
    private javax.swing.JPanel border8;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconDashboard7;
    private javax.swing.JLabel iconDashboard8;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel manageDashboard;
    private javax.swing.JPanel manageDashboardPanel;
    private javax.swing.JLabel manageSessions;
    private javax.swing.JPanel manageSessionsPanel;
    private javax.swing.JLabel manageSessionsReg;
    private javax.swing.JPanel manageSessionsRegPanel;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables

    private void manageDashboard() {
        changeBtnBgs("dashboard");
        FitnessStaffDashboard fitnessStaffDashboard = new FitnessStaffDashboard(mainPanel, ecosystem, userAccount);
        mainPanel.add("fitnessStaffDashboard", fitnessStaffDashboard);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void manageRequests() {
        changeBtnBgs("reg");
        ManageUserFitRegRequestPanel mur = new ManageUserFitRegRequestPanel(mainPanel, ecosystem, userAccount);
        mainPanel.add("ManageUserReuestPanel", mur);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }
}
