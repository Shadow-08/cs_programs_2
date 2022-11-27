/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class penultimate
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = sc.nextLine(); // user input
        int l = s.length();
        for(int i=0; i<l; i++) // loop for printing the penultimate letter
        {
            char ch = s.charAt(i);
            if(i == l-1)
            {
                System.out.println("penultimate letter = "+s.charAt(i-1)); // printing the penultimate letter
            }
            else if(ch == ' ')
            {
                System.out.println("penultimate letter = "+s.charAt(i-2)); // printing the penultimate letter
            }
        }
    }
}