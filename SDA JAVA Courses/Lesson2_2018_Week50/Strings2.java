package Lesson2_2018_Week50;

import java.util.Scanner;
public class Strings2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String a = "Hello";
        String b = "Hello";
        String c = new String ("Hello");
        System.out.println ("a = b ? " + (a == b));
        System.out.println("a equals b ? " + (a.equals(b)));

        System.out.println("a = c ? " + (a == c));
        System.out.println("a equals c ? " + (a.equals(c)));
        System.out.println("a equals (ignoring case) c ? " + (a.equalsIgnoreCase(c)));
        String hello = "Hello, world!";
        String part1 = hello.substring(0, 5);
        String part2 = hello.substring(7);
        String part3 = hello.substring(7, hello.length());
        String concatedStr = part1 + ",x+qq " + part2;
        System.out.println(concatedStr);

        String left = "Hello";
        String right = "hello";
        int result = left.compareTo(right);

        StringBuilder sb = new StringBuilder ("Hello world");
        for(int i = 0; i<10; i++){
            sb.append("!");
        }
        String finalString = sb.toString();
    }
}