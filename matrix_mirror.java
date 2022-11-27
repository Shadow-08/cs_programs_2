/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class matrix_mirror
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of the array");
        int m = sc.nextInt(); // user input
        int x[][] = new int[m][m];
        System.out.println("enter elements for the array");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
            {
                x[i][j] = sc.nextInt(); // user input
            }
        }
        System.out.println("array :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(x[i][j] + " "); // printing array
            }
            System.out.println();
        }
        System.out.println("mirror array :");
        for(int i=0; i<m; i++)
        {
            for(int j=m-1; j>=0; j--)
            {
                System.out.print(x[i][j] + " "); // printing array
            }
            System.out.println();
        }
    }
}