package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Third {

    private static List<Integer> readList() {
        System.out.println("enter array");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            List<Integer> list = new ArrayList<>();
            try {
                String str = scanner.nextLine();
                String[] strArr = str.split(" ");
                for (String s : strArr) {
                    list.add(Integer.parseInt(s));
                }
                return list;
            } catch (Exception ex) {
                System.out.println("please, enter correct array");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = readList();
        for (int num : list) {
            if (num % 3 == 0) {
                System.out.print(String.format("%d ", num));
            }
        }
        System.out.println();
    }

}
