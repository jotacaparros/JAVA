/*
2.1.6.3. Create a program called NumbersStrings. This program must ask the user to
enter 4 numbers, that will be stored in 4 String variables. Then, the program will join
the first pair of numbers into a single integer value, and the second pair of numbers into
another integer value, and then add these values. For instance, if the user types the
numbers 23, 11, 45 and 112, then the program will create a first integer value of 2311
and a second integer value of 45112. Then, it will add these two values and get a final
result of 47423.

*/


import java.util.Scanner;

public class Ejercicio2_1_6_3 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Daddy? Give me 4 numbers for my pleasure: ");

        String one = sc.nextLine();
        String two = sc.nextLine();
        String three = sc.nextLine();
        String four = sc.nextLine();

        String pairOne = one + two;
        String pairTwo = three + four;

        int pairOneInt = Integer.parseInt(pairOne);
        int pairTwoInt = Integer.parseInt(pairTwo);

        int mix = (pairOneInt + pairTwoInt);

        System.out.println("This " + pairOne);
        System.out.println(" or that " + pairTwo);

        System.out.println("The black ship is " + mix);


    }


}