/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Customer.CustomerDirectory; 

import Business.Orders.GroceryOrderDirectory;
import Business.Grocery.GroceryDirectory;
import Business.GroceryManager.GroceryManagerDirectory;

import Business.NGO.NGODirectory;

import Business.DeliveryMan.DeliveryManDirectory;

import Business.FactoryManager.FactoryManagerDirectory;
import Business.FactoryOutlet.FactoryDirectory;
import Business.Orders.FactoryOrderDirectory;

import Business.Orders.HotelOrderDirectory;
import Business.HotelManager.HotelManagerDirectory;
import Business.Hotel.Hotel_Directory;

import Business.Farms.FarmDirectory;
import Business.FarmManager.FarmManagerDirectory;

import Business.GovernmentOfficial.GovernmentOfficialDirectory;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
/**
 *
 * @author raaga
 */
public class EcoSystem extends Organization {
    
     private static EcoSystem business;
    
    private GroceryDirectory groceryDirectory;
    private GroceryManagerDirectory groceryManagerDirectory; 
    private GroceryOrderDirectory groceryOrderDirectory;
    
    private FarmDirectory farmDirectory;
    private FarmManagerDirectory farmManagerDirectory; 
    
    private CustomerDirectory customerDirectory;
    
    private NGODirectory NGODirectory;
    
    private DeliveryManDirectory deliveryManDirectory;
       
    
    private Hotel_Directory hotel_Directory;
    private HotelOrderDirectory hotelOrderDirectory;
    private HotelManagerDirectory hotelManagerDirectory; 
    
    private GovernmentOfficialDirectory govOfficialDirectory;
    
    private FactoryDirectory factoryDirectory;
    private FactoryManagerDirectory factoryManagerDirectory;
    private FactoryOrderDirectory factoryOrderDirectory;
    
     public EcoSystem(HotelOrderDirectory hotelOrderDirectory, HotelManagerDirectory hotelManagerDirectory, NGODirectory NGODirectory, 
            FarmManagerDirectory farmManagerDirectory, FarmDirectory farmDirectory, GroceryDirectory groceryDirectory, 
            GroceryOrderDirectory groceryOrderDirectory, GovernmentOfficialDirectory govOfficialDirectory, Hotel_Directory hotel_Directory, 
            CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, GroceryManagerDirectory groceryManagerDirectory,
            FactoryDirectory factoryDirectory, FactoryManagerDirectory factoryManagerDirectory, FactoryOrderDirectory factoryOrderDirectory) {
       
        this.groceryDirectory = groceryDirectory;
        this.groceryManagerDirectory = groceryManagerDirectory;
        this.groceryOrderDirectory = groceryOrderDirectory;
        
        this.farmDirectory = farmDirectory;
        this.farmManagerDirectory = farmManagerDirectory;
        
        this.customerDirectory = customerDirectory;
        
        this.NGODirectory = NGODirectory;
        
        this.deliveryManDirectory = deliveryManDirectory;
        
        this.govOfficialDirectory = govOfficialDirectory;
        
        this.hotelOrderDirectory = hotelOrderDirectory;
        this.hotel_Directory = hotel_Directory;
        this.hotelManagerDirectory = hotelManagerDirectory;
        
        this.factoryDirectory = factoryDirectory;
        this.factoryManagerDirectory = factoryManagerDirectory;
        this.factoryOrderDirectory = factoryOrderDirectory;
        
    }
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
    }

    public boolean checkIfUserIsUnique(String userName){
       return false;
    }
}
