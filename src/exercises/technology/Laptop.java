package exercises.technology;

public class Laptop extends Computer{
    private int resolution;
    private String speakers;

    public Laptop(int aResolution, String aSpeakers,int aSerialNumber, String aBrand, String aModel) {
        super(aSerialNumber, aBrand, aModel);
        resolution = aResolution;
        speakers = aSpeakers;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getSpeakers() {
        return speakers;
    }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    public String watchNetflix(){
        if(getBatteryLevel() > 25){
            return "on this season on Rock of Love with Brett Michaels...";
        }
        else {
            return "not enough battery level";
        }
    }
    public String study(){
        return "click clack tip tap I'm smarter now!";
    }
}
