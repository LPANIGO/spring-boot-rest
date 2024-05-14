/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leo.SBProject.controller;

import com.leo.SBProject.model.Product;
import com.leo.SBProject.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leo
 */
@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @GetMapping("/products")
    public List<Product> getAllProducts(){
      return productService.getAllProducts();
    }
    
    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name){
      return productService.getProduct(name);
    }
    
    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        System.out.println(p);
        productService.addProduct(p);
    }
}
