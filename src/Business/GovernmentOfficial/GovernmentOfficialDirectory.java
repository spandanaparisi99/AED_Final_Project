/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GovernmentOfficial;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author Swapnil
 */
public class GovernmentOfficialDirectory {
  private ArrayList<GovernmentOfficial> govOfficialList;
    
    public GovernmentOfficialDirectory() {
        govOfficialList = new ArrayList();
    }

    public ArrayList<GovernmentOfficial> getGovOfficialList() {
        return govOfficialList;
    }
    
     public void setCustomerList(ArrayList<GovernmentOfficial> govOfficialList) {
        this.govOfficialList = govOfficialList;
    }
    
    public void deleteGovOfficial(String name) {
        for(int i = 0; i < govOfficialList.size(); i ++) {
            if(govOfficialList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(govOfficialList.get(i).getAccountDetails().getUsername());
                
                govOfficialList.remove(i);
                System.out.println(govOfficialList.size() + "length 1");
//                return true;
            }
        }
//        return false;
    }
    
    public GovernmentOfficial createHospitalManager(String name, UserAccount ua, String phone, String address, String Network){
        GovernmentOfficial cust = new GovernmentOfficial();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setNetwork(Network);
        govOfficialList.add(cust);
        return cust;
    }  
}
