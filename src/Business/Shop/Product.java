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
public class Product {
    private String productId;
    private String productName;
    private Double calories;
    private Double price;
    private String description;
    private Boolean isPrescriptionNeeded;

    public Product(String productName, Double calories, Double price, String description,Boolean isPrescriptionNeeded) {
        UUID uid = UUID.randomUUID();
        this.productId = uid.toString();
        this.productName = productName;
        this.calories = calories;
        this.price = price;
        this.description = description;
        this.isPrescriptionNeeded = isPrescriptionNeeded;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsPrescriptionNeeded() {
        return isPrescriptionNeeded;
    }

    public void setIsPrescriptionNeeded(Boolean isPrescriptionNeeded) {
        this.isPrescriptionNeeded = isPrescriptionNeeded;
    }
     
    
     @Override
    public String toString() {
        return productName;
    }
}
