public class Dog extends Pet{
    public Dog(String name, Sex sex){  // Constructor
        setName(name);
        setSex(sex);
    }

    public Dog(String name){  // Constructor
        setName(name);
        setSex(Sex.Unknown);
    }

    // Void  - is nothing
    public void bark(){
        System.out.println(getName() + " says: Woof woof");
    }
}
