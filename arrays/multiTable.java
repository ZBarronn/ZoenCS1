import java.util.Scanner;

public class multiTable 
{
    public static void main(String[] args) 
    {
        Scanner numScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = numScanner.nextInt();

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 15; i++) 
        {
            System.out.printf("%d x %d = %d%n", number, i, (number * i));
        }
        numScanner.close();
    }
}
