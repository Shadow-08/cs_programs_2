/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class arr_s
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[4][4], s=0; // array declaration
        System.out.println("enter elements for the array");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                x[i][j] = sc.nextInt(); // user input
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                s += x[i][j]; // sum calculation
            }
        }
        System.out.println("array :");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(x[i][j] + " "); // printing array
            }
            System.out.println();
        }
        System.out.println("sum = "+s); // printing sum
    }
}