
/**
 * Patrick and Alex
 * 9/7
 * Hours Minutes Seconds
 * This program converts seconds to hr/min/sec
 */

import java.util.*;

public class hourMinSec {
   
   
   public static void main(String[] args) {
        //declare all variables
        Scanner Input = new Scanner(System.in);
        int hour1, min1;
        int hour, sec, min;
        int input;
       
        //prompts seconds
        System.out.print("Input seconds: ");
        input = Input.nextInt();
       
        //calculate Hours, minutes, seconds
        hour = input / 3600;
        min = (input % 3600) / 60;
        sec = input % 60;
       
        
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + sec);
    }
}