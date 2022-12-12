/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;

import Business.NGO.NGO;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author Swapnil
 */
public class NGOPlansDirectory {
    private ArrayList<NGOPlanOrder> orderList;
    private String status;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private UserAccount customerDetails;
    private NGO ngo;

    public ArrayList<NGOPlanOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<NGOPlanOrder> orderList) {
        this.orderList = orderList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        NGOPlansDirectory.count = count;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserAccount getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(UserAccount customerDetails) {
        this.customerDetails = customerDetails;
    }

    public NGO getNGO() {
        return ngo;
    }

    public void setNGO(NGO ngo) {
        this.ngo = ngo;
    }
    
     public NGOPlansDirectory() {
        id = count;
        count++;
        orderList = new ArrayList();
        status = "Placed";
        comment = "";        
        isAccept = false;
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

    public NGOPlanOrder createOrder(String item, String price, NGO leg, UserAccount user) {
        NGOPlanOrder order1 = new NGOPlanOrder();
        order1.setItem(item);
        order1.setPrice(price);
        ngo = leg;
        customerDetails = user;
        orderList.add(order1);
        return order1;
    }
}
