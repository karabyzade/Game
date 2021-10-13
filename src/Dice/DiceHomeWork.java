package Dice;
import java.util.Random;
public class DiceHomeWork {
    public static void main(String[] args)
    {
        int All;
        int i = 0;

        System.out.println("I want to play a Game");

        for(All = 0; All < 50; i++){
            Random random = new Random();
            int dice = random.nextInt(6) + 1;

            if ((dice == 1) || (dice == 2)) {
                System.out.println("Game over!");
                break;
            }
            if (dice == 3) {
                All = All + 0;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + All + "$");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 4) {
                All = All + 4;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + All + "$");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 5) {
                All = All + 5;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + All + "$");
                dice = random.nextInt(6) + 1;
            }
            if (dice == 6) {
                All = All + 6;
                System.out.println("Dice:" + dice);
                System.out.println("Earned" + All + "$");
                dice = random.nextInt(6) + 1;
            }
        }
        if (All >= 50) {
            System.out.println("Max prize." + "\n" + "Your moneyyy: " + All + "$");


        }
    }
}
