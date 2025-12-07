import java.util.Scanner;

/**
 * Workshop 5 Question Scenario
 *
 * @author Lajana
 * @version v1.0
 */
public class FixedDepositNIB
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean condition = true;
        System.out.println("==========================================================================");
        System.out.println("");
        while (condition)
        {
            System.out.println("                            Enter the Details");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Enter the amount: (in Rs.)");
            double p=scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter the interest rate: (8-12%)");
            double r=scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter the duration: (in year)");
            double d=scan.nextDouble();
            scan.nextLine();
            System.out.println("The processing fee will be 0.5%.");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("");
            if(p>=1000 && (r>=8 && r<=12) && d<5)
            {
                double mr = (r/100) / 12;
                double m = d * 12;
                double a = p * Math.pow((1+mr),m);
                double f = a * 0.005;
                double fa = a - f;
                System.out.println("Deposited amount : Rs."+p);
                System.out.println("Annual interest rate : "+r+"%");
                System.out.println("Monthly interest rate : "+mr+"%");
                System.out.println("Duration in years : "+d+"year/s");
                System.out.println("Duration in months : "+m+"months");
                System.out.println("Maturity amount (before fee) : Rs."+a);
                System.out.println("Processing fee rate : 0.5%");
                System.out.println("Processing fee : Rs."+f);
                System.out.println("Final Amount : Rs."+fa);
            }
            else
            {
                System.out.println("Minimun deposit should be Rs.1000.\nInterest rate should be between 8% and 12%.\nThe maximum duration should be 5 years.");
            }
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Do you want to perform another Fixed Deposit calculation? (y/n)");
            char w = scan.next().charAt(0);
            if (w == 'y' || w == 'Y')
            {
                condition = true;
            }
            else
            {
                condition = false;
            }
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------");
        }
        System.out.println("                               Thank You ");
        System.out.println("");
        System.out.println("===========================================================================");
    }
}