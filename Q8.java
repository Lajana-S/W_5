import java.util.Scanner;

/**
 * Workshop 5 Question 8
 *
 * @author Lajana
 * @version v1.0
 */
public class Q8
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        System.out.println("");
        int n=scan.nextInt();
        scan.nextLine();
        System.out.println("Multiplication Table of "+n+" :");
        for(int i=1; i<=10; i++)
        {
            int m=n*i;
            System.out.println(n+"*"+i+"="+m);
        }
    }
}