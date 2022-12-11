/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FarmManager;

/**
 *
 * @author RAJAS
 */
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

public class FarmManagerDirectory {
    private ArrayList<FarmManager> FarmManagerList;
    
    public FarmManagerDirectory() {
        FarmManagerList = new ArrayList();
    }

    public ArrayList<FarmManager> getFarmManagerList() {
        return FarmManagerList;
    }
    
     public void setCustomerList(ArrayList<FarmManager> MaidManagerList) {
        this.FarmManagerList = MaidManagerList;
    }
    
    public Boolean deleteFarmManager(String name) {
        for(int i = 0; i < FarmManagerList.size(); i ++) {
            if(FarmManagerList.get(i).getName().equals(name)) {
                FarmManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public FarmManager createFarmManager(String name, UserAccount ua, String phone, String gender , String address, String Network){
        FarmManager cust = new FarmManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setGender(gender);
        cust.setNetwork(Network);
        FarmManagerList.add(cust);
        return cust;
    }
}
