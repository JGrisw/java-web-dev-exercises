package exercises.technology;

public class Computer {

    private int serialNumber;
    private String brand;
    private String model;
    public int batteryLevel = 100;

    public Computer (int aSerialNumber, String aBrand, String aModel) {
        serialNumber = aSerialNumber;
        brand = aBrand;
        model = aModel;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

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

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


}
