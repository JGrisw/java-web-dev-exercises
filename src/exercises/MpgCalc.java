package exercises;
import java.util.Scanner;
public class MpgCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("how many gallons of gas have you used?");
        double gas = input.nextDouble();
        double mpg = miles/gas;
        System.out.println("your MPG is currently: " + mpg);
    }
}
