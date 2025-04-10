package thuc_hanh.static_method_test;

public class Main {
    public static void main(String args[]) {
        thuc_hanh.static_method_test.Student.change(); //calling change method

        //creating objects
        thuc_hanh.static_method_test.Student s1 = new thuc_hanh.static_method_test.Student(111, "Hoang");
        thuc_hanh.static_method_test.Student s2 = new thuc_hanh.static_method_test.Student(222, "Khanh");
        thuc_hanh.static_method_test.Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
