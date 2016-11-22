import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ArraysExercise {
    public static void main(String[] args) {
       /* String[] arrayOfAdjectives = {"Alarmed", "Alert", "Ample", "Breakable", "Bumpy", "Biodegradable", "Bountiful",
        "Candid", "Chubby", "Crushing", "Cooked", "Dapper", "Downright", "Dry", "Delectable", "Deadly", "Enchanting",
        "Metal", "Massive", "Disrespectful", "Sexy", "Hot", "Bearded", "Duck-like", "Insanely Creepy", "Naked", "Shaky", "Sick",
        "Fluffy", "Unholy", "Filthy", "Fighting", "Frisky", "Hideous", "Abusive", "Drunken", "Useless", "High-End", "Costumed",
        "Alcoholic", "Disgusting", "Adulterous", "Misunderstood", "Mentally Impaired"};
        String[] arrayOfNouns = {"Toaster", "Acura Legend", "Marketing Idea", "Sandwich", "Friendly Grandma", "Antidepressant Drug",
        "Corn Cake", "President of the Night", "Coffee Pot", "Useless Brakes", "Skinny Woman", "Elastic Band", "Karate", "People who are Hurt",
        "Mad Cow Disease", "Kitty Cat", "Hairy Legs", "Mad-Dog Skullcap", "Keepsake Machete", "Dog Poop", "Mental Disorder", "Sweet Tailpipe"};
        String adjective = getRandom(arrayOfAdjectives);
        String noun = getRandom(arrayOfNouns);
        System.out.println("Your new server name is: " + adjective + " " + noun);*/

        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);
        int numberOfAtBats;
        int[] basesEarnedPerBat;
        int numberOfHits = 0;
        int numberOfBases = 0;
        double battingAverage;
        double sluggingPercentage;

        while (keepGoing) {
            numberOfAtBats = getNumberOfBats(sc);
            basesEarnedPerBat = new int[numberOfAtBats];
            for (int i = 0; i < numberOfAtBats; i++) {
                basesEarnedPerBat[i] = getBasesEarned(sc, i);
            }
            for (int hit : basesEarnedPerBat) {
                if (hit != 0) {
                    numberOfHits++;
                }
                numberOfBases += hit;
            }
            battingAverage = (double) numberOfHits / (double) numberOfAtBats;
            sluggingPercentage = (double) numberOfBases / (double) numberOfAtBats;
            System.out.printf("Batting average is %.3f", battingAverage);
            System.out.printf("\nSlugging percentage is %.3f", sluggingPercentage);
            keepGoing = keepGoing(sc);
            numberOfHits = 0;
            numberOfBases = 0;
        }
    }
    public static String getRandom(String[] array){
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    public static int getNumberOfBats(Scanner sc){
        int numberOfAtBats;
        while(true){
            try {
                System.out.print("Enter the number of at bats for this player: ");
                numberOfAtBats = sc.nextInt();
                if (numberOfAtBats <= 0){
                    System.out.println("Please enter a valid number of bats");
                    continue;
                }
                return numberOfAtBats;
            } catch(InputMismatchException e) {
                sc.next();
                System.out.println("Please Enter a valid number of bats");
                return getNumberOfBats(sc);
            }
        }
    }
    public static int getBasesEarned(Scanner sc, int baseNumber){
        int basesEarned;
        while(true) {
            try {
                System.out.print("Enter the number of bases earned for bat " + (baseNumber + 1) + ": ");
                basesEarned = sc.nextInt();
                if (basesEarned < 0 || basesEarned > 4) {
                    System.out.println("Enter a valid number of bases earned");
                    continue;
                }
                return basesEarned;
            }catch(InputMismatchException e){
                System.out.println("Enter a valid number of bases earned");
                return getBasesEarned(sc, baseNumber);
            }
        }
    }
    public static boolean keepGoing(Scanner sc){
        String keepGoing;
        while(true) {
            try {
                System.out.print("\nDo you want to calculate for another player? (y/n): ");
                keepGoing = sc.next();
                if (!keepGoing.equalsIgnoreCase("y") && !keepGoing.equalsIgnoreCase("n")) {
                    System.out.println("Please enter a valid character");
                    continue;
                }
                return (keepGoing.equalsIgnoreCase("y")) ? true : false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Please enter a valid character");
                return keepGoing(sc);
            }
        }
    }
}
