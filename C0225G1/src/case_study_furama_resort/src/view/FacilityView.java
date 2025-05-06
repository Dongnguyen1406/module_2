package view;

import utils.ValidateUtils;

import java.util.Scanner;

public class FacilityView {
    private final Scanner scanner = new Scanner(System.in);

    public String getFacilityChoice() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.print("Select: ");
        return scanner.nextLine();
    }

    public String inputValid(String prompt, String regex) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine();
        } while (!input.matches(regex));
        return input;
    }

    public String getVillaId() {
        return inputValid("Enter Villa ID (SVVL-YYYY): ", ValidateUtils.ID_VILLA_REGEX);
    }

    public String getHouseId() {
        return inputValid("Enter House ID (SVHO-YYYY): ", ValidateUtils.ID_HOUSE_REGEX);
    }

    public String getRoomId() {
        return inputValid("Enter Room ID (SVRO-YYYY): ", ValidateUtils.ID_ROOM_REGEX);
    }

    public String getServiceName() {
        return inputValid("Enter service name: ", ValidateUtils.NAME_SERVICE_REGEX);
    }

    public double getArea() {
        return Double.parseDouble(inputValid("Enter area (>30): ", ValidateUtils.AREA_REGEX));
    }

    public double getCost() {
        return Double.parseDouble(inputValid("Enter cost: ", ValidateUtils.COST_REGEX));
    }

    public int getMaxPeople() {
        return Integer.parseInt(inputValid("Enter max people (1-19): ", ValidateUtils.MAX_PEOPLE_REGEX));
    }

    public String getRentalType() {
        System.out.print("Enter rental type: ");
        return scanner.nextLine();
    }

    public String getRoomStandard() {
        System.out.print("Enter room standard: ");
        return scanner.nextLine();
    }

    public double getPoolArea() {
        return Double.parseDouble(inputValid("Enter pool area: ", ValidateUtils.AREA_REGEX));
    }

    public int getFloors() {
        return Integer.parseInt(inputValid("Enter floors: ", ValidateUtils.FLOOR_REGEX));
    }

    public String getFreeService() {
        System.out.print("Enter free service: ");
        return scanner.nextLine();
    }
}
