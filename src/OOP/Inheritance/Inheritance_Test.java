package OOP.Inheritance;

public class Inheritance_Test {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(6, 5, 7);
        System.out.println(bike.toString());

       // bike.setHeight(6);
       // bike.getSeatHeight();



    }
}
class Bicycle{
    int gear;
    int speed;

    public Bicycle(int gear, int speed){
    this.gear = gear;
    this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public String toString(){
        return "Bicycle{" + "gear=" + gear + ", speed=" + speed + '}';

    }
}

class MountainBike extends Bicycle{

    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }


    public int getSeatHeight() {
        return seatHeight;
    }
    public void setHeight(int seatHeight){
        this.seatHeight = seatHeight;
        System.out.println(seatHeight);
    }

    @Override
    public String toString() {
        return "MountainBike " +
                "seatHeight=" + seatHeight +
                '}';
    }
}
