/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hotel;

import Business.HotelManager.HotelManager;
import java.util.ArrayList;
/**
 *
 * @author Swapnil
 */
public class Hotel_Directory {
 private ArrayList<Hotel> restaurantList;
    
    public Hotel_Directory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Hotel> getHotelList() {
        return restaurantList;
    }
    
    public Boolean deleteHotel(String name) {
        for(int i = 0; i < restaurantList.size(); i ++) {
            if(restaurantList.get(i).getName().equals(name)) {
                restaurantList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Hotel createHotel(String name, HotelManager rm, String phone, String location, String Network){
        Hotel rest = new Hotel();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        restaurantList.add(rest);
        return rest;
    }   
}
