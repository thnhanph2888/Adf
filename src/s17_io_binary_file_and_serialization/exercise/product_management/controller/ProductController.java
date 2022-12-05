package exercise.product_management.controller;

import exercise.product_management.model.Product;
import exercise.product_management.service.impl.ProductImpl;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductImpl productImpl = new ProductImpl();
    public List<Product> displayProduct(String path){
       return productImpl.displayProduct(path);
    }

    public void addNewProduct(String path, Product product){
        productImpl.addProduct(path, product);
    }

    public String findProduct(int id, String path){
       return productImpl.findProduct(id, path);
    }

}
