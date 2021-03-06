/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Department.HospitalDepartmentDirectory;
import Business.Hospital.Hospital;
import Business.Shop.Shop;
import Business.Shop.ShopDirectory;
import Business.Staff.Staff;
import Business.Type.Type;
import Business.UserAccount.UserAccount;
import constants.Utils;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class BookConsultaionPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderMedicinePanel
     */
    private JPanel mainWorkArea;
    private EcoSystem ecosystem;
    UserAccount userAccount;

    Utils utils;

    public BookConsultaionPanel(JPanel mainPanel, EcoSystem ecosystem, UserAccount userAccount) {
        this.mainWorkArea = mainPanel;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
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

        lblPageTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listHospitalDepartment = new javax.swing.JTable();
        lblPageTitle1 = new javax.swing.JLabel();
        lblPageTitle2 = new javax.swing.JLabel();
        comboBoxHospitalDepartment = new javax.swing.JComboBox<>();
        btnSelectShopType = new javax.swing.JButton();
        btnSelectShop = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 249, 249));

        lblPageTitle.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/profile.png"))); // NOI18N
        lblPageTitle.setText("Book Consultation");

        listHospitalDepartment.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        listHospitalDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr No.", "Doctor Name", "Designation", "Zipcode"
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
        listHospitalDepartment.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane2.setViewportView(listHospitalDepartment);

        lblPageTitle1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPageTitle1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPageTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/stethoscope.png"))); // NOI18N
        lblPageTitle1.setText("Choose Doctor");

        lblPageTitle2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPageTitle2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPageTitle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/small/hospital.png"))); // NOI18N
        lblPageTitle2.setText("Choose Department");

        comboBoxHospitalDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboBoxHospitalDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHospitalDepartmentActionPerformed(evt);
            }
        });

        btnSelectShopType.setBackground(new java.awt.Color(3, 80, 111));
        btnSelectShopType.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectShopType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnSelectShopType.setText("Continue");
        btnSelectShopType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnSelectShopType.setBorderPainted(false);
        btnSelectShopType.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSelectShopType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectShopTypeActionPerformed(evt);
            }
        });

        btnSelectShop.setBackground(new java.awt.Color(3, 80, 111));
        btnSelectShop.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnSelectShop.setText("Confirm");
        btnSelectShop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnSelectShop.setBorderPainted(false);
        btnSelectShop.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSelectShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectShopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPageTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxHospitalDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPageTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(btnSelectShopType, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(btnSelectShop, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPageTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxHospitalDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSelectShopType, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(lblPageTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(448, Short.MAX_VALUE)
                    .addComponent(btnSelectShop, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(255, 255, 255)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Staff getSelectedStaff() {
        int selectedRowIndex = listHospitalDepartment.getSelectedRow();

        if (selectedRowIndex < 0) {
            utils.showErrorToast("Oops! Please select a Staff first.");
            return null;
        }

        Staff s = (Staff) listHospitalDepartment.getValueAt(selectedRowIndex, 1);

        return s;
    }

    private void comboBoxHospitalDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHospitalDepartmentActionPerformed
 
    }//GEN-LAST:event_comboBoxHospitalDepartmentActionPerformed

    private void btnSelectShopTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectShopTypeActionPerformed
        // validations
        String type = comboBoxHospitalDepartment.getSelectedItem().toString();
        
        if (!utils.isStringInputValid(type)) {
             utils.showErrorToast("Please select Staff type");
        }else if(type.equalsIgnoreCase("select")){
            utils.showErrorToast("Please select Staff type");
        } 
        else {
           populateTable(type);
        }
    }//GEN-LAST:event_btnSelectShopTypeActionPerformed

    private void btnSelectShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectShopActionPerformed
        // TODO add your handling code here:
        Staff stf = getSelectedStaff();
            if(stf.getSessionDirectory().getSession().isEmpty()){
                utils.showErrorToast("No Slot available for " + stf.getName());
            }else{
                if (stf != null) {
            SelectConsultationPanel selectConsultationPanel = new SelectConsultationPanel(mainWorkArea, ecosystem, stf, userAccount);
            mainWorkArea.add("orderMedicineCartPanel", selectConsultationPanel);
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.next(mainWorkArea);
            }
//        if (stf != null) {
//            SelectConsultationPanel selectConsultationPanel = new SelectConsultationPanel(mainWorkArea, ecosystem, stf, userAccount);
//            mainWorkArea.add("orderMedicineCartPanel", selectConsultationPanel);
//            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//            layout.next(mainWorkArea);
        }
    }//GEN-LAST:event_btnSelectShopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectShop;
    private javax.swing.JButton btnSelectShopType;
    private javax.swing.JComboBox<Object> comboBoxHospitalDepartment;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblPageTitle1;
    private javax.swing.JLabel lblPageTitle2;
    private javax.swing.JTable listHospitalDepartment;
    // End of variables declaration//GEN-END:variables

    private void populateData() {

        for (Type t : ecosystem.getTypeDirectory().getTypeList()) {
            if (t.getParent().toLowerCase().equals("hospital department")) {
                comboBoxHospitalDepartment.addItem(t.getType());
            }
        }
    }

    private void populateTable(String type) {
        ArrayList<Staff> stf = new ArrayList<>();

        ArrayList<Hospital> hospList = ecosystem.getHospitalDirectory().getHospitalList();
        for(Hospital hosp: hospList){
            ArrayList<HospitalDepartment> hospDeptList = hosp.getDepartmentDirectory().getDepartmentList();
            for(HospitalDepartment hd: hospDeptList){
                if(hd.getType().equalsIgnoreCase(type)){
                     stf= hd.getStaffDirectory().getStaffList();
                }
            }
        }       
        DefaultTableModel model = (DefaultTableModel) listHospitalDepartment.getModel();

        model.setRowCount(0);

        if (stf != null) {
            int count = 1;
            for (Staff s : stf) {
                    Object[] row = new Object[4];
                    row[0] = "" + count++;
                    row[1] = s;
                    row[2] = s.getDesignation();
                    row[3] = s.getZipcode();
                    model.addRow(row);
            }
        }
    }
}
