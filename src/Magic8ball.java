import java.util.Scanner;

public class Magic8ball {

    public static void main(String[]largs){
        Scanner keyboard;

        String Question;
        int number;

        keyboard = new Scanner(System.in);

        System.out.println("This is a magic 8 ball what is your question.");
        Question = keyboard.nextLine();
        System.out.println("Now give me a number.");
        number = keyboard.nextInt();

        if (number >= 1 && number <= 10)
            System.out.println("Yes.");
        else if (number >= 11 & number <= 20)
            System.out.println("No.");
        else if (number >= 21 & number <= 30)
            System.out.println("No way.");
        else if (number >= 31 & number <= 40)
            System.out.println("Absolutely.");
        else if (number >= 41 & number <= 50)
            System.out.println("Of course.");
        else if (number >= 51 & number <= 60)
            System.out.println("Are you kidding me, no.");
        else if (number >= 61 & number <= 70)
            System.out.println("Are you crazy, no.");
        else if (number >= 71 & number <= 80)
            System.out.println("Of course not.");
        else if (number >= 81 & number <= 90)
            System.out.println("Are you kidding me, yes.");
        else if (number >= 91 & number <= 100)
            System.out.println("Are you crazy, yes.");


    }
}
