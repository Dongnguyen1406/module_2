package bai_tap.validate_phone_number;

public class PhoneExampleTest {
    private static final String[] validPhone = new String[]{"(84)-(0978489648)"};
    private static final String[] invalidPhone = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
    private static PhoneExample phoneExample;
    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String phone : validPhone){
            boolean isValid = phoneExample.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isValid);
        }
        for (String phone : invalidPhone){
            boolean isValid = phoneExample.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isValid);
        }
    }
}
