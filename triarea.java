/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
import java.util.*;
public class triarea
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to check the area of an equilateral triangle");
        System.out.println("enter 2 to check the area of an isoceles triangle");
        System.out.println("enter 3 to check the area of a scalene triangle");
        int x = sc.nextInt(); // user input
        double area=0;
        switch(x) // switch statement
        {
            case 1: // area of an equilateral triangle
            System.out.println("enter the value of a side");
            int s = sc.nextInt(); // user input
            area = (Math.sqrt(3)/4)*(s*s); // calculation
            break;

            case 2: // area of an isoceles triangle
            System.out.println("enter the value of sides");
            int a = sc.nextInt(); // user input
            int b = sc.nextInt(); // user input
            area = 0.25*b*(Math.sqrt((4*a*a)-(b*b))); // calculation
            break;

            case 3: // area of a scalene triangle
            System.out.println("enter the value of sides");
            int k = sc.nextInt(); // user input
            int l = sc.nextInt(); // user input
            int m = sc.nextInt(); // user input
            double n = (k+l+m)/2;
            area = Math.sqrt(n*(n-k)*(n-l)*(n-m)); // calculation
            break;

            default : System.out.println("WRONG INPUT!"); // default statement
        }
        System.out.println("area = "+area); // printing area
    }
}