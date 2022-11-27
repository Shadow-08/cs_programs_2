/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class mimara
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[3][3]; // array declaration
        System.out.println("enter elements for the array");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                x[i][j] = sc.nextInt(); // user input
            }
        }
        int max = x[0][0], min = x[0][0];
        System.out.println("array :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(x[i][j] + " "); // array printing
            }
            System.out.println();
        }
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(max < x[i][j]) // max check
                {
                    max = x[i][j];
                }
                if(x[i][j] < min) // min check
                {
                    min = x[i][j];
                }
            }
        }
        System.out.println("largest element = "+max);
        System.out.println("smallest element = "+min);
    }
}