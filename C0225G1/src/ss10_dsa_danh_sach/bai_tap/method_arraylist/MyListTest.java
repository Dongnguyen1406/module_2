package ss10_dsa_danh_sach.bai_tap.method_arraylist;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student(){}

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "huy1");
        Student student2 = new Student(2, "huy2");
        Student student3 = new Student(3, "huy3");
        Student student4 = new Student(4, "huy4");
        Student student5 = new Student(5, "huy5");
        Student f = new Student(6, "My2");
        
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
//        studentMyList.add(f, 2);
        studentMyList.size();
//        studentMyList.clear();
        
//        for (int i = 0; i < studentMyList.size(); i++){
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(2).getName());
//        System.out.println(studentMyList.indexOf(f));
//        System.out.println(studentMyList.contains(student2));
        newMyList = studentMyList.clone();
        Student student = newMyList.remove(0);
        System.out.println(student.getName());
//        for (int i =0; i< newMyList.size(); i++){
//            System.out.println(newMyList.get(i).getName());
//        }
        
    }
}
