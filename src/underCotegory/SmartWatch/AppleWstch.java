package underCotegory.SmartWatch;

public class AppleWstch extends SmartWatch{

    @Override
    public String counting() {
        return "counting steps";
    }

    @Override
    public String get() {
        return "getting alert...";
    }

    public AppleWstch(String brand, String model, String color) {
        super(brand, model, color);
    }

    public AppleWstch() {
    }

    public AppleWstch(String brand, String model, String color, String battery, int version) {
        super(brand, model, color, battery, version);
    }

    public AppleWstch(String battery, int version) {
        super(battery, version);
    }
}
