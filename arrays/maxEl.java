public class maxEl 
{
    public static void main(String[] args) 
    {
        int[] array = {10, 20, 5, 15, 30};
        int max = findMax(array);
        System.out.println("Max element in array: " + max);
    }
    
    public static int findMax(int[] arr) 
    {
        if (arr == null || arr.length == 0) 
        {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int max = Integer.MIN_VALUE;
        
        for (int num : arr) 
        {
            if (num > max) 
            {
                max = num;
            }
        }
        
        return max; 
    }
}
