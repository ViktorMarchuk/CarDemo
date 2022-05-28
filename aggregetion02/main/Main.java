package by.epam.aggregetion02.main;
/*
 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 менять колесо, вывести на консоль марку автомобиля.
 */

import by.epam.aggregetion02.entity.Car;
import by.epam.aggregetion02.entity.Engine;
import by.epam.aggregetion02.entity.Wheel;
import by.epam.aggregetion02.logic.ChangeWheel;
import by.epam.aggregetion02.logic.Drive;
import by.epam.aggregetion02.logic.Refuel;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Mazda");
        Engine engine=new Engine();
        Wheel wheel=new Wheel();
        Refuel refuel=new Refuel();
        ChangeWheel changeWheel=new ChangeWheel();
        Drive drive=new Drive();

        System.out.println(car);
        System.out.println("_____________________________");
        refuel.checkTipeFuel(92);
        System.out.println("_____________________________");
        refuel.checkFuel(23);
        System.out.println("______________________________");
        changeWheel.checkWheel(5);
        System.out.println("______________________________");
        drive.drivePermition("ice");

    }
}
/*
Name of the car = Mazda
_____________________________
Checking by fuel type
Incompatible type of fuel, you not move
_____________________________
Fuel quantity check
The car can move
______________________________
Сhecking the tire tread
The tire is allright
______________________________
Check the wheather
Be carefull, ice on the road

 */