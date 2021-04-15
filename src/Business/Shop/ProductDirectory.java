/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shop;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class ProductDirectory {
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        if(productList==null){
        productList = new ArrayList<>();
        }
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addNewProduct(String productName,Double calories, Double price, String description){
        Product product = new Product(productName,calories,price,description);
        productList.add(product);
        return product;
    }

     public void deleteProduct(String productID){
         Product product=null;
         for(Product pr: productList){
         if(pr.getProductId().equals(productID)){
             product=pr;
         }
         }
         productList.remove(product);
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
