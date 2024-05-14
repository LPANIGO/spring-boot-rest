/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leo.SBProject.repo;

//import java.sql.Connection;


import com.leo.SBProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;


/**
 *
 * @author Leo
 */
@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
          
    Product findByPname(String name); //has to match with column name
    
    
//    =====================================
//    ** JDBC implementation **
//    
//    Connection connection = null;
//    
//    public ProductDB(){
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/magnus", "root","1234");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    
//    public void save(Product p){
//        String query = "insert into product (pname, price, category) values (?,?,?) ";
//        try {
//            PreparedStatement st = connection.prepareStatement(query);
//            st.setString(1,p.getPname());
//            st.setInt(2,p.getPrice());
//            st.setString(3, p.getCategory());
//            st.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public List<Product> getAll() {
//        List<Product> products = new ArrayList<>();
//        String query = "select * from product";
//        try {
//            PreparedStatement st = connection.prepareStatement(query);
//            ResultSet rs = st.executeQuery();
//            while(rs.next()){
//                Product p = new Product();
//                p.setPname(rs.getString(2));
//                p.setPrice(rs.getInt(3));
//                p.setCategory(rs.getString(4));
//                products.add(p);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return products;
//    }
}
