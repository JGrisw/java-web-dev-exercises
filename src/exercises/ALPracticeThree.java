package exercises;
import java.util.Scanner;
import java.util.ArrayList;

public class ALPracticeThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> practice = new ArrayList<>();
        practice.add("alpine");
        practice.add("two");
        practice.add("purple");
        practice.add("turbo");
        practice.add("teams");
        practice.add("applesauce");
        practice.add("radical");
        practice.add("hello");
        practice.add("fighter");
        practice.add("language");
        practice.add("sorry");
        practice.add("against");
        System.out.println("input search length: ");

        double search = input.nextDouble();
        for ( int i = 0 ; i < practice.size(); i++) {
            if (practice.get(i).length() == search){
                System.out.println(practice.get(i));
            }
        }



    }
}
