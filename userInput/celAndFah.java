import java.util.Scanner;

class celAndFah
{
    public static void main (String args[])
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter the weather number in fahrenheit: ");
        double num1 = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter the weather number in celsius: ");
        double num2 = scanner2.nextDouble();

        double cel = ((num1-32)/1.800);
        double fah = ((num2*1.8)+ 32);

        System.out.println("fahrenheit to celsius is " + cel);
        System.out.println("celsius to fahrenheit is " + fah);


      
    }
}