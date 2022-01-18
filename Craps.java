
/**
 * Craps project
 *
 * @author Libby Konjoyan
 * @version 11.1.22
 */

import java.util.Scanner;

public class Craps
{
    //instructions method
    public static void instructions()
    {
        System.out.println("The basic rules for playing craps:");
        System.out.println("A player rolls two six-sided dice and adds the numbers together");
        System.out.println("On the first roll: 7 or 11 automatically wins");
        System.out.println("                 : 2, 3, or 12 automatically loses");
        System.out.println("                 : 4, 5, 6, 8, 9, 10 become the 'point'");
        System.out.println("The point is now the number you want to roll to win");
        System.out.println("The player continues the roll the two d6 until they roll the point");
        System.out.println("OR the player rolls a 7, which is an automatic loss");
    }

    public static void main(String[] args)
    {
        //welcome
        Scanner in = new Scanner(System.in);
        boolean win = false;
        boolean playing = true;
        System.out.println("Shall we play a game of craps?");
        while (playing)
        {
            System.out.println("Would you like to see the instructions on how to pay craps? (yes or no) ");
            response = in.nextLine();
            if (response == "yes")
            {
                instructions();
            }
            //need to have two dice rolls
            System.out.println("Hit enter to roll dice: ");
            response = in.nextLine();
            System.out.println(//Die.rollDie());

            //dice rolling --> call die class
            int die1 = //first die
            int die2 = //second die
            int point = die1 + die2;
            System.out.println("Your roll total is : " + point);
            if (point == 7 || point == 11)
            {
                win = true;
            }
            else if (point == 2 || point == 3 || point == 12)
            {
                win = false;
            }
            else
            {
                while (!win)
                {
                    //reroll die
                    // compare to losing value or point
                }
            }
            if (win)
            {
                System.out.println("You won!");
            }
            else
            {
                System.out.println("Game over!");
            }
            System.outl.println("Would you like to play again? (y/n)");
            String response = in.next();
            if (response.equalsIgnoreCase("y"))
            {
                playing = true;
            }
            else
            {
                playing = false;
                System.out.println("Thank you for playing. Goodbye...");
            }
        }
    }
}