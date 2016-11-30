package Validator;

import java.util.Scanner;
import java.util.InputMismatchException;
public class KeepGoing {
    public static boolean check(String prompt){
        Scanner sc = new Scanner(System.in);
        String keepGoing;
        while(true) {
            try {
                System.out.print(prompt);
                keepGoing = sc.next();
                if (!keepGoing.equalsIgnoreCase("y") && !keepGoing.equalsIgnoreCase("n")) {
                    System.out.println("Please enter a valid character");
                    continue;
                }
                if(keepGoing.equalsIgnoreCase("y")){
                    return true;
                }
                return false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Please enter a valid character");
            }
        }
    }
}
