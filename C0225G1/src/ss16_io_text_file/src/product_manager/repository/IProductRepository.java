package product_manager.repository;

import product_manager.entity.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);
//    void updateProduct(int id, Product product);
//    void deleteProduct(int id);
    boolean updateProduct(int id, Product product);
    boolean deleteProduct(int id);

    List<Product> findAllProducts();
    List<Product> searchByName(String name);
    List<Product> sortByPriceAsc();
    List<Product> sortByPriceDesc();
}
