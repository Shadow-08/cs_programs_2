/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class array_pattern
{
    public static void main(String[]args)
    {
        int x[] = {2, 6, 12, 20, 30, 42}, d=0; // declaring array
        for(int i=0; i<6; i++)
        {
            System.out.print(x[i] + " "); // printing the first line
        }
        System.out.println();
        for(int i=5; i>=0; i--)
        {
            for(int j=0; j<i; j++)
            {
                d = Math.abs(x[j] - x[j+1]); // subtraction
                System.out.print(d+" "); // printing difference
                x[j] = d; // assigning difference as element
            }
            System.out.println();
        }
    }
}