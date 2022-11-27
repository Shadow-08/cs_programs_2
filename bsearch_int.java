/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class bsearch_int
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[10], p, k=0, t, lb=0, ub=9;
        System.out.println("enter the elements :");
        for(int i=0; i<10; i++)
        {
            x[i] = sc.nextInt(); // user input
        }
        for(int i=0; i<9; i++) // bubble sorting
        {
            for(int j=0; j<(9-i); j++)
            {
                if(x[j] > x[j+1])
                {
                    t = x[j];
                    x[j] = x[j+1];
                    x[j+1] = t;
                }
            }
        }
        System.out.println("array :");
        for(int i=0; i<10; i++)
        {
            System.out.print(x[i]+" "); // printing array
        }
        System.out.println();
        System.out.println("enter the number to be searched");
        int n = sc.nextInt(); // user input
        while(lb<=ub) // binary searching
        {
            p = (lb+ub)/2;
            if(x[p]==n)
            {
                k=1;
                break;
            }
            else if(x[p]<n)
            {
                lb = p+1;
            }
            else
            {
                ub = ub-1;
            }
        }
        if(k==1) // number check
        {
            System.out.println("Search Successful");
        }
        else
        {
            System.out.println("the number is not present");
        }
    }
}