/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class insert
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int l = sc.nextInt(); // user input
        int x[] = new int[l];
        System.out.println("enter the elements of the array");
        for(int i=0; i<l; i++)
        {
            x[i] = sc.nextInt(); // user input
        }
        System.out.println("enter the number to be inserted");
        int n = sc.nextInt(); // user input
        System.out.println("enter the the position of the element");
        int p = sc.nextInt(); // user input
        for(int i=l-1; i>=p; i--) // spacing
        {
            x[i+1] = x[i];
        }
        x[p] = n; // inserting
        l++;
        System.out.println("array elements :");
        for(int i=0; i<l; i++)
        {
            System.out.print(x[i]+" "); // printing array
        }
    }
}