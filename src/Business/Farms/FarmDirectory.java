/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Farms;

import Business.FarmManager.FarmManager;
import java.util.ArrayList;

/**
 *
 * @author raaga
 */
public class FarmDirectory {
    
    private ArrayList<Farm> farmList;
    
    public FarmDirectory() {
        farmList = new ArrayList();
    }

    public ArrayList<Farm> getFarmList() {
        return farmList;
    }
    
    public Boolean deleteFarm(String name) {
        for(int i = 0; i < farmList.size(); i ++) {
            if(farmList.get(i).getName().equals(name)) {
                farmList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Farm createFarm(String name, FarmManager rm, String phone, String location, String Network){
        Farm rest = new Farm();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        farmList.add(rest);
        return rest;
    }
    
}
