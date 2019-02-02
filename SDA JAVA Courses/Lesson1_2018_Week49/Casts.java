package Lesson1_2018_Week49;

public class Casts {
    public static char giveChar(int a){
        return (char)a;
    }

    public static void main(String[] args){
        double a = 3.94;
        int b = (int)a;

        char c = giveChar((int)a);

        int hugeInt = (int)10E17;
        short smallInt = (short)hugeInt;
    }
}
