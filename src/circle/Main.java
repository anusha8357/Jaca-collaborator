package circle;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(1, "red");
        System.out.println("enter the radius : " + c.getRadius());
        System.out.println("enter the area: " + c.getArea());
        c.toString();
        Cylinder cy = new Cylinder(4,5);
        System.out.println("enter the volume" + cy.getVolume());


    }
}
