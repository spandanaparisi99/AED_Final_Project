/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FactoryOutlet;

import Business.Orders.FactoryOrder;
import Business.Orders.FactoryOrderDirectory;
import Business.FactoryManager.FactoryManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Swapnil
 */
public class Factory {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;    
    private String location;
    private String phone;
    private FactoryManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<FactoryOrder> orderList;
    private HashMap<String, ArrayList<FactoryOrder>> orders;
    private ArrayList<FactoryOrderDirectory> orderDirectoryList;
    private String Network;
    
     public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public ArrayList<FactoryOrderDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<FactoryOrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    public HashMap<String, ArrayList<FactoryOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<FactoryOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<FactoryOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<FactoryOrder> orderList) {
        this.orderList = orderList;
    }
    
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }
    
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public FactoryManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(FactoryManager managerDetails) {
        this.managerDetails = managerDetails;
    }
    
    public Factory() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<FactoryOrder>();
        orders = new HashMap<String, ArrayList<FactoryOrder>>();
        orderDirectoryList = new ArrayList<FactoryOrderDirectory>();
    }
    
    public String getManager() {
        return managerDetails.getName();
    }
    
    public void setMenuItem(String name, String value) {
        menu.put(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Factory.count = count;
    }
}
