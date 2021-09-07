    
    /**
     * Patrick
     * 9/7
     * First Middle Last
     * Asks user for first middle and last name, then displays components
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

            int b = (fullname.substring(a+1)).indexOf(' ');
            a = a + 1;
            // adding 1 to a, so that the next time I scan for a space
            // I will find a different space
            String middle = fullname.substring(a,b+a);
            b = b + 1;
            // adding 1 to b, so that the next time I scan for a space
            // I will find a different space
            int c = fullname.substring(b+1).indexOf(' ');
            String last = fullname.substring(a+b);
            System.out.println(first + " " + middle);
            System.out.println(last);
            
            // Billy Bob Joe
            // Billy Bob
            // Joe
            // ---------------
            // Your Real Mom
            // Your Real
            // Mom
     
        
    }
}
