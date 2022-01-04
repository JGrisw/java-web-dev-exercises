package exercises;

import java.util.Arrays;

public class ArrayExTwo {
    public static void main(String[] args) {
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] seussSplit = seuss.split(" ");
        System.out.println(Arrays.toString(seussSplit));
        String[] sentenceSplit = seuss.split("\\.");
        System.out.println(Arrays.toString(sentenceSplit));


    }
}
