package thuc_hanh;

public class Demo {
    public static void main(String[] args) {
        String name = "Nguyen Van A";
        String regexName = "^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$";
        boolean check = name.matches(regexName);
        System.out.println("finish");
    }
}
