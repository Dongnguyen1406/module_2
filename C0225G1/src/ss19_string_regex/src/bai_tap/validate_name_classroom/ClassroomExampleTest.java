package bai_tap.validate_name_classroom;

public class ClassroomExampleTest {
        private static final String[] validName = new String[]{"C0223G", "A0323K"};
        private static final String[] invalidName = new String[]{"M0318G", "P0323A"};
        private static ClassroomExample classroomExample;

    public static void main(String[] args) {
        classroomExample = new ClassroomExample();
        for (String name : validName){
            boolean isValid = classroomExample.validate(name);
            System.out.println("Name Classroom is " + name + " is valid: " + isValid);
            
        }
        
        for (String name : invalidName){
            boolean isValid = classroomExample.validate(name);
            System.out.println("Name Classroom is " + name + " is valid: " + isValid);
        }
    }
}
