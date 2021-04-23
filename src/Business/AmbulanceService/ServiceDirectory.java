/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AmbulanceService;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class ServiceDirectory {

    private ArrayList<Service> serviceList = new ArrayList<>();

    public ArrayList<Service> getServiceList() {
        if (serviceList == null) {
            serviceList = new ArrayList<>();
        }
        return serviceList;
    }

    public void setServiceList(ArrayList<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public Service addNewService(Service service) {
        serviceList.add(service);
        return service;
    }

    public void removeService(Service h) {
        if (serviceList != null) {
            serviceList.remove(h);
        }
    }
    
    public Service getServiceByName(String name){
        Service ser = null;
        if(serviceList != null){
            for(Service s: serviceList){
                if(s.getName().equalsIgnoreCase(name))
                    ser=s;
            }
        }  
        return ser;
    }
    
//     public Service getServiceBypatientName(String name){
//        Service ser = null;
//        if(serviceList != null){
//            for(Service s: serviceList){
//                if(s.getCustomerName().equalsIgnoreCase(name))
//                    ser=s;
//            }
//        }  
//        return ser;
//    }
 
}
