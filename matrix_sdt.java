/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class matrix_sdt
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[3][3], y[][] = new int[3][3], s[][] = new int[3][3], d[][] = new int[3][3], st[][] = new int[3][3], t1[][] = new int[3][3], t2[][] = new int[3][3];
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
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                s[i][j] = x[i][j] + y[i][j]; // sum
                d[i][j] = x[i][j] - y[i][j]; // difference
                t1[i][j] = x[j][i]; // transpose
                t2[i][j] = y[j][i]; // transpose
                st[i][j] = x[i][j] + t1[i][j]; // sum
            }
        }
        System.out.println("sum of the 1st array and the 2nd array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(s[i][j] + " "); // printing array
            }
            System.out.println();
        }
        System.out.println("difference of the 1st array and the 2nd array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(d[i][j] + " "); // printing array
            }
            System.out.println();
        }
        System.out.println("transpose of the 1st array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(t1[i][j] + " "); // printing array
            }
            System.out.println();
        }
        System.out.println("transpose of the 2nd array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(t2[i][j] + " "); // printing array
            }
            System.out.println();
        }
        System.out.println("sum of the 1st array and its transpose :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(st[i][j] + " "); // printing array
            }
            System.out.println();
        }
    }
}