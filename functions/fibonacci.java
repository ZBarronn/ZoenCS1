import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args) 
    {
        Scanner numscanner = new Scanner(System.in);
        System.out.print("enter number of terms: ");
        int n = numscanner.nextInt();
        
        int a = 0, b = 1;
        System.out.println("fibonacci series:");
        for (int i = 0; i < n; ++i) 
        {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
