
/**
 * Write a description of class CircleSphere here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class CircleSphere
{
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
    
    
        System.out.print("Input radius for a circle: ");
        int radius = input.nextInt();
    
        double pi = Math.PI;
        double circumference = pi * radius * 2;
        double circlearea =  pi * radius * radius;

        System.out.println("Circle circumference: " + circumference);
        System.out.println("Circle area: " + circlearea);

    
    }
}
