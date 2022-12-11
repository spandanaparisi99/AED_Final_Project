/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FactoryManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raaga
 */
public class FactoryManagerDirectory {
    
    private ArrayList<FactoryManager> factoryManagerList;
    
    public FactoryManagerDirectory() {
        factoryManagerList = new ArrayList();
    }

    public ArrayList<FactoryManager> getFactoryManagerList() {
        return factoryManagerList;
    }
    
     public void setCustomerList(ArrayList<FactoryManager> factoryManagerList) {
        this.factoryManagerList = factoryManagerList;
    }
     
     public Boolean deleteFactoryManager(String name) {
        for(int i = 0; i < factoryManagerList.size(); i ++) {
            if(factoryManagerList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                factoryManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public FactoryManager createFactoryManager(String name, UserAccount ua, String phone, String address, String Network){
        FactoryManager cust = new FactoryManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setNetwork(Network);
        factoryManagerList.add(cust);
        return cust;
    }
    
}
