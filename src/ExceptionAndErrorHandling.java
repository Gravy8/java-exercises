import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionAndErrorHandling {
    public static void main(String[] args) {
        String studentName;
        int studentAge;
        String whyProgramming;
        studentName = getStudentName();
        studentAge = getStudentAge();
        whyProgramming = whyProgrammingQuestion();
        System.out.println("Students name is " + studentName + " and they are " + studentAge + " year(s) old");
        System.out.println("When asked why they want to learn programming, " + studentName + " said \"" + whyProgramming + "\"");
    }
    public static String getStudentName(){
        Scanner sc = new Scanner(System.in);
        String studentName;
        try{
            System.out.print("Enter the students first name: ");
            studentName = sc.next();
            if (!onlyLetters(studentName)){
                throw new InputMismatchException();
            }
        } catch(InputMismatchException e){
            System.out.println("Please enter a valid first name");
            return getStudentName();
        }
        return studentName;
    }
    public static boolean onlyLetters(String name){
        char[] nameArray = name.toCharArray();
        for(char c : nameArray){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
    public static int getStudentAge(){
        Scanner sc = new Scanner(System.in);
        int studentAge;
        try{
            System.out.print("Enter students age: ");
            studentAge = sc.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Enter a valid age please");
            return getStudentAge();
        }
        return studentAge;
    }
    public static String whyProgrammingQuestion(){
        Scanner sc = new Scanner(System.in);
        String answer;
        try{
            System.out.print("Why does this student want to learn programming: ");
            answer = sc.nextLine();
            if (answer.equals("")){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e){
            System.out.println("Please enter some information");
            return whyProgrammingQuestion();
        }
        return answer;
    }
}
