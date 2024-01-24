import java.util.Scanner;

class simpleIntrest
{
    public static void main (String args[])
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter principle amount: ");
        double num1 = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter intrest rate in decimal form: ");
        double num2 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Please enter time in years: ");
        double num3 = scanner3.nextDouble();

        double intrest = ((num1*num2)*num3)+num1;
        System.out.println("You will owe " + intrest + " in " + num3 + " years.");
      
    }
}