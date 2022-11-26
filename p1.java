/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
public class p1
{
    public static void main(String[]args)
    {
        for(int i=1; i<=5; i++) // row loop
        {
            for(int j=1; j<=i; j++) // column loop
            {
                System.out.print(j+" "); // printing pattern
            }
            System.out.println();
        }
    }    
}