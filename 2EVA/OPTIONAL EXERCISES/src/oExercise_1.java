/*Create a program that prints the first n squared numbers, asking to the user the
number n. */

import java.util.Scanner;

public class oExercise_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int square = 0; int prev_x = 0; int numberUser;

        System.out.println("Please choose a number");
        numberUser = sc.nextInt();

            for (int x = 0; x < numberUser; x++)
            {
                square = (square + x + prev_x);
                System.out.print(square + " ");
                prev_x = x;
            }

    }





}
