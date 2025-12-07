/**
 * Workshop 5 Question 1
 *
 * @author Lajana
 * @version v1.0
 */
public class Q1
{
    public static void main(String[] args){
        System.out.println();
        System.out.println("for loop :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*2);
        }
        System.out.println();
        System.out.println("while loop :");
        int j=1;
        while (j<=10)
        {
            System.out.println(j*2);
            j++;
        }
        System.out.println();
        System.out.println("do while loop :");
        int k=1;
        do
        {
            System.out.println(k*2);
            k++;
        }while(k<=10);
    }
}