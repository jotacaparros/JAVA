import java.util.Scanner;

/*
2.2.1.2. Create a program called GramOunceConverter that will be an improved version
of exercise 2.1.6.2. of previous unit. In this case, the user will type a weight (float), and
a unit ( g for grams, o for ounces). Then, depending on the unit chosen, the
program will convert the weight to the opposite unit. For instance, if the user types a
weight of 33 and chooses o as unit, then the program must convert 33 ounces to
grams. You must solve this program using a switch structure. If the unit is other than
g or o , then the program must output an error message: "Unexpected unit", with no
final result.
*/
import java.util.Scanner;

public class Ejercicio2_2_1_2 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Put a weight");
        
        float weight = sc.nextInt();

        System.out.println("Now you hace to choose a unit to convert, g for grams to ounces or o for ounces to grams");

        char unit = sc.next().charAt(0);

        double result = 0;

        switch (unit) {

            case 'g' : result = weight / 28.3495; System.out.println(weight +  " grams are " + result + " ounces"); 
            break;
            
            case 'o' : result = weight * 28.3495; System.out.println(weight +  " ounces are " + result + " grams"); 
            break;

            default: System.out.println("Unexpected unit");

        }

        
    }
}