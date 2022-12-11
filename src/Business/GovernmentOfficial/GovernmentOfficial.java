/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GovernmentOfficial;

import Business.Orders.GovPlanOrder;
import Business.Orders.GovPlansDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Swapnil
 */
public class GovernmentOfficial {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private String phone;
    private UserAccount accountDetails;
    private HashMap<String, String> menu;
    private ArrayList<GovPlanOrder> orderList;
    private HashMap<String, ArrayList<GovPlanOrder>> orders;
    private ArrayList<GovPlansDirectory> orderDirectoryList;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }
    
    public ArrayList<GovPlansDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<GovPlansDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
     public HashMap<String, ArrayList<GovPlanOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<GovPlanOrder>> orders) {
        this.orders = orders;
    }
    
    public UserAccount getAccountDetails() {
        return accountDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setAccountDetails(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
    }
    
    public ArrayList<GovPlanOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<GovPlanOrder> orderList) {
        this.orderList = orderList;
    }
    
    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }
    
    public GovernmentOfficial() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<GovPlanOrder>();
        orders = new HashMap<String, ArrayList<GovPlanOrder>>();
        orderDirectoryList = new ArrayList<GovPlansDirectory>();
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
        GovernmentOfficial.count = count;
    }
}
