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
        boolean done = false;

        //do while loop for each of the 3 variables that need input
        do
        {
            System.out.println("Enter the number of gallons of gas in the tank:");

            if(in.hasNextDouble())
            {
                gallonsGas = in.nextDouble();
                in.nextLine(); //clearing buffer

                if(gallonsGas >= 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Please enter a positive number, not " + gallonsGas);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid number not " + trash);
            }
        } while(!done);
        //resets sentinel
        done = false;
        //another do while for next variable requiring input from user
        do
        {
            System.out.println("Enter the fuel efficiency number of miles per gallon your vehicle gets:");

            if(in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine(); //clearing buffer

                if(milesPerGallon >= 0) //cannot have negative miles per gallon
                {
                    done = true;
                }
                else
                {
                    System.out.println("Please enter a positive number, not " + milesPerGallon);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid number not " + trash);
            }
        } while(!done);
        //resetting sentinel
        done = false;
        //another for the final variable needing input
        do
        {
            System.out.println("Enter the price per gallon:");

            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine(); //clearing buffer

                if(pricePerGallon >= 0) //gas is not free
                {
                    done = true;
                }
                else
                {
                    System.out.println("Please enter a positive number, not " + pricePerGallon);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid number not " + trash);
            }
        } while(!done); //???WHAT IS GOING ON???

        //now compute the other variables and output the results to the user
        pricePerHundredMiles = (100 / milesPerGallon) * pricePerGallon;
        totalMilesCanTravel = (gallonsGas * milesPerGallon);
        System.out.println("The price of every 100 miles is " + pricePerHundredMiles);
        System.out.println("Your vehicle can travel a total of " + totalMilesCanTravel + " with " + gallonsGas + " in the vehicle");

    }
}
