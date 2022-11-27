/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class wordnum
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = sc.nextLine(); // user input
        int l = s.length(), c=1;
        for(int i=0; i<l; i++) // counting loop
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                c++; // counter
            }
        }
        System.out.println("number of words = "+c); // printing number of words
    }
}