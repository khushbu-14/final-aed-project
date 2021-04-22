/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.User.User;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class StaffWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;

    public StaffWorkAreaPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
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
        manageDirectConsultDoctorPanel = new javax.swing.JPanel();
        iconDashboard1 = new javax.swing.JLabel();
        manageDirectConsultDoctor = new javax.swing.JLabel();
        border1 = new javax.swing.JPanel();
        manageAvailabilityPanel = new javax.swing.JPanel();
        iconDashboard3 = new javax.swing.JLabel();
        manageAvailability = new javax.swing.JLabel();
        border3 = new javax.swing.JPanel();
        patientsAppointmentPanel = new javax.swing.JPanel();
        iconDashboard4 = new javax.swing.JLabel();
        patientsAppointment = new javax.swing.JLabel();
        border4 = new javax.swing.JPanel();
        patientsAppointmentPanel1 = new javax.swing.JPanel();
        iconDashboard5 = new javax.swing.JLabel();
        patientsAppointment1 = new javax.swing.JLabel();
        border5 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(244, 249, 249));
        setPreferredSize(new java.awt.Dimension(1243, 653));

        sideBar.setBackground(new java.awt.Color(3, 80, 111));

        manageDashboardPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageDashboardPanel.setToolTipText("Dashboard");
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

        manageDirectConsultDoctorPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageDirectConsultDoctorPanel.setToolTipText("Manage Consultations");
        manageDirectConsultDoctorPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageDirectConsultDoctorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageDirectConsultDoctorPanelMousePressed(evt);
            }
        });

        iconDashboard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N
        iconDashboard1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iconDashboard1KeyPressed(evt);
            }
        });

        manageDirectConsultDoctor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageDirectConsultDoctor.setForeground(new java.awt.Color(255, 255, 255));
        manageDirectConsultDoctor.setText("Consultations");
        manageDirectConsultDoctor.setToolTipText("Dashboard");
        manageDirectConsultDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageDirectConsultDoctorMousePressed(evt);
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

        javax.swing.GroupLayout manageDirectConsultDoctorPanelLayout = new javax.swing.GroupLayout(manageDirectConsultDoctorPanel);
        manageDirectConsultDoctorPanel.setLayout(manageDirectConsultDoctorPanelLayout);
        manageDirectConsultDoctorPanelLayout.setHorizontalGroup(
            manageDirectConsultDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDirectConsultDoctorPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageDirectConsultDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageDirectConsultDoctorPanelLayout.createSequentialGroup()
                        .addComponent(border1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageDirectConsultDoctorPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageDirectConsultDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        manageDirectConsultDoctorPanelLayout.setVerticalGroup(
            manageDirectConsultDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDirectConsultDoctorPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageDirectConsultDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageDirectConsultDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        manageAvailabilityPanel.setBackground(new java.awt.Color(3, 80, 111));
        manageAvailabilityPanel.setToolTipText("Manage Availability");
        manageAvailabilityPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageAvailabilityPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageAvailabilityPanelMousePressed(evt);
            }
        });

        iconDashboard3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        manageAvailability.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageAvailability.setForeground(new java.awt.Color(255, 255, 255));
        manageAvailability.setText("Manage Availability");
        manageAvailability.setToolTipText("Dashboard");
        manageAvailability.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageAvailabilityMousePressed(evt);
            }
        });

        border3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border3.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout border3Layout = new javax.swing.GroupLayout(border3);
        border3.setLayout(border3Layout);
        border3Layout.setHorizontalGroup(
            border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        border3Layout.setVerticalGroup(
            border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout manageAvailabilityPanelLayout = new javax.swing.GroupLayout(manageAvailabilityPanel);
        manageAvailabilityPanel.setLayout(manageAvailabilityPanelLayout);
        manageAvailabilityPanelLayout.setHorizontalGroup(
            manageAvailabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAvailabilityPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageAvailabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageAvailabilityPanelLayout.createSequentialGroup()
                        .addComponent(border3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageAvailabilityPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        manageAvailabilityPanelLayout.setVerticalGroup(
            manageAvailabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAvailabilityPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(manageAvailabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(border3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        patientsAppointmentPanel.setBackground(new java.awt.Color(3, 80, 111));
        patientsAppointmentPanel.setToolTipText("Manage Appointments");
        patientsAppointmentPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientsAppointmentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                patientsAppointmentPanelMousePressed(evt);
            }
        });

        iconDashboard4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        patientsAppointment.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        patientsAppointment.setForeground(new java.awt.Color(255, 255, 255));
        patientsAppointment.setText("Appointments");
        patientsAppointment.setToolTipText("Dashboard");
        patientsAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                patientsAppointmentMousePressed(evt);
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

        javax.swing.GroupLayout patientsAppointmentPanelLayout = new javax.swing.GroupLayout(patientsAppointmentPanel);
        patientsAppointmentPanel.setLayout(patientsAppointmentPanelLayout);
        patientsAppointmentPanelLayout.setHorizontalGroup(
            patientsAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsAppointmentPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(patientsAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(border4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(patientsAppointmentPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientsAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        patientsAppointmentPanelLayout.setVerticalGroup(
            patientsAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsAppointmentPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(patientsAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientsAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(border4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        patientsAppointmentPanel1.setBackground(new java.awt.Color(3, 80, 111));
        patientsAppointmentPanel1.setToolTipText("Manage Appointments");
        patientsAppointmentPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientsAppointmentPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                patientsAppointmentPanel1MousePressed(evt);
            }
        });

        iconDashboard5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N

        patientsAppointment1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        patientsAppointment1.setForeground(new java.awt.Color(255, 255, 255));
        patientsAppointment1.setText("Appointments");
        patientsAppointment1.setToolTipText("Dashboard");
        patientsAppointment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                patientsAppointment1MousePressed(evt);
            }
        });

        border5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        border5.setPreferredSize(new java.awt.Dimension(2, 1));

        javax.swing.GroupLayout border5Layout = new javax.swing.GroupLayout(border5);
        border5.setLayout(border5Layout);
        border5Layout.setHorizontalGroup(
            border5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        border5Layout.setVerticalGroup(
            border5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout patientsAppointmentPanel1Layout = new javax.swing.GroupLayout(patientsAppointmentPanel1);
        patientsAppointmentPanel1.setLayout(patientsAppointmentPanel1Layout);
        patientsAppointmentPanel1Layout.setHorizontalGroup(
            patientsAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsAppointmentPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(patientsAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientsAppointmentPanel1Layout.createSequentialGroup()
                        .addComponent(border5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(patientsAppointmentPanel1Layout.createSequentialGroup()
                        .addComponent(iconDashboard5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientsAppointment1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        patientsAppointmentPanel1Layout.setVerticalGroup(
            patientsAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsAppointmentPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(patientsAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientsAppointment1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(border5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageDirectConsultDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageAvailabilityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientsAppointmentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                        .addComponent(patientsAppointmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(manageDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageDirectConsultDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageAvailabilityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientsAppointmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientsAppointmentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(244, 249, 249));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE))
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

    private void manageDirectConsultDoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDirectConsultDoctorMousePressed
        // TODO add your handling code here:
        //manageDirectConsultations();
        manageDirectConsultations();
    }//GEN-LAST:event_manageDirectConsultDoctorMousePressed

    private void manageDirectConsultDoctorPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDirectConsultDoctorPanelMousePressed
        // TODO add your handling code here:
        manageDirectConsultations();
    }//GEN-LAST:event_manageDirectConsultDoctorPanelMousePressed

    private void manageAvailabilityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAvailabilityMousePressed
        // TODO add your handling code here:
        manageSessions();
    }//GEN-LAST:event_manageAvailabilityMousePressed

    private void manageAvailabilityPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAvailabilityPanelMousePressed
        // TODO add your handling code here:
        manageSessions();
    }//GEN-LAST:event_manageAvailabilityPanelMousePressed

    private void patientsAppointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsAppointmentMousePressed
        managePatientsAppointments();
    }//GEN-LAST:event_patientsAppointmentMousePressed

    private void patientsAppointmentPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsAppointmentPanelMousePressed
        managePatientsAppointments();
    }//GEN-LAST:event_patientsAppointmentPanelMousePressed
    private void managePersonalInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePersonalInfoMousePressed
//        try {
//            // TODO add your handling code here:
//            managePersonalInfo();
//        } catch (ParseException ex) {
//            Logger.getLogger(StaffWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_managePersonalInfoMousePressed

    private void manageProfilePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfilePanelMousePressed
//        try {
//            // TODO add your handling code here:
//            managePersonalInfo();
//        } catch (ParseException ex) {
//            Logger.getLogger(StaffWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_manageProfilePanelMousePressed

    private void iconDashboard1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iconDashboard1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iconDashboard1KeyPressed

    private void patientsAppointment1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsAppointment1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsAppointment1MousePressed

    private void patientsAppointmentPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsAppointmentPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsAppointmentPanel1MousePressed

    private void manageOrderProducts() {
        changeBtnBgs("order-products");
        OrderMedicinePanel orderMedicinePanel = new OrderMedicinePanel(mainPanel, ecosystem, userAccount, "STAFF");
        mainPanel.add("manageHospitalsJPanel", orderMedicinePanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void managePersonalInfo() throws ParseException {
        changeBtnBgs("managePersonalInfo");
        User user = ecosystem.getUserDirectory().getUserByUserName(userAccount.getUsername());
        AddMedicalProfilePanel manageInformationPanel = new AddMedicalProfilePanel(mainPanel, ecosystem, user);
        mainPanel.add("manageInformationJPanel", manageInformationPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void managePatientsAppointments() {
        changeBtnBgs("patientsappointmnets");
        ManagePatientConsultationDoctorJPanel managePatientsJPanel = new ManagePatientConsultationDoctorJPanel(mainPanel, ecosystem, userAccount);
        mainPanel.add("managePatientsAppointments", managePatientsJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    public void changeBtnBgs(String type) {
        Color activeColor = Color.WHITE;
        Color notActiveColor = Color.getColor("03506F");

        Color activeTxtColor = Color.BLACK;
        Color nonActiveTxtColor = Color.WHITE;

//        manageAppointmentsPanel.setBackground(notActiveColor);
        manageDashboardPanel.setBackground(notActiveColor);
        manageDirectConsultDoctorPanel.setBackground(notActiveColor);
        manageAvailabilityPanel.setBackground(notActiveColor);

//        manageOrderMedicinePanel.setBackground(notActiveColor);
//        manageOrdersPanel.setBackground(notActiveColor);
        patientsAppointmentPanel.setBackground(notActiveColor);

//        manageSessionsPanel.setBackground(notActiveColor);
        manageDashboard.setForeground(nonActiveTxtColor);

//        manageAppointments.setForeground(nonActiveTxtColor);
        manageDirectConsultDoctor.setForeground(nonActiveTxtColor);
        manageAvailability.setForeground(nonActiveTxtColor);

//        manageOrderMedicine.setForeground(nonActiveTxtColor);
//        manageOrders.setForeground(nonActiveTxtColor);
        patientsAppointment.setForeground(nonActiveTxtColor);

//        manageSessions.setForeground(nonActiveTxtColor);
//        if ("order-products".equalsIgnoreCase(type)) {
//            manageOrderMedicinePanel.setBackground(activeColor);
//            manageOrderMedicine.setForeground(activeTxtColor);
//        } else if ("order-history".equalsIgnoreCase(type)) {
//            manageOrdersPanel.setBackground(activeColor);
//            manageOrders.setForeground(activeTxtColor);
//        } else 
        if ("managePersonalInfo".equalsIgnoreCase(type)) {
            patientsAppointmentPanel.setBackground(activeColor);
            patientsAppointment.setForeground(activeTxtColor);
        } else if ("direct-consult".equalsIgnoreCase(type)) {
            manageDirectConsultDoctorPanel.setBackground(activeColor);
            manageDirectConsultDoctor.setForeground(activeTxtColor);
        } else if ("sessions".equalsIgnoreCase(type)) {
            manageAvailabilityPanel.setBackground(activeColor);
            manageAvailability.setForeground(activeTxtColor);
        } else if ("patientsappointmnets".equalsIgnoreCase(type)) {
            patientsAppointmentPanel.setBackground(activeColor);
            patientsAppointment.setForeground(activeTxtColor);
        } else if ("dashboard".equalsIgnoreCase(type)) {
            manageDashboardPanel.setBackground(activeColor);
            manageDashboard.setForeground(activeTxtColor);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel border;
    private javax.swing.JPanel border1;
    private javax.swing.JPanel border3;
    private javax.swing.JPanel border4;
    private javax.swing.JPanel border5;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconDashboard1;
    private javax.swing.JLabel iconDashboard3;
    private javax.swing.JLabel iconDashboard4;
    private javax.swing.JLabel iconDashboard5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel manageAvailability;
    private javax.swing.JPanel manageAvailabilityPanel;
    private javax.swing.JLabel manageDashboard;
    private javax.swing.JPanel manageDashboardPanel;
    private javax.swing.JLabel manageDirectConsultDoctor;
    private javax.swing.JPanel manageDirectConsultDoctorPanel;
    private javax.swing.JLabel patientsAppointment;
    private javax.swing.JLabel patientsAppointment1;
    private javax.swing.JPanel patientsAppointmentPanel;
    private javax.swing.JPanel patientsAppointmentPanel1;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables

    private void manageOrderHistory() {
        changeBtnBgs("order-history");

        ManageUserOrderHistory manageUserOrderHistory = new ManageUserOrderHistory(mainPanel, ecosystem, userAccount);

        // OrderMedicinePanel orderMedicinePanel = new OrderMedicinePanel(mainPanel, ecosystem, userAccount);
        mainPanel.add("ManageUserOrderHistory", manageUserOrderHistory);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void manageDirectConsultations() {
        changeBtnBgs("direct-consult");

        ManageDirectConsultationsHistory manageDirectConsultationsHistory = new ManageDirectConsultationsHistory(mainPanel, ecosystem, userAccount);

        // OrderMedicinePanel orderMedicinePanel = new OrderMedicinePanel(mainPanel, ecosystem, userAccount);
        mainPanel.add("manageDirectConsultationsHistory", manageDirectConsultationsHistory);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void manageSessions() {
        changeBtnBgs("sessions");

        ManageHospStaffSessionsPanel manageSess = new ManageHospStaffSessionsPanel(mainPanel, ecosystem, userAccount);

        // OrderMedicinePanel orderMedicinePanel = new OrderMedicinePanel(mainPanel, ecosystem, userAccount);
        mainPanel.add("manageDirectConsultationsHistory", manageSess);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void manageDashboard() {
        changeBtnBgs("dashboard");

        HospitalStaffDashboard hsd = new HospitalStaffDashboard(mainPanel, ecosystem, userAccount);

        mainPanel.add("HospitalStaffDashboard", hsd);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }
}
