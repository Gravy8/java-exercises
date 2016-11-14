import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        stringBasics();
        toPigLatin();
    }

    public static void stringBasics(){
        String message;
        message = "We don't need no education";
        System.out.println(message);
        message = "We don't need no though control";
        System.out.println(message);
        message = "Check \"this\" out!, \"s inside of \"s";
        System.out.println(message);
        message = "In Windows, the main drive is usually C:\\";
        System.out.println(message);
        message = "I can do back slashes \\, and double back slashes \\\\, and the amazing triple back-slash \\\\\\!";
        System.out.println(message);
    }
    public static void toPigLatin(){
        String userInput;
        String pigLatin;
        String consonants = "";
        int userInputLength;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        userInput = sc.next();
        userInputLength = userInput.length();
        userInput = userInput.toLowerCase();
        if (userInput.startsWith("a") || userInput.startsWith("e") || userInput.startsWith("i") || userInput.startsWith("o") || userInput.startsWith("u")){
            pigLatin = userInput + "way";
        } else {
            for (int i = 0; i < userInputLength; i++){

            }
        }

    }
}
