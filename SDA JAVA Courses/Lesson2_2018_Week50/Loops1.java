package Lesson2_2018_Week50;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[]args) {
        int i = 3;
        while(i>0){
            System.out.println("I'm a loop");
            i--;
        }
        do {
            System.out.println("I'm another loop");
        } while (2 == 5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter positive number: ");
        int num = scanner.nextInt();

        while(num > 0){
            System.out.println("yeye!");
            System.out.print("Please enter positive number:");
            num = scanner.nextInt();
        }
        System.out.println("--------------------------");
                }
        }