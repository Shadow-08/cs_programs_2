/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
public class pri100
{
    public static void main(String[]args)
    {
        for(int i=1; i<=100; i++) // number loop
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
                System.out.println(i); // printing number
            }
        }
    }
}