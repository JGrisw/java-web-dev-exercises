package exercises;
import java.util.ArrayList;

public class ALPracticeTwo {
    public static void main(String[] args){
    ArrayList<String> practice = new ArrayList<String>();
    practice.add("alpine");
    practice.add("two");
    practice.add("purple");
    practice.add("turbo");
    practice.add("teams");
    practice.add("applesauce");
    practice.add("radical");
    for (int i = 0; i < practice.size(); i++){
//        String single = practice.get(i);
        if (practice.get(i).length() == 5){
            System.out.println(practice.get(i));
        }
    }
    }
}
