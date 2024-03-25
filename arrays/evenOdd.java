public class evenOdd 
{
    public static void main(String[] args) 
    {
        int[] array = {5, 3, 9, 12, 7, 8, 6};
        countEvenOdd(array);
    }

    public static void countEvenOdd(int[] array) 
    {
        if (array.length == 0) 
        {
            System.out.println("Array is empty.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Even numbers:");
        for (int num : array) 
        {
            if (num % 2 == 0) 
            {
                System.out.println(num);
                evenCount++;
            }
        }

        System.out.println("Odd numbers:");
        for (int num : array) 
        {
            if (num % 2 != 0) 
            {
                System.out.println(num);
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
