/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
public class p5
{
    public static void main(String[]args)
    {
        int x=0;
        for(int i=1; i<=4; i++) // row loop (upper portion)
        {
            for(int j=1; j<=i; j++, x++) // column loop (upper portion)
            {
                System.out.print(x+" "); // printing pattern (upper portion)
            }
            System.out.println();
        }
        x=5;
        for(int i=3; i>=1; i--) // row loop (lower portion)
        {
            for(int j=1; j<=i; j++, x--) // column loop (lower portion)
            {
                System.out.print(x+" "); // printing pattern (lower portion)
            }
            System.out.println();
        }
    }
}