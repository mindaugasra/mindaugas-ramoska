package Lesson2_2018_Week50;

public class Strings3 {
    public static void main(String[]args) {
        StringBuilder sb = new StringBuilder ("Hello world");
        for(int i = 0; i<10; i++){
            sb.append("!");
        }
        String finalString = sb.toString();
        System.out.println("finalString????");
    }
}