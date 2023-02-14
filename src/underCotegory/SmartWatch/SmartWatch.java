package underCotegory.SmartWatch;

import underCotegory.UnderCotegory;

public class SmartWatch extends UnderCotegory {
    private String battery;
    private int version;
    public SmartWatch(String brand, String model, String color) {
        super(brand, model, color);
    }

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, String color, String battery, int version) {
        super(brand, model, color);
        this.battery = battery;
        this.version = version;
    }

    public SmartWatch(String battery, int version) {
        this.battery = battery;
        this.version = version;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    public String counting(){
        return "counting...";
    }
    public String get(){
        return "getting...";
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "battery='" + battery + '\'' +
                ", version=" + version +
                '}';
    }
}
