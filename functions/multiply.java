public class Calculator
{
    
	public static int multiNumbers(int num1, int num2) 
    {
    	return num1 * num2;
	}

	public static void main(String[] args) 
    {

    	int product = multiNumbers(8, 7);
   	 
    	System.out.println("8 * 7 is: " + product);
	}
}