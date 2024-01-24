import java.util.Scanner;

class doubleNum
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num*2);
      
    }
}