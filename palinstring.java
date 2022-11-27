/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class palinstring
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = sc.next(), s1=""; // user input
        int l = s.length();
        for(int i=l-1; i>=0; i--) // reversing the word
        {
            s1 += s.charAt(i);
        }
        if(s1.compareTo(s) == 0) // checking for palindrome condition
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}