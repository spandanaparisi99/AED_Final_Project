/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;


import Business.Orders.FarmOrder;
import Business.Orders.FarmOrdersDirectory;
import Business.FarmManager.FarmManager;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Swapnil
 */
public class CustomerSelectFarmPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    FarmManager farmManager;
    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    private String selectedItem;
    private String selectedPrice;
     private String removeItem;
    JSplitPane screen;
    Double Total = 0.0;
     
    private FarmOrdersDirectory FarmOrderDirectory;
    java.util.Date dateCurrent = new java.util.Date();


    /**
     * Creates new form CustomerSelectLegalPanel
     */
    public CustomerSelectFarmPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, FarmManager farmManager, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.farmManager = farmManager;
        this.screen = screen;
        ecosystem = system;
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        model2 = new DefaultTableModel();
       
        LegalserviceTable.setModel(model);
         cartTable.setModel(model1);
       
        
        
        FarmOrderDirectory = new FarmOrdersDirectory();
        
        model.addColumn("Item");
        model.addColumn("Price");
        
        model1.addColumn("Item");
        model1.addColumn("Price");
        model1.addColumn("Quantity");
        model1.addColumn("Total");
        
        
        
        
        showMenuTable();
        showCartTable();
       
        
        maidname.setText(farmManager.getName());
     
        
        jPanel3.setVisible(false);
 }
    
    public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getFarmManagerDirectory().getFarmManagerList().size(); i++) {
             model2.addRow(new Object[]{
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getName(),
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getAddress(),
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getPhone(),
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getAvailable()});
        }
    }
    
    public void showMenuTable() {
        HashMap<String, String> menu = farmManager.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }
        public void showCartTable() {
        if (FarmOrderDirectory.getOrderList().size() > 0) {
            for (int i = 0; i < FarmOrderDirectory.getOrderList().size(); i++) {
                model1.addRow(new Object[]{
                    FarmOrderDirectory.getOrderList().get(i).getItem(),
                    FarmOrderDirectory.getOrderList().get(i).getPrice(),
                    FarmOrderDirectory.getOrderList().get(i).getTime(),
                    FarmOrderDirectory.getOrderList().get(i).getTotal()
                });
            }
        }
    }
            
        

        
    public Customer findCustomer() {
        for(int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i ++) {
            if(ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }                           
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        placeButton = new javax.swing.JButton();
        maidname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LegalserviceTable = new javax.swing.JTable();
        itemText = new javax.swing.JTextField();
        itemText1 = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        removeItemText = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backbutton.setBackground(new java.awt.Color(127, 195, 126));
        Backbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Backbutton.setText("Back");
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });
        add(Backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 141, 40));

        jPanel3.setBackground(new java.awt.Color(254, 254, 226));

        placeButton.setBackground(new java.awt.Color(127, 195, 126));
        placeButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        placeButton.setText("Place Order");
        placeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        placeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(placeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(placeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 270, 110));

        maidname.setBackground(new java.awt.Color(255, 255, 255));
        maidname.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        maidname.setForeground(new java.awt.Color(254, 254, 226));
        add(maidname, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 40, 310, 50));

        jPanel1.setBackground(new java.awt.Color(254, 254, 226));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 72, 72));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Selected Item");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 72, 72));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Quantity");
        jLabel4.setAutoscrolls(true);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Select Items");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LegalserviceTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LegalserviceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        LegalserviceTable.setRowHeight(25);
        LegalserviceTable.setShowGrid(true);
        LegalserviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LegalserviceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LegalserviceTable);

        itemText.setForeground(new java.awt.Color(72, 72, 72));

        itemText1.setForeground(new java.awt.Color(72, 72, 72));

        AddButton.setBackground(new java.awt.Color(127, 195, 126));
        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemText1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 410, 410));

        jPanel2.setBackground(new java.awt.Color(254, 254, 226));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Your Quick Cart View");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
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
        cartTable.setRowHeight(25);
        cartTable.setShowGrid(true);
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(cartTable);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(72, 72, 72));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Selected Item");
        jLabel12.setAutoscrolls(true);

        removeItemText.setForeground(new java.awt.Color(72, 72, 72));

        clearButton.setBackground(new java.awt.Color(127, 195, 126));
        clearButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clearButton.setText("Clear ");
        clearButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(127, 195, 126));
        removeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        removeButton.setText("Remove");
        removeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel12)
                        .addGap(32, 32, 32)
                        .addComponent(removeItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(removeItemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 500, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void LegalserviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LegalserviceTableMouseClicked
        // TODO add your handling code here:
        System.out.println(model.getValueAt(LegalserviceTable.getSelectedRow(), 0) +" selected added list ");
        selectedItem = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 0));
        selectedPrice = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 1));
        itemText.setText(selectedItem);
    }//GEN-LAST:event_LegalserviceTableMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here
        
       
         SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
         String time = itemText1.getText();
         double total = Integer.parseInt(time) * Integer.parseInt(selectedPrice);
         
         String mes = "We are Sorry, " + farmManager.getName() +" is not Available on this date!" ;
         
        
        FarmOrderDirectory.createOrder(selectedItem, selectedPrice,String.valueOf(total), time, farmManager, userAccount);
        model1.addRow(new Object[]{
            selectedItem,
            selectedPrice,
            time,
            String.valueOf(total)
        });
        itemText.setText("");
        itemText1.setText("");
        JOptionPane.showMessageDialog(this, "Item added to cart");
        
        jPanel3.setVisible(true);

    }//GEN-LAST:event_AddButtonActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        // TODO add your handling code here:
        CustomerOrderFarmPanel dm= new CustomerOrderFarmPanel(userProcessContainer, userAccount, ecosystem, screen);
//        userProcessContainer.add("manageNetworkJPanel",dm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        screen.setRightComponent(dm);
    }//GEN-LAST:event_BackbuttonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if(removeItemText.getText().isEmpty() || removeItem == null) {
            JOptionPane.showMessageDialog(this, "Kindly select item to remove");
            return;
        }
        FarmOrderDirectory.deleteOrder(removeItem);
        for (int i = 0; i < cartTable.getRowCount(); i++) {
            if (((String) cartTable.getValueAt(i, 0)).equals(removeItem)) {
                model1.removeRow(i);
            }
        }
        removeItemText.setText("");
        JOptionPane.showMessageDialog(this, "Item removed successfully");
    }//GEN-LAST:event_removeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        FarmOrderDirectory.deleteOrderAll();
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        JOptionPane.showMessageDialog(this, "Items removed successfully");
        jPanel3.setVisible(false);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
    removeItem = String.valueOf(model1.getValueAt(cartTable.getSelectedRow(), 0));
        removeItemText.setText(removeItem);        // TODO add your handling code here:
    }//GEN-LAST:event_cartTableMouseClicked

    private void placeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeButtonActionPerformed
        // TODO add your handling code here:
        Customer cust = findCustomer();
        if("Credit".equals(cust.getCardType())){
            setOrderListLegal(cust);
            for(int i = 0; i < FarmOrderDirectory.getOrderList().size(); i ++) {
            Total+= (Double.parseDouble(FarmOrderDirectory.getOrderList().get(i).getTime())*Double.parseDouble(FarmOrderDirectory.getOrderList().get(i).getPrice()));
        }
        CustomerPaymentPanels mm = new CustomerPaymentPanels(screen, cust, Total, "We have received your order. We will update as soon as you have appointment is scheduled.");
        screen.setRightComponent(mm);
        }else {JOptionPane.showMessageDialog(this, "Sorry Cannot place Direct Order, Add A Credit Card");}
        jPanel3.setVisible(false);
    }//GEN-LAST:event_placeButtonActionPerformed
 
    public void setOrderListLegal(Customer cust) {
         for(int i = 0; i <  FarmOrderDirectory.getOrderList().size(); i ++) {
               farmManager.getOrderList().add(FarmOrderDirectory.getOrderList().get(i));
               cust.getFarmorderList().add(FarmOrderDirectory.getOrderList().get(i));

        }
//        legal.getOrders().put(String.valueOf(legal.getOrders().size()), legalOrderDirectory.getOrderList());
        cust.getFarmDirectoryList().add(FarmOrderDirectory);
        farmManager.getOrderDirectoryList().add(FarmOrderDirectory);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton Backbutton;
    private javax.swing.JTable LegalserviceTable;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField itemText;
    private javax.swing.JTextField itemText1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel maidname;
    private javax.swing.JButton placeButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField removeItemText;
    // End of variables declaration//GEN-END:variables
}
