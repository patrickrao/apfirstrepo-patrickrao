
/**
 * Patrick
 * 9/7
 * Circle Sphere
 * This program finds area and circumference of a circle with a given radius
 */
import java.util.*;

public class CircleSphere
{
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
    
    
        System.out.print("Input radius for a circle: ");
        int radius = input.nextInt();
        //Calculating circumference and area
        double pi = Math.PI;
        double circumference = pi * radius * 2;
        double circlearea =  pi * radius * radius;

        System.out.println("Circle circumference: " + circumference);
        System.out.println("Circle area: " + circlearea);

    
    }
}
