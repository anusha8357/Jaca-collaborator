package Class_Definition;

public class Constructors_InJava {
    String name;

    //creating constructors in java

    //types of Constructors

    //1. Default
    //2. No-argument
    //3. Parameterized


    //No-Arg
    public Constructors_InJava(){

        this.name= "Test Java Constructor!!";

    }

    public static void main(String[] args) {
        Constructors_InJava obj = new Constructors_InJava();
        System.out.println(obj.name);

        //Constructors_InJava onjOne =new Constructors_InJava("Test");

    }
}
