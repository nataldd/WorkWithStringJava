import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        String result = text.replaceAll("[^a-zA-Z0-9]", ""); 
	return result.equalsIgnoreCase(new StringBuilder(result).reverse().toString()); 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println(isPalindrome(string));
    }
}
