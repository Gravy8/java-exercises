import Validator.Validator;
import Validator.KeepGoing;

import java.util.ArrayList;
public class StudentScoreApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        boolean keepGoing = true;

        System.out.println("Welcome to the Student Score Application");

        while(keepGoing){
            Student newStudent = getStudentInfo();
            students.add(newStudent);

            keepGoing = KeepGoing.check("Do you want to enter another student? (y/n): ");
        }

        students.sort((a, b) -> a.compareTo(b));
        for(Student student : students){
            System.out.println(student.firstName + " " + student.lastName + " Score: " + student.score);
        }


    }

    private static Student getStudentInfo(){
        String firstName;
        String lastName;
        int score;

        firstName = Validator.getStringOnlyLetters("Enter the students first name: ");
        lastName = Validator.getStringOnlyLetters("Enter the students last name: ");
        score = Validator.getIntWithinRange("Enter the students score: ", 0, 100);

        return new Student(firstName, lastName, score);
    }
}
