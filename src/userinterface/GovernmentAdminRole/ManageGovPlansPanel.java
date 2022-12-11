/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentAdminRole;

import Business.EcoSystem;
import Business.GovernmentOfficial.GovernmentOfficial;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raaga
 */

public class ManageGovPlansPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    GovernmentOfficial govOfficial;
    DefaultTableModel model;
    UserAccount ua;

    /**
     * Creates new form ManageRestaurantMenu
     */
    public ManageGovPlansPanel(JPanel userProcessContainer, EcoSystem system, GovernmentOfficial govOfficial, UserAccount ua) {
        initComponents();
        ecosystem = system;
        this.ua= ua;
        this.userProcessContainer = userProcessContainer;
        this.govOfficial = govOfficial;
        model = new DefaultTableModel();
        menuTable.setModel(model);
        model.addColumn("Program");
        model.addColumn("Price");
        showDeleteList();
        viewMenuList();
    }

    public void viewMenuList() {
        HashMap<String, String> menu = govOfficial.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }

    public void showDeleteList() {
        HashMap<String, String> menu = govOfficial.getMenu();
        if (govOfficial.getMenu().size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                itemsCombo.addItem(e.getKey());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        AddItemPanel = new javax.swing.JPanel();
        AddItemLabel = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        AddItemNameLabel = new javax.swing.JLabel();
        AddItemPriceLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 108, 103));

        menuTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
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
        menuTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(menuTable);

        btnBack.setBackground(new java.awt.Color(127, 195, 126));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        AddItemPanel.setBackground(new java.awt.Color(254, 254, 226));

        AddItemLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemLabel.setText("Add Program");

        itemText.setForeground(new java.awt.Color(72, 72, 72));
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });

        priceText.setForeground(new java.awt.Color(72, 72, 72));

        AddItemNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddItemNameLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemNameLabel.setText("Name");

        AddItemPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddItemPriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemPriceLabel.setText("Price");

        addButton.setBackground(new java.awt.Color(127, 195, 126));
        addButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(51, 51, 51));
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddItemPanelLayout = new javax.swing.GroupLayout(AddItemPanel);
        AddItemPanel.setLayout(AddItemPanelLayout);
        AddItemPanelLayout.setHorizontalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddItemPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddItemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddItemPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceText)
                    .addComponent(itemText))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddItemPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddItemPanelLayout.createSequentialGroup()
                        .addComponent(AddItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddItemPanelLayout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        AddItemPanelLayout.setVerticalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AddItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddItemNameLabel))
                .addGap(24, 24, 24)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddItemPriceLabel)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        UpdateItemPanel.setBackground(new java.awt.Color(254, 254, 226));
        UpdateItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update / Delete Program");
        UpdateItemPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 416, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 72, 72));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Select Name");
        UpdateItemPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 128, -1));

        itemsCombo.setForeground(new java.awt.Color(72, 72, 72));
        itemsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None" }));
        itemsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsComboActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(itemsCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 244, -1));

        ItemPanel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ItemPanel.setForeground(new java.awt.Color(72, 72, 72));
        ItemPanel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ItemPanel.setText("Program");
        UpdateItemPanel.add(ItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 128, -1));

        updateItemText.setForeground(new java.awt.Color(72, 72, 72));
        updateItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemTextActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(updateItemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 244, -1));

        PriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PriceLabel.setText("Price");
        UpdateItemPanel.add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 128, -1));

        updatePriceText.setForeground(new java.awt.Color(72, 72, 72));
        UpdateItemPanel.add(updatePriceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, -1));

        updateButton.setBackground(new java.awt.Color(127, 195, 126));
        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(51, 51, 51));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 118, 35));

        deleteButton.setBackground(new java.awt.Color(127, 195, 126));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        UpdateItemPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 119, 32));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 226));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/government.gif"))); // NOI18N

        title.setBackground(new java.awt.Color(254, 254, 226));
        title.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(254, 254, 226));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Manage Your Programs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(UpdateItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addGap(0, 234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields(itemText.getText(), priceText.getText());
        if (!isValid) {
            return;
        }
        HashMap<String, String> menu = govOfficial.getMenu();
        menu.put(itemText.getText(), priceText.getText());
        govOfficial.setMenu(menu);
        JOptionPane.showMessageDialog(this, "Item added successfully");
        itemsCombo.addItem(itemText.getText());
        System.out.println(itemText.getText() + " test " + priceText.getText());
        model.addRow(new Object[]{
            itemText.getText(),
            priceText.getText()
        });
        itemText.setText("");
        priceText.setText("");

    }//GEN-LAST:event_addButtonActionPerformed
    public void reset() {
        itemsCombo.setSelectedIndex(0);
        updateItemText.setText("");
        updatePriceText.setText("");

    }
    private void itemsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsComboActionPerformed
        // TODO add your handling code here:
        HashMap<String, String> menu = govOfficial.getMenu();
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
    public Boolean validateFields(String item, String price) {
        String pattern = "^(\\d*\\.)?\\d+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Matcher m = r.matcher(price);
        if(item.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return false;
        } else if(!m.find()) {
            JOptionPane.showMessageDialog(null, "Please enter Valid price");
            return false;
        }
        return true;
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if(itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown");
            return;
        } else if (!validateFields(updateItemText.getText(), updatePriceText.getText())) {
            return;
        }
        HashMap<String, String> menu = govOfficial.getMenu();
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
        govOfficial.setMenu(menu);
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        for (int i = 0; i < menuTable.getRowCount(); i++) {
            if (((String) menuTable.getValueAt(i, 0)).equals(selectedItem)) {
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
        HashMap<String, String> menu = govOfficial.getMenu();
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
        for (int i = 0; i < menuTable.getRowCount(); i++) {
            if (((String) menuTable.getValueAt(i, 0)).equals(selectedItem)) {
                model.removeRow(i);
                itemsCombo.removeItemAt(i + 1);
                updateItemText.setText("");
                updatePriceText.setText("");
            }//end of if block
        }
        
        govOfficial.setMenu(menu);
        System.out.println(menu.size() + "jsdje " + govOfficial.getMenu().size());
        reset();
        // TODO add your handling code here:

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminWorkAreaJPanel dm= new AdminWorkAreaJPanel(userProcessContainer, ua, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void updateItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateItemTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItemLabel;
    private javax.swing.JLabel AddItemNameLabel;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JLabel AddItemPriceLabel;
    private javax.swing.JLabel ItemPanel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel UpdateItemPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField itemText;
    private javax.swing.JComboBox<String> itemsCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateItemText;
    private javax.swing.JTextField updatePriceText;
    // End of variables declaration//GEN-END:variables
}
