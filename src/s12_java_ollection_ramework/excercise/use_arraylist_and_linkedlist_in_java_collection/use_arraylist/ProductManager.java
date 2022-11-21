package excercise.use_arraylist_and_linkedlist_in_java_collection.use_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class ProductManager {
    private List<Product> productArrayList = new ArrayList<>();

    public void add(Product product) {
        productArrayList.add(product);
    }

    public void remove(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.remove(i);
            }
        }
    }

    public void edit(int idEdit, String name, int price, int id) {
        for (Product product : productArrayList) {
            if (product.getId() == idEdit) {
                product.setName(name);
                product.setPrice(price);
                product.setId(id);
            }
        }
    }

    public void disPlay() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
        System.out.println("");
    }

    public boolean search(String name) {
        for (Product product : productArrayList) {
            if (Objects.equals(product.getName(), name)) {
                System.out.println("The product you are looking for is: " + product);
                return true;
            }
        }
        return false;
    }

    public void sortAscending() {
        PriceComparatorAscending ascending = new PriceComparatorAscending();
        Collections.sort(productArrayList, ascending);
    }

    public void sortDescending() {
        PriceComparatorDescending descending = new PriceComparatorDescending();
        Collections.sort(productArrayList, descending);
    }

    public static void main(String[] args) {
        ProductManager productManager2 = new ProductManager();
        Product product1 = new Product("Car1", 31, 1);
        Product product2 = new Product("Car2", 32, 2);
        Product product3 = new Product("Car3", 33, 3);
        Product product4 = new Product("Car4", 34, 4);
        Product product5 = new Product("Car5", 35, 5);

        productManager2.add(product1);
        productManager2.add(product3);
        productManager2.add(product2);
        productManager2.add(product5);
        productManager2.add(product4);
        System.out.println("Before edit: ");
        productManager2.disPlay();
        System.out.println(productManager2.search("Car2"));
        productManager2.edit(2, "CarNew", 100, 2);
        System.out.println("After edit: ");
        productManager2.disPlay();
        System.out.println(productManager2.search("Car2"));
        productManager2.remove(2);
        System.out.println("After remove: ");
        productManager2.disPlay();
        productManager2.sortAscending();
        System.out.println("After sort ascending by price: ");
        productManager2.disPlay();
        productManager2.sortDescending();
        System.out.println("After sort descending by price: ");
        productManager2.disPlay();
    }
}
