/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class matrix_prod
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[3][3], y[][] = new int[3][3], z[][] = new int[3][3];
        System.out.println("enter elements for the 1st array");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                x[i][j] = sc.nextInt(); // user input
            }
        }
        System.out.println("enter elements for the 2nd array");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                y[i][j] = sc.nextInt(); // user input
            }
        }
        System.out.println("1st array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(x[i][j] + " "); // printing array
            }
            System.out.println();
        }
        System.out.println("2nd array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(y[i][j] + " "); // printing array
            }
            System.out.println();
        }
        for(int i=0; i<3; i++) // product calculating loop
        {
            for(int j=0; j<3; j++)
            {
                z[i][j] = 0;
                for(int k=0; k<3; k++)
                {
                    z[i][j] += x[i][k] * y[k][j]; // product calculation
                }
            }
        }
        System.out.println("product of the 1st array and the 2nd array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(z[i][j] + " "); // printing array
            }
            System.out.println();
        }
    }
}