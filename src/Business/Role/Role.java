/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author RAJAS
 */
public abstract class Role {
    
    public enum RoleType{
        GroceryAdmin("GroceryAdmin"),
        HotelAdmin("HotelAdmin"),
        GovOfficalAdmin("GovOfficialAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        FactoryAdmin("FactoryAdmin"),
        FarmAdmin("FarmAdmin"),
        NGOAdmin("NGOAdmin"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
