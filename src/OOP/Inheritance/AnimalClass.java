package OOP.Inheritance;

public class AnimalClass {
    public static void main(String[] args) {
        Dog d = new Dog(56,66, "aa");
        d.move();
        d.speak();

    }
}

class Animal{
    int age;
    int runSpeed;
    String  name;

    public Animal(int age, int runSpeed, String name) {
        this.age = age;
        this.runSpeed = runSpeed;
        this.name = name;
    }

    void move(){
        System.out.println("this is void of parent class");

    }
}

class Cat extends Animal{

    public Cat(int age, int runSpeed, String name) {
        super(age, runSpeed, name);
    }
}

class Dog extends Cat{

    public Dog(int age, int runSpeed, String name) {
        super(age, runSpeed, name);
    }
     void speak(){
        System.out.println("this is dog method speak");
    }


}
