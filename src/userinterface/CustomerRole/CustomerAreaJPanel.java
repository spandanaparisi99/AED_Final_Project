/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Orders.GroceryOrderDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.GroceryAdminRole.ManageGroceryInventoryPanel;
import userinterface.GroceryAdminRole.ManageOrdersPanel;

/**
 *
 * @author Swapnil
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    DefaultTableModel model1;
    private UserAccount userAccount;
    private GroceryOrderDirectory orderDirectory;
    DefaultTableModel model;
    Customer cust;
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        ecosystem = system;
        cust = findCustomer();

        //valueLabel.setText(enterprise.getName());
        title2.setText("Welcome "+ cust.getName());
        
        ImageIcon icon1 =  new ImageIcon("./src/images/profile.png");
        Image image1 = icon1.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        profileBtn.setIcon(new ImageIcon(image1));
        
        ImageIcon icon2 =  new ImageIcon("./src/images/ngo.png");
        Image image2 = icon2.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ngoBtn.setIcon(new ImageIcon(image2));
        
        ImageIcon icon3 =  new ImageIcon("./src/images/grocery.png");
        Image image3 = icon3.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        grocerybutton.setIcon(new ImageIcon(image3));
        
        ImageIcon icon4 =  new ImageIcon("./src/images/farm.png");
        Image image4 = icon4.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        farmBtn.setIcon(new ImageIcon(image4));
        
        ImageIcon icon5 =  new ImageIcon("./src/images/government.png");
        Image image5 = icon5.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        govSchemeBtn.setIcon(new ImageIcon(image5));
        
        ImageIcon icon6 =  new ImageIcon("./src/images/restaurant.png");
        Image image6 = icon6.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        RestaurantBtn.setIcon(new ImageIcon(image6));
        
        ImageIcon icon7 =  new ImageIcon("./src/images/cart.png");
        Image image7 = icon7.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        cartbutton.setIcon(new ImageIcon(image7));
        
        ImageIcon icon8 =  new ImageIcon("./src/images/credit-card.png");
        Image image8 = icon8.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        cardbutton.setIcon(new ImageIcon(image8));
        
        ImageIcon icon9 =  new ImageIcon("./src/images/factory.png");
        Image image9 = icon9.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        factoryBtn.setIcon(new ImageIcon(image9));
        
       
        
        
 }
    
     public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        ngoBtn = new javax.swing.JButton();
        grocerybutton = new javax.swing.JButton();
        farmBtn = new javax.swing.JButton();
        govSchemeBtn = new javax.swing.JButton();
        RestaurantBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        cartbutton = new javax.swing.JButton();
        cardbutton = new javax.swing.JButton();
        factoryBtn = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        birdiemessage = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(10);

        jPanel1.setBackground(new java.awt.Color(254, 254, 226));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        ngoBtn.setBackground(new java.awt.Color(127, 195, 126));
        ngoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ngoBtn.setText("NGO Plans");
        ngoBtn.setBorder(null);
        ngoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngoBtnActionPerformed(evt);
            }
        });

        grocerybutton.setBackground(new java.awt.Color(127, 195, 126));
        grocerybutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        grocerybutton.setText("Grocery Store");
        grocerybutton.setBorder(null);
        grocerybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grocerybuttonActionPerformed(evt);
            }
        });

        farmBtn.setBackground(new java.awt.Color(127, 195, 126));
        farmBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        farmBtn.setText("Farm Produce");
        farmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmBtnActionPerformed(evt);
            }
        });

        govSchemeBtn.setBackground(new java.awt.Color(127, 195, 126));
        govSchemeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        govSchemeBtn.setText("Government Programs");
        govSchemeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                govSchemeBtnActionPerformed(evt);
            }
        });

        RestaurantBtn.setBackground(new java.awt.Color(127, 195, 126));
        RestaurantBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RestaurantBtn.setText("Restaurant");
        RestaurantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurantBtnActionPerformed(evt);
            }
        });

        profileBtn.setBackground(new java.awt.Color(127, 195, 126));
        profileBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileBtn.setText("Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        cartbutton.setBackground(new java.awt.Color(127, 195, 126));
        cartbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartbutton.setText("Cart");
        cartbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbuttonActionPerformed(evt);
            }
        });

        cardbutton.setBackground(new java.awt.Color(127, 195, 126));
        cardbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cardbutton.setText("Add Card");
        cardbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardbuttonActionPerformed(evt);
            }
        });

        factoryBtn.setBackground(new java.awt.Color(127, 195, 126));
        factoryBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        factoryBtn.setText("Factory Outlet");
        factoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grocerybutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(govSchemeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(RestaurantBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(factoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(farmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(grocerybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RestaurantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(farmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(factoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(govSchemeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ngoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(0, 108, 103));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        title2.setForeground(new java.awt.Color(254, 254, 226));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Welcome To Food For All");
        container.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 940, 60));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("We are a zero-food wastage app! Solving all your food problems!");
        container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 670, -1));

        birdiemessage.setText(" ");
        container.add(birdiemessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/112.jpg"))); // NOI18N
        container.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 510, 420));

        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/111.jpg"))); // NOI18N
        container.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 420));

        jSplitPane1.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ngoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngoBtnActionPerformed
         CustomerOrderNGOPanel mm = new CustomerOrderNGOPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
//        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);        // TODO add your handling code here:
         jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_ngoBtnActionPerformed

    private void grocerybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grocerybuttonActionPerformed
        OrderGroceryPanel mm = new OrderGroceryPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
//        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        // TODO add your handling code here:        // TODO add your handling code here:
        jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_grocerybuttonActionPerformed

    private void farmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmBtnActionPerformed
        CustomerOrderFarmPanel mm = new CustomerOrderFarmPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
//        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);        // TODO add your handling code here:
        jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_farmBtnActionPerformed

    private void govSchemeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_govSchemeBtnActionPerformed
        CustomerOrderGovPlanPanel mm = new CustomerOrderGovPlanPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
//        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);        // TODO add your handling code here:
    jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_govSchemeBtnActionPerformed

    private void RestaurantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurantBtnActionPerformed
        // TODO add your handling code here:
         CustomerHotelJPanel mm = new CustomerHotelJPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
//        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
         jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_RestaurantBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
          CustomerUpdateInformation mm = new CustomerUpdateInformation(userProcessContainer, userAccount, ecosystem, jSplitPane1);
//        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
          jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void cartbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbuttonActionPerformed
        // TODO add your handling code here:
        CustomerCart mm = new CustomerCart(userProcessContainer, userAccount, ecosystem, jSplitPane1, cust);
        jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_cartbuttonActionPerformed

    private void cardbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardbuttonActionPerformed
        // TODO add your handling code here:
        CustomerAddCardDetailsPanel mm = new CustomerAddCardDetailsPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
        jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_cardbuttonActionPerformed

    private void factoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoryBtnActionPerformed
        // TODO add your handling code here:
         CustomerFactoryJPanel mm = new CustomerFactoryJPanel(userProcessContainer, userAccount, ecosystem, jSplitPane1);
         jSplitPane1.setRightComponent(mm);
    }//GEN-LAST:event_factoryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RestaurantBtn;
    private javax.swing.JLabel birdiemessage;
    private javax.swing.JButton cardbutton;
    private javax.swing.JButton cartbutton;
    private javax.swing.JPanel container;
    private javax.swing.JButton factoryBtn;
    private javax.swing.JButton farmBtn;
    private javax.swing.JButton govSchemeBtn;
    private javax.swing.JButton grocerybutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton ngoBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
