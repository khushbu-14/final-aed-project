/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;

import Business.User.User;
import Business.UserAccount.UserAccount;
import constants.Utils;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class AddMedicalPage2Panel extends javax.swing.JPanel {

    private JPanel mainWorkArea;
    private EcoSystem ecosystem;

    Utils util;

    DefaultTableModel model;

    private UserAccount userAccount;
    Boolean isUpdatePage = false;
    Boolean isRecordExist = false;
    private User user;
    private ArrayList<String> detailsList = new ArrayList<>();
    private ArrayList<String> allergiesList = new ArrayList<>();
    private ArrayList<String> currentMedList = new ArrayList<>();
    private ArrayList<String> pastMedList = new ArrayList<>();
    private ArrayList<String> chronicDiseaseList = new ArrayList<>();
    private ArrayList<String> surgeriesList = new ArrayList<>();
     private ArrayList<String> allergiesList1 = new ArrayList<>();
    private ArrayList<String> currentMedList1 = new ArrayList<>();
    private ArrayList<String> pastMedList1 = new ArrayList<>();
    private ArrayList<String> chronicDiseaseList1 = new ArrayList<>();
    private ArrayList<String> surgeriesList1 = new ArrayList<>();
    private String selectedValue;
    
    Boolean flag;
    /**
     * Creates new form AddUniversity
     *
     * @param mainWorkArea
     * @param ecosystem
     * @param user
     * @param isUpdatePage
     */
    public AddMedicalPage2Panel(JPanel mainWorkArea, EcoSystem ecosystem, ArrayList<String> detailsList,User user, Boolean flag) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.ecosystem = ecosystem;
        this.user = user;
        this.detailsList=detailsList;
        this.flag = flag;
        util = new Utils();
        this.allergiesList= user.getMedicalProfile().getAllergyList();
        this.currentMedList = user.getMedicalProfile().getCurrentMedicationList();
        this.pastMedList = user.getMedicalProfile().getPastMedicationList();
        this.chronicDiseaseList = user.getMedicalProfile().getChronicDiseaseList();
        this.surgeriesList = user.getMedicalProfile().getSurgeriesyList();
        jPanelAdd.setVisible(false);
        btnSubmit.setVisible(false);
        btnClose.setVisible(false);
        btnNext.setVisible(true);
        populateViewTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        splitPanel = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblUserAction = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewTable = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jcomboBoxList = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanelAdd = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        addedTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setBackground(new java.awt.Color(249, 244, 244));
        setLayout(new java.awt.BorderLayout());

        splitPanel.setDividerLocation(70);
        splitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("View university list");
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

        lblUserAction.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblUserAction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserAction.setText("Add Medical Details");
        lblUserAction.setToolTipText("Add Department");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(lblUserAction, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(478, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserAction, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitPanel.setTopComponent(topPanel);

        bottomPanel.setBackground(new java.awt.Color(243, 241, 249));

        jLabel1.setText("Select one if applicable");

        ViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Available Data"
            }
        ));
        jScrollPane1.setViewportView(ViewTable);

        btnNext.setText("New Record");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jcomboBoxList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allergies", "CurrentMedication", "PastMedication", "ChronicDisease", "Surgeries" }));
        jcomboBoxList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBoxListActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "List"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(listTable);

        addedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Added"
            }
        ));
        jScrollPane2.setViewportView(addedTable);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddLayout.setVerticalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcomboBoxList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jPanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bottomPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboBoxList, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(jPanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        splitPanel.setRightComponent(bottomPanel);

        add(splitPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void setField() {
    }
     private int getSelectedRow() {
        int selectedRowIndex = ViewTable.getSelectedRow();
        return selectedRowIndex;
    }

    private void backAction() {
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AddMedicalProfilePanel addMedical = (AddMedicalProfilePanel) component;
        addMedical.setFields(flag);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) addedTable.getModel();
        model.setRowCount(0);
        int selectedRowIndex = listTable.getSelectedRow();
        
           if (selectedRowIndex < 0) {
            util.showErrorToast("Oops! Please select a record first first.");
            
        }
        
        if(selectedValue.toLowerCase().equals("allergies")){
            String s = (String) listTable.getValueAt(selectedRowIndex, 0);
             if(allergiesList.size()>0){
                if(allergiesList.contains(s) || allergiesList1.contains(s)){
                  util.showErrorToast("Oops! Record is already   Present");
                for(String st: allergiesList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                
                }
                }else{
                allergiesList1.add(s);
                for(String st: allergiesList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
            } else {
                allergiesList1.add(s);
                for(String st: allergiesList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
            
        } else if(selectedValue.toLowerCase().equals("currentmedication")){
            String s = (String) listTable.getValueAt(selectedRowIndex, 0);
            if(currentMedList.size()>0){
                if(currentMedList.contains(s) || currentMedList1.contains(s)){
                  util.showErrorToast("Oops! Record is already   Present");
                  for(String st: currentMedList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                
                }
                }else{
                currentMedList1.add(s);
                for(String st: currentMedList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
            } else {
                currentMedList1.add(s);
                for(String st: currentMedList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
        } else if(selectedValue.toLowerCase().equals("pastmedication")){
            String s = (String) listTable.getValueAt(selectedRowIndex, 0);
              if(pastMedList.size()>0){
                if(pastMedList.contains(s) || pastMedList1.contains(s)){
                  util.showErrorToast("Oops! Record is already Present");
                  for(String st: pastMedList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                
                }
                }else{
                pastMedList1.add(s);
                for(String st: pastMedList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
            } else {
                pastMedList1.add(s);
                for(String st: pastMedList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
        } else if(selectedValue.toLowerCase().equals("chronicdisease")){
            String s = (String) listTable.getValueAt(selectedRowIndex, 0);
             if(chronicDiseaseList.size()>0){
                if(chronicDiseaseList.contains(s) || chronicDiseaseList1.contains(s)){
                  util.showErrorToast("Oops! Record is already Present");
                  for(String st: chronicDiseaseList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                
                }
                }else{
                chronicDiseaseList1.add(s);
                for(String st: chronicDiseaseList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
            } else {
                chronicDiseaseList1.add(s);
                for(String st: chronicDiseaseList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
        }  else if(selectedValue.toLowerCase().equals("surgeries")){
            String s = (String) listTable.getValueAt(selectedRowIndex, 0);
             if(surgeriesList.size()>0){
                if(surgeriesList.contains(s) || surgeriesList1.contains(s)){
                  util.showErrorToast("Oops! Record is already Present");
                  for(String st: surgeriesList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                
                }
                }else{
                surgeriesList1.add(s);
                for(String st: surgeriesList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
            } else {
                surgeriesList1.add(s);
                for(String st: surgeriesList1){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        jPanelAdd.setVisible(true);
        btnSubmit.setVisible(true);
        btnClose.setVisible(true);
        btnNext.setVisible(false);
        populateListTable();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        for(String st: allergiesList1){
            if(!user.getMedicalProfile().getAllergyList().contains(st)){
            user.getMedicalProfile().addAllergies(st);
            }
            
        }
        for(String st: chronicDiseaseList1){
            if(!user.getMedicalProfile().getChronicDiseaseList().contains(st)){
             user.getMedicalProfile().addChronicDisease(st);
            }
           
        }
        for(String st: surgeriesList1){
            if(!user.getMedicalProfile().getSurgeriesyList().contains(st)){
            user.getMedicalProfile().addSurgeries(st);
            }
            
        }
        for(String st: currentMedList1){
            if(!user.getMedicalProfile().getCurrentMedicationList().contains(st)){
            user.getMedicalProfile().addCurrentMedication(st);
            }
            
        }
        for(String st: pastMedList1){
            if(!user.getMedicalProfile().getPastMedicationList().contains(st)){
            user.getMedicalProfile().addPastMedications(st);
            }
            
        }
        DefaultTableModel model = (DefaultTableModel) addedTable.getModel();
        model.setRowCount(0);
        allergiesList1.clear();
        currentMedList1.clear();
        pastMedList1.clear();
        chronicDiseaseList1.clear();
        surgeriesList1.clear();
        JOptionPane.showMessageDialog(this, "Records Added successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
       
        populateViewTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jcomboBoxListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBoxListActionPerformed
        // TODO add your handling code here:
        selectedValue = jcomboBoxList.getSelectedItem().toString();
        populateViewTable();
        populateListTable();
        
    }//GEN-LAST:event_jcomboBoxListActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        jPanelAdd.setVisible(false);
        btnSubmit.setVisible(false);
        btnClose.setVisible(false);
        btnNext.setVisible(true);
        allergiesList1.clear();
        currentMedList1.clear();
        pastMedList1.clear();
        chronicDiseaseList1.clear();
        surgeriesList1.clear();
        DefaultTableModel model = (DefaultTableModel) addedTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) ViewTable.getModel();
//        model.setRowCount(0);
        int selectedRowIndex = ViewTable.getSelectedRow();
           if (selectedRowIndex < 0) {
            util.showErrorToast("Oops! Please select a record first first.");
            populateViewTable();
        }else{
        String s = (String) ViewTable.getValueAt(selectedRowIndex, 0);
        selectedValue = jcomboBoxList.getSelectedItem().toString();
        if(selectedValue.toLowerCase().equals("allergies")){
            user.getMedicalProfile().removeAllergies(s);
        }else if(selectedValue.toLowerCase().equals("currentmedication")){
            user.getMedicalProfile().removeCurrentMedication(s);
        } else if(selectedValue.toLowerCase().equals("pastmedication")){
            user.getMedicalProfile().removePastMedications(s);
        } else if(selectedValue.toLowerCase().equals("chronicdisease")){
            user.getMedicalProfile().removeChronicDisease(s);
        } else if(selectedValue.toLowerCase().equals("surgeries")){
            user.getMedicalProfile().removeSurgeries(s);
        }
        JOptionPane.showMessageDialog(this, "Record removed successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        populateViewTable();
           }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewTable;
    private javax.swing.JTable addedTable;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcomboBoxList;
    private javax.swing.JLabel lblUserAction;
    private javax.swing.JTable listTable;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

    public void populateViewTable(){
        DefaultTableModel model = (DefaultTableModel) ViewTable.getModel();
        model.setRowCount(0);
        selectedValue = jcomboBoxList.getSelectedItem().toString();
        if(selectedValue.toLowerCase().equals("allergies")){
            for(String st: user.getMedicalProfile().getAllergyList()){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("currentmedication")){
            for(String st: user.getMedicalProfile().getCurrentMedicationList()){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("pastmedication")){
            for(String st: user.getMedicalProfile().getPastMedicationList()){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("chronicdisease")){
            for(String st: user.getMedicalProfile().getChronicDiseaseList()){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("surgeries")){
            for(String st: user.getMedicalProfile().getSurgeriesyList()){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        }
        
    }
    public void populateListTable(){
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        model.setRowCount(0);
        selectedValue = jcomboBoxList.getSelectedItem().toString();
        listTable.setEnabled(true);
        addedTable.setEnabled(true);
        if(selectedValue.toLowerCase().equals("allergies")){
            List<String> allergyList = Arrays.asList("Lactose","Soy","Seafood","Nuts","Eggs","Fish");
            for(String st: allergyList){
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("currentmedication")){
            List<String> allergyList = Arrays.asList("Atm a gel 15gm","Nadoxin a gel 15ml","Calak a lotion 100ml","trump a syrup 100 ml","Alorex a cream 20gm","Glintra a gel 15ml");
            for(String st: allergyList){
                
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("pastmedication")){
            List<String> allergyList = Arrays.asList("Atm a gel 15gm","Nadoxin a gel 15ml","Calak a lotion 100ml","trump a syrup 100 ml","Alorex a cream 20gm","Glintra a gel 15ml");
            for(String st: allergyList){
                
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("chronicdisease")){
            List<String> allergyList = Arrays.asList("Diabetes","Hypertension","PCOS","COPD","Asthama","Heart disease");
            for(String st: allergyList){
                
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        } else if(selectedValue.toLowerCase().equals("surgeries")){
            List<String> allergyList = Arrays.asList("Heart","Liver","Kidney","Lungs","Brain"," cosmetic");
            for(String st: allergyList){
                
                Object[] row = new Object[1];
                row[0] = st;
                model.addRow(row);
            }
        }
    }
}