package exercise.product_management.service.impl;

import exercise.product_management.model.Product;
import exercise.product_management.service.IService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements IService<Product> {


    @Override
    public void addProduct(String path,Product product) {
       List<Product> listProduct = displayProduct(path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Product prd : listProduct) {
                if (prd.getId() == product.getId()) {
                    System.out.println("Product " + product.getName() + " really exist");
                    return;
                }
            }
            listProduct.add(product);
            objectOutputStream.writeObject(listProduct);
            fileOutputStream.close();
            objectOutputStream.close();
            System.out.println("Successful add!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> displayProduct(String path) {
        List<Product> listProduct = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            listProduct = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }  catch (EOFException e) {
            if (listProduct.size() == 0) {
                System.out.println("List product is empty!");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    @Override
    public String findProduct(int id, String path) {
        List<Product> productList = displayProduct(path);
        for (Product prd : productList) {
            if (id == prd.getId()) {
                return prd.toString();
            }
        }
        return "Not found product";
    }

}
