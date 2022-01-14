
/**
 * Die, a singular dice
 *
 * @author Libby Konjoyan
 * @version 11.1.22
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     * Give the die a random initial value
     */
    public Die()
    {
        // initialise instance variables
        roll = rollDie();
    }

    /**
     * Rolls the die
     * @return the value of the die after the roll;
     */
    public int rollDie()
    {
        // put your code here
        roll = (int)(Math.random() * 6 +1);
        return roll;
    }
    
    /**
     * Gets the value of the die without rolling it;
     * @return the value of the die;
     */
    public int getRoll()
    {
        return roll;
    }
}
