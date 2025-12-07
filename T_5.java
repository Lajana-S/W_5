import java.util.Scanner;

/**
 * Tutorial 5 (Looping statements and unconditional statements)
 *
 * @author Lajana
 * @version v1.0
 */
public class T_5
{
    public static void main(String[] args){
        //For loop(range is known)
        int sum=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a range:");
        int r=in.nextInt();
        for(int i=1; i<=r; i++)
        {
            sum = sum + i;//or sum+=i;
        }
        System.out.println(sum);
        System.out.println("");
        //while loop(only the condition is known)
        int j=1;
        while(j<=5)
        {
            System.out.println(j);
            j++;
        }
        System.out.println("");
        //do while loop(execute at least one time)
        int k=1;
        do
        {
            System.out.println(k);
            k++;
        }
        while(k<1);
        System.out.println("");
        //unconditional statements(usually used inside a conditional statement)
        
        //break statement or jump statement(exits)
        for (int l=1;l<=10;l++)
        {
            if (l==3){
            break;
            }
            System.out.println(l);
        }
        System.out.println("");
        //continue statement(skips printing even numbers)
        for (int m=1;m<=10;m++)
        {
            if (m%2==0){
            continue;
            }
            System.out.println(m);
        }
        System.out.println("");
        //nested loops(patterns and matrix)
        for(int a=1;a<=5;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int a=1;a<=3;a++){
            for(int b=1;b<=2;b++){
                System.out.print("a: "+a+"b: "+b);
            }
            System.out.println("");
        }
    }
}