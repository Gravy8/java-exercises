package circle;

public class Circle {
    private double radius;
    private static int circlesProduced = 0;

    public Circle (double radius){
        this.radius = radius;
        circlesProduced++;
    }

    public double calculateArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getNumberOfCirclesCalculated(){
        return circlesProduced;
    }

}
