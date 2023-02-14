package underCotegory.Phone;

public class Samsung extends Phone{

    public Samsung(String brand, String model, String color) {
        super(brand, model, color);
    }

    public Samsung() {
    }

    public Samsung(String brand, String model, String color, String memory, int yearofMade) {
        super(brand, model, color, memory, yearofMade);
    }

    public Samsung(String memory, int yearofMade) {
        super(memory, yearofMade);
    }

    @Override
    public String caliing() {
        return "Callin to mom";
    }

    @Override
    public String caliing1() {
        return "Callin to dad";
    }
}
