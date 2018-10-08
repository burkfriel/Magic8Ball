import java.util.Scanner;

public class Magic8ball {

    public static void main(String[] largs) {
        Scanner keyboard;

        String Question;
        int number;
        boolean playAgain;
        playAgain = false;
        int playAgainn;
        boolean done;
        done = false;


        keyboard = new Scanner(System.in);



        while(!playAgain) {

            System.out.println("This is a magic 8 ball what is your question.");
            Question = keyboard.nextLine();
            number = (int) (Math.random() * 100);

            while(!done) {

                if (number >= 1 && number <= 10) {
                    System.out.println("Yes.");
                    done = true;
                } else if (number >= 11 && number <= 20) {
                    System.out.println("No.");
                    done = true;
                } else if (number >= 21 && number <= 30) {
                    System.out.println("No way.");
                    done = true;
                } else if (number >= 31 && number <= 40) {
                    System.out.println("Absolutely.");
                    done = true;
                } else if (number >= 41 && number <= 50) {
                    System.out.println("Of course.");
                    done = true;
                } else if (number >= 51 && number <= 60) {
                    System.out.println("Are you kidding me, no.");
                    done = true;
                } else if (number >= 61 && number <= 70) {
                    System.out.println("Are you crazy, no.");
                    done = true;
                } else if (number >= 71 && number <= 80) {
                    System.out.println("Of course not.");
                    done = true;
                } else if (number >= 81 && number <= 90) {
                    System.out.println("Are you kidding me, yes.");
                    done = true;
                } else if (number >= 91 && number <= 100) {
                    System.out.println("Are you crazy, yes.");
                    done = true;
                }
            }



            System.out.println("Would you like to play again 1=Yes 2=No.");
            playAgainn = keyboard.nextInt();
            keyboard.nextLine();

            if (playAgainn == 2) {
                System.out.println("Thank you for playing my magic 8 ball.");
                playAgain = true;
            }
            if (playAgainn == 1) {
                playAgain = false;
            }
        }
    }
}