public class Cat extends Pet{
    public Cat(String name, Sex sex) {  // Constructor
        setName(name);
        setSex(sex);
    }

    public Cat(String name) {  // Constructor
        setName(name);
        setSex(Sex.Unknown);
    }

    // Void  - is nothing
    public void meow(){
        System.out.println(getName() + " says: meow");
    }
}
