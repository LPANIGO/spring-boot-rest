/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leo.SBProject.service;

import com.leo.SBProject.repo.ProductDB;
import com.leo.SBProject.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leo
 */
@Service
public class ProductService {
    
    List<Product> products = new ArrayList();
    
    @Autowired
    ProductDB db;
    
    public List<Product> getAllProducts(){   
//        return db.getAll();
        return db.findAll();
    }
    
    public Product getProduct(String name){
//        for(Product p : products){
//            if(p.getPname().equals(name)){
//                return p;
//            }
//        }
        return db.findByPname(name);
    }
    
    public void addProduct(Product p){
//        products.add(p);
        db.save(p);
        
    } 

    public List<Product> getProductsWithText(String text) {
        List<Product> productsText = new ArrayList<>();
        for(Product p : this.products){
            String name = p.getPname().toLowerCase();
            String category = p.getCategory().toLowerCase();
            if(name.contains(text) || category.contains(text)){
                productsText.add(p);
            }
        }
        return productsText;
    }
}
