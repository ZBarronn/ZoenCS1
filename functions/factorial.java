import java.util.Scanner;

import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args) 
    {
        Scanner numscanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = numscanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("factorial: " + factorial);

        numscanner.close();
    }

    public static long calculateFactorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
