import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        /*System.out.println("Hello world!!");
        int number = 5;
        double first = 5;
        double second = 5;
        char character;
        double floatingNumber =  1.4;
        System.out.println(floatingNumber);
        if (multiply(first,second) > 20){
            System.out.println("Fasdfasdf");
        }
        boolean isFriday = true;
        System.out.println(isFriday);
        character = '5';
        System.out.println(character);*/
        /*Scanner sc = new Scanner(System.in);
        int userInput;
        System.out.print("Enter an Integer: ");
        userInput = sc.nextInt();
        System.out.println(userInput);*/

        /*String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        userInput = sc.next();
        System.out.println(userInput);*/

        /*String wordOne;
        String wordTwo;
        String wordThree;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        wordOne = sc.next();
        System.out.print("Enter second word: ");
        wordTwo = sc.next();
        System.out.print("Enter word three: ");
        wordThree = sc.next();
        System.out.print(wordOne + " " + wordTwo + " " + wordThree);*/
        String keepGoing = "y";
        while(keepGoing.equals("y")){
            keepGoing = measureRoom();
        }

    }
    /*private static double multiply(double a, double b){
        return a * b;
    }*/
    public static String measureRoom(){
        String keepGoing;
        double length;
        double width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the room length: ");
        length = sc.nextDouble();
        System.out.print("Enter the room width: ");
        width = sc.nextDouble();
        System.out.println("The perimeter of your room is " + ((length * 2) + (width * 2)));
        System.out.println("The area of your room is " + (length * width));
        System.out.print("Do you want to continue? (y/n) ");
        keepGoing = sc.next();
        return keepGoing;
    }
}
