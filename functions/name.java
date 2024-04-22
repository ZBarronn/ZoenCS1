import java.util.Scanner;

public class Name
{

    public static void main(String[] args) 
    {
        Scanner namescanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = namescanner.nextLine();
        
        System.out.println("Hello " + userName);
    }
}
