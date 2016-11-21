import java.util.Scanner;
import java.util.InputMismatchException;
public class DiscountEnumExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = promptForTotal(sc);
        double totalAfterDiscount;
        Colors random = getColorForDiscount();
        totalAfterDiscount = total * random.discount;
        System.out.println(random);
        System.out.printf("%.2f", totalAfterDiscount);
    }
    public static enum Colors{
        RED(1.0), BLUE(.9), YELLOW(.75), GREEN(.65), PURPLE(.5), PINK(0);
        private final double discount;
        Colors(double discount){
            this.discount = discount;
        }

    }
    public static float promptForTotal(Scanner sc){
        float enteredTotal;
        while(true) {
            try {
                System.out.print("Enter your receipt total: ");
                enteredTotal = sc.nextFloat();
                if (enteredTotal <= 0) {
                    System.out.println("Please enter a valid price");
                    continue;
                }
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Please enter a valid price");
                return promptForTotal(sc);
            }
            return enteredTotal;
        }
    }
    public static Colors getColorForDiscount(){
        int randomNumber = (int) Math.floor(Math.random() * 6) + 1;
        Colors toApply = Colors.PINK;
        switch(randomNumber){
            case 1:
                toApply = Colors.RED;
                break;
            case 2:
                toApply = Colors.BLUE;
                break;
            case 3:
                toApply = Colors.YELLOW;
                break;
            case 4:
                toApply = Colors.GREEN;
                break;
            case 5:
                toApply = Colors.PURPLE;
                break;
        }
        return toApply;
    }
}
