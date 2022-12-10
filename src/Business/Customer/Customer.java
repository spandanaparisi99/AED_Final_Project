/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.Orders.FactoryOrder;
import Business.Orders.FactoryOrderDirectory;
import Business.Orders.HotelOrderDirectory;
import Business.Orders.HotelOrder;

import Business.Orders.GroceryOrder;
import Business.Orders.GroceryOrderDirectory;

import Business.Orders.NGOPlanOrder;
import Business.Orders.NGOPlansDirectory;

import Business.Orders.GovPlanOrder;
import Business.Orders.GovPlansDirectory;

import Business.Orders.FarmOrder;
import Business.Orders.FarmOrdersDirectory;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raaga
 */
public class Customer {
    
     private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private String phone;
    private String Email;
    private String cardName;
    private String cardType;
    private String Network;
    private String cardNo;
    private String cardCVV;
    private String cardED;
    
    private UserAccount accountDetails = new UserAccount();
    
    private ArrayList<GroceryOrder> orderList;
    private ArrayList<GroceryOrderDirectory> orderDirectoryList;
    
    private ArrayList<NGOPlanOrder> ngoOrderList;
    private ArrayList<NGOPlansDirectory> ngoPlanDirectoryList;
    
    private ArrayList<GovPlanOrder> govOrderList;
    private ArrayList<GovPlansDirectory> govPlansDirectoryList;

    private ArrayList<FarmOrder> farmOrderList;
    private ArrayList<FarmOrdersDirectory> farmOrderDirectoryList;
    
    private ArrayList<HotelOrder> hotelorderList;
    private ArrayList<HotelOrderDirectory> hotelDirectoryList;
    
    private ArrayList<FactoryOrder> factoryOrderList;
    private ArrayList<FactoryOrderDirectory> factoryOrderDirectoryList;
    
     public Customer() {
        id = count;
        count++;
        
        orderList = new ArrayList<GroceryOrder>();
        orderDirectoryList = new ArrayList<GroceryOrderDirectory>();
        
        ngoOrderList = new ArrayList<NGOPlanOrder>();
        ngoPlanDirectoryList = new ArrayList<NGOPlansDirectory>();
        
        farmOrderList = new ArrayList<FarmOrder>();
        farmOrderDirectoryList = new ArrayList<FarmOrdersDirectory>();
        
        govOrderList = new ArrayList<GovPlanOrder>();
        govPlansDirectoryList = new ArrayList<GovPlansDirectory>();

        hotelorderList = new ArrayList<HotelOrder>();
        hotelDirectoryList = new ArrayList<HotelOrderDirectory>();
        
        factoryOrderList = new ArrayList<FactoryOrder>();
        factoryOrderDirectoryList = new ArrayList<FactoryOrderDirectory>();
    }
 
    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }

    public String getCardED() {
        return cardED;
    }

    public void setCardED(String cardED) {
        this.cardED = cardED;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public ArrayList<FarmOrder> getFarmorderList() {
        return farmOrderList;
    }

    public void setFarmorderList(ArrayList<FarmOrder> farmOrderList) {
        this.farmOrderList = farmOrderList;
    }

    public ArrayList<FarmOrdersDirectory> getFarmDirectoryList() {
        return farmOrderDirectoryList;
    }

    public ArrayList<GovPlanOrder> getgovOrderList() {
        return govOrderList;
    }

    public void setgovOrderList(ArrayList<GovPlanOrder> govOrderList) {
        this.govOrderList = govOrderList;
    }
    
     public ArrayList<HotelOrder> gethotelorderList() {
        return hotelorderList;
    }

    public void sethotelorderList(ArrayList<HotelOrder> hotelorderList) {
        this.hotelorderList = hotelorderList;
    }
    

    public void setFarmDirectoryList(ArrayList<FarmOrdersDirectory> farmOrderDirectoryList) {
        this.farmOrderDirectoryList = farmOrderDirectoryList;
    }
    
    public ArrayList<GovPlansDirectory> getGovorderDirectoryList() {
        return govPlansDirectoryList;
    }

    public void setGovorderDirectoryList(ArrayList<GovPlansDirectory> govPlansDirectoryList) {
        this.govPlansDirectoryList = govPlansDirectoryList;
    }

    public ArrayList<HotelOrderDirectory> getHotelorderDirectoryList() {
        return hotelDirectoryList;
    }

    public void setHotelorderDirectoryList(ArrayList<HotelOrderDirectory> hotelDirectoryList) {
        this.hotelDirectoryList = hotelDirectoryList;
    }

    public ArrayList<NGOPlanOrder> getNGOorderList() {
        return ngoOrderList;
    }

    public void setNGOorderList(ArrayList<NGOPlanOrder> ngoOrderList) {
        this.ngoOrderList = ngoOrderList;
    }

    public ArrayList<NGOPlansDirectory> getNGOorderDirectoryList() {
        return ngoPlanDirectoryList;
    }

    public void setNGOorderDirectoryList(ArrayList<NGOPlansDirectory> ngoPlanDirectoryList) {
        this.ngoPlanDirectoryList = ngoPlanDirectoryList;
    }

    public ArrayList<GroceryOrderDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<GroceryOrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    public ArrayList<GroceryOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<GroceryOrder> orderList) {
        this.orderList = orderList;
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
        Customer.count = count;
    }

    public ArrayList<NGOPlanOrder> getNgoOrderList() {
        return ngoOrderList;
    }

    public void setNgoOrderList(ArrayList<NGOPlanOrder> ngoOrderList) {
        this.ngoOrderList = ngoOrderList;
    }

    public ArrayList<NGOPlansDirectory> getNgoPlanDirectoryList() {
        return ngoPlanDirectoryList;
    }

    public void setNgoPlanDirectoryList(ArrayList<NGOPlansDirectory> ngoPlanDirectoryList) {
        this.ngoPlanDirectoryList = ngoPlanDirectoryList;
    }

    public ArrayList<GovPlanOrder> getGovOrderList() {
        return govOrderList;
    }

    public void setGovOrderList(ArrayList<GovPlanOrder> govOrderList) {
        this.govOrderList = govOrderList;
    }

    public ArrayList<GovPlansDirectory> getGovPlansDirectoryList() {
        return govPlansDirectoryList;
    }

    public void setGovPlansDirectoryList(ArrayList<GovPlansDirectory> govPlansDirectoryList) {
        this.govPlansDirectoryList = govPlansDirectoryList;
    }

    public ArrayList<FarmOrder> getFarmOrderList() {
        return farmOrderList;
    }

    public void setFarmOrderList(ArrayList<FarmOrder> farmOrderList) {
        this.farmOrderList = farmOrderList;
    }

    public ArrayList<FarmOrdersDirectory> getFarmOrderDirectoryList() {
        return farmOrderDirectoryList;
    }

    public void setFarmOrderDirectoryList(ArrayList<FarmOrdersDirectory> farmOrderDirectoryList) {
        this.farmOrderDirectoryList = farmOrderDirectoryList;
    }

    public ArrayList<HotelOrder> getHotelorderList() {
        return hotelorderList;
    }

    public void setHotelorderList(ArrayList<HotelOrder> hotelorderList) {
        this.hotelorderList = hotelorderList;
    }

    public ArrayList<HotelOrderDirectory> getHotelDirectoryList() {
        return hotelDirectoryList;
    }

    public void setHotelDirectoryList(ArrayList<HotelOrderDirectory> hotelDirectoryList) {
        this.hotelDirectoryList = hotelDirectoryList;
    }

    public ArrayList<FactoryOrder> getFactoryOrderList() {
        return factoryOrderList;
    }

    public void setFactoryOrderList(ArrayList<FactoryOrder> factoryOrderList) {
        this.factoryOrderList = factoryOrderList;
    }

    public ArrayList<FactoryOrderDirectory> getFactoryOrderDirectoryList() {
        return factoryOrderDirectoryList;
    }

    public void setFactoryOrderDirectoryList(ArrayList<FactoryOrderDirectory> factoryOrderDirectoryList) {
        this.factoryOrderDirectoryList = factoryOrderDirectoryList;
    }
    
}
