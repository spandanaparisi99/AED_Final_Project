/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raaga
 */
public class GroceryMain extends javax.swing.JPanel {

    /**
     * Creates new form GroceryMain
     */
    JPanel userProcessContainer;
    private static EcoSystem ecosystem;
    
    public GroceryMain(JPanel userProcessContainer1, EcoSystem system) {
        userProcessContainer = userProcessContainer1;
        ecosystem = system;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageGroceryButton = new javax.swing.JButton();
        manageGroceryManagersButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageGroceryButton.setBackground(new java.awt.Color(127, 195, 126));
        ManageGroceryButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageGroceryButton.setForeground(new java.awt.Color(51, 51, 51));
        ManageGroceryButton.setText("Grocery Shop");
        ManageGroceryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGroceryButtonActionPerformed(evt);
            }
        });
        add(ManageGroceryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 178, 46));

        manageGroceryManagersButton.setBackground(new java.awt.Color(127, 195, 126));
        manageGroceryManagersButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageGroceryManagersButton.setForeground(new java.awt.Color(51, 51, 51));
        manageGroceryManagersButton.setText("Grocery Managers");
        manageGroceryManagersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageGroceryManagersButtonActionPerformed(evt);
            }
        });
        add(manageGroceryManagersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 180, 46));

        btnBack.setBackground(new java.awt.Color(127, 195, 126));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 119, 47));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageGroceryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGroceryButtonActionPerformed
        ManageGrocery rest= new ManageGrocery(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",rest);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageGroceryButtonActionPerformed

    private void manageGroceryManagersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageGroceryManagersButtonActionPerformed
        // TODO add your handling code here:
        ManagerGroceryManagers restM= new ManagerGroceryManagers(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",restM);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageGroceryManagersButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SystemAdminWorkAreaJPanel dm= new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageGroceryButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton manageGroceryManagersButton;
    // End of variables declaration//GEN-END:variables
}
