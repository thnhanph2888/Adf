package excercise.product_management.service.impl;

import excercise.product_management.Product;
import excercise.product_management.service.IService;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements IService<Product> {


    @Override
    public void addProduct(String path,Product product) {
        List<Product> listProduct = displayProduct(path);
        try {
            for (Product prd : listProduct) {
                if (prd.getId() == product.getId()) {
                    System.out.println("Product " + product.getName() + " really exist");
                }
            }
            listProduct.add(product);
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
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
        } catch (Exception e) {
            e.printStackTrace();
            if (listProduct.size() == 0) {
                System.out.println("List product is empty!");
            }
        }
        return listProduct;
    }

}
