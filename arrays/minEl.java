public class minEl 
{
    public static void main(String[] args) 
    {
        int[] array = {5, 3, 9, 1, 7};
        int min = findMinimum(array);
        System.out.println("The minimum element in the array is: " + min);
    }

    public static int findMinimum(int[] array) 
    {
        if (array == null || array.length == 0) 
        {
            return Integer.MIN_VALUE;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
