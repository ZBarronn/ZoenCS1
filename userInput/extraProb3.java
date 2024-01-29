import java.util.Scanner;

class extraProb3
{
    public static void main (String args[])
    {
        Scanner choiceScanner = new Scanner(System.in);
        System.out.println("1) Square");
        System.out.println("2) Triangle");
        int choice = choiceScanner.nextInt();
        if(choice == 1)
        {
            Scanner numScanner = new Scanner(System.in);
            System.out.print("Please enter the length of one of the squares sides: ");
            double num = numScanner.nextDouble();
            double square = (num * num);
            System.out.print("The squares area is: " + square);
        }
        if(choice == 2)
        {
            Scanner baseScanner = new Scanner(System.in);
            Scanner heightScanner = new Scanner(System.in);
            System.out.print("Please enter the base length of the triangle: ");
            double base = baseScanner.nextDouble();
            System.out.print("Please enter the height of the triangle: ");
            double height = heightScanner.nextDouble();
            double triangle = ((base * height)/2);
            System.out.print("The triangles area is: " + triangle);
        }
        else
        {
            System.out.print("please try again");
        }
       
    }
}