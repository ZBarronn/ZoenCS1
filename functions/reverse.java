import java.util.Scanner;

public class reverse
{
    public static String reverseString(String str) 
    {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static void main(String[] args) 
    {

        Scanner wordscanner = new Scanner(System.in);
        
        System.out.print("enter a word: ");
        String input = wordscanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("reversed string: " + reversed);
        
        wordscanner.close();
    }
}

