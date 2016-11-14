import java.util.Scanner;
public class ControlStatementsLoops {
    public static void main(String[] args) {
        //whileExercise();
        //doWhileExercise();
        //forExercise();
        String keepGoing;
        /*do{
            keepGoing = fizzbuzz();
        } while(keepGoing.equals("y"));*/
        do{
            keepGoing = grades();
        } while(keepGoing.equals("y"));
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

    public static String grades(){
        int userGrade;
        String keepGoing;
        char letterGrade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        userGrade = sc.nextInt();
        if (userGrade >= 0 && userGrade < 61){
            letterGrade = 'F';
        } else if (userGrade < 67){
            letterGrade = 'D';
        } else if (userGrade < 80){
            letterGrade = 'C';
        } else if (userGrade < 88){
            letterGrade = 'B';
        } else{
            letterGrade = 'A';
        }
        System.out.println("Your letter grade is " + letterGrade);
        System.out.print("Do you want to enter another grade?(y/n): ");
        keepGoing = sc.next();
        return keepGoing;
    }
}
