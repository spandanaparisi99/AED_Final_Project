/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Farms;

import Business.Orders.FarmOrder;
import Business.Orders.FarmOrdersDirectory;
import Business.FarmManager.FarmManager;
import Business.Orders.FarmOrder;
import Business.Orders.FarmOrdersDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author raaga
 */
public class Farm {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;    
    private String location;
    private String phone;
    private FarmManager managerDetails;
    private UserAccount userAccount;
    private HashMap<String, String> menu;
    private ArrayList<FarmOrder> orderList;
    private HashMap<String, ArrayList<FarmOrder>> orders;
    private ArrayList<FarmOrdersDirectory> orderDirectoryList;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public ArrayList<FarmOrdersDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<FarmOrdersDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    public HashMap<String, ArrayList<FarmOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<FarmOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<FarmOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<FarmOrder> orderList) {
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

    public FarmManager getManagerDetails() {
        return managerDetails;
    }

    public void setManagerDetails(FarmManager managerDetails) {
        this.managerDetails = managerDetails;
    }
    
    public Farm() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<FarmOrder>();
        orders = new HashMap<String, ArrayList<FarmOrder>>();
        orderDirectoryList = new ArrayList<FarmOrdersDirectory>();
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
        Farm.count = count;
    }
}
