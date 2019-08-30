package main;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        if (readNumber() > 7) {
            System.out.println("Привет");
        }
    }

    private static double readNumber() {
        System.out.println("enter number");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextDouble();
            }
            catch (Exception ex) {
                System.out.println("please, enter correct number");
            }
            scanner.next();
        }
    }

}
