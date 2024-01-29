import java.util.Scanner;

class age
{
    public static void main (String args[])
    {
        Scanner ageScanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = ageScanner.nextInt();
        if(age > 17)
        {
            System.out.print("you can vote");
        }
        if(age == 17)
        {
            System.out.print("you can learn to drive");
        }
        if(age < 17)
        {
            System.out.print("you can go trick or treating");
        }
    }
}