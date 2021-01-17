
/* In this exercise you are asked to 

*/
import java.util.Scanner;

public class games {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (args.length == 1) {

            if (!args[0].equals("lottery")) {

                System.out.println("Please only put \"lottery\"");

            } else {

                playLottery();

            }

        }

        if (args.length == 2) {

            if (!args[0].equals("nim")) {

                System.out.println("Please only put \"nim\"");

            }

            else {

                int chips = 0;

                try {

                    chips = Integer.parseInt(args[1]);

                }

                catch (NumberFormatException exception) {

                    System.out.println("Wrong input. Only numbers");

                }

                if (chips > 30 || chips < 1) {

                    System.out.println("Wrong input. Only numbers between 1 and 30");

                } else {

                    playNim(chips);

                }
            }

        }

    }

    public static int generateNumber(int min, int max) {

        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        return randomNumber;
    }

    public static int[] generateLottery() {

        int[] lottery = new int[6];

        for (int i = 0; i < 6; i++) {

            lottery[i] = generateNumber(1, 49);
        }

        for (int i = 0; i < lottery.length - 1; i++) {

            for (int j = i + 1; j < lottery.length; j++) {

                if (lottery[i] > lottery[j]) {

                    int aux = lottery[i];
                    lottery[i] = lottery[j];
                    lottery[j] = aux;
                }
            }
        }

        return lottery;

    }

    public static int checkLottery(int[] user, int[] winner) {

        int times = 0;

        for (int i = 0; i < user.length; i++) {

            for (int j = 0; j < winner.length; j++) {

                if (user[i] == winner[j]) {

                    times++;

                    break;
                }

            }

        }

        return times;

    }

    public static void playLottery() {

        Scanner sc = new Scanner(System.in);
        int[] luckyNumbers = new int[6];
        int[] trueLuckyNumbers = new int[6];

        System.out.println(" Put your 6 lucky numbers, and good luck!!!");

        for (int i = 0; i < 6; i++) {

            luckyNumbers[i] = sc.nextInt();
        }

        System.out.println("These are the true lucky numbers: ");

        trueLuckyNumbers = generateLottery();

        for (int number : trueLuckyNumbers) {

            System.out.print(number + " ");

        }
        System.out.println();

        System.out.print("The number of hits: " + checkLottery(luckyNumbers, trueLuckyNumbers));

    }

    public static void playNim(int chips) {

        Scanner sc = new Scanner(System.in);
        int takeUser, takeComputer;

        while (chips > 0) {

            System.out.println("There are " + chips + " chips");

            System.out.println("Please put a number between 1 and 3");

            takeUser = sc.nextInt();

            while (takeUser > 3 || takeUser > chips) {

                System.out.println("Please only between 1 and 3");
                takeUser = sc.nextInt();

            }

            chips -= takeUser;

            if (chips == 0) {

                System.out.println("You win!!!");
                break;
            }

            System.out.println("Now there are " + chips + " chips");

            if (chips <= 3) {

                takeComputer = generateNumber(1, chips);
            } else {

                takeComputer = generateNumber(1, 3);

            }

            chips -= takeComputer;

            if (chips == 0) {

                System.out.println("You lose!!!");
                break;
            }

            System.out.println("The computer takes " + takeComputer + " chips. Now there are " + chips);

        }

    }
}
