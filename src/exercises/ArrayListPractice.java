package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
    ArrayList<Integer> practice = new ArrayList<Integer>();
    practice.add(2);
    practice.add(3);
    practice.add(4);
    practice.add(5);
    practice.add(6);
    practice.add(7);
    practice.add(8);
    practice.add(9);
    practice.add(10);
    practice.add(11);
    System.out.println(practice);
    double sum = 0;
    for (int i = 0; i < practice.size(); i++){
        if ( practice.get(i) %2==0 ){
            sum +=i;
        }
        }
        System.out.println(sum);
    }
}
