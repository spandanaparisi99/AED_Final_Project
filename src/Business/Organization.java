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
    
    public enum Type{
        HotelAdmin("HotelAdmin"),
        GroceryAdmin("GroceryAdmin"),
        FarmAdmin("FarmAdmin"),
        GovAdmin("GovAdmin"),
        Customer("Customer"),
        NGO("NGOAdmin"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        Factory("FactoryAdmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        
        workQueue = new WorkQueue();
        
        employeeDirectory = new EmployeeDirectory();
        
        userAccountDirectory = new UserAccountDirectory();
        
        createNetwork = new createNetwork();
        
        groceryDirectory = new GroceryDirectory();
        groceryManagerDirectory = new GroceryManagerDirectory();
        groceryOrderDirectory = new GroceryOrderDirectory();
        
        farmDirectory = new FarmDirectory();
        farmManagerDirectory = new FarmManagerDirectory();
        
        hotelDirectory = new HotelOrderDirectory();
        hotel_Directory = new Hotel_Directory();
        hotelManagerDirectory = new HotelManagerDirectory();
        
        deliveryManDirectory = new DeliveryManDirectory();  
        
        govOfficialDirectory = new GovernmentOfficialDirectory();
        
        customerDirectory = new CustomerDirectory();
        
        ngoDirectory = new NGODirectory(); 
        
        factoryDirectory = new FactoryDirectory();
        factoryManagerDirectory = new FactoryManagerDirectory();
        factoryOrderDirectory = new FactoryOrderDirectory();
        
        organizationID = counter;
        ++counter;
    }
    
    public Organization(){
        System.out.println("organization..");
    }

    public FarmDirectory getFarmDirectory() {
        return farmDirectory;
    }

    public FarmManagerDirectory getFarmManagerDirectory() {
        return farmManagerDirectory;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public GroceryOrderDirectory getOrderDirectory() {
        return groceryOrderDirectory;
    }

    public HotelOrderDirectory getHotelDirectory() {
        return hotelDirectory;
    }

    public HotelManagerDirectory getHotelManagerDirectory() {
        return hotelManagerDirectory;
    }
    
    public GovernmentOfficialDirectory getGovOfficialDirectory() {
        return govOfficialDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setGroceryDirectory(GroceryDirectory groceryDirectory) {
        this.groceryDirectory = groceryDirectory;
    }

    public void setFarmDirectory(FarmDirectory farmDirectory) {
        this.farmDirectory = farmDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public void setNGODirectory(NGODirectory ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public void setGroceryManagerDirectory(GroceryManagerDirectory groceryManagerDirectory) {
        this.groceryManagerDirectory = groceryManagerDirectory;
    }

    public void setFarmManagerDirectory(FarmManagerDirectory farmManagerDirectory) {
        this.farmManagerDirectory = farmManagerDirectory;
    }

    public void setHotelDirectory(HotelOrderDirectory hotelDirectory) {
        this.hotelDirectory = hotelDirectory;
    }

    public void setHotel_Directory(Hotel_Directory hotel_Directory) {
        this.hotel_Directory = hotel_Directory;
    }

    public void setHotelManagerDirectory(HotelManagerDirectory hotelManagerDirectory) {
        this.hotelManagerDirectory = hotelManagerDirectory;
    }

    public void setGovOfficialDirectory(GovernmentOfficialDirectory govOfficialDirectory) {
        this.govOfficialDirectory = govOfficialDirectory;
    }

    public void setOrderDirectory(GroceryOrderDirectory orderDirectory) {
        this.groceryOrderDirectory = orderDirectory;
    }
    
    public GroceryDirectory getGroceryDirectory() {
        return groceryDirectory;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public NGODirectory getNGODirectory() {
        return ngoDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public createNetwork getcreateNetwork() {
        return createNetwork;
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public GroceryManagerDirectory getGroceryManagerDirectory() {
        return groceryManagerDirectory;
    }
    
    public Hotel_Directory getHotel_Directory() {
        return hotel_Directory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public FactoryDirectory getFactoryDirectory() {
        return factoryDirectory;
    }

    public void setFactoryDirectory(FactoryDirectory factoryDirectory) {
        this.factoryDirectory = factoryDirectory;
    }

    public FactoryManagerDirectory getFactoryManagerDirectory() {
        return factoryManagerDirectory;
    }

    public void setFactoryManagerDirectory(FactoryManagerDirectory factoryManagerDirectory) {
        this.factoryManagerDirectory = factoryManagerDirectory;
    }

    public GroceryOrderDirectory getGroceryOrderDirectory() {
        return groceryOrderDirectory;
    }

    public void setGroceryOrderDirectory(GroceryOrderDirectory groceryOrderDirectory) {
        this.groceryOrderDirectory = groceryOrderDirectory;
    }

    public NGODirectory getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(NGODirectory ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }

    public createNetwork getCreateNetwork() {
        return createNetwork;
    }

    public void setCreateNetwork(createNetwork createNetwork) {
        this.createNetwork = createNetwork;
    }

    public FactoryOrderDirectory getFactoryOrderDirectory() {
        return factoryOrderDirectory;
    }

    public void setFactoryOrderDirectory(FactoryOrderDirectory factoryOrderDirectory) {
        this.factoryOrderDirectory = factoryOrderDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
}
