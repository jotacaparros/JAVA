/*
2.2.1.1. Create a program called MarkCheck that asks the user to enter 3 marks. The
program must print one of these messages, depending on the mark values:
   
    - All marks are greater or equal than 4
    - Some marks are not greater or equal than 4
    - No mark is greater or equal than 4
*/

import java.util.Scanner;

public class Ejercicio2_2_1_1 {

    public static void main (String [] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Buddy, tell me your three marks");

            byte mark1 = sc.nextByte();
            byte mark2 = sc.nextByte();
            byte mark3 = sc.nextByte();

            if ((mark1 >= 4) && (mark2 >= 4) && (mark3 >= 4)){

                System.out.println("All marks are greater or equal than 4");

            }

            else if ((mark1 >= 4) || (mark2 >= 4) || (mark3 >= 4)){

                System.out.println("Some marks are not greater or equal than 4");

            }

            /*
             para terminar con el else no se puede poner condicion, sino sería un else if
             MI ERROR: PONER EN EL ELSE ESTO "((mark1 <= 4) && (mark2 <= 4) && (mark3 <= 4))"
            */
            else {

                System.out.println("No mark is greater or equal than 4");

            }


        
    }
}