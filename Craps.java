
/**
 * Craps project
 *
 * @author Libby Konjoyan
 * @version 11.1.22
 */

import java.util.Scanner;

public class Craps
{
    /**
     * instructions method
     * Prints out the instructions for a game of craps
     */
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
    
    /**
     * Main method: runs the program
     */
    public static void main(String[] args)
    {
        //welcome
        Scanner in = new Scanner(System.in);
        Die die = new Die();
        boolean win = false;
        boolean playing = true;
        System.out.println("Shall we play a game of craps?");
        while (playing)
        {
            System.out.println("Would you like to see the instructions on how to pay craps? (y/n) ");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("y"))
            {
                instructions();
            }
            System.out.println("Hit enter to roll dice: ");
            response = in.nextLine();
            int die1 = die.rollDie();
            int die2 = die.rollDie();
            int point = die1 + die2;
            System.out.println("First die: " + die1 + ", Second die: " + die2 + ", Point: " + point);
            
            //compare to winning or losing values
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
                boolean doneRolling = false;
                while (!doneRolling)
                {
                    //reroll die
                    System.out.println("Hit enter to roll again");
                    response = in.nextLine();
                    die1 = die.rollDie();
                    die2 = die.rollDie();
                    int diceSum = die1 + die2;
                    System.out.println("You rolled a " + diceSum);
                    
                    // compare to losing value or point
                    if (diceSum == point)
                    {
                        win = true;
                        doneRolling = true;
                    }
                    else if (diceSum == 7)
                    {
                        win = false;
                        doneRolling = true;
                    }
                    else
                    {
                        doneRolling = false;
                    }
                }
            }
            
            //win or lose
            if (win)
            {
                System.out.println("You won!");
            }
            else
            {
                System.out.println("Game over!");
            }
            
            //asks if user would like to play again
            System.out.println("Would you like to play again? (y/n)");
            response = in.nextLine();
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

/*

COMMENTS FROM THE INSTRUCTOR:

This is wonderful, Libby! You did a great job of correctly implementing the rules
of the game of Craps, and your program works just as it should.

One detail: the assignment asked you to implement a "default value" that would
be used when answering Yes-No questions. You didn't do that, but it's a nice
feature to include, as it streamlines play for the user.

Overall, though, excellent work! Thank you!

SCORE: 50/50

*/

