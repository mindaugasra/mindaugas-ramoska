public class Rabbit extends Pet{
    public Rabbit(String name, Sex sex) {  // Constructor
        setName(name);
        setSex(sex);
    }

    public Rabbit(String name) {  // Constructor
        setName(name);
        setSex(Sex.Unknown);
    }

    // Void  - is nothing
    public void squeak(){
        System.out.println(getName() + " says: squeak");
    }
}
