/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class matrix_rascend
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
        int t=0;
        for(int i=0; i<m; i++) // sorting loop
        {
            for(int j=0; j<(m-1); j++)
            {
                for(int k=0; k<((m-1)-j); k++)
                {
                    if(x[i][k] > x[i][k+1])
                    {
                        t = x[i][k];
                        x[i][k] = x[i][k+1];
                        x[i][k+1] = t;
                    }
                }
            }
        }
        System.out.println("resultant array :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(x[i][j] + " "); // printing array
            }
            System.out.println();
        }
    }
}
