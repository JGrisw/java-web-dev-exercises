package exercises;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class HashMapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double newKid;
        HashMap<Double,String> students = new HashMap<>();

        System.out.println("Please enter student ID: ");

        do {
            System.out.println("Id: ");
            newKid = input.nextDouble();

            if (!newKid.equals(0.0)) {
                System.out.println("Please enter name: ");
                String name = input.nextLine();
                students.put(newKid, name);

                input.next();
            }

        } while (!newKid.equals(" "));

        System.out.println("\nClass Roster");

        for (Map.Entry<Double, String> student: students.entrySet()) {
            System.out.println(student.getKey() + "(" + student.getValue() +")");
        }
    }
}
