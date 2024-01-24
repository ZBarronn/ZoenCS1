import java.util.Scanner;

class birthYearAge
{
    public static void main (String args[])
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter your birthyear: ");
        int num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter the current year: ");
        int num2 = scanner2.nextInt();

        int yearNum = (num2-num1);
        System.out.println("You are " + yearNum);
      
    }
}