package exercises.technology;

public class Smartphone extends Computer {
    private int cameraMP;
    private String color;

    public Smartphone(int aCameraMP,String aColor ,int aSerialNumber, String aBrand, String aModel) {
        super(aSerialNumber, aBrand, aModel);
        cameraMP = aCameraMP;
        color = aColor;
    }

    public int getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(int cameraMP) {
        this.cameraMP = cameraMP;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String takePicture(){
        return "Ka-chow!";
    }
    public String sendText(){
        if(getBatteryLevel() >10){
            return "OMG Becky LOL ";
        }
        else {
            return "battery too low to send a stupid text";
        }
    }

}
