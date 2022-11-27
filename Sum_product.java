/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class Sum_product
{
    int n; // data member initialisation
    Sum_product() // default constructor
    {
        n = 0;
    }
    public static void main(String[]args) // drive method
    {
        Sum_product in = new Sum_product();
        in.readNum();
        in.check();
    }
    void readNum() // function for accepting number
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
    }
    int sum(int x) // function for calculating sum
    {
        int s=0, d;
        while(x>0)
        {
            d = x%10;
            s += d;
            x /= 10;
        }
        return s;
    }
    int product(int x) // function for calculating product
    {
        int p=1, d;
        while(x>0)
        {
            d = x%10;
            p *= d;
            x /= 10;
        }
        return p;
    }
    void check() // function for checking sum product condition
    {
        int s = sum(n) * product(n);
        if(s == n)
        {
            System.out.println("sum product number");
        }
        else
        {
            System.out.println("not a sum product number");
        }
    }
}