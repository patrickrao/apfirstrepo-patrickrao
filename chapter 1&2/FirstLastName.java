
/**
 * asks user for first and last name, then displays components
 *
 * Patrick
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.Scanner;

public class FirstLastName
{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String fullname = Input.nextLine();

        // finding position of 1st space, and then displaying info before it
        int a = fullname.indexOf(' ');
        String first = fullname.substring(0, a);
        int b = (fullname.substring(a)).indexOf(' ');
        // String middle = fullname.sub
        System.out.print(fullname.substring(b));
        String middle = fullname.substring(a,b);
        int c = fullname.substring(b).indexOf(' ');
        String last = fullname.substring(b+1);
        System.out.print("First " + first);
        System.out.print("Middle " + middle);
        System.out.print("Last " + last);
        
        
        
     
        
    }
}
