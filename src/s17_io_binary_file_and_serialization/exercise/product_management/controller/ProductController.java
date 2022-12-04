package excercise.product_management.controller;

import excercise.product_management.Product;
import excercise.product_management.service.impl.ProductImpl;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    ProductImpl productImpl = new ProductImpl();
    private final String PATH = "excercise/product_management/data/listProduct.csv";
    Scanner sc = new Scanner(System.in);
    void displayMainMenu(){
        System.out.println(
                "Main menu\n" +
                "1. Display product\n" +
                "2. Add new product\n" +
                "3. Find product"
           );
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    List<Product> displayProduct(){
        productImpl.displayProduct()
    }
}
