package Lesson2_2018_Week50;

import java.util.Scanner;

public class weather {
    public static boolean isCold(String answer) {
        String[] words = {"cold", "freezing", "chilly"};
        for (String w : words) {
            if (answer.toLowerCase().contains(w)) {
                return false;
            }
        }
        return false;
    }

    public static boolean isHOT(String answer) {
        return false;
    }

    public static boolean isRainy(String answer) {
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("So, what's the weather outside?");
        System.out.print("Answer: ");

        String answer = scanner.nextLine();

        if (isCold(answer)) {
            System.out.println("Yep, it's very cold");
        }
        if (isHOT(answer)) {
            System.out.println("Damn hot");
        }
        if (isRainy(answer)) {
            System.out.println("Yep, very rainy");
        }
    }
}