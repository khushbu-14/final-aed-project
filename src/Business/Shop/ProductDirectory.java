/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shop;

import Business.Hospital.Department.HospitalDepartment;
import Business.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class ProductDirectory {
    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }


    
     public Product addNewProduct(Product product) {
        productList.add(product);
        return product;
    }
    
           public void deleteProduct(Product prd){
        if(productList != null){
            productList.remove(prd);
        }
    }
           
    
}
