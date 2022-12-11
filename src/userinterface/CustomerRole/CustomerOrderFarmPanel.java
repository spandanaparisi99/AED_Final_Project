/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;

/**
 *
 * @author Swapnil
 */
public class CustomerOrderFarmPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    DefaultTableModel model;
    DefaultTableModel model1;
    Customer cust;
    JSplitPane screen;

    /**
     * Creates new form CustomerSelectHospitalManagerPanel
     */
    public CustomerOrderFarmPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.screen = screen;
        ecosystem = system;
        cust = findCustomer();
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        
        pastorderstable.setModel(model1);
        legaltable.setModel(model);
        model.addColumn("Farm");
        model.addColumn("Location");
        model.addColumn("Phone");
        
        model1.addColumn("Id");
        model1.addColumn("Status");
        model1.addColumn("Farm");
 
        populateRequestTable();
        populateCustomerOrders();
        Titlelabel.setText("Welcome "+cust.getName());
        
    }
    
    public void populateCustomerOrders() {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        for (int i = 0; i < cust.getFarmDirectoryList().size();i++) {
            model1.addRow(new Object[]{
                i+1,
                cust.getFarmDirectoryList().get(i).getStatus(),
                cust.getFarmDirectoryList().get(i).getFarmManager().getName()
            });
        }

    }
     public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
    
   public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getFarmManagerDirectory().getFarmManagerList().size(); i++) {
            if(ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getNetwork().equals(cust.getNetwork())){
             model.addRow(new Object[]{
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getName(),
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getAddress(),
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getPhone(),
                ecosystem.getFarmManagerDirectory().getFarmManagerList().get(i).getAvailable()});
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titlelabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastorderstable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        legaltable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titlelabel.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        Titlelabel.setForeground(new java.awt.Color(254, 254, 226));
        Titlelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titlelabel.setText("Welcome");
        add(Titlelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -10, 804, 88));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/farm_1.gif"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 480, 290));

        jPanel1.setBackground(new java.awt.Color(254, 254, 226));

        pastorderstable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pastorderstable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pastorderstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
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
        pastorderstable.setGridColor(new java.awt.Color(0, 0, 0));
        pastorderstable.setRowHeight(25);
        pastorderstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastorderstableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pastorderstable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Past Orders");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 570, 230));

        jPanel2.setBackground(new java.awt.Color(254, 254, 226));

        legaltable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        legaltable.setModel(new javax.swing.table.DefaultTableModel(
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
        legaltable.setRowHeight(25);
        legaltable.setShowGrid(true);
        jScrollPane1.setViewportView(legaltable);

        jButton2.setBackground(new java.awt.Color(127, 195, 126));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Select a Farm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 570, 300));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/farm.gif"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 480, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         System.out.println(legaltable.getSelectedRow() + " row ");
        if (legaltable.getSelectedRow() >= 0) {
            CustomerSelectFarmPanel mm = new CustomerSelectFarmPanel(userProcessContainer, this.userAccount, ecosystem,  ecosystem.getFarmManagerDirectory().getFarmManagerList().get(legaltable.getSelectedRow()), screen);
//            userProcessContainer.add("manageNetworkJPanel", mm);
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
               screen.setRightComponent(mm);
//               System.out.println("Cleaning Service Selected");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a service from our list");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pastorderstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastorderstableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pastorderstableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titlelabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable legaltable;
    private javax.swing.JTable pastorderstable;
    // End of variables declaration//GEN-END:variables
}
