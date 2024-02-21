import java.util.Scanner;

class reverse 
{
    public static void main(String[] args) 
    {
        Scanner wordScanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = wordScanner.nextLine();
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) 
        {
            reversed += word.charAt(i);
        }

        System.out.println(reversed);
        wordScanner.close();
    }
}