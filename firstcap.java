/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class firstcap
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = sc.nextLine(), s1=""; // user input
        int l = s.length();
        for(int i=0; i<l; i++) // capitalising loop
        {
            char ch = s.charAt(i), ch1;
            if(i == 0)
            {
                ch1 = Character.toUpperCase(s.charAt(i)); // capitalising
                s1 += ch1;
            }
            else if(ch == ' ')
            {
                ch1 = Character.toUpperCase(s.charAt(i+1)); // capitalising
                s1 += " " + ch1;
                i++;
            }
            else
            {
                s1 += ch;
            }
        }
        System.out.println(s1); // printing resultant string
    }
}