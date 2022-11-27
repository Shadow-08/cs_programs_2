/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
public class pripal500
{
    public static void main(String[]args)
    {
        for(int i=1; i<=500; i++) // number loop
        {
            int c=0;
            for(int j=1; j<=i; j++) 
            {
                if(i%j == 0)
                {
                    c++;
                }
            }
            if(c == 2) // prime condition check
            {
                int t=i, rev, s=0;
                while(t!=0)
                {
                    rev = t%10;
                    s = s*10+rev;
                    t/=10;
                }
                if(i == s) // palindrome condition check
                {
                    System.out.println(i); // printing number
                }
            }
        }
    }
}