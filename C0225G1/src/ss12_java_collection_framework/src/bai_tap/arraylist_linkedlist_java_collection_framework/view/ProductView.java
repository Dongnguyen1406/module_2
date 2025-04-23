package bai_tap.arraylist_linkedlist_java_collection_framework.view;

import bai_tap.arraylist_linkedlist_java_collection_framework.entity.Product;
import bai_tap.arraylist_linkedlist_java_collection_framework.service.IProductService;
import bai_tap.arraylist_linkedlist_java_collection_framework.service.ProductService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static IProductService service = new ProductService();
    private static Scanner sc = new Scanner(System.in);

    public static void addProduct(){
        System.out.println("Nhập ID của sản phầm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên của sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá của sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());

        service.addProduct(new Product(id, name, price));
    }

    public static void updateProduct(){
        System.out.println("Nhập id của sản phẩm muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Tên mới: ");
        String name = sc.nextLine();
        System.out.println("Gía mới: ");
        Double price = Double.parseDouble(sc.nextLine());

        service.updateProduct(id, new Product(id, name, price));
    }

    public static void deleteProduct(){
        System.out.println("Nhập id của sản phẩm muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        
        

        System.out.println("Bạn có chắc chắn xóa sản phẩm này không (Có/Không)?");
        String confirm = sc.nextLine().trim().toLowerCase();
        if(confirm.equals("có")){
            service.deleteProduct(id);
            System.out.println("Đã xóa sản phẩm có ID: " + id);
        } else {
            System.out.println("Đã hủy xóa!");
        }
        
    }

    public static void displayProducts() {
        List<Product> products = service.findAllProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }


    public static void searchProduct() {
        System.out.print("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        List<Product> products = service.searchByName(name);
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static void sortAscending() {
        List<Product> products = service.findAllProducts();
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static void sortDescending() {
        List<Product> products = service.findAllProducts();
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }
}
