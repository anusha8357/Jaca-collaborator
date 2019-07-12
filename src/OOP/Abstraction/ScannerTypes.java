package OOP.Abstraction;

public class ScannerTypes implements wifi, Color, fax, Scan {
    @Override
    public void connectWifi() {
        System.out.println("wifi connection");
    }

    @Override
    public void scandocument() {
        System.out.println("Scan document");
    }
    public void printColor(){
        System.out.println("prints the color");
    }

    @Override
    public void sendFax() {
        System.out.println(" send the fax");
    }

    public static void main(String[] args) {
        ScannerTypes scanOne = new ScannerTypes();
        System.out.println("scanner one");
        scanOne.connectWifi();
        scanOne.printColor();

        ScannerTypes scanTwo = new ScannerTypes();
        System.out.println("Scanner two");
        scanTwo.printColor();
        scanTwo.scandocument();
        scanTwo.sendFax();

        ScannerTypes scanFour = new ScannerTypes();
        System.out.println("Scanner four");
        scanFour.printColor();
        scanFour.sendFax();
        scanFour.scandocument();
        scanFour.connectWifi();

    }
}

interface wifi{
    abstract void connectWifi();
}

interface Color{
    abstract void printColor();
}

interface fax{
    abstract void sendFax();
}

interface Scan{
    abstract void scandocument();
}
