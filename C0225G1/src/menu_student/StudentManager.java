package menu_student;

import java.util.Scanner;

public class StudentManager {
    private static Student[] students = new Student[100];
     Scanner sc= new Scanner(System.in);
    static {
        students[0] = new Student(1, "binh", 22);
        students[1] = new Student(2, "dong", 23);
        students[2] = new Student(3, "khanh", 24);
    }
    
    public void display(){
        for (int i =0; i<students.length; i++){
            if(students[i] != null){
                System.out.println(students[i]);
            } 
        }
    }
    public void add(){
        System.out.println("Nhap thong tin cua sinh vien moi: ");
        
        int id;
        while(true){
            System.out.println("Nhap id: ");
            String input = sc.nextLine();
            try{ 
                id = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("ID phải là số nguyên. Vui lòng nhập lại!");
            }
        }
        
        
       
        String name;
        while(true){
            System.out.println("Nhap name: ");
            name = sc.nextLine();
            if (name.matches("[a-zA-zÀ-Ỹ\\s]+")){
                break;
            } else {
                System.out.println("Tên chỉ chứa được chữ cái. Vui lòng nhập lại");
            }
        }
        
        int age;
        while(true){
            System.out.println("Nhap age");
            String input = sc.nextLine();
            try {
                age =  Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("Tuổi phải là số nguyên. Vui lòng nhập lại.");
            }
        }
        
        Student student = new Student(id, name, age);
        for (int i = 0; i <students.length; i++){
            if (students[i] == null){
                students[i] = student;
                System.out.println("Đã thêm sinh viên thành công");
                return;
            } 
        }
        System.out.println("Không thể thêm sinh viên: danh sách đã quá 100.");
    }
    
    public void delete(){
        int id;
        while (true){
            System.out.println("Nhap id cua sinh vien muon xoa: ");
            String  input = sc.nextLine();
            try {
                id = Integer.parseInt(input);
                break;
            }catch (NumberFormatException e){
                System.out.println("ID phải là số nguyên. Vui lòng nhập lại!");
            }
        }
        
        for (int i = 0; i < students.length; i++){
            if (students[i] != null &&  id == students[i].getId()){
                students[i] = null;
                System.out.println("Đã xóa sinh viên thành công");
                return;
            } 
        }
        System.out.println("khong tim thay sinh vien co id nay");
    }

    public void edit() {
        int idUpdate = 0;

        // Nhập ID sinh viên muốn sửa
        while (true) {
            try {
                System.out.print("Nhập ID của sinh viên muốn sửa: ");
                idUpdate = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID phải là số nguyên. Vui lòng nhập lại!");
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == idUpdate) {

                // Nhập ID mới
                int newId = 0;
                while (true) {
                    try {
                        System.out.print("Nhập ID mới: ");
                        newId = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("ID phải là số nguyên. Vui lòng nhập lại!");
                    }
                }

                // Nhập tên mới (chỉ gồm chữ cái và khoảng trắng)
                String newName = "";
                while (true) {
                    System.out.print("Nhập tên mới: ");
                    newName = sc.nextLine();
                    boolean isValid = true;

                    if (newName.isEmpty()) {
                        isValid = false;
                    } else {
                        for (int j = 0; j < newName.length(); j++) {
                            char c = newName.charAt(j);
                            if (!Character.isLetter(c) && c != ' ') {
                                isValid = false;
                                break;
                            }
                        }
                    }

                    if (isValid) {
                        break;
                    } else {
                        System.out.println("Tên chỉ được chứa chữ cái và khoảng trắng. Vui lòng nhập lại!");
                    }
                }

                // Nhập tuổi mới
                int newAge = 0;
                while (true) {
                    try {
                        System.out.print("Nhập tuổi mới: ");
                        newAge = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Tuổi phải là số nguyên. Vui lòng nhập lại!");
                    }
                }

                // Cập nhật thông tin sinh viên
                students[i].setId(newId);
                students[i].setName(newName);
                students[i].setAge(newAge);

                System.out.println("Sửa thông tin sinh viên thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy sinh viên có ID này.");
    }
    public void search() {
        System.out.println("Nhập tên sinh viên muốn tìm kiếm: ");
        String nameSearch = sc.nextLine().toLowerCase(); // chuyển về chữ thường
        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                String studentName = students[i].getName().toLowerCase(); // chuyển về chữ thường
                if (studentName.contains(nameSearch)) { // kiểm tra nếu chuỗi con tồn tại
                    System.out.println(students[i]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên chứa '" + nameSearch + "'");
        }
    }
    
    
}
