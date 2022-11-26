/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
public class p4
{
    public static void main(String[]args)
    {
        for(int i=1; i<=5; i++) // row loop
        {
            for(int j=1; j<=i; j++) // column loop
            {
                if(j%2 == 0)
                {
                    System.out.print("? "); // printing a question mark
                }
                else
                {
                    System.out.print("* "); // printing a star
                }
            }
            System.out.println();
        }
    }    
}