import java.util.Scanner;

class grade
{
    public static void main (String args[])
    {
        Scanner gradeScanner = new Scanner(System.in);

        System.out.print("Please enter a number grade: ");
        int grade = gradeScanner.nextInt();

        if(grade <= 100 && grade >= 90)
        {
            System.out.print("You have an A");
        }
        if(grade < 90 && grade >=80)
        {
            System.out.print("You have a B");
        }
        if(grade < 80 && grade >=70)
        {
            System.out.print("You have a C");
        }
        if(grade < 70 && grade >=60)
        {
            System.out.print("You have a D");
        }
        if(grade < 60)
        {
            System.out.print("You have a F");
        }
        gradeScanner.close();
    }
}