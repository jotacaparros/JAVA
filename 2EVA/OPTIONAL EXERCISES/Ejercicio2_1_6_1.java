/* Create a program called FormattedDate with a class with the same name
inside. The program will ask the user to enter the day, month and year of birth (all
values are integers). Then, it will print his birth date with the format d/m/y. For
instance, if the user types day = 7, month = 11, year = 1990, the program will output
7/11/1990 */

import java.util.Scanner;

public class Ejercicio2_1_6_1 {

    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Hi buddy please tell me the day of your birth:");

        int day = sc.nextInt();

        System.out.print("Now tell me the month of your birth (Only numbers):");

        int month = sc.nextInt();

        System.out.print("Finaly, tell me the year:");

        int year = sc.nextInt();

        System.out.print("Your birthday is in : " + day + "/" + month + "/" + year );
    }
}