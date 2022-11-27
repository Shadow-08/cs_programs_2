/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class odd_0
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[4][4]; // array declaration
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
                if(x[i][j]%2 != 0)
                {
                    x[i][j] = 0; // replacing with 0
                }
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
    }
}