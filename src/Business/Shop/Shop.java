/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shop;

import Business.Hospital.Department.HospitalDepartment;
import Business.Role.HospitalDepartmentRole;
import Business.Role.ShopsRole;
import java.util.ArrayList;
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
    private ArrayList<Product> productList;

    public Shop(String userName, String password, String shopName, String shopType, String contactNo, String address, String email, String zipcode) {
        UUID uid = UUID.randomUUID();
        this.shopId = uid.toString();
        this.shopName = shopName;
        this.shopType = shopType;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
        this.zipcode = zipcode;
        setPassword(password);
        setUsername(userName);
        setRole(new ShopsRole());
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
    
     public ArrayList<Product> getProductList() {
        if(productList==null){
        productList = new ArrayList<>();
        }
        return productList;
    }
   
     @Override
    public String toString() {
        return shopName;
    }
    
     public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addNewProduct(String productName,Double calories, Double price, String description){
        Product product = new Product(productName,calories,price,description);
        productList.add(product);
        return product;
    }

//     public void deleteProduct(String productID){
//         Product product=null;
//         for(Product pr: productList){
//         if(pr.getProductId().equals(productID)){
//             product=pr;
//         }
//         }
//         productList.remove(product);
//     }
      public void deleteProduct(Product prd){
        if(productList != null){
            productList.remove(prd);
        }
    }
     
     public Product getProductById(String id){
         Product product = null;
         for(Product prd: productList){
             if(prd.getProductId().equals(id)){
                 product = prd;
             }    
         }
         return product;
     }

      public void updateProductById(String productID, String productName,Double calories, Double price, String description){
          Product product = getProductById(productID);
          product.setProductName(productName);
          product.setCalories(calories);
          product.setPrice(price);
          product.setDescription(description);
      }
      
}
