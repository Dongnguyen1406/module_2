package bai_tap.arraylist_linkedlist_java_collection_framework.service;

import bai_tap.arraylist_linkedlist_java_collection_framework.entity.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(int id, Product product);
    void deleteProduct(int id);
    List<Product> findAllProducts();
    List<Product> searchByName(String name);
    List<Product> sortByPriceAsc();
    List<Product> sortByPriceDesc();
}
