package Lesson2_2018_Week50;

import java.util.Scanner;

public class Strings {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String a = "Hello";
        String b = "Hello";
        System.out.print("Enter a word: ");
        String c = scanner.next();
        System.out.println ("a = b ? " + (a == b));
        System.out.println("a equals b ? " + (a.equals(b)));

        System.out.println("a = c ? " + (a == c));
        System.out.println("a equals c ? " + (a.equals(c)));
        System.out.println("a equals (ignoring case) c ? " + (a.equalsIgnoreCase(c)));

        String hello = "Hello, world!";
    }
}
