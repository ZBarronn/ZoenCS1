import java.util.Scanner;

class largestSmall 
{
    public static void main(String[] args) 
    {
        Scanner numscanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        char choice;
        do 
        {
            System.out.print("Enter a number: ");
            int num = numscanner.nextInt();
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);
            System.out.print("Enter another number? (Y/N): ");
            choice = numscanner.next().charAt(0);
        } while (Character.toUpperCase(choice) == 'Y');

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        numscanner.close();
    }
}
