/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class matrix_diag
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[3][3];
        System.out.println("enter elements for the array");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                x[i][j] = sc.nextInt(); // user input
            }
        }
        System.out.println("array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(x[i][j] + " "); // printing array
            }
            System.out.println();
        }
        for(int i=0; i<3; i++) // left diagonal
        {
            for(int j=0; j<3; j++)
            {
                if(i == j)
                {
                    x[i][j] = 0; // assigning to 0
                }
            }
        }
        for(int i=0; i<3; i++) // right diagonal
        {
            for(int j=0; j<3; j++)
            {
                if(i+j == 2)
                {
                    x[i][j] = 0; // assigning to 0
                }
            }
        }
        System.out.println("array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(x[i][j] + " "); // printing array
            }
            System.out.println();
        }
    }
}