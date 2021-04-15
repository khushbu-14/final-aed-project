/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shop;

import Business.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class ShopDirectory {
    private ArrayList<Shop> shopList;

    public ArrayList<Shop> getShopList() {
        if(shopList == null){
        shopList = new ArrayList<>();
        }
        return shopList;
    }

    public void setShopList(ArrayList<Shop> shopList) {
        this.shopList = shopList;
    }
    
    public Shop addNewShop(String shopName,String shopType, String contact, String address, String email, String zipcode, String userId, String password ){
        Shop shop = new Shop(shopName,shopType,contact,address,email,zipcode);
        shop.setUsername(userId);
        shop.setPassword(password);
        shopList.add(shop);
        return shop;
    }

//     public void deleteShop(String userName){
//         Shop shop=null;
//         for(Shop shp: shopList){
//         if(shp.getUsername().equals(userName)){
//             shop=shp;
//         }
//         }
//         shopList.remove(shop);
//     }
     
      public void deleteShop(Shop shp){
        if(shopList != null){
            shopList.remove(shp);
        }
    }
     
     public Shop getShopById(String id){
         Shop shop = null;
         for(Shop shp: shopList){
             if(shp.getShopId().equals(id)){
                 shop = shp;
             }    
         }
         return shop;
     }
      public Shop getShopByUserName(String userName){
         Shop shop = null;
         for(Shop shp: shopList){
             if(shp.getUsername().equals(userName)){
                 shop = shp;
             }    
         }
         return shop;
     }
      public void updateShopByUserName(String userName, String shopName,String shopType, String contact, String address, String email, String zipcode, String password){
          Shop shop = getShopByUserName(userName);
          shop.setShopName(shopName);
          shop.setShopType(shopType);
          shop.setContactNo(contact);
          shop.setAddress(address);
          shop.setEmail(email);
          shop.setZipcode(zipcode);    
          shop.setPassword(password);
      }
      
    
}
