/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FarmerAdminRole;


import Business.EcoSystem;


import Business.FarmManager.FarmManager;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Business.Customer.SendMail;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Swapnil
 */
public class ManageFarmServicesPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FarmManager farmManager;
    DefaultTableModel model;
    UserAccount ua;

    public ManageFarmServicesPanel(JPanel userProcessContainer, EcoSystem system, FarmManager farmManager,UserAccount ua) {
        initComponents();
        this.ecosystem = system;
        this.farmManager = farmManager;
        model = new DefaultTableModel();
        this.userProcessContainer = userProcessContainer;
        ManageServiceTabel.setModel(model);
        model.addColumn("Item");
        model.addColumn("Price");
        System.out.println(farmManager.getName());
        

        viewMenuList();
        showDeleteList();
        
    }
    
      public void viewMenuList() {
        HashMap<String, String> menu = farmManager.getMenu();
        
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });}}}

        public void showDeleteList() {
        HashMap<String, String> menu = farmManager.getMenu();
        if (farmManager.getMenu().size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                itemsCombo.addItem(e.getKey());
            }
        }
    }
        
          public void reset() {
        itemsCombo.setSelectedIndex(0);
        updateItemText.setText("");
        updatePriceText.setText("");

    }
        
     public Boolean validateFields(String item, String price) {
        String pattern = "^(\\d*\\.)?\\d+$  ";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Matcher m = r.matcher(price);
        if(item.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return false;
        } 
//        else if(!m.find()) {
//            JOptionPane.showMessageDialog(null, "Please enter Valid price");
//            return false;
//        }
        return true;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ManageServiceTabel = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        AddItemPanel = new javax.swing.JPanel();
        AddItemLabel = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        AddItemNameLabel = new javax.swing.JLabel();
        AddItemPriceLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        itemText = new javax.swing.JTextField();
        UpdateItemPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemsCombo = new javax.swing.JComboBox<>();
        ItemPanel = new javax.swing.JLabel();
        updateItemText = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        updatePriceText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageServiceTabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ManageServiceTabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ManageServiceTabel);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 421, 193));

        BackButton.setBackground(new java.awt.Color(127, 195, 126));
        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 49, 145, 49));

        AddItemPanel.setBackground(new java.awt.Color(254, 254, 226));

        AddItemLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemLabel.setText("Add Inventory");

        priceText.setForeground(new java.awt.Color(72, 72, 72));

        AddItemNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddItemNameLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemNameLabel.setText("Item");

        AddItemPriceLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddItemPriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemPriceLabel.setText("Price");

        addButton.setBackground(new java.awt.Color(127, 195, 126));
        addButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(51, 51, 51));
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        itemText.setForeground(new java.awt.Color(72, 72, 72));
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddItemPanelLayout = new javax.swing.GroupLayout(AddItemPanel);
        AddItemPanel.setLayout(AddItemPanelLayout);
        AddItemPanelLayout.setHorizontalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddItemPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddItemPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddItemPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddItemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(priceText)
                                .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        AddItemPanelLayout.setVerticalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(AddItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddItemNameLabel)
                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddItemPriceLabel)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        add(AddItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        UpdateItemPanel.setBackground(new java.awt.Color(254, 254, 226));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update / Delete an Item");

        jLabel5.setForeground(new java.awt.Color(72, 72, 72));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Select Item");

        itemsCombo.setForeground(new java.awt.Color(72, 72, 72));
        itemsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None" }));
        itemsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsComboActionPerformed(evt);
            }
        });

        ItemPanel.setForeground(new java.awt.Color(72, 72, 72));
        ItemPanel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ItemPanel.setText("Item");

        updateItemText.setForeground(new java.awt.Color(72, 72, 72));
        updateItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemTextActionPerformed(evt);
            }
        });

        PriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PriceLabel.setText("Price");

        updatePriceText.setForeground(new java.awt.Color(72, 72, 72));

        updateButton.setBackground(new java.awt.Color(127, 195, 126));
        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(51, 51, 51));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(127, 195, 126));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateItemPanelLayout = new javax.swing.GroupLayout(UpdateItemPanel);
        UpdateItemPanel.setLayout(UpdateItemPanelLayout);
        UpdateItemPanelLayout.setHorizontalGroup(
            UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemsCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addComponent(ItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateItemText))
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UpdateItemPanelLayout.setVerticalGroup(
            UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(itemsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateItemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemPanel))
                .addGap(31, 31, 31)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(updatePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        add(UpdateItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));

        title.setBackground(new java.awt.Color(254, 254, 226));
        title.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(254, 254, 226));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Manage Your Inventory");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 508, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        userinterface.FarmerAdminRole.AdminWorkAreaJPanel sysAdminwjp = (userinterface.FarmerAdminRole.AdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields((String) itemText.getText(), priceText.getText());
        if (!isValid) {
            return;
        }
         
        HashMap<String, String> menu = farmManager.getMenu();
        
        menu.put((String) itemText.getText(), priceText.getText());
        farmManager.setMenu(menu);
        JOptionPane.showMessageDialog(this, "Item added successfully");
        itemsCombo.addItem((String) itemText.getText());
        System.out.println((String) itemText.getText() + " test " + priceText.getText());
        model.addRow(new Object[]{
            (String) itemText.getText(),
            priceText.getText()
        });
       
        priceText.setText("");

    }//GEN-LAST:event_addButtonActionPerformed

    private void itemsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsComboActionPerformed
     // TODO add your handling code here:
        HashMap<String, String> menu = farmManager.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    updateItemText.setText(e.getKey());
                    updatePriceText.setText(String.valueOf(e.getValue()));
                }
            }
        }
    }//GEN-LAST:event_itemsComboActionPerformed

    private void updateItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateItemTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
          // TODO add your handling code here:
        if(itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown");
            return;
        } else if (!validateFields(updateItemText.getText(), updatePriceText.getText())) {
            return;
        }
        HashMap<String, String> menu = farmManager.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    menu.remove(e);
                    menu.put(updateItemText.getText(), updatePriceText.getText());
                    JOptionPane.showMessageDialog(this, "Menu Item updated successfully");
                }
            }
        }
        farmManager.setMenu(menu);
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        for (int i = 0; i < ManageServiceTabel.getRowCount(); i++) {
            if (((String) ManageServiceTabel.getValueAt(i, 0)).equals(selectedItem)) {
                itemsCombo.addItem(updateItemText.getText());
                model.addRow(new Object[]{
                    updateItemText.getText(),
                    updatePriceText.getText()
                });
                model.removeRow(i);
                itemsCombo.removeItemAt(i + 1);

            }//end of if block
        }
        reset();
        // TODO add your handling code here:
  
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            // TODO add your handling code here:
        if(itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown");
            return;
        }
        HashMap<String, String> menu = farmManager.getMenu();
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        if (itemsCombo.getSelectedItem() != null) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    System.out.println("inside delete..");
                    menu.remove(e.getKey());
                    JOptionPane.showMessageDialog(this, "Menu Item deleted successfully");
                }
            }
        }
        for (int i = 0; i < ManageServiceTabel.getRowCount(); i++) {
            if (((String) ManageServiceTabel.getValueAt(i, 0)).equals(selectedItem)) {
                model.removeRow(i);
                itemsCombo.removeItemAt(i + 1);
                updateItemText.setText("");
                updatePriceText.setText("");
            }//end of if block
        }
        
        farmManager.setMenu(menu);
        System.out.println(menu.size() + "jsdje " + farmManager.getMenu().size());
        reset();
        // TODO add your handling code here:

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItemLabel;
    private javax.swing.JLabel AddItemNameLabel;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JLabel AddItemPriceLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ItemPanel;
    private javax.swing.JTable ManageServiceTabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel UpdateItemPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField itemText;
    private javax.swing.JComboBox<String> itemsCombo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateItemText;
    private javax.swing.JTextField updatePriceText;
    // End of variables declaration//GEN-END:variables
}
