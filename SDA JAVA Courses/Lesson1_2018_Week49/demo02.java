package Lesson1_2018_Week49;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        int width, height;

        System.out.print("Enter package dimensions (WxH); ");
        width = scanner.nextInt();
        height = scanner.nextInt();

        System.out.println(
                String.format("%d x %d", width, height)
        );
        }
    }
