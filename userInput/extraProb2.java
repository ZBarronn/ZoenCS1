import java.util.Scanner;

class extraProb2
{
    public static void main (String args[])
    {
        Scanner numScanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = numScanner.nextInt();
        if(num < 10)
        {
            System.out.print("Too low");
        }
        if(num >= 10 && (num <=20))
        {
            System.out.print("Correct");
        }
        if(num > 20)
        {
            System.out.print("Too high");
        }
    }
}