package product_manager.service;

import product_manager.entity.Product;
import product_manager.repository.IProductRepository;
import product_manager.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private final IProductRepository repository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public boolean updateProduct(int id, Product product) {
        return repository.updateProduct(id, product);
    }

    @Override
    public boolean deleteProduct(int id) {
        return repository.deleteProduct(id);
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

