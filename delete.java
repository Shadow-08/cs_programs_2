/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class delete
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int l = sc.nextInt(); // user input
        int x[] = new int[l]; // array declaration
        System.out.println("enter the elements of the array");
        for(int i=0; i<l; i++)
        {
            x[i] = sc.nextInt(); // user input
        }
        System.out.println("enter the the position of the element");
        int p = sc.nextInt(); // user input
        for(int i=p+1; i<l; i++) // deleting
        {
            x[i-1] = x[i];
        }
        l--;
        System.out.println("array elements :");
        for(int i=0; i<l; i++)
        {
            System.out.print(x[i]+" "); // printing array
        }
    }
}