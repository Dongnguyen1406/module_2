package vehicle_manager.entity;

public class Manufacturer {
    private String id;
    private String name;
    private String country;

    public Manufacturer(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " - " + name + " (" + country + ")";
    }
}