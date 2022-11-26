/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class s5
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = sc.nextInt(); // user input
        double s=0;
        for(double i=1.0; i<=n; i++) // series loop
        {
            s += 1/i;
        }
        System.out.println("sum = "+s); // printing series
    }
}