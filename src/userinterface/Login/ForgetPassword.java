/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Login;

import Business.Customer.Customer;
import Business.Customer.SendMail;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Swapnil
 */
public class ForgetPassword extends javax.swing.JPanel {

    /**
     * Creates new form ForgetPassword
     */
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    JPanel container;
    EcoSystem system;
    JButton logoutJButton;
    public ForgetPassword(JPanel container, EcoSystem system, JButton logoutJButton) {
        this.container = container;
        this.system = system;
        this.logoutJButton = logoutJButton;
        
        
        for (int i = 0; i < system.getCustomerDirectory().getCustomerList().size(); i++) {
            customerList.add(system.getCustomerDirectory().getCustomerList().get(i));
        }
           
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

        restPwdLabel2 = new javax.swing.JLabel();
        updateUsernameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AddBtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        restPwdLabel2.setBackground(new java.awt.Color(254, 254, 226));
        restPwdLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restPwdLabel2.setForeground(new java.awt.Color(254, 254, 226));
        restPwdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel2.setText("Enter Your Email ID");
        add(restPwdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 154, -1));

        updateUsernameText.setForeground(new java.awt.Color(72, 72, 72));
        updateUsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUsernameTextActionPerformed(evt);
            }
        });
        add(updateUsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 171, -1));

        jLabel1.setBackground(new java.awt.Color(254, 254, 226));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 226));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 145, -1));

        AddBtn1.setBackground(new java.awt.Color(127, 195, 126));
        AddBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBtn1.setForeground(new java.awt.Color(51, 51, 51));
        AddBtn1.setText("Back");
        AddBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn1ActionPerformed(evt);
            }
        });
        add(AddBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 117, 49));

        jButton1.setBackground(new java.awt.Color(127, 195, 126));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Send Email");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 144, 46));
    }// </editor-fold>//GEN-END:initComponents

    private void updateUsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateUsernameTextActionPerformed

    private void AddBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)container.getLayout();
        LoginPage su = new LoginPage(container, system, logoutJButton);
        container.add("workArea",su);
        layout.next(container);
    }//GEN-LAST:event_AddBtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int Index = -1;
          for (int i = 0; i < customerList.size(); i++){
              if(customerList.get(i).getEmail().equals(updateUsernameText.getText())){
                  System.out.println("Hey " + customerList.get(i).getName() + "\n" +"Did you forget your password?" + "\n" +"Your Password is: " + system.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getPassword() +"\n" + "If you dont want to change your password or didn't request this, please ignore and delete this message");
                  SendMail sendMail = new SendMail(customerList.get(i).getEmail(), "Your Password for HelpingHands","Hey " + customerList.get(i).getName() + "\n" +" Did you forget your password? Your Passwrod is: " + 
                          system.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getPassword() 
                  + "If you don't want to change your password or didn't request this, please ignore and delete this message");
                    Index = i;
                  break;
              }
          }
          if(Index >= 0){
              
              
              CardLayout layout=(CardLayout)container.getLayout();
              LoginPage su = new LoginPage(container, system, logoutJButton);
              container.add("workArea",su);
              layout.next(container);
          }else{
              JOptionPane.showMessageDialog(this,"Email Id not found, Try Signing up","Error message", JOptionPane.ERROR_MESSAGE);
          }            
        
        
                  
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel restPwdLabel2;
    private javax.swing.JTextField updateUsernameText;
    // End of variables declaration//GEN-END:variables
}
