/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class s4
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = sc.nextInt(); // user input
        System.out.println("enter the value of a");
        int a = sc.nextInt(); // user input
        double s=1.0;
        for(int i=1; i<=n; i++) // series loop
        {
            s += Math.pow(a, i);
        }
        System.out.println("sum = "+s); // printing series
    }
}