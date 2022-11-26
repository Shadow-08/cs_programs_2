/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */ 
public class s9
{
    public static void main(String[]args)
    {
        double s=0;
        for(double i=10.0, j=1.0; i>=1.0; i--, j++) // series loop
        {
            int f=1, ff=1; // variables for storing factorials
            for(int k=1; k<=i; k++)
            {
                f *= k;
            }
            for(int k=1; k<=j; k++)
            {
                ff *= k;
            }
            s += (f-ff)/i;
        }
        System.out.println("sum = "+s); // printing series
    }
}