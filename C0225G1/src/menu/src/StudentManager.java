import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StudentManager {
    private static Student[] students = new Student[100];
    private Scanner sc= new Scanner(System.in);
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
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap name: ");
        String name = sc.nextLine();
        System.out.println("Nhap age");
        int age = Integer.parseInt(sc.nextLine());
        Student student = new Student(id, name, age);
        for (int i = 0; i <students.length; i++){
            if (students[i] == null){
                students[i] = student; 
                break;
            } else {
                System.out.printf("Không tìm thấy sinh viên có id này!");
                break;
            }
        }
    }
    
    public void delete(){
        System.out.println("Nhap id cua sinh vien muon xoa: ");
        int idDelete = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < students.length; i++){
            if (idDelete == students[i].getId()  && students[i] != null){
                students[i] = null;
                return;
            } else {
                System.out.printf("Không tìm thấy sinh viên có id này!");
                break;
            }
        }
    }
    
    public void edit(){
        System.out.println("Nhap id cua sinh vien muon sua: ");
        int idUpdate = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.length; i++){
            if (idUpdate == students[i].getId() && students[i] != null){
                System.out.println("nhap id moi cua sinh vien: ");
                students[i].setId(Integer.parseInt(sc.nextLine()));
                System.out.println("nhap id moi cua sinh vien: ");
                students[i].setName(sc.nextLine());
                System.out.println("nhap age moi cua sinh vien: ");
                students[i].setAge(Integer.parseInt(sc.nextLine()));
                return;
            } else {
                System.out.printf("Không tìm thấy sinh viên có id này!");
                break;
            }
        }
    }
    
    public void search(){
        System.out.println("Nhập tên sinh viên muốn tìm kiếm: ");
        String nameSearch = sc.nextLine();
        for (int i = 0; i < students.length; i++){
            if (nameSearch.equals(students[i].getName()) && students[i] != null){
                System.out.println("ID: " + students[i].getId() + "\n" + "Name: " + students[i].getName() + "\n" +  "Age: " + students[i].getAge());
                return;
            } else {
                System.out.printf("Không tìm thấy sinh viên này!");
                break;
            }
        }
    }
    
    
}
