package Lesson2_2018_Week50;

public class ControlFlow {
    public enum Fruit{
        Apple,
        Orange,
        Banana
    }
    public static void main(String[]args){
        Fruit myFruit = Fruit.Banana;
        switch (myFruit){
            case Apple:
                System.out.println("Mmmm... an appple...");
                break;
            case Banana:
                System.out.println("Am i monkey ?");
            break;
            default:
                System.out.println("i don't want any fruits");
                break;
        }
    }
}
