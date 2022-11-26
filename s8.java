/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class s8
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt(); // user input
        double s=0;
        for(double i=1.0, j=10.0; i<=10.0; i++, j--) // series loop
        {
            s += (a-i)/(a+j);
        }
        System.out.println("sum = "+s); // printing series
    }
}