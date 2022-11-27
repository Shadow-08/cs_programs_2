/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class sort
{
    Scanner sc = new Scanner(System.in);
    int arr[], item; // data member initialisation
    sort() // default constructor
    {
        arr = new int[50];
        item = 0;
    }
    public static void main(String[]args) // drive method
    {
        sort in = new sort();
        in.inpdata();
        in.bubblesort();
        in.binsearch();
    }
    void inpdata() // function for accepting elements
    {
        System.out.println("enter elements for the array");
        for(int i=0; i<50; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    void bubblesort() // function for bubble sorting elements
    {
        int t=0;
        for(int i=0; i<49; i++)
        {
            for(int j=0; j<(49-i); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    void binsearch() // function for binary searching an element
    {
        int p, k=0, lb=0, ub=49;
        System.out.println("enter the number to be searched");
        int n = sc.nextInt();
        while(lb<=ub)
        {
            p = (lb+ub)/2;
            if(arr[p]==n)
            {
                k=1;
                break;
            }
            else if(arr[p]<n)
            {
                lb = p+1;
            }
            else
            {
                ub -= 1;
            }
        }
        if(k==1)
        {
            System.out.println("Search Successful");
        }
        else
        {
            System.out.println("the number is not present");
        }
    }
}