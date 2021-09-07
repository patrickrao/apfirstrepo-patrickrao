
/**
 * Patrick
 * 9/7
 * Random Phone
 * This program generates a phone number with certain restraints.
 */

import java.util.*;
import java.util.Random;

public class RandomPhone
{
    public static void main(String[] args) {
        
        Random generator = new Random();
        int a = generator.nextInt(8);
        int b = generator.nextInt(8);
        int c = generator.nextInt(8);
        int def = generator.nextInt(743);
        int g = generator.nextInt(10);
        int h = generator.nextInt(10);
        int i = generator.nextInt(10);
        int j = generator.nextInt(10);

        System.out.println("Phone number: "+a+b+c+"-"+def+"-"+g+h+i+j);
        
        
        
        
        
        // 643-354-2231
        // 263-677-5067
    }

}
