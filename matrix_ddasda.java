/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class matrix_ddasda
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
        int z[] = new int[m*m], t=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++, t++)
            {
                z[t] = x[i][j]; // merging into single dimensional array
            }
        }
        System.out.println("resultant array :");
        for(int i=0; i<(m*m); i++)
        {
            System.out.print(z[i] + " "); // printing array
        }
    }
}