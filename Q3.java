
/**
 * Workshop 5 Question 3
 *
 * @author Lajana
 * @version v1.0
 */
public class Q3
{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        do
        {
            sum=sum+(i*i);
            i++;
        }while(i<=10);
        System.out.println(sum);
    }
}