
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
        System.out.println("Hello, would you like to play a game of craps? (yes or no) ");
        String response = in.nextLine();
        if (response != "yes")
        {
            //end program
        }
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
        
    }
}
