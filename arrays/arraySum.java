import java.util.Scanner;

public class arraySum
{

    public static void main(String[] args) 
    {
        Scanner numScanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = numScanner.nextInt();

        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) 
        {
            sum += numScanner.nextInt();
        }

        System.out.println("Sum of the array elements: " + sum);

        numScanner.close();
    }
}



