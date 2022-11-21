package excercise.use_arraylist_and_linkedlist_in_java_collection.use_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class ProductManager {
    private List<Product> productLinkedList = new LinkedList<>();

    public void add(Product product) {
        productLinkedList.add(product);
    }

    public void remove(int id) {
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getId() == id) {
                productLinkedList.remove(i);
            }
        }
    }

    public void edit(int idEdit, String name, int price, int id) {
        for (Product product : productLinkedList) {
            if (product.getId() == idEdit) {
                product.setName(name);
                product.setPrice(price);
                product.setId(id);
            }
        }
    }

    public void disPlay() {
        for (Product product : productLinkedList) {
            System.out.println(product);
        }
        System.out.println("");
    }

    public boolean search(String name) {
        for (Product product : productLinkedList) {
            if (Objects.equals(product.getName(), name)) {
                System.out.println("The product you are looking for is: " + product);
                return true;
            }
        }
        return false;
    }

    public void sortAscending() {
        PriceComparatorAscending ascending = new PriceComparatorAscending();
        Collections.sort(productLinkedList, ascending);
    }

    public void sortDescending() {
        PriceComparatorDescending descending = new PriceComparatorDescending();
        Collections.sort(productLinkedList, descending);
    }

    public static void main(String[] args) {
        ProductManager productManagerNew = new ProductManager();
        Product product1 = new Product("Moto1", 21, 1);
        Product product2 = new Product("Moto2", 22, 2);
        Product product3 = new Product("Moto3", 23, 3);
        Product product4 = new Product("Moto4", 24, 4);
        Product product5 = new Product("Moto5", 25, 5);

        productManagerNew.add(product1);
        productManagerNew.add(product3);
        productManagerNew.add(product2);
        productManagerNew.add(product5);
        productManagerNew.add(product4);
        System.out.println("Before edit: ");
        productManagerNew.disPlay();
        System.out.println(productManagerNew.search("Car2"));
        productManagerNew.edit(2, "CarNew", 100, 2);
        System.out.println("After edit: ");
        productManagerNew.disPlay();
        System.out.println(productManagerNew.search("Car2"));
        productManagerNew.remove(2);
        System.out.println("After remove: ");
        productManagerNew.disPlay();
        productManagerNew.sortAscending();
        System.out.println("After sort ascending by price: ");
        productManagerNew.disPlay();
        productManagerNew.sortDescending();
        System.out.println("After sort descending by price: ");
        productManagerNew.disPlay();
    }
}
