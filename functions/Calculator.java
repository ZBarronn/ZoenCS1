public class Calculator {
    
	// Method to add two numbers
	public static int addNumbers(int num1, int num2) {
    	return num1 + num2;
	}

	public static void main(String[] args) {
    	// Call the addNumbers method and store the result in a variable
    	int sum = addNumbers(5, 7);
   	 
    	// Print the result
    	System.out.println("The sum of 5 and 7 is: " + sum);
	}
}
