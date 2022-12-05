package exercise.product_management.service;

import exercise.product_management.model.Product;

import java.util.List;

public interface IService<O> {

    void addProduct(String path,Product product);

    List<O> displayProduct(String path);

    String findProduct(int id, String path);
}
