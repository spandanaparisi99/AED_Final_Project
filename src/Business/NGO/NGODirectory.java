/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGO;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raaga
 */
public class NGODirectory {
    private ArrayList<NGO> ngoList;
    
    public NGODirectory() {
        ngoList = new ArrayList();
    }

    public ArrayList<NGO> getNGOList() {
        return ngoList;
    }
    
     public void setNGOList(ArrayList<NGO> ngoList) {
        this.ngoList = ngoList;
    }
    
    public void deleteNGO(String name) {
        for(int i = 0; i < ngoList.size(); i ++) {
            if(ngoList.get(i).getName().equals(name)) {
                ngoList.remove(i);
            }
        }
    }
    
    public NGO createNGO(String name, UserAccount ua, String phone, String address, String Email, String Network){
        NGO cust = new NGO();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setEmail(Email);
        cust.setNetwork(Network);
        ngoList.add(cust);
        return cust;
    }
    
}
