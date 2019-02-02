public class Pet {
    private String name;  // fields
    private Sex sex;

    public void setSex(Sex s){
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
}
