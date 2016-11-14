import java.util.Scanner;
public class ControlStatementsLoops {
    public static void main(String[] args) {
        //whileExercise();
        //doWhileExercise();
        //forExercise();
        String keepGoing = "y";
        while(keepGoing.equals("y")){
            keepGoing = fizzbuzz();
        }
    }
    public static void whileExercise(){
        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }
    }
    public static void doWhileExercise(){
        long i = 2;
        do {
            System.out.println(i);
            i *= i;
        }while(i < 1000000);
    }
    public static void forExercise(){
        for(int i = 5; i<= 15; i++){
            System.out.println(i);
        }
        for(long j = 2; j < 1000000; j*=j){
            System.out.println(j);
        }
    }
    public static String fizzbuzz(){
        String keepGoing;
        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userInput = sc.nextInt();
        for(int i = 1; i <= userInput; i++){
            System.out.println(i + " squared is " + (i * i));
            System.out.println(i + " cubed is " + (i * i * i));
        }
        System.out.print("Do you want to continue?(y/n): ");
        keepGoing = sc.next();
        return keepGoing;
    }
}
