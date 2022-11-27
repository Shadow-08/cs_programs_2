/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class ssort
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int l = sc.nextInt(); // user input
        int x[] = new int[l], min, t;
        System.out.println("enter the elements :");
        for(int i=0; i<l; i++)
        {
            x[i] = sc.nextInt(); // user input
        }
        System.out.println("elements before sorting :");
        for(int i=0; i<l; i++)
        {
            System.out.print(x[i]+" "); // printing array
        }
        System.out.println();
        for(int i=0; i<l-1; i++) // selection sorting
        {
            min = i;
            for(int j=i+1; j<l; j++)
            {
                if(x[j]<x[min])
                {
                    min = j;
                }
            }
            t = x[i];
            x[i] = x[min];
            x[min] = t;
        }
        System.out.println("elements after sorting :");
        for(int i=0; i<l; i++)
        {
            System.out.print(x[i]+" "); // printing array
        }
    }
}