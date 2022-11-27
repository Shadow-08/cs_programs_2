/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class pakmae_num
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to check for prime number");
        System.out.println("enter 2 to check for armstrong number");
        System.out.println("enter 3 to check for kaprekar number");
        System.out.println("enter 4 to check for magic number");
        System.out.println("enter 5 to check for automorphic number");
        System.out.println("enter 6 to exit");
        int x = sc.nextInt(); // user input
        switch(x)
        {
            case 1:
            System.out.println("enter the number"); // accepting the number
            int w = sc.nextInt();
            int c=0;
            for(int i=1; i<=w; i++) // checking for prime condition
            {
                if(w%i == 0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println("the number is prime"); // printing prime
            }
            else
            {
                System.out.println("the number isn't prime"); // printing not prime
            }
            break;

            case 2:
            int a, d, num, arm=0;
            System.out.println("enter the number"); // accepting number
            num = sc.nextInt();
            d = num;
            while(num>0) // checking for armstrong condition
            {
                a = num%10;
                num /= 10;
                arm += a*a*a;
            }
            if(arm == d)
            {
                System.out.println("the number is armstrong"); // printing armstrong
            }
            else
            {
                System.out.println("the number isn't armstrong"); // printing isn't armstrong
            }
            break;

            case 3:
            System.out.println("enter the number"); // accepting number
            int k = sc.nextInt();
            int squr = k*k, digi, s=0;
            while(squr!=0) // checking for kaprekar condition
            {
                digi = squr%10;
                s += digi;
                squr /= 10;
            }
            if(k == s)
            {
                System.out.println("it is a kaprekar number"); // printing kaprekar
            }
            else
            {
                System.out.println("it isn't a kaprekar number"); // printing not kaprekar
            }
            break;

            case 4:
            System.out.println("enter a number"); // accepting the number
            int l = sc.nextInt();
            int z = l;
            while(z>9) // checking for magic condition
            {
                l=z;z=0;
                while(l>0)
                {
                    int p = l/10;
                    int q = p*10;
                    int r = l-q;
                    z += r;
                    l=p;
                }
            }
            if(z == 1)
            {
                System.out.println("the number is magic"); // printing magic
            }
            else
            {
                System.out.println("the number isn't magic"); // printing not magic
            }
            break;

            case 5:
            System.out.println("enter any number"); // accepting the number
            int n = sc.nextInt();
            int y=0, sqr=n*n, t=n;
            while(t>0) // checking for automorphic condition
            {
                y++;
                t/=10;
            }
            int digit = (int) (sqr%(Math.pow(10, y)));
            if(n == digit)
            {
                System.out.println("the number is automorphic"); // printing automorphic
            }
            else
            {
                System.out.println("the number isn't automorphic"); // printing automorphic
            }
            break;

            case 6:
            System.exit(0);
            break;

            default : System.out.println("WRONG INPUT!");
        }
    }
}