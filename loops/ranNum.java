import java.util.Random;
import java.util.Scanner;

class ranNum 
{
    public static void main(String[] args) 
    {
        int ranNum = new Random().nextInt(100) + 1;
        Scanner numscanner = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 100:");

        int guess;
        while ((guess = numscanner.nextInt()) != ranNum) {
            System.out.println(guess < ranNum ? "Too low, try again." : "Too high, try again.");
        }

        System.out.println("Thats the right number!");
        numscanner.close();
    }
}
