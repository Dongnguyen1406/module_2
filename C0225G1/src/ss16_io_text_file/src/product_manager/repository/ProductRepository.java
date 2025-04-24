package product_manager.repository;

import product_manager.entity.Product;
import product_manager.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static List<Product> productList = new ArrayList<>();
    private final String PRODUCT_FILE = "src/product_manager/data/product.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
//    String[] arr;


//    public ProductRepository() {
//        productList.add(new Product(1, "Laptop Dell", 1500));
//        productList.add(new Product(2, "Điện thoại Samsung", 1000));
//        productList.add(new Product(3, "Tai nghe Sony", 1500));
//        productList.add(new Product(4, "Chuột Logitech", 7000));
//        productList.add(new Product(5, "Bàn phím cơ", 1200));
//    }

    @Override
    public void addProduct(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToFile());
        ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, APPEND);
//        productList.add(product);
    }
    
//    @Override
//    public void updateProduct(int id, Product product) {
//        for (Product p : productList) {
//            if (p.getId() == id) {
//                p.setName(product.getName());
//                p.setPrice(product.getPrice());
//                break;
//            }
//        }
//    }

    @Override
    public boolean updateProduct(int id, Product product) {
        List<Product> productList = findAllProducts();
        boolean check = false;
        for (Product p : productList){
            if (p.getId() == id){
                check = true;
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product p : productList){
            stringList.add(p.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND);
        return check;
    }

    @Override
    public boolean deleteProduct(int id) {
        List<Product> productList = findAllProducts();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                check = true;
                productList.remove(i);
                break;
            }
        }
        // chuyển productList => stringList
        List<String> stringList = new ArrayList<>();
        for (Product p: productList){
            stringList.add(p.getInfoToFile());
        }
        // ghi đè lại
        ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND);
        return check;
    }

//    @Override
//    public void deleteProduct(int id) {

    /// /        productList.removeIf(p -> p.getId() == id);
//        for (int i = 0; i < productList.size(); i++){
//            if(productList.get(i).getId() == id){
//                productList.remove(i);
//                System.out.println("Xóa thành công");
//                return;
//            }
//        }
//        System.out.println("Ko tìm thấy");
//    }
    @Override
    public List<Product> findAllProducts() {
        List<Product> productList = new ArrayList<>();
        // đọc file 
        List<String> stringList = ReadAndWriteFile.readFile(PRODUCT_FILE);
        // chuyển dữ liệu stringList sang productList
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Product product = new Product(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]));
            productList.add(product);
        }
        return productList;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = findAllProducts();
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
        List<Product> sorted = new ArrayList<>(findAllProducts());
//      sorted.sort(Comparator.comparingDouble(Product::getPrice));
        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = i + 1; j < sorted.size(); j++) {
                if (sorted.get(i).getPrice() > sorted.get(j).getPrice()){
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
        List<Product> sorted = new ArrayList<>(findAllProducts());
//      sorted.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        for (int i = 0; i < productList.size(); i++) {
            for (int j = i + 1; j < sorted.size(); j++) {
                if (sorted.get(i).getPrice() < sorted.get(i).getPrice()) {
                    Product temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(i, temp);
                }
            }
        }
        return sorted;
    }
}
