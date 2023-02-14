package underCotegory.Computer;

public class Lenovo extends Computer{
    public Lenovo(String brand, String model, String color, String displayDioganal, String ram) {
        super(brand, model, color, displayDioganal, ram);
    }

    public Lenovo(String displayDioganal, String ram) {
        super(displayDioganal, ram);
    }

    public Lenovo() {
    }

    public Lenovo(String brand, String model, String color) {
        super(brand, model, color);
    }

    @Override
    public String turnOn() {
        return "Lenovo turning on";
    }

    @Override
    public String turnOff() {
        return "Lenovo turning off";
    }
}
