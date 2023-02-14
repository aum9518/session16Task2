package underCotegory.Phone;

public class Iphone extends Phone{
    public Iphone(String brand, String model, String color) {
        super(brand, model, color);
    }

    public Iphone() {
    }

    public Iphone(String brand, String model, String color, String memory, int yearofMade) {
        super(brand, model, color, memory, yearofMade);
    }

    public Iphone(String memory, int yearofMade) {
        super(memory, yearofMade);
    }

    @Override
    public String caliing() {
        return "Calling to brother";
    }

    @Override
    public String caliing1() {
        return "calling to Sister";
    }
}
