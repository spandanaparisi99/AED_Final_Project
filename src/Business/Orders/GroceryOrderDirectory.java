/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;

import Business.DeliveryMan.DeliveryMan;
import Business.Grocery.Grocery;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author Swapnil
 */
public class GroceryOrderDirectory {
    private ArrayList<GroceryOrder> orderList;
    private String status;
    private DeliveryMan deliveryMan;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private String feedbackComment;
    private UserAccount customerDetails;
    private Grocery grocery;

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserAccount getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(UserAccount customerDetails) {
        this.customerDetails = customerDetails;
    }

    public Grocery getGrocery() {
        return grocery;
    }

    public void setGrocery(Grocery grocery) {
        this.grocery = grocery;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public GroceryOrderDirectory() {
        id = count;
        count++;
        orderList = new ArrayList();
        deliveryMan = new DeliveryMan();
        status = "Placed";
        comment = "";        
        feedbackComment = "";
        isAccept = false;
    }

    public ArrayList<GroceryOrder> getOrderList() {
        return orderList;
    }

    public void deleteOrder(String name) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getItem().equals(name)) {
                orderList.remove(i);
                return;
            }
        }
    }

    public void deleteOrderAll() {
        for (int i = 0; i < orderList.size(); i++) {
            orderList.remove(i);
        }
    }

    public GroceryOrder createOrder(String item, String price, int quantity, Grocery rest, UserAccount user) {
        GroceryOrder order = new GroceryOrder();
        order.setItem(item);
        order.setPrice(price);
        order.setQuantity(quantity);
        grocery = rest;
        customerDetails = user;
        orderList.add(order);
        return order;
    }
}
