package bai_tap.arraylist_linkedlist_java_collection_framework.repository;

import bai_tap.arraylist_linkedlist_java_collection_framework.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        productList.add(new Product(1, "Laptop Dell", 1500));
        productList.add(new Product(2, "Điện thoại Samsung", 1000));
        productList.add(new Product(3, "Tai nghe Sony", 1500));
        productList.add(new Product(4, "Chuột Logitech", 7000));
        productList.add(new Product(5, "Bàn phím cơ", 1200));
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
    }
    
    

    @Override
    public void deleteProduct(int id) {
//        productList.removeIf(p -> p.getId() == id);
        for (int i = 0; i < productList.size(); i++){
            if(productList.get(i).getId() == id){
                productList.remove(i);
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Ko tìm thấy");
    }

    @Override
    public List<Product> findAllProducts() {
        return productList;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public List<Product> sortByPriceAsc() {
        List<Product> sorted = new ArrayList<>(productList);
//      sorted.sort(Comparator.comparingDouble(Product::getPrice));
        for (int i = 0; i < productList.size() - 1; i++){
            for (int j = i+1; j < sorted.size(); j++){
                if (sorted.get(i).getPrice() > sorted.get(i).getPrice()){
                    Product temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
        return sorted;
    }

    @Override
    public List<Product> sortByPriceDesc() {
        List<Product> sorted = new ArrayList<>(productList);
//      sorted.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        for (int i = 0; i < productList.size(); i++){
            for (int j = i + 1; j < sorted.size(); j++){
                if (sorted.get(i).getPrice() < sorted.get(i).getPrice()){
                    Product temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(i, temp);
                }
            }
        }
        return sorted;
    }
}
