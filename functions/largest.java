import java.util.Scanner;

public class largest 
{
    public static void main(String[] args) 
    {
        Scanner numscanner = new Scanner(System.in);

        System.out.print("enter the size: ");
        int size = numscanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) 
        {
            System.out.print("enter element " + (i + 1) + ": ");
            array[i] = numscanner.nextInt();
        }

        int largest = findLargestElement(array);
        System.out.println("largest element: " + largest);

        numscanner.close();
    }

    public static int findLargestElement(int[] array) 
    {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > largest) 
            {
                largest = array[i];
            }
        }
        return largest;
    }
}
