/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.AmbulanceService.AmbulanceDirectory;
import Business.AmbulanceService.AmbulanceService;
import Business.AmbulanceService.Service;
import Business.AmbulanceService.ServiceDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.FitnessCenter.Department.FitnessCenterDepartment;
import Business.FitnessCenter.Department.FitnessCenterDepartmentDirectory;
import Business.FitnessCenter.FitnessCenter;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Department.HospitalDepartmentDirectory;
import Business.Hospital.Hospital;
import Business.Shop.Product;
import Business.Shop.ProductDirectory;
import Business.Shop.Shop;
import Business.Staff.FcStaff;
import Business.Staff.Staff;
import Business.User.User;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author khushbu
 */
public class ManageJTreePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageJTreePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public ManageJTreePanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        initComponents();
        populateTree();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        treePane = new javax.swing.JScrollPane();
        treePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();

        setBackground(new java.awt.Color(244, 249, 249));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("JTree");

        treePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout treePanelLayout = new javax.swing.GroupLayout(treePanel);
        treePanel.setLayout(treePanelLayout);
        treePanelLayout.setHorizontalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(treePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        treePanelLayout.setVerticalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );

        treePane.setViewportView(treePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(treePane, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(607, 607, 607))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(treePane, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

        User user;
        ArrayList<User> userList = ecosystem.getUserDirectory().getUserList();

        Hospital hospital;
        ArrayList<Hospital> hospitalList = ecosystem.getHospitalDirectory().getHospitalList();

        Shop shop;
        ArrayList<Shop> shopList = ecosystem.getShopDirectory().getShopList();

        FitnessCenter fitnessCenter;
        ArrayList<FitnessCenter> fitnessCenterList = ecosystem.getFitnessCenterDirectory().getFitnessCenterList();

        DeliveryMan deliveryMan;
        ArrayList<DeliveryMan> deliveryManList = ecosystem.getDeliveryManDirectory().getDeliveryManList();

        AmbulanceService ambulanceService;
        ArrayList<AmbulanceService> ambulanceServiceList = ecosystem.getAmbulanceDirectory().getAmbulanceList();

        DefaultMutableTreeNode systemAdmin = new DefaultMutableTreeNode("SystemAdmin");

        List<WorkRequest> workRequestList;

        HospitalDepartmentDirectory hd;
        FitnessCenterDepartmentDirectory fcd;

        ProductDirectory productDirectory;

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();

        root.insert(systemAdmin, 0);

        DefaultMutableTreeNode users = new DefaultMutableTreeNode("Users");
        systemAdmin.insert(users, 0);

        DefaultMutableTreeNode hospitals = new DefaultMutableTreeNode("Hospitals");
        systemAdmin.insert(hospitals, 1);

        DefaultMutableTreeNode shops = new DefaultMutableTreeNode("Shops");
        systemAdmin.insert(shops, 2);

        DefaultMutableTreeNode fitnessCenters = new DefaultMutableTreeNode("Fitness Centers");
        systemAdmin.insert(fitnessCenters, 3);

        DefaultMutableTreeNode deliveryMans = new DefaultMutableTreeNode("Delivery Man");
        systemAdmin.insert(deliveryMans, 4);

        DefaultMutableTreeNode ambulanceServices = new DefaultMutableTreeNode("Ambulance Service");
        systemAdmin.insert(ambulanceServices, 5);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode orderNode;
        DefaultMutableTreeNode staffNode;

        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            networkNode = new DefaultMutableTreeNode(user.getName());
            users.insert(networkNode, i);

            workRequestList = ecosystem.getWorkQueue().getUserRequestList(user, "USER-ORDER");

            int count = 0;
            for (WorkRequest req : workRequestList) {
                String txt = req.getShop().getShopName() + " - " + req.getStatus();
                orderNode = new DefaultMutableTreeNode(txt);
                networkNode.insert(orderNode, count);
                count++;
            }
        }

        for (int i = 0; i < hospitalList.size(); i++) {

            hospital = hospitalList.get(i);

            networkNode = new DefaultMutableTreeNode(hospital.getHospitalName());
            hospitals.insert(networkNode, i);

            int count = 0;

            hd = hospital.getDepartmentDirectory();

            for (HospitalDepartment dept : hd.getDepartmentList()) {
                String txt = dept.getDepartmentName();
                orderNode = new DefaultMutableTreeNode(txt);
                networkNode.insert(orderNode, count);
                count++;

                int count1 = 0;

                for (Staff s : dept.getStaffDirectory().getStaffList()) {
                    String txt1 = s.getName() + " - " + s.getDesignation();
                    staffNode = new DefaultMutableTreeNode(txt1);
                    orderNode.insert(staffNode, count1);
                    count1++;
                }
            }
        }

        for (int i = 0; i < shopList.size(); i++) {
            shop = shopList.get(i);
            networkNode = new DefaultMutableTreeNode(shop.getShopName());
            shops.insert(networkNode, i);

            int count = 0;

            productDirectory = shop.getProductDirectory();

            for (Product p : productDirectory.getProductList()) {
                String txt = p.getProductName() + " - $" + p.getPrice();
                orderNode = new DefaultMutableTreeNode(txt);
                networkNode.insert(orderNode, count);
                count++;
            }
        }

        for (int i = 0; i < fitnessCenterList.size(); i++) {
            fitnessCenter = fitnessCenterList.get(i);
            networkNode = new DefaultMutableTreeNode(fitnessCenter.getFitnessCenterName());
            fitnessCenters.insert(networkNode, i);
            int count = 0;
            fcd = fitnessCenter.getFcdepartmentDirectory();

            for (FitnessCenterDepartment dept : fcd.getDepartmentList()) {
                String txt = dept.getDepartmentName();
                orderNode = new DefaultMutableTreeNode(txt);
                networkNode.insert(orderNode, count);
                count++;

                int count1 = 0;

                for (FcStaff s : dept.getStaffDirectory().getStaffList()) {
                    String txt1 = s.getName() + " - " + s.getDesignation();
                    staffNode = new DefaultMutableTreeNode(txt1);
                    orderNode.insert(staffNode, count1);
                    count1++;
                }
            }
        }

        for (int i = 0; i < deliveryManList.size(); i++) {
            deliveryMan = deliveryManList.get(i);
            networkNode = new DefaultMutableTreeNode(deliveryMan.getName());
            deliveryMans.insert(networkNode, i);
        }

        for (int i = 0; i < ambulanceServiceList.size(); i++) {
            ambulanceService = ambulanceServiceList.get(i);
            networkNode = new DefaultMutableTreeNode(ambulanceService.getName());
            ambulanceServices.insert(networkNode, i);

            ServiceDirectory ambulanceDirectory = ambulanceService.getServiceDirectory();
            int count = 0;

            for (Service s : ambulanceDirectory.getServiceList()) {
                String txt = s.getName();
                orderNode = new DefaultMutableTreeNode(txt);
                networkNode.insert(orderNode, count);
                count++;
            }
        }

        model.reload();
    }

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane treePane;
    private javax.swing.JPanel treePanel;
    // End of variables declaration//GEN-END:variables
}
