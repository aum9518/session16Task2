package underCotegory;

public class UnderCotegory {
    private String brand;
    private String model;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public UnderCotegory(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public UnderCotegory() {
    }

    @Override
    public String toString() {
        return "UnderCotegory{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
