package thuc_hanh.static_property_test;

public class Car {
    public String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}