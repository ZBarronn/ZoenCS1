public class Calculator
{
    
	public static int addNumbers(int num1, int num2, int num3) 
    {
    	return num1 + num2 + num3;
	}

	public static void main(String[] args) 
    {

    	int sum = addNumbers(8, 7, 9);
   	 
    	System.out.println("8 + 7 + 9 is: " + sum);
	}
}