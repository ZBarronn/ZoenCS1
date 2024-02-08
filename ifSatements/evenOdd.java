import java.util.Scanner;

class evenOdd
{
    public static void main (String args[])
    {
        Scanner numScanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = numScanner.nextInt();
        int num2 = num%2;
        if(num2 == 0)
        {
            System.out.print("That number is even.");
        }
        if(num2 != 0)
        {
            System.out.print("That number is odd.");
        }
        numScanner.close();
    }
}