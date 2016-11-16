import java.util.Scanner;
import java.util.InputMismatchException;
public class CarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car();
        boolean fuckeryCatcher = true;
        while(fuckeryCatcher) {
            try {
                System.out.print("Enter your cars make: ");
                myCar.setMake(sc.next());
                fuckeryCatcher = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid make for you car");
            }
        }
        fuckeryCatcher = true;
        while(fuckeryCatcher) {
            try {
                System.out.print("Enter your cars model: ");
                myCar.setModel(sc.next());
                fuckeryCatcher = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid model");
            }
        }
        fuckeryCatcher = true;
        while(fuckeryCatcher) {
            try {
                System.out.print("Enter your cars mileage to the nearest whole number: ");
                myCar.setMiles(sc.nextInt());
                if (myCar.getMiles() < 0){
                    throw new InputMismatchException();
                }
                fuckeryCatcher = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid whole number that is greater than 0");
            }
        }
        fuckeryCatcher = true;
        while(fuckeryCatcher) {
            try {
                System.out.print("Enter your cars color: ");
                myCar.setColor(sc.next());
                fuckeryCatcher = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid color");
            }
        }

        System.out.println("Your " + myCar.getColor() + " " + myCar.getMake() + " " + myCar.getModel() + " has " + myCar.getMiles() + " miles.");

    }
}
