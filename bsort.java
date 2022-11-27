/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class bsort
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int l = sc.nextInt(), t; // user input
        int x[] = new int[l]; // array declaration
        System.out.println("enter the elements of the array");
        for(int i=0; i<l; i++)
        {
            x[i] = sc.nextInt(); // user input
        }
        for(int i=0; i<(l-1); i++) // bubble sorting
        {
            for(int j=0; j<((l-1)-i); j++)
            {
                if(x[j] < x[j+1])
                {
                    t = x[j];
                    x[j] = x[j+1];
                    x[j+1] = t;
                }
            }
        }
        System.out.println("array elements :");
        for(int i=0; i<l; i++)
        {
            System.out.print(x[i]+" "); // printing array
        }
    }
}