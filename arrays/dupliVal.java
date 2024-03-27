import java.util.Scanner;

public class dupliVal 
{
    public static void main(String[] args) 
    {
        Scanner numScanner = new Scanner(System.in);

        System.out.println("Enter 25 values:");

        int[] values = new int[25];
        boolean hasDuplicates = false;
        int firstDuplicate = -1;

        for (int i = 0; i < 25; i++) 
        {
            System.out.print("Enter a value: ");
            int input = numScanner.nextInt();

            if (input == -1) 
            {
                break;
            }

            if (isDuplicate(values, i, input)) 
            {
                hasDuplicates = true;
                if (firstDuplicate == -1) 
                {
                    firstDuplicate = input;
                }
            } else 
            {
                values[i] = input;
            }
            
            numScanner.nextLine();
        }

        if (hasDuplicates) 
        {
            System.out.println("Duplicates were found");
            System.out.println("The first duplicate is: " + firstDuplicate);
        } else 
        {
            System.out.println("No duplicates found.");
        }
    }

    private static boolean isDuplicate(int[] array, int count, int value) 
    {
        for (int i = 0; i < count; i++) 
        {
            if (array[i] == value) 
            {
                return true; 
            }
        }
        return false;
    }
}
