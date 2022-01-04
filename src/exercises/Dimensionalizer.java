package exercises;
import java.util.Scanner;

public class Dimensionalizer {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("what is the length of your rectangle? ");

    int length = input.nextInt();
    System.out.println("what is the width of your rectangle?");
    int width = input.nextInt();
    int area = length * width;

    System.out.println("the Area of your rectangle is: " + area);

    }
}
