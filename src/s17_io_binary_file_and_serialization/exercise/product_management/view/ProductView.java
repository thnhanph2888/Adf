package exercise.product_management.view;

import exercise.product_management.controller.ProductController;
import exercise.product_management.model.Product;
import exercise.product_management.service.impl.ProductImpl;

import java.util.Scanner;

public class ProductView {


    private final String PATH = "exercise/product_management/data/listProduct.csv";
    private Scanner sc = new Scanner(System.in);

    private ProductController productController = new ProductController();
    public void displayMainMenu(){
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
                System.out.println(productController.displayProduct(PATH));
                break;
            case 2:
                System.out.println("Enter id product: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Enter name product: ");
                String name = sc.nextLine();
                System.out.println("Enter brand product: ");
                String brand = sc.nextLine();
                System.out.println("Enter price product: ");
                Double price = Double.parseDouble(sc.nextLine());
                System.out.println("Enter describe product: ");
                String describe = sc.nextLine();
                productController.addNewProduct(PATH, new Product(id,name,brand,price,describe));
                break;
            case 3:
                System.out.println("Enter product id to search: ");
                int idSearch = Integer.parseInt(sc.nextLine());
                System.out.println(productController.findProduct(idSearch, PATH));
                break;
        }
    }

    public static void main(String[] args) {
        ProductView productView = new ProductView();
        productView.displayMainMenu();

    }
}
