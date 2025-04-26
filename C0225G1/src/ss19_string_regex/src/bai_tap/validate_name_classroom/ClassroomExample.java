package bai_tap.validate_name_classroom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassroomExample {
    private static final String NAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";
    
    public ClassroomExample(){}
    
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches(); 
    }
}
