package random;
import java.util.Scanner;
import java.util.Random;

public class RandomNum {

    private static int userInput;

    public static void main(String[] args) throws Exception {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(11);

        do {
            System.out.print("Enter your guess (between 0 and 10): ");
            userInput = scanner.nextInt();

            if (userInput > randomNumber) {
                System.out.println("Too high");
            } else if (userInput < randomNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }

        } while (userInput != randomNumber);

        System.out.println("The number was " + randomNumber);

        scanner.close();
    }
}
