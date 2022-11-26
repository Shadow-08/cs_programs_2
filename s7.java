/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class s7
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = sc.nextInt(); // user input
        double s=0;
        for(int i=1; i<=n; i++) // series loop
        {
            s += (i*(i+1))/(i+(i+1));
        }
        System.out.println("sum = "+s); // printing series
    }
}