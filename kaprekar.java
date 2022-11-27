/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class kaprekar
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt(); // user input
        int sqr = x*x, digit, s=0;
        while(sqr!=0)
        {
            digit = sqr%10;
            s += digit;
            sqr /= 10;
        }
        if(x == s) // kaprekar condition check
        {
            System.out.println("it is a kaprekar number"); // printing result
        }
        else
        {
            System.out.println("it isn't a kaprekar number"); // printing result
        }
    }
}