/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class twomer
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[3], y[] = new int[3], z[] = new int[6]; // arrays declaration 
        System.out.println("enter elements for the first array");
        for(int i=0; i<3; i++)
        {
            x[i] = sc.nextInt(); // user input
        }
        System.out.println("enter elements for the second array");
        for(int i=0; i<3; i++)
        {
            y[i] = sc.nextInt(); // user input
        }
        for(int i=0; i<6; i++) // merging arrays
        {
            if(i < 3)
            {
                z[i] = x[i];
            }
            else
            {
                z[i] = y[i-3];
            }
        }
        System.out.println("first array :");
        for(int i=0; i<3; i++)
        {
            System.out.print(x[i] + " "); // printing array
        }
        System.out.println();
        System.out.println("second array :");
        for(int i=0; i<3; i++)
        {
            System.out.print(y[i] + " "); // printing array
        }
        System.out.println();
        System.out.println("merged array :");
        for(int i=0; i<6; i++)
        {
            System.out.print(z[i] + " "); // printing array
        }
    }
}