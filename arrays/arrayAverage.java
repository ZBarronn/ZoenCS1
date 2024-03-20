import java.util.Scanner;

public class arrayAverage
{
    public static void main(String[] args) 
    {
        Scanner numScanner = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = numScanner.nextInt();
        
        int[] array = new int[size];
        int sum = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = numScanner.nextInt();
            sum += array[i];
        }
        
        double average = (double) sum / size;
        System.out.println("Average of the array: " + average);
        
        numScanner.close();
    }
}
