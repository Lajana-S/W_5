import java.util.Scanner;

/**
 * Workshop 5 Question 7
 *
 * @author Lajana
 * @version v1.0
 */
public class Q7
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter second number:");
        int n2= scan.nextInt();
        scan.nextLine();
        
        System.out.println("Your choices:");
        System.out.println("Type 1 for Addition");
        System.out.println("Type 2 for Subtraction");
        System.out.println("Type 3 for Multiplication");
        System.out.println("Type 4 for Division");
        System.out.println("");
        
        System.out.println("Enter Your choice:");
        int o= scan.nextInt();
        scan.nextLine();
        
        if (o>=1 && o<=4)
     {
        while(o>=1 && o<=4)
        {
            switch (o)
            {
            case 1:
                {
                int sum=n1+n2;
                System.out.println("Sum of "+n1+" and "+n2+" is "+sum);
                break;
                }
            case 2:
                {
                int diff=n1-n2;
                System.out.println("Difference of "+n1+" and "+n2+" is "+diff);
                break;
                }
            case 3:
                {
                int pro=n1*n2;
                System.out.println("Product of "+n1+" and "+n2+" is "+pro);
                break;
                }
            case 4:
                {
                double quo=n1/n2;
                System.out.println("Quotient of "+n1+" and "+n2+" is "+quo);
                break;
                }
            }
            System.out.println("Do you want to continue?(1-yes and 0-no)");
            int a=scan.nextInt();
            scan.nextLine();
            switch (a)
            {
            case 0:
            {
                System.out.println("Thank you!!");
                o= 0;
                break;
            }
            case 1:
            {
                System.out.println("Enter your choice:");
                o= scan.nextInt();
                scan.nextLine();
                break;
            }
            default:
            {
                System.out.println("Your choice is invalid!");
                o=0;
                break;
            }
            }
        }
     }
     else
     {
         System.out.println("Your choice is invalid!");   
     }
}
}