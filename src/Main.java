//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Declaring variables
        Scanner in = new Scanner(System.in);
        double gallonsGas = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double pricePerHundredMiles = 0;
        double totalMilesCanTravel = 0;
        String trash = ""; //for bad input use
        Boolean done = false;

        //do while loop for each of the 3 variables that need input
        do
        {
            System.out.println("Enter the number of gallons of gas in the tank:");

            if(in.hasNextDouble()) //need this if else statement to read in a valid number and not a string
            {
                gallonsGas = in.nextDouble();
                in.nextLine(); //clearing buffer
                //need this if statement to set condition so user cannot input negative gallons of gas
                if(gallonsGas > -1)
                {
                    done = true; //we got a valid number so loop ends
                }
                else
                {
                    if(gallonsGas <= -1)
                    {
                        System.out.println("Please enter a valid positive number, not " + gallonsGas);
                    }
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not " + trash);
            }
        } while(!done);
        //need another do while loop for next variable that requires input from user
        do
        {
            System.out.println("Enter the fuel efficiency as miles per gallon of your vehicle:");

            if(in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine(); //clearing buffer

                if(milesPerGallon > -1) //cannot travel negative miles per gallon
                {
                    done = true; //we got a valid number so loop ends
                }
                else
                {
                    if(milesPerGallon <= -1)
                    {
                        System.out.println("Please enter a valid positive number, not " + milesPerGallon);
                    }
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not " + trash);
            }
        } while(!done);
        //need yet another do while loop for variable that needs user input
        do
        {
            System.out.println("Enter the price of gas per gallon:");

            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine(); //clearing buffer
                if(pricePerGallon > 0) //no such thing as free gas
                {
                    done = true; //we got a valid number so loop ends
                }
                else
                {
                    if(pricePerGallon <= 0)
                    {
                        System.out.println("Please enter a valid positive number, not " + pricePerGallon);
                    }
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not " + trash);
            }
        } while(!done);

        pricePerHundredMiles = (100 / milesPerGallon) * pricePerGallon;
        System.out.println("The cost per 100 miles is : " + pricePerHundredMiles);
        totalMilesCanTravel = (gallonsGas * milesPerGallon);
        System.out.println("Your vehicle can travel a total of " + totalMilesCanTravel + " with " + gallonsGas + " gallons of gas at " + milesPerGallon + " mpg");

    }
}