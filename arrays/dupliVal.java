import java.util.Scanner;

public class dupliVal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[25];
        int size = 0;

        System.out.println("Enter 25 values:");
        while (size < 25) 
        {
            int input = scanner.nextInt();
            if (input == -1) 
            {
                break;
            }
            for (int i = 0; i < size; i++) 
            {
                if (values[i] == input) 
                {
                    System.out.println("Duplicate was found: " + input);
                    return;
                }
            }
            values[size++] = input;
        }

        System.out.println("No duplicates were found.");
    }
}
