import java.util.Scanner;

class firstArray
{
    public static void main(String[] args) 
    {
        Scanner numScanner = new Scanner(System.in);
        int[] numbers;
        numbers = new int[5];
        System.out.println("Please enter five numbers (Press enter after each number you enter): ");
        for (int i = 0; i < 5; i++) 
        {
            numbers[i] = numScanner.nextInt();
        }

        System.out.println("");
        for (int number : numbers) 
        {
            System.out.print(number + " ");
        }

        System.out.println("");
        for (int i = numbers.length - 1; i >= 0; i--) 
        {
            System.out.print(numbers[i] + " ");
        }

        numScanner.close();
    }
}
