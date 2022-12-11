/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DeliveryMan;

import Business.Orders.FactoryOrderDirectory;
import Business.Orders.FarmOrdersDirectory;
import Business.Orders.HotelOrderDirectory;
import Business.Orders.GroceryOrderDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Swapnil
 */
public class DeliveryMan {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private String phone;
    private boolean available;
    private UserAccount accountDetails = new UserAccount();
    private ArrayList<GroceryOrderDirectory> groceryOrderList;
    private ArrayList<HotelOrderDirectory> hotelOrderList;
    private ArrayList<FactoryOrderDirectory> factoryOrderList;
    private ArrayList<FarmOrdersDirectory> farmOrderDirectoryList;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network){
        this.Network = Network;
    }

    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public ArrayList<HotelOrderDirectory> getHotelOrderLists(){
        return hotelOrderList;
    }

    public void setHotelOrderLists(ArrayList<HotelOrderDirectory> orderLists){
        this.hotelOrderList = orderLists;
    }

    public ArrayList<GroceryOrderDirectory> getGroceryOrderList(){
        return groceryOrderList;
    }

    public void setGroceryOrderList(ArrayList<GroceryOrderDirectory> orderList){
        this.groceryOrderList = orderList;
    }

    public ArrayList<FactoryOrderDirectory> getFactoryOrderList(){
        return factoryOrderList;
    }

    public void setFactoryOrderList(ArrayList<FactoryOrderDirectory> factoryOrderList){
        this.factoryOrderList = factoryOrderList;
    }

    public UserAccount getAccountDetails(){
        return accountDetails;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getManagerName(){
        return managerName;
    }

    public void setManagerName(String managerName){
        this.managerName = managerName;
    }

    public void setAccountDetails(UserAccount accountDetails){
        this.accountDetails = accountDetails;
    }
    
    public DeliveryMan(){
        id = count;
        count++;
        groceryOrderList = new ArrayList<GroceryOrderDirectory>();
        hotelOrderList = new ArrayList<HotelOrderDirectory>();
        factoryOrderList = new ArrayList<FactoryOrderDirectory>();
        farmOrderDirectoryList = new ArrayList<FarmOrdersDirectory>();
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
        DeliveryMan.count = count;
    }

    public ArrayList<FarmOrdersDirectory> getFarmOrderDirectoryList() {
        return farmOrderDirectoryList;
    }

    public void setFarmOrderDirectoryList(ArrayList<FarmOrdersDirectory> farmOrderDirectoryList) {
        this.farmOrderDirectoryList = farmOrderDirectoryList;
    }
    
}
