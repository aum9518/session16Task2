package underCotegory.Computer;

import underCotegory.UnderCotegory;

public class Computer extends UnderCotegory {
    private String displayDioganal;
    private String ram;

    public String getDisplayDioganal() {
        return displayDioganal;
    }

    public void setDisplayDioganal(String displayDioganal) {
        this.displayDioganal = displayDioganal;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Computer(String brand, String model, String color, String displayDioganal, String ram) {
        super(brand, model, color);
        this.displayDioganal = displayDioganal;
        this.ram = ram;
    }

    public Computer(String displayDioganal, String ram) {
        this.displayDioganal = displayDioganal;
        this.ram = ram;
    }

    public Computer() {
    }

    public Computer(String brand, String model, String color) {
        super(brand, model, color);
    }
    public String turnOn(){
        return "Turn on";
    }
    public String turnOff(){
        return "Turn off";
    }
}
