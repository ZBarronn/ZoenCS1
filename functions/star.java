import java.util.Scanner;

public class StarPrinter 
{
    public static void main(String[] args) 
    {
        Scanner numscanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOfStars = numscanner.nextInt();
        printStars(numberOfStars);
        numscanner.close();
    }

    public static void printStars(int num) 
    {
        for (int i = 0; i < num; i++) 
        {
            System.out.print("*");
        }
    }
}
