import java.util.Scanner;

class name
{
    public static void main (String args[])
    {
        Scanner name = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String name1 = name.nextLine();
        System.out.print("Now enter your middle intial: ");
        String name2 = name.nextLine();
        System.out.print("Now enter your last name: ");
        String name3 = name.nextLine();

        System.out.println("Hello, " + name1 + " " + name2 + " " + name3 + "!");
        name.close();
      
    }
}



