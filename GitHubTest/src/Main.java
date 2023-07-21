//NOTE: The comment block below will be at the top of every coding assignment. You MUST fill it out with your name and
//  your South Hills username. Your South Hills username is your email without the @southhills.edu part.
/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */

public class Main
{
    // Replace the characters between the double-quotes with your name
    private static final String YOUR_NAME = "YOUR NAME HERE";

    public static void main(String[] args)
    {
        //The "comment" below suppresses a warning. If you're curious, you can remove it to see what happens.
        //noinspection ConstantValue
        if(YOUR_NAME.equals("YOUR NAME HERE"))
        {
            System.err.println("You must change the variable \"YOUR_NAME\" to your name!");
        }
        else
        {
            System.out.printf("Hello, %s!%n", YOUR_NAME);
            System.out.println("If you can see this, then your installations succeeded without issue!");
        }
    }
}