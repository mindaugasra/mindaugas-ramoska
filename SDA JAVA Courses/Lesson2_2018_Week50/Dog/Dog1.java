package Lesson2_2018_Week50.Dog;

public class Dog1 {
    private String name;
    private Sex sex;

    public Dog1(String name, Sex sex){  // Constructor
        this.name = name;
        this.sex = sex;
    }

    public Dog1(String name){  // Constructor
        int a = 5;   // variable
        this.name = name;
        this.sex = Sex.Unknown;
    }

    public void setSex(Sex s){ // Method
        sex = s;
}

    public String getName(){
        return name;
    }

    public Sex getSex(){
        return sex;
    }

    public void setName(String name){
        this.name = name;
    }

    // Void  - is nothing
    public void bark(){
        System.out.println(name + " says: Woof woof");
    }
}
