/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.NGO.NGODirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business.FactoryManager.FactoryManagerDirectory;
import Business.FactoryOutlet.FactoryDirectory;
import Business.Orders.GroceryOrderDirectory;
import Business.Orders.HotelOrderDirectory;
import Business.Grocery.GroceryDirectory;
import Business.GroceryManager.GroceryManagerDirectory;
import Business.Farms.FarmDirectory;
import Business.FarmManager.FarmManagerDirectory;
import Business.Hotel.Hotel_Directory;
import Business.HotelManager.HotelManagerDirectory;
import Business.GovernmentOfficial.GovernmentOfficialDirectory;
import Business.Orders.FactoryOrderDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.createNetwork;
import java.util.ArrayList;

/**
 *
 * @author Swapnil
 */
public abstract class Organization {
    private String name;
    
    private WorkQueue workQueue;
    
    private EmployeeDirectory employeeDirectory;    
    
    private GroceryDirectory groceryDirectory;  
    private GroceryManagerDirectory groceryManagerDirectory;
    private GroceryOrderDirectory groceryOrderDirectory;
    
    private FarmDirectory farmDirectory;  
    private FarmManagerDirectory farmManagerDirectory;
    
    private CustomerDirectory customerDirectory;
    
    private NGODirectory ngoDirectory;
    
    private UserAccountDirectory userAccountDirectory;
    
    private createNetwork createNetwork;
    
    private int organizationID;
    
    private static int counter=0;
    
    private DeliveryManDirectory deliveryManDirectory;  
    
    private HotelOrderDirectory hotelDirectory;
    private Hotel_Directory hotel_Directory;
    private HotelManagerDirectory hotelManagerDirectory;
    
    private GovernmentOfficialDirectory govOfficialDirectory;
    
    private FactoryDirectory factoryDirectory;
    private FactoryManagerDirectory factoryManagerDirectory;
    private FactoryOrderDirectory factoryOrderDirectory;
    
}
