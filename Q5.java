
/**
 * Workshop 5 Question 5
 *
 * @author Lajana
 * @version v1.0
 */
public class Q5
{
    public static void main(String[] args){
        for(int i=1;i<=5;i++)
        {
            for(int k=4; k>=i;k--)
                {
                System.out.print(" ");
                }
            for(int j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}