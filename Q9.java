import java.util.Scanner;

/**
 * Workshop 5 Question 9
 *
 * @author Lajana
 * @version v1.0
 */
public class Q9
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n=scan.nextInt();
        scan.nextLine();
        int a=0;
        int r=0;
        while(n!=0)
        {
            a=n%10;
            r=(r*10)+a;
            n=n/10;
        }
        System.out.println(r);
    }
}