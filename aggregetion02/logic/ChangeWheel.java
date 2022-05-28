package by.epam.aggregetion02.logic;

public class ChangeWheel {
    public void checkWheel(double h) { // h - высота протектора
        System.out.println("Сhecking the tire tread");
        if(h < 3.3) {
            System.out.println("You need change tire");
        }else {
            System.out.println("The tire is allright");
        }
    }
}
