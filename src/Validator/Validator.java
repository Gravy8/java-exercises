package Validator;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Validator {
    public static int getInt(String prompt){
        Scanner sc = new Scanner(System.in);
        int userInput;
        while(true) {
            try {
                System.out.print(prompt);
                userInput = sc.nextInt();
                return userInput;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Enter an integer");
            }
        }
    }

    public static int getIntWithinRange(String prompt, int min, int max){
        while(true){
            int userInput = getInt(prompt);

            try{
                if(userInput < min || userInput > max){
                    throw new InputMismatchException();
                }
                return userInput;
            } catch (InputMismatchException e){
                System.out.println("Enter a valid integer");
            }
        }
    }

    public static double getDouble(String prompt){
        Scanner sc = new Scanner(System.in);
        double userInput;

        while(true){
            try{
                System.out.print(prompt);
                userInput = sc.nextDouble();
                return userInput;
            }catch (InputMismatchException e){
                sc.next();
                System.out.println("Enter a number");
            }
        }
    }

    public static double getPositiveDouble(String prompt){
        while(true){
            double userInput = getDouble(prompt);

            try{
                if(userInput < 0){
                    throw new InputMismatchException();
                }
                return userInput;
            }catch(InputMismatchException e){
                System.out.println("Enter a valid number");
            }
        }
    }

    public static double getDoubleGreaterThanZero(String prompt){
        while(true){
            double userInput = getDouble(prompt);

            try{
                if(userInput <= 0){
                    throw new InputMismatchException();
                }
                return userInput;
            }catch(InputMismatchException e){
                System.out.println("Enter a number greater than zero");
            }
        }
    }

    public static String getString(String prompt){
        Scanner sc = new Scanner(System.in);
        String userInput;
        while(true) {
            try {
                System.out.print(prompt);
                userInput = sc.next();
                return userInput;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a string");
            }
        }
    }

    public static String getStringOnlyLetters(String prompt){
        Scanner sc = new Scanner(System.in);
        String userInput;
        while(true) {
            try {
                System.out.print(prompt);
                userInput = sc.next();
                if (!onlyLetters(userInput)) {
                    throw new InputMismatchException();
                }
                return userInput;
            } catch (InputMismatchException e) {
                System.out.println("Please make a valid entry");
            }
        }
    }

    private static boolean onlyLetters(String name){
        char[] nameArray = name.toCharArray();
        for(char c : nameArray){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }

}
