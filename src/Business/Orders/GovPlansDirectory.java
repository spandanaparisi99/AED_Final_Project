/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;

import Business.GovernmentOfficial.GovernmentOfficial;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author Swapnil
 */
public class GovPlansDirectory {
    private ArrayList<GovPlanOrder> orderList;
    private String status;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private UserAccount customerDetails;
    private GovernmentOfficial govOfficial;
    private String feedbackComment;

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }

    public ArrayList<GovPlanOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<GovPlanOrder> orderList) {
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
        GovPlansDirectory.count = count;
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

    public GovernmentOfficial getGovOfficial() {
        return govOfficial;
    }

    public void setGovOfficial(GovernmentOfficial govOfficial) {
        this.govOfficial = govOfficial;
    }
    
     public GovPlansDirectory() {
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

    public GovPlanOrder createOrder(String item, String price, String total, String hrs, GovernmentOfficial leg, UserAccount user) {
        GovPlanOrder order1 = new GovPlanOrder();
        order1.setItem(item);
        order1.setPrice(price);
        order1.setTime(hrs);
        order1.setTotal(total);
        govOfficial = leg;
        customerDetails = user;
        orderList.add(order1);
        return order1;
    }
}
