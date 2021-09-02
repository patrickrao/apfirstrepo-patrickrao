
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.text.DecimalFormat;

public class Coin
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many pennies? ");
        double pennies = input.nextInt();
        System.out.print("How many nickels? ");
        double nickels = input.nextInt();
        System.out.print("How many dimes? ");
        double dimes = input.nextInt();
        System.out.print("How many quarters? ");
        double quarters = input.nextInt();
        
        DecimalFormat fmt = new DecimalFormat("0.##");
        
        double totalcash = 0.25 * quarters + 0.10 * dimes + 0.05 * nickels + 0.01 * pennies;
        System.out.println(fmt.format(totalcash));
        
        
        
        
        
        
        
       
    }
}
