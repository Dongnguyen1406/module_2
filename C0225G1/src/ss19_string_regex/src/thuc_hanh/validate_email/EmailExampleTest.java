package thuc_hanh.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "abc@gmail.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail){
            boolean isvaild = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvaild);
        }
        for (String email : invalidEmail){
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is invalid: " + isvalid);
        }
    }
}
