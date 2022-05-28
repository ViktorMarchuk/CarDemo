package by.epam.aggregetion02.logic;

public class Drive {
    public void drivePermition(String wheather) {
        System.out.println("Check the wheather");
        if(wheather.equalsIgnoreCase("ice")) {
            System.out.println("Be carefull, ice on the road");
        }
        if(wheather.equalsIgnoreCase("synny")) {
            System.out.println("You can drive");
        }
    }
}
