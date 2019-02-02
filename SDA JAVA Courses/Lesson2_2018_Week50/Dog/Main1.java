package Lesson2_2018_Week50.Dog;

public class Main1 {
    public static void main(String[] args) {
        // Dog is a class
        // Charlie is an object
        Dog[] dogs = {
                new Dog("Charlie", Sex.Male),
                new Dog("Betty", Sex.Female),
                new Dog("Spark")
        };

        for (Dog d : dogs) {
            d.bark();
        }
        System.out.println("Hello doggy, what's your name?");
        System.out.println(dogs[1].getName());
    }
}