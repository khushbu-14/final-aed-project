/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class DeliveryManDirectory {

    private ArrayList<DeliveryMan> deliveryManList = new ArrayList<>();

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public DeliveryMan addNewDeliveryMan(DeliveryMan dm) {
        deliveryManList.add(dm);
        return dm;
    }

    public void deleteDeliveryMan(DeliveryMan dm) {
        if (deliveryManList != null) {
            deliveryManList.remove(dm);
        }
    }
}
