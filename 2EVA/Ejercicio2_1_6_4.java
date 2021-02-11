/*
2.1.6.4. Create a program called CircleArea that defines a float constant called PI
with the value 3.14159 . Then, the program will ask the user to enter the radius of a
circle, and it will output the area of the circle ( PI * radius * radius). This area will be
printed with two decimal digits.
*/

import java.util.Scanner;

public class Ejercicio2_1_6_4 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;

        System.out.println("Give me a radius my pana");

        float radius = sc.nextFloat();

        float PIfloat = (float) PI;

        float area = (PIfloat * radius * radius);

        System.out.println("The area is " + area);
    }
}