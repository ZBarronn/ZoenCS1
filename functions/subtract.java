public class Calculator
{
    
	public static int subNumbers(int num1, int num2) 
    {
    	return num1 - num2;
	}

	public static void main(String[] args) 
    {

    	int difference = subNumbers(8, 7);
   	 
    	System.out.println("8 - 7 is: " + difference);
	}
}