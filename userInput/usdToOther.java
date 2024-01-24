import java.util.Scanner;

class usdToOther
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an amount in USD: ");
        double num1 = scanner.nextDouble();

        double euro = (num1*0.92);
        System.out.println("Your amount of USD is equal to " + euro + " in Euros.");
      
    }
}