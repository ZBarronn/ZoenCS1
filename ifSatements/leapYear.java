import java.util.Scanner;

class leapYear
{
    public static void main (String args[])
    {
        Scanner yearScanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = yearScanner.nextInt();
        if((year%4) == 0 && (year%100) != 0)
        {
            System.out.print("That is a leap year.");  
        }
        else
        {
            if(year%400 == 0)
            {
                System.out.print("That is a leap year.");  
            }
            else
            {
                System.out.print("That is not a leap year.");  
            }
        }
        yearScanner.close();
    }
}