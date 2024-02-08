import java.util.Scanner;

class age
{
    public static void main (String args[])
    {
        Scanner ageScanner = new Scanner(System.in);

        System.out.print("Please enter a valid age: ");
        int age = ageScanner.nextInt();

        if(age > 0 && age < 13)
        {
            System.out.print("You are a child.");
        }
        if(age <= 17 && age >= 13)
        {
            System.out.print("You are a teenager.");
        }
        if(age < 55 && age > 17)
        {
            System.out.print("You are an adult.");
        }
        if(age < 100 && age >= 55)
        {
            System.out.print("You are a senior citizen.");
        }
        if(age >= 100)
        {
            System.out.print("You are dead or very very old.");
        }
        if(age <= 0)
        {
            System.out.print("That is not a valid age. ");
        }
        ageScanner.close();
    }
}