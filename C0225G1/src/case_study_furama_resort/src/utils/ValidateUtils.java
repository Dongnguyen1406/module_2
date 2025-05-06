package utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ValidateUtils {
    public static final String ID_EMPLOYEE_REGEX = "^NV-\\d{4}$";
    public static final String NAME_REGEX = "^([A-Z][a-z]+\\s)*[A-Z][a-z]+$";
    public static final String CMND_REGEX = "^\\d{9}|\\d{12}$";
    public static final String PHONE_REGEX = "^0\\d{9}$";
    public static final String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
    public static final String ID_CUSTOMER_REGEX = "^KH-\\d{4}$";

    public static final String ID_VILLA_REGEX = "^SVVL-\\d{4}$";
    public static final String ID_HOUSE_REGEX = "^SVHO-\\d{4}$";
    public static final String ID_ROOM_REGEX = "^SVRO-\\d{4}$";
    public static final String NAME_SERVICE_REGEX = "^[A-Z][a-zA-Z0-9\\s]*$";
    public static final String AREA_REGEX = "^([3-9]\\d|\\d{3,})(\\.\\d+)?$"; // >30
    public static final String COST_REGEX = "^[1-9]\\d*(\\.\\d+)?$";
    public static final String MAX_PEOPLE_REGEX = "^[1-9]$|^1\\d$"; // 1-19
    public static final String FLOOR_REGEX = "^[1-9]\\d*$";
    
    public static boolean isValidAge(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateStr, formatter);
        return Period.between(birthDate, LocalDate.now()).getYears() >= 18;
    }
}
