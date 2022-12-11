/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FarmerAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;


import Business.FarmManager.FarmManager;
import Business.Orders.FarmOrdersDirectory;
import Business.Orders.FarmOrder;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Swapnil
 */
public class ManageFarmOrdersPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FarmManager maidmanager;
    DefaultTableModel model;
    UserAccount ua;
    DefaultTableModel ordersModel;
    private FarmOrdersDirectory selectedDir;


    public ManageFarmOrdersPanel(JPanel userProcessContainer, EcoSystem system, FarmManager maidmanager, UserAccount ua) {
        initComponents();
        ecosystem = system;
        model = new DefaultTableModel();
        this.ua = ua;
        this.userProcessContainer = userProcessContainer;
        this.maidmanager = maidmanager;
        
        model = new DefaultTableModel();
        ordersModel = new DefaultTableModel();
        
        orderTable.setModel(model);
        orderListTable.setModel(ordersModel);
        
        model.addColumn("Item");
        model.addColumn("Price");
        model.addColumn("Date");
        model.addColumn("Customer");
        ordersModel.addColumn("Id");
        ordersModel.addColumn("Status");
        ordersModel.addColumn("name");        
        ordersModel.addColumn("comment");
        
        
        viewOrderDirList();
    }
    
    @SuppressWarnings("unchecked")
    
    public void viewOrderDirList() {
        String name = "";
        for (int i = ordersModel.getRowCount() - 1; i >= 0; i--) {
            ordersModel.removeRow(i);
        }
        for (int i = 0; i < maidmanager.getOrderDirectoryList().size(); i++) {
            for (int j = 0; j < maidmanager.getOrderDirectoryList().get(i).getOrderList().size(); j++) {
                name = maidmanager.getOrderDirectoryList().get(i).getCustomerDetails().getUsername();
            }
            ordersModel.addRow(new Object[]{
                maidmanager.getOrderDirectoryList().get(i).getId(),
                maidmanager.getOrderDirectoryList().get(i).getStatus(),
                name,
                maidmanager.getOrderDirectoryList().get(i).getComment()
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderListTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        AcceptButton = new javax.swing.JButton();
        RejectButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 108, 103));

        title.setBackground(new java.awt.Color(254, 254, 226));
        title.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(254, 254, 226));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Manage Your Orders");

        jButton1.setBackground(new java.awt.Color(127, 195, 126));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 226));

        orderListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        orderListTable.setGridColor(new java.awt.Color(0, 0, 0));
        orderListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderListTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(orderListTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Orders");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(254, 254, 226));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        orderTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(orderTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Orders");

        AcceptButton.setBackground(new java.awt.Color(127, 195, 126));
        AcceptButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AcceptButton.setText("Accept");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });

        RejectButton.setBackground(new java.awt.Color(127, 195, 126));
        RejectButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RejectButton.setText("Reject");
        RejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListTableMouseClicked
              // TODO add your handling code here:
        if(orderListTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        String b = String.valueOf(ordersModel.getValueAt(orderListTable.getSelectedRow(), 1));
        System.out.print(b + " b " + !b.equalsIgnoreCase("Placed"));
        String a = String.valueOf(ordersModel.getValueAt(orderListTable.getSelectedRow(), 1));
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        selectedDir =  maidmanager.getOrderDirectoryList().get(orderListTable.getSelectedRow());
        
        ArrayList<FarmOrder> orderlist = maidmanager.getOrderDirectoryList().get(orderListTable.getSelectedRow()).getOrderList();
        System.out.println("tst"+ orderlist.size());
        for (int i = 0; i < orderlist.size(); i++) {
            System.out.println(orderlist.get(i).getItem());
            model.addRow(new Object[]{
                orderlist.get(i).getItem(),

                orderlist.get(i).getPrice(),
                orderlist.get(i).getDate(),
                selectedDir.getCustomerDetails().getUsername()
            });
        }

    }//GEN-LAST:event_orderListTableMouseClicked
  
    public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(selectedDir.getCustomerDetails().getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
    
    public void setCustomerStatus(String status) {
        Customer cust = findCustomer();
            for (int i = 0; i < cust.getNGOorderDirectoryList().size(); i++) {
                if (cust.getNGOorderDirectoryList().get(i).getId() == (selectedDir.getId())) {
                    cust.getNGOorderDirectoryList().get(i).setStatus(status);
                }
            }
    }
    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonActionPerformed
        String b = String.valueOf(ordersModel.getValueAt(orderListTable.getSelectedRow(), 1));
        if(!b.equalsIgnoreCase("Placed")){
            JOptionPane.showMessageDialog(this, "Order Already Accepted");
        }            
        else if (selectedDir != null ) {
            selectedDir.setIsAccept(true);
            selectedDir.setStatus("Accepted");
            setCustomerStatus("Accepted");
             JOptionPane.showMessageDialog(this, "Order Accepted");
        } else {
            JOptionPane.showMessageDialog(this, "Select a order first");
        }// TODO add your handling code here:
        
        viewOrderDirList();

    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void RejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectButtonActionPerformed
        // TODO add your handling code here:
         
        if (selectedDir != null) {
            selectedDir.setIsAccept(false);
            selectedDir.setStatus("Rejected");
            setCustomerStatus("Rejected");
            JOptionPane.showMessageDialog(this, "Order rejected");
            }else {
            JOptionPane.showMessageDialog(this, "Select a order first");
        } 
         viewOrderDirList();
    }//GEN-LAST:event_RejectButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AdminWorkAreaJPanel dm= new AdminWorkAreaJPanel(userProcessContainer, ua, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JButton RejectButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderListTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
