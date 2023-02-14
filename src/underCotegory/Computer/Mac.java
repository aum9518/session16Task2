package underCotegory.Computer;

public class Mac extends Computer{
    public Mac(String brand, String model, String color, String displayDioganal, String ram) {
        super(brand, model, color, displayDioganal, ram);
    }

    public Mac(String displayDioganal, String ram) {
        super(displayDioganal, ram);
    }

    public Mac() {
    }

    public Mac(String brand, String model, String color) {
        super(brand, model, color);
    }

    @Override
    public String turnOn() {
        return "Mac turning on";
    }

    @Override
    public String turnOff() {
        return "Mac turning off";
    }
}
