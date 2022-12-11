/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;


/**
 *
 * @author Swapnil
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliverymanList;

    public ArrayList<DeliveryMan> getDeliverymanList() {
        return deliverymanList;
    }

    public void setDeliverymanList(ArrayList<DeliveryMan> deliverymanList) {
        this.deliverymanList = deliverymanList;
    }
    
    public DeliveryManDirectory() {
        deliverymanList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryMan() {
        return deliverymanList;
    }
    
    public void deleteDeliveryMan(String name) {
        for(int i = 0; i < deliverymanList.size(); i ++) {
            if(deliverymanList.get(i).getName().equals(name)) {
                deliverymanList.remove(i);
            }
        }
    }
    
    public DeliveryMan createDeliveryMan(String name, UserAccount ua, String phone, String address, String Network){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName(name);
        deliveryMan.setAccountDetails(ua);
        deliveryMan.setAddress(address);
        deliveryMan.setPhone(phone);
        deliveryMan.setAvailable(true);
        deliveryMan.setNetwork(Network);
        deliverymanList.add(deliveryMan);
        return deliveryMan;
    }
}
