    /********************************************************************
// These are the notes for ch 2 used in hayes class
//******************************************************************* */
//Name
//Date
//Program
//Description
//Who helped me: Mr. Hayes

//Util is the package. Insi
import java.util.Random; // lets us use the random class
//you import the Scanner Class!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner; // last word is the the Class


import java.util.*;  // let me use any class in the package

//import java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;


public class ch2notes5

    {   enum Flavor {chocolate, strawberry, mitChocolateChip, razberry}
    
    
    public static void main (String[] args)
    {
            //Scanner scan = new Scanner (System.in);
            Scanner Keyboard = new Scanner(System.in);
            if(true)
            {
                
                
            }
            //Flavor cone = Flavor.razberry;
        
            //these are basic data types
                int length;
                int x = 9,y,z;
                int id = 789;
                double num = 5, num1 = 23.89765, num2 = 3.4;
                char letter = 'd'; // same as int. single quote ONLY used for char
                boolean choice = false;
                float num5 = 3.14f;
        
                //These are Objects
                Integer number = new Integer(47); // every basic data type has a wrapper class
                /* start with a letter or an _ 
                 * cannot use symbols except _ and $
                 * must have new
                 * has the same name as the class\
                 * constructor(data, may be optional)
                 * 
                 * Class    id  
                 * name
                 */
                String myname = new String("Kevin Hayes");
                Integer n2 = 7;//Auto Boxing
        
                String word = new String("Homer Simpson");
                String word2 = new String("Homer Simpson");
                String word3 = new String("Bart Simpson");
                String name = new String();
                //String is special!!! other class/obj can't do this
                String last = "Hayes";
                /*
                System.out.println(word.length());
                System.out.println("The name is "+name);
        
        
                System.out.printf("Name:  %s \t ID: %5d \n", name,id);
                System.out.println('a' + 100 ); //chars are ints
                System.out.println('a'   );
                System.out.println("A"+100  ); 
                System.out.println("The add is :" + 7 + 5);
                System.out.println(7 + 5 + "is the add");
        
        //      System.out.printf(  );
        
        //      System.out.printf( );
        
        //      System.out.println(  );
        
         //   System.out.println( );
         //   System.out.println(  );
        
        
        /**/
                num1 = 23.89765; num2 = 3.4;
        //Your create a NumberFormat and Decimalformat object
        
        /*
                NumberFormat money = NumberFormat.getCurrencyInstance();//abstraction
                NumberFormat percent = NumberFormat.getPercentInstance();
                DecimalFormat fmt = new DecimalFormat("0.###"); //DecimalFormat is a constructor
                DecimalFormat fmt2= new DecimalFormat("0.00");// ## vs 00
                
        
                System.out.println( "Sub Total: " + money.format(num1) );
                System.out.println( "Sub Total: " + percent.format(.5) );
                System.out.println( "Sub Total: " + fmt.format(num1) );
                System.out.println( "Sub Total: " + fmt2.format(num2) );
                System.out.println( "Sub Total: " + fmt.format(num2) );
                //.00 pads with 0s
                System.out.println( "Sub Total: " + fmt2.format(num1) );
                //\### limits to 3 decimal places    
        
        // page 90 Why do we get this Error???
        /**/
                System.out.print("Enter a number ");
                x = Keyboard.nextInt   ();
                System.out.println(x  );
                System.out.print("Enter a word ");
                //word = Keyboard.next   ();
                Keyboard.nextLine();
                word = Keyboard.nextLine   ();
                System.out.println("The word is " + word);
                System.out.println("Did you get to this line");
                
                System.out.print("Enter a number ");
                x = Keyboard.nextInt   ();
                y = Keyboard.nextInt   ();
                z = Keyboard.nextInt   ();
                System.out.print(x+ " "+y+" "+z);
        
        /*
                System.out.print("Enter a decimal");
                num = Keyboard.nextDouble ();
                System.out.println(num  );
        
        
                // what happens when you have both of these together
        /*
                System.out.print("Enter a word");
                
                word = Keyboard.next(); // nextline = next line, next = next white space
                //word = Keyboard.nextLine();
                System.out.println(word);
        
        /*      System.out.println( "enter a word" );
                word = Keyboard.nextLine();
                System.out.println(word);
        /*
                System.out.print("Enter a word "  );
                word = Keyboard.next   ();
                lname = Keyboard.next();
                System.out.println(word + "\n" + lname  );
        
        
        
        /*
        //  Can we make a Math Object? What type of class is Math???
        // Do not make objects from static classes.pg88   Math silly = new Math();
        
                System.out.println(Math.abs(-4));
                System.out.println(Math.sqrt (12));
                System.out.println(Math.pow(2,3)*10); // these return a number
        //      System.out.println(silly.pow(2,4));
        
        
        /*
        //!!!!!!!!!!!! Make a Random Object called generator
                Random generator = new Random();
                // 100 numbers from 0-99
                x = generator.nextInt(100);
                System.out.println("the Random number is " + x);
        //decimal of 17 digits from 0 - 1 exclusive
                num =generator.nextDouble()*50;
                System.out.println(num);
                // how many numbers + the range
                num = Math.random() * 100  -50;
                System.out.println(num);
                
        /*
        
        /*
        //----------------------------Know it live it love it p 78
                //word is an oject can do things (NOT len(word))
                System.out.println(  word.length() );
                System.out.println(  word == word2 ); // compares object to object
                System.out.println(  word.equals(word2) );
                System.out.println(  x == 9 );
                System.out.println(  word.compareTo(word3 ));// pos after neg before
                System.out.println(  word3.compareTo(word ));// compares first letter
                System.out.println(  word.indexOf("p"));
                System.out.println(  word.substring(word.indexOf("e")));
                int find = word.indexOf("S");
                System.out.println(  word.substring(find, find+2));
                // substring(start, end-1)
        
        
        
        
        
        
        //System.out.println((int)(letter + letter ) );
        
            //System.out.println( (char)101 );
        /*
                double conversionFactor = (double)x/5; //9/5 logic error -- promotion 5.0
                // int divided by int gives integer result
                System.out.println(conversionFactor);
                final int BASE = 32;            // cast is (data type)
                int celsiusTemp = 30;
        
                double fahrenTemp = celsiusTemp * conversionFactor + BASE;
        
                System.out.println("Celsius Temp: " + celsiusTemp );
                System.out.println("Fahrenheit Equivalent" + fahrenTemp  );
                
                System.out.println((int)(Math.random()*100));
        
        /*
            //num = num + num;
            //num = num - num;
            //num = num * num;
            //num = num / num;
            num = num % 3;
            System.out.println(num);
        
        
        
        /**/
        
    }//end of main
    
}//end of class

















