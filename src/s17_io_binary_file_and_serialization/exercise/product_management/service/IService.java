package excercise.product_management.service;

import excercise.product_management.Product;

import java.util.List;

public interface IService<O> {

    void addProduct(String path,Product product);

    List<O> displayProduct(String path);

}
