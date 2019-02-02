package Lesson2_2018_Week50;

import java.util.Arrays;
import java.util.Scanner;

public class weather2 {
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
        String[] hotWords = {"hot", "warm", "sunny"};
        String[] answerWords = answer.split(" ");
        for (String hotWord : hotWords) {
            for (String answerWord : answerWords) {
                if (hotWord.equalsIgnoreCase(answerWord)) {
                    return true;
                }
            }
        }
            return false;
        }

        public static boolean isRainy(String answer) {
            String[] rainyWords = {"wet", "rainy", "raining"};
            return Arrays
                    .stream(answer.split(""))
                    .map((x) -> x.toLowerCase())
                    .map((x) -> x.trim())
                    .filter((x) -> {
                        for(String r : rainyWords){
                            if(r.equalsIgnoreCase(x)){
                                return true;
                            }
                        }
                        return false;
            })
                    .findAny()
                    .isPresent();
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