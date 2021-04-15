/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shop;

import java.util.UUID;

/**
 *
 * @author kunal
 */
public class Shop extends Business.UserAccount.UserAccount {
    private String shopId;
    private String shopName;
    private String shopType;
    private String contactNo;
    private String address;
    private String zipcode;
    private String email;

    public Shop(String shopName, String shopType, String contactNo, String address, String email, String zipcode) {
         UUID uid = UUID.randomUUID();
        this.shopId = uid.toString();
        this.shopName = shopName;
        this.shopType = shopType;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
        this.zipcode = zipcode;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
     @Override
    public String toString() {
        return shopName;
    }
    
}
