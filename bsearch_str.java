/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class bsearch_str
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String x[] = new String[10], t;
        int k=0;
        System.out.println("enter the elements :");
        for(int i=0; i<10; i++)
        {
            x[i] = sc.next(); // user input
        }
        for(int i=0; i<9; i++) // bubble sorting
        {
            for(int j=(i+1); j<10; j++)
            {
                if(x[i].compareTo(x[j]) > 0)
                {
                    t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
            }
        }
        System.out.println("array :");
        for(int i=0; i<10; i++)
        {
            System.out.print(x[i]+" "); // printing array
        }
        System.out.println();
        System.out.println("enter the first character of the name to be searched");
        char ch= sc.next().charAt(0); // user input
        for(int i=0; i<10; i++) // binary searching
        {
            if(x[i].charAt(0) == ch) // number check
            {
                k=1;
                System.out.println(x[i]+" is found");
            }
        }
        if(k==0)
        {
            System.out.println("the name is not found");
        }
    }
}