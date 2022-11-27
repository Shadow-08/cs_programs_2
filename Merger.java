/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class Merger
{
    Scanner sc = new Scanner(System.in);
    long n1, n2, mergeNum; // data member initialisation
    Merger() // default constructor
    {
        n1 = 0;
        n2 = 0;
    }
    public static void main(String[]args) // drive method
    {
        Merger in = new Merger();
        in.readNum();
        in.Join();
        in.Show();
    }
    void readNum() // function for accepting numbers
    {
        System.out.println("enter 2 long integers");
        n1 = sc.nextLong();
        n2 = sc.nextLong();
    }
    void Join() // function for joining numbers
    {
        String s = String.valueOf(n1) + String.valueOf(n2);
        mergeNum = Long.parseLong(s);
    }
    void Show() // function for printing numbers and merged number
    {
        System.out.println("first number = "+n1);
        System.out.println("second number = "+n2);
        System.out.println("merged number = "+mergeNum);
    }
}