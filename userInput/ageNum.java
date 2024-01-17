import java.util.Scanner;

class ageNum
{
    public static void main (String args[])
    {
        Scanner ageScanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = ageScanner.nextInt();
        int doubled = (age * 2);
        int cubed = (age * age * age);
        int squared = (age * age);
        System.out.println("Your age doubled is " + doubled + ".");
        System.out.println("Your age squared is " + squared + ".");
        System.out.println("Your age cubed is " + cubed + ".");
        
        
      
    }
}