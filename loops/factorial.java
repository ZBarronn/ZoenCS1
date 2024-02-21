import java.util.Scanner;

class factorial {
    public static void main(String args[]) {
        Scanner numScanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = numScanner.nextInt();
        int num2 = 1;
        int num3 = 1;

        while (num2 <= num) {
            num3 *= num2;
            num2++;
        }

        System.out.println("The factorial of " + num + " is " + num3);
        numScanner.close();
    }
}
