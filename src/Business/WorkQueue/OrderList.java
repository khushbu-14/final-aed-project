/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author khushbu
 */
public class OrderList extends WorkRequest {

    private String orderId;
    private ArrayList<OrderItem> orderList = new ArrayList<OrderItem>();
    private Boolean isPickup;

    public OrderList() {
        UUID uid = UUID.randomUUID();
        orderId = uid.toString();
    }

    public ArrayList<OrderItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderItem> orderList) {
        this.orderList = orderList;
    }

    public OrderItem addOrderItem(OrderItem oi) {
        orderList.add(oi);
        return oi;
    }

    public void removeOrderItem(OrderItem oi) {
        orderList.remove(oi);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Boolean getIsPickup() {
        return isPickup;
    }

    public void setIsPickup(Boolean isPickup) {
        this.isPickup = isPickup;
    }

}
