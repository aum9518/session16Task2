package underCotegory.Phone;

import underCotegory.UnderCotegory;

public class Phone extends UnderCotegory {
    private String memory;
    private int yearofMade;
    public Phone(String brand, String model, String color) {
        super(brand, model, color);
    }

    public Phone() {
    }

    public Phone(String brand, String model, String color, String memory, int yearofMade) {
        super(brand, model, color);
        this.memory = memory;
        this.yearofMade = yearofMade;
    }

    public Phone(String memory, int yearofMade) {
        this.memory = memory;
        this.yearofMade = yearofMade;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getYearofMade() {
        return yearofMade;
    }

    public void setYearofMade(int yearofMade) {
        this.yearofMade = yearofMade;
    }
    public String caliing(){
        return "calling ";
    }
    public String caliing1(){
        return "calling ";
    }
}
