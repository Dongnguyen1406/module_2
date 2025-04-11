package bai_tap.access_modifier.product_manager;

import java.util.Locale;
import java.util.Scanner;

public class ProductManager {
    private static Product[] products = new Product[10];
    
    Scanner sc = new Scanner(System.in);
    String number = "1234567890";
    static {
        products[0] = new Product(1, "May Giac", 100);
        products[1] = new Product(2, "May Tinh", 200);
        products[2] = new Product(3, "Tu Lanh", 150);
    }
    
    public void display(){
        for (int i = 0; i < products.length; i++){
            if(products[i] != null){
                System.out.println(products[i]);
            }
        }
    }
    
    public void add(){
        System.out.println("Nhập thông tin của sản phẩm: ");
        
        int id;
        while(true){
            System.out.println("Nhập ID của sản phẩm: ");
            String input = sc.nextLine().trim();
            try {
                id = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.printf("ID không hợp lệ. Vui lòng nhập lại !");
            }
        }
        
        String name;
        
        while(true){
            System.out.println("Nhập tên của sản phẩm: ");
            name = sc.nextLine();
            if (!name.contains(number)){
               break;
            } else {
                System.out.println("Tên chỉ chứa chữ cái, Vui lòng nhập lại!");
            }
        }
        
        int price;
        while(true){
            System.out.println("Nhập giá của sản phẩm: ");
            String input = sc.nextLine().trim();
            try {
                price = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("Gía không hợp lệ. Vui lòng nhập lại!");
            }
        }
        
        Product product = new Product(id, name, price);
        for (int i =0; i < products.length; i++){
            if(products[i] == null){
                products[i] = product;
                System.out.println("Đã thêm sản phẩm thành công!");
                return;
            } 
        }
        System.out.println("Không thể thêm sản phẩm: danh sách tối đa 10 sản phẩm!");
        
    }
    
    public void delete(){
        int id;
        while (true){
            System.out.println("Nhập ID của sản phẩm muốn xóa: ");
            String input = sc.nextLine();
            try {
                id = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("ID không hợp lệ. Vui lòng nhập lại!");
            }
        }
        for (int i = 0; i < products.length; i++){
            if (products[i] != null && id == products[i].getId()){
                products[i] = null;
                System.out.println("Đã xóa sản phẩm thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩmcó id này!");
    }
    
    public void edit(){
        int idUpdate;
        while(true){
            System.out.println("Nhập ID của sản phẩm muốn sửa: ");
            String input = sc.nextLine();
            try {
                idUpdate = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("ID không hợp lệ. Vui lòng nhập lại!");
            }
        }
        
        for (int i = 0; i < products.length; i++){
            if (products[i] != null && idUpdate == products[i].getId()){
                System.out.println("Nhập thông tin của sản phẩm muốn sửa:");
                int id;
                while(true){
                    System.out.println("Nhập ID mới: ");
                    String input = sc.nextLine().trim();
                    try {
                        id = Integer.parseInt(input);
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("ID không hợp lệ. Vui lòng nhập lại!");
                    }
                }
                
                String name = "";
                while(true){
                    System.out.println("Nhập tên của sản phẩm: ");
                    name = sc.nextLine();
                    if (!name.contains(number)){
                        break;
                    } else {
                        System.out.println("Tên chỉ chứa chữ cái, Vui lòng nhập lại!");
                    }
                }
                
                int price;
                while(true){
                    System.out.println("Nhập giá của sản phẩm: ");
                    String input = sc.nextLine();
                    try {
                        price = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Gía không hợp lệ. Vui lòng nhập lại!");
                    }
                }
                
                products[i].setId(id);
                products[i].setName(name);
                products[i].setPrice(price);
                System.out.println("Cập nhập sản phẩm thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID này!");
    }
    
}
