import java.util.Scanner;

public class prime 
{
    public static void main(String[] args) 
    {
        Scanner numscanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = numscanner.nextInt();
        
        if (isPrime(number)) 
        {
            System.out.println(number + " is prime.");
        } else 
        {
            System.out.println(number + " is not prime");
        }
        
        numscanner.close();
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
