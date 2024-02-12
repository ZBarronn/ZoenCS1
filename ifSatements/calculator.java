import java.util.Scanner;

class calculator
{
    public static void main (String args[])
    {
        Scanner numScanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double num = numScanner.nextDouble();

        Scanner num2Scanner = new Scanner(System.in);
        System.out.print("Please enter another number: ");
        double num2 = num2Scanner.nextDouble();

        Scanner pickScanner = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
        System.out.println("Please pick an option:" + newLine + "a) add both numbers" + newLine + "b) multiply both numbers" + newLine + "c) subtract the second number from the first number" + newLine + "d) divide the first number by the second");
        String pick = pickScanner.nextLine();

        if(pick.equals("a"))
        {
            double num3 = (num + num2);
            System.out.print(num3);
        }
        if(pick.equals("b"))
        {
            double num3 = (num*num2);
            System.out.print(num3);
        }
        if(pick.equals("c"))
        {
            double num3 = (num - num2);
            System.out.print(num3);
        }
        if(pick.equals("d"))
        {
            double num3 = (num/num2);
            System.out.print(num3);
        }
        numScanner.close();
        num2Scanner.close();
        pickScanner.close();

        
    }
}