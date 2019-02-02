public class Main {
    public static void main(String[] args) {
        // Dog is a class
        // Charlie is an object
        Pet[] pets = {
                new Dog("Charlie", Sex.Male),
                new Dog("Betty", Sex.Female),
                new Dog("Spark"),
                new Cat("Love", Sex.Female),
                new Rabbit ("Fluffy", Sex.Female)
        };

        for(Pet pet : pets) {
            System.out.println("Hello, my name is " +pet.getName());
            if(pet instanceof Dog) {
                ((Dog) pet).bark();
            } else if (pet instanceof Cat){
                ((Cat)pet).meow();
            } else if (pet instanceof  Rabbit){

            } else {
                System.out.println("I don't kno what's wrong");
            }
            }
    }
}