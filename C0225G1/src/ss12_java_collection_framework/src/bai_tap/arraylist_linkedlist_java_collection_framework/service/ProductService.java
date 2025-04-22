package bai_tap.arraylist_linkedlist_java_collection_framework.service;

import bai_tap.arraylist_linkedlist_java_collection_framework.entity.Product;
import bai_tap.arraylist_linkedlist_java_collection_framework.repository.IProductRepository;
import bai_tap.arraylist_linkedlist_java_collection_framework.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private final IProductRepository repository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        repository.updateProduct(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        repository.deleteProduct(id);
    }

    @Override
    public List<Product> findAllProducts() {
        return repository.findAllProducts();
    }

    @Override
    public List<Product> searchByName(String name) {
        return repository.searchByName(name);
    }

    @Override
    public List<Product> sortByPriceAsc() {
        return repository.sortByPriceAsc();
    }

    @Override
    public List<Product> sortByPriceDesc() {
        return repository.sortByPriceDesc();
    }
}
