package product_manager.service;

import product_manager.entity.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    boolean updateProduct(int id, Product product);
    boolean deleteProduct(int id);
    List<Product> findAllProducts();
    List<Product> searchByName(String name);
    List<Product> sortByPriceAsc();
    List<Product> sortByPriceDesc();
}
