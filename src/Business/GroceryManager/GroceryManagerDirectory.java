/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GroceryManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raaga
 */
public class GroceryManagerDirectory {
    private ArrayList<GroceryManager> groceryManagerList;
    
    public GroceryManagerDirectory() {
        groceryManagerList = new ArrayList();
    }

    public ArrayList<GroceryManager> getGroceryManagerList() {
        return groceryManagerList;
    }
    
     public void setCustomerList(ArrayList<GroceryManager> groceryManagerList) {
        this.groceryManagerList = groceryManagerList;
    }
    
    public Boolean deleteGroceryManager(String name) {
        for(int i = 0; i < groceryManagerList.size(); i ++) {
            if(groceryManagerList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(groceryManagerList.get(i).getAccountDetails().getUsername());
                groceryManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public GroceryManager createGroceryManager(String name, UserAccount ua, String phone, String address, String Network){
        GroceryManager cust = new GroceryManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setNetwork(Network);
        groceryManagerList.add(cust);
        return cust;
    }
}
