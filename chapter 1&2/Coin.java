
/**
 * Receives amount of penny/nickel/dime/quarter, then finds the value.
 *
 * Patrick
 * @version (a version number or a date)
 */

import java.util.*;
import java.text.DecimalFormat;

public class Coin
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many pennies? ");
        int pennies = input.nextInt();
        System.out.print("How many nickels? ");
        int nickels = input.nextInt();
        System.out.print("How many dimes? ");
        int dimes = input.nextInt();
        System.out.print("How many quarters? ");
        int quarters = input.nextInt();
        
        DecimalFormat fmt = new DecimalFormat("$0.##");
        // Calculating the total amount of money using values
        double totalcash = 0.25 * quarters + 0.10 * dimes + 0.05 * nickels + 0.01 * pennies;
        System.out.println("Total value of coins: " + fmt.format(totalcash));
        
        
        
        
        
        
        
       
    }
}
