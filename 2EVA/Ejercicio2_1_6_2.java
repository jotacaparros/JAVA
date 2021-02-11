/*
2.1.6.2. Create a program called GramOunceConverter that converts from grams to
ounces. The program will ask the user to enter a weight in grams (an integer number),
and then it will show the corresponding weight in ounces (a real number), taking into
account that 1 ounce = 28.3495 grams.
*/

import java.util.Scanner;

public class Ejercicio2_1_6_2 {

       public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Put grams to convert ounces");

        int grams = sc.nextInt();

        double ounce = (grams / 28.3495);

        System.out.println(grams + " grams are " + (float) ounce + " ounces.");
        
    }
}