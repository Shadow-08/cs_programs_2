/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
public class p7
{
    public static void main(String[]args)
    {
        for(int i=1; i<=4; i++) // row loop (upper portion)
        {
            for(int j=4; j>i; j--) // column loop (upper portion)
            {
                System.out.print(" "); // printing whitespace (upper portion)
            }
            for(int j=1; j<=i; j++) // column loop (upper portion)
            {
                System.out.print(j); // printing pattern (upper portion)
            }
            for(int j=i-1; j>=1; j--) // column loop (upper portion)
            {
                System.out.print(j); // printing pattern (upper portion)
            }
            System.out.println();
        }
        for(int i=3; i>=1; i--) // row loop (lower portion)
        {
            for(int j=4; j>i; j--) // column loop (lower portion)
            {
                System.out.print(" "); // printing whitespace (lower portion)
            }
            for(int j=1; j<=i; j++) // column loop (lower portion)
            {
                System.out.print(j); // printing pattern (lower portion)
            }
            for(int j=i-1; j>=1; j--) // column loop (lower portion)
            {
                System.out.print(j); // printing pattern (lower portion)
            }
            System.out.println();
        }
    }
}