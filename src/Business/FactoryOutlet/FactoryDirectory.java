/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FactoryOutlet;

import Business.FactoryManager.FactoryManager;
import java.util.ArrayList;

/**
 *
 * @author Swapnil
 */
public class FactoryDirectory {
    private ArrayList<Factory> factoryList;
    
    public FactoryDirectory() {
        factoryList = new ArrayList();
    }

    public ArrayList<Factory> getFactoryList() {
        return factoryList;
    }
    
    public Boolean deleteFactory(String name) {
        for(int i = 0; i < factoryList.size(); i ++) {
            if(factoryList.get(i).getName().equals(name)) {
                factoryList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    public Factory createFactory(String name, FactoryManager fm, String phone, String location, String Network){
        Factory rest = new Factory();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(fm);
        rest.setNetwork(Network);
        rest.setUserAccount(fm.getAccountDetails());
        factoryList.add(rest);
        return rest;
    }
}
