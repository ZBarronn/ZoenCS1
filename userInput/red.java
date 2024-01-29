import java.util.Scanner;

class red
{
    public static void main (String args[])
    {
        Scanner colorscanner = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String color = colorscanner.nextLine();
        if(color.equals("red") || color.equals("RED") || color.equals("Red"))
        {
            System.out.print("I like red too");
        }
        else
        {
            System.out.print("I don't like that color I like red");
        }
    }
}