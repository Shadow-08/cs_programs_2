/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class matrix_beldiag
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
        System.out.println("array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(i>j)
                {
                    System.out.print(x[i][j]+" "); // printing elements below the diagonal
                }
                else
                {
                    System.out.print("  "); // printing whitespace
                }
            }
            System.out.println();
        }
    }
}