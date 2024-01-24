import java.util.Scanner;

class addTwo
{
    public static void main (String args[])
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter another number: ");
        int num2 = scanner2.nextInt();

        int num3 = (num1+num2);
        System.out.println(num3);

        
      
    }
}