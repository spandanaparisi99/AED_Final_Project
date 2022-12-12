/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.NetworkPanel;
import javax.swing.JPanel;


/**
 *
 * @author RAJAS
 */
public class SystemAdminRole extends Role{
    
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new NetworkPanel(userProcessContainer, system);
    }
    
}
