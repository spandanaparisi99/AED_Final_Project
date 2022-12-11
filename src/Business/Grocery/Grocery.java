/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Grocery;

import Business.Orders.GroceryOrder;
import Business.Orders.GroceryOrderDirectory;
import Business.GroceryManager.GroceryManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author RAJAS
 */
public class Grocery {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;    
    private String location;
    private String phone;
    private GroceryManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<GroceryOrder> orderList;
    private HashMap<String, ArrayList<GroceryOrder>> orders;
    private ArrayList<GroceryOrderDirectory> orderDirectoryList;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public ArrayList<GroceryOrderDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<GroceryOrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    public HashMap<String, ArrayList<GroceryOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<GroceryOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<GroceryOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<GroceryOrder> orderList) {
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

    public GroceryManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(GroceryManager managerDetails) {
        this.managerDetails = managerDetails;
    }
    
    public Grocery() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<GroceryOrder>();
        orders = new HashMap<String, ArrayList<GroceryOrder>>();
        orderDirectoryList = new ArrayList<GroceryOrderDirectory>();
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
        Grocery.count = count;
    }
   
    
    
}
