import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("------------------");
            System.out.println("Select an option:");
            System.out.println("1) Start");
            System.out.println("2) Display Score");
            System.out.println("3) Exit");
            System.out.println("------------------");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Select a range: ");
                    int range = scanner.nextInt();
                    Random r = new Random();
                    int randomNo= r.nextInt(range) + 1;
                    guessNumber(randomNo);
                    break;
                case 2:
                    System.out.println("You guessed the number in " + count + " tries!");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static int count = 0;
    public static void guessNumber(int randomNo) {
        Scanner scanner = new Scanner(System.in);
        int guessedNo;

        do {
            System.out.println("Guess the number: ");
            guessedNo = scanner.nextInt();
            count++;

            if (guessedNo > randomNo)
                System.out.println("Guess lower");
            else if (guessedNo < randomNo)
                System.out.println("Guess higher");

        } while (randomNo != guessedNo);

        System.out.println("You guessed it!");
    }
}
