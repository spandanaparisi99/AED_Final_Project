/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.FactoryAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author RAJAS
 */
public class FactoryRole {
    
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business);
    }

    
}
