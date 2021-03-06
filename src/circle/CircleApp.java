package circle;
import Validator.Validator;
import Validator.KeepGoing;

public class CircleApp {
    public static void main(String[] args) {
        double radius;
        boolean keepGoing = true;

        System.out.println("Welcome to the circle calculator application");

        while(keepGoing){
            radius = Validator.getDoubleGreaterThanZero("Enter the radius for your circle: ");

            Circle newCircle = new Circle(radius);

            System.out.println("Circle Area: " + newCircle.calculateArea() +
                    "\nCircle Circumference: " + newCircle.calculateCircumference());

            keepGoing = KeepGoing.check("Do you want to calculate for another circle? (y/n): ");
        }
        System.out.println("You calculated " + Circle.getNumberOfCirclesCalculated() + " circles. \nGoodbye");
    }
}
