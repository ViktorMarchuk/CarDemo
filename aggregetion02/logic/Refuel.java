package by.epam.aggregetion02.logic;

public class Refuel {
    public void checkFuel(double t) {
        System.out.println("Fuel quantity check");
        if(t <= 5.0) {
            System.out.println("You need tank the car");
        } else {
            System.out.println("The car can move");
        }
    }

    public void checkTipeFuel(int f) {
        System.out.println("Checking by fuel type");
        if(f != 95) {
            System.out.println("Incompatible type of fuel, you not move");
        } else {
            System.out.println("The car can  move");
        }
    }
}