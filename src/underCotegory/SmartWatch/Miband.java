package underCotegory.SmartWatch;

public class Miband extends SmartWatch{

    @Override
    public String counting() {
        return "Counting time...";
    }

    @Override
    public String get() {
        return "getting message...";
    }

    public Miband(String brand, String model, String color) {
        super(brand, model, color);
    }

    public Miband() {
    }

    public Miband(String brand, String model, String color, String battery, int version) {
        super(brand, model, color, battery, version);
    }

    public Miband(String battery, int version) {
        super(battery, version);
    }
}
