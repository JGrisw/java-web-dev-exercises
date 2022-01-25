package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat yancha = new HouseCat("Yancha", 9);
        yancha.eat();
        System.out.println(yancha.isTired());
        yancha.sleep();
        System.out.println(yancha.isTired());
    }
}
