package main;

import java.util.Scanner;

public class Second {

    private static String inputName() {
        System.out.println("enter name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        if (inputName().equals("Вячеслав")) {
            System.out.println("привет, Вячеслав");
        }
        else {
            System.out.println("нет такого имени");
        }
    }
}