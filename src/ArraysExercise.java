import java.util.Random;
public class ArraysExercise {
    public static void main(String[] args) {
        String[] arrayOfAdjectives = {"Alarmed", "Alert", "Ample", "Breakable", "Bumpy", "Biodegradable", "Bountiful",
        "Candid", "Chubby", "Crushing", "Cooked", "Dapper", "Downright", "Dry", "Delectable", "Deadly", "Enchanting",
        "Metal", "Massive", "Disrespectful", "Sexy", "Hot", "Bearded", "Duck-like", "Insanely Creepy", "Naked", "Shaky", "Sick",
        "Fluffy", "Unholy", "Filthy", "Fighting", "Frisky", "Hideous", "Abusive", "Drunken", "Useless", "High-End", "Costumed",
        "Alcoholic", "Disgusting", "Adulterous", "Misunderstood", "Mentally Impaired"};
        String[] arrayOfNouns = {"Toaster", "Acura Legend", "Marketing Idea", "Sandwich", "Friendly Grandma", "Antidepressant Drug",
        "Corn Cake", "President of the Night", "Coffee Pot", "Useless Brakes", "Skinny Woman", "Elastic Band", "Karate", "People who are Hurt",
        "Mad Cow Disease", "Kitty Cat", "Hairy Legs", "Mad-Dog Skullcap", "Keepsake Machete", "Dog Poop", "Mental Disorder", "Sweet Tailpipe"};
        String adjective = getRandom(arrayOfAdjectives);
        String noun = getRandom(arrayOfNouns);
        System.out.println("Your new server name is: " + adjective + " " + noun);
    }
    public static String getRandom(String[] array){
        int random = new Random().nextInt(array.length);
        return array[random];
    }
}
