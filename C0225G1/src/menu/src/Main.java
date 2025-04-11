import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        StudentManager studentManager = new StudentManager();
        while (true) {
            System.out.println("---------------Dịch vụ sinh viên-------------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Sửa sinh viên");
            System.out.println("5. Search");
            System.out.println("6. Dừng");
            System.out.println("Chọn dịch vụ để thực thi: ");
            int choose = sc.nextInt();
            if (choose <= 0 || choose == 6) {
                break;
            }

            switch (choose) {
                case 1:
//                    Cach 1                    
//                    
//                    if (student.getId() == 0) {
//                        System.out.println("Chưa có sinh viên nào.");
//                    } else {
//                        studentManager.display();
//                    }
//                    Cach 2
                    System.out.println("--- Danh sách sinh viên ---");
                    studentManager.display();
                    break;
                case 2:
                    System.out.println("--- Thêm mới sinh viên ---");
                    studentManager.add();
//                    sc.nextLine();
//                    String idInput = "";
//                    while (idInput.equals("")) {
//                        System.out.println("Nhập ID: ");
//                        idInput = sc.nextLine().trim();
//                        if (idInput.equals("")) {
//                            System.out.println("ID không được để trống");
//                        }
//                    }
//
//                    int id = Integer.parseInt(idInput);
//                    student.setId(id);
//
//                    String nameInput = "";
//                    while (nameInput.equals("")) {
//                        System.out.print("Nhập tên: ");
//                        nameInput = sc.nextLine().trim();
//                        if (nameInput.equals("")) {
//                            System.out.println("Tên không được để trống");
//                        }
//                    }
//                    student.setName(nameInput);
//
//
//                    String ageInput = "";
//                    while (ageInput.equals("")) {
//                        System.out.println("nhập tuổi");
//                        ageInput = sc.nextLine().trim();
//                        if (ageInput.equals("")) {
//                            System.out.println("Tuổi không được để trống");
//                        }
//                    }
//                    int age = Integer.parseInt(ageInput);
//                    student.setAge(age);
//                    System.out.println("Đã thêm mới sinh viên thành công");
                    break;
                    
                case 3:
                    System.out.println("--- Xóa sinh viên ---");
//                    if (student.getId() == 0) {
//                        System.out.println("Chưa có sinh viên nào để xóa.");
//                    } else {
//                        System.out.println("Nhập id của học sinh muốn xóa");
//                        int idDelete = sc.nextInt();
//
//                        if (idDelete == student.getId()) {
//                            student.setId(0);
//                            student.setName("");
//                            student.setAge(0);
//                            System.out.println("Đã xóa sinh viên thành công");
//                        } else {
//                            System.out.println("Không tìm thấy sinh viên với id đó");
//                        }
//                    }
                    studentManager.delete();
                    break;
                case 4:
                    System.out.println("--- Sửa sinh viên ---");
//                    if (student.getId() == 0) {
//                        System.out.println("Chưa có sinh viên nào để update.");
//                    } else {
//                        System.out.println("Nhập id của học sinh muốn update");
//                        int idUpdate = sc.nextInt();
//
//                        if (idUpdate == student.getId()) {
//                            sc.nextLine();
//
//                            String idNew = "";
//                            while (idNew.equals("")) {
//                                System.out.println("Nhập ID để update: ");
//                                idNew = sc.nextLine().trim();
//                                if (idNew.equals("")) {
//                                    System.out.println("ID không được để trống");
//                                }
//                            }
//                            
//                            student.setId(Integer.parseInt(idNew));
//
//                            String nameNew = "";
//                            while (nameNew.equals("")) {
//                                System.out.print("Nhập tên để update: ");
//                                nameNew = sc.nextLine().trim();
//                                if (nameNew.equals("")) {
//                                    System.out.println("Tên không được để trống");
//                                }
//                            }
//                            student.setName(nameNew);
//
//
//                            String ageNew = "";
//                            while (ageNew.equals("")) {
//                                System.out.println("nhập tuổi để update");
//                                ageNew = sc.nextLine().trim();
//                                if (ageNew.equals("")) {
//                                    System.out.println("Tuổi không được để trống");
//                                }
//                            }
//                            
//                            student.setAge(Integer.parseInt(ageNew));
//
//                            System.out.println("Đã sửa sinh viên thành công");
//                        } else {
//                            System.out.println("Không tìm thấy sinh viên với id đó");
//                        }
//                    }
                    studentManager.edit();
                    break;
                case 5:
                    System.out.println("-----Search-----");
                    studentManager.search();
                    break;
                default:
                    System.out.println("Vui lòng chọn số dịch vụ từ (1 - 5) !");
            }
        }
    }
}