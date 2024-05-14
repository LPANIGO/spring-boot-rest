package com.leo.SBProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbProjectApplication {

    //controller(only req res) -> service (only logic) -> repo(only db queries)
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SbProjectApplication.class, args); //This is a spring container where objects are created.
        
//        ProductService productService = context.getBean(ProductService.class);
//        productService.addProduct(new Product("Intel I5 10400f", 100, "Processors"));

        
//        System.out.println("=======================================");
//        System.out.println("\nParticular product");
//        System.out.println(productService.getProduct("Ryzen 7 7700"));
//        
//        System.out.println("\n=======================================");
//        System.out.println("Particular text");
//        List<Product> productsText = productService.getProductsWithText("ryzen");
//        for(Product pt : productsText){
//            System.out.println(pt);
//        }
    }

}
