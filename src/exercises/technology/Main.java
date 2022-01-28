package exercises.technology;

public class Main {

    public static void main(String[] args) {
        Laptop hp = new Laptop(4000, "Bose",  "HP", "Spectre");

        System.out.println(hp.getSerialNumber());
        Laptop dell = new Laptop(10, "bose", "Dell", "Spectre");
        System.out.println(dell.getSerialNumber());
    }


}
