import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color = "";
        String pastTenseVerb = "";
        String adjective = "";
        String noun = "";
        String playAgain = "";

        do {
            System.out.println("Type a color");
            color = scan.nextLine();

            System.out.println("Type a verb in the past tense");
            pastTenseVerb = scan.nextLine();

            System.out.println("Type an adjective (such as 'silly')");
            adjective = scan.nextLine();

            System.out.println("Type a noun");
            noun = scan.nextLine();

            System.out.println("Your MadLibs story:");
            System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
            System.out.println(" knight, who rode in on a stury, giant " + noun + ".");

            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing MadLibs, goodbye!");
        scan.close();
    }
}


