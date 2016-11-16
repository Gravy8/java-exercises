import java.util.Scanner;
import java.util.InputMismatchException;
public class GameDevelopment102 {
    public static void main(String[] args) {
        String sideOfTable;
        String userSwing;
        String cpuSwing;
        int cpuScore = 0;
        int playerScore = 0;
        System.out.println("Lets Play Ping Pong!");
        while (true){
            userSwing = userTurn();
            sideOfTable = ballControl();
            if (userSwing.equalsIgnoreCase(sideOfTable)){
                System.out.println("You hit the ball");
                cpuSwing = cpuTurn();
                sideOfTable = ballControl();
                if(cpuSwing.equals(sideOfTable)){
                    System.out.println("CPU hit the ball");
                    continue;
                } else{
                    System.out.println("CPU missed. Point Player");
                    playerScore++;
                    System.out.println("The score is\nPlayer: " + playerScore + "\nCPU: " + cpuScore);
                }

            } else{
                System.out.println("You missed. Point CPU");
                cpuScore++;
                System.out.println("The score is\nPlayer: " + playerScore + "\nCPU: " + cpuScore);
            }
            if (playerScore == 7){
                System.out.println("You Win!");
                break;
            }
            if (cpuScore == 7){
                System.out.println("CPU Wins!");
                break;
            }
        }
    }
    public static String ballControl(){
        String sideOfTable = "right";
        int sideOfTableNumber = (int) Math.floor(Math.random() * 2);
        if(sideOfTableNumber == 0){
            sideOfTable = "left";
        }
        return sideOfTable;
    }
    public static String userTurn(){
        Scanner sc = new Scanner(System.in);
        String userSwing;
        System.out.print("Which side of the table will you swing your paddle(left/right): ");
        try{
            userSwing = sc.next();
            if (!(userSwing.equalsIgnoreCase("left")) && !(userSwing.equalsIgnoreCase("right"))){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e){
            System.out.println("Please enter either \"right\" or \"left\"");
            return userTurn();
        }
        return userSwing;
    }
    public static String cpuTurn(){
        String cpuSwingString = "right";
        int cpuSwingInt = (int) Math.floor(Math.random() * 2);
        if (cpuSwingInt == 0){
            cpuSwingString = "left";
        }
        return cpuSwingString;
    }
}
