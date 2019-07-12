package OOP.Abstraction;

public class Abstraction_Demo extends Demotest{
    @Override
    void myMethod() {
        System.out.println("this is overide method");
    }

    public static void main(String[] args) {
        Abstraction_Demo demo = new Abstraction_Demo();
        demo.myMethod();
    }
}

abstract class Demotest{

    //you cannot create an instance of an abstract class.
    //can have method also as in abstract method.
    //all abstract method are by public by default.
    //all abstract methods must be override by child class..
    //you are not allowed to have body of method fro abstract method.

    abstract void myMethod();

}