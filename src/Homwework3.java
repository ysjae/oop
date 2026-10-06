import java.util.Scanner;
public class Homwework3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("몇개?");
        int n=sc.nextInt();
        int max=-10000,min=10000;

        int[] ip = new int[n];

        System.out.println("수 입력");
        for (int i=0;i<n;i++)
        {
            ip[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if (min > ip[i])
            {
                min=ip[i];
            }
            if (max <ip[i])
            {
                max=ip[i];
            }
        }
        System.out.printf("최대:%d 최소:%d",max,min);
    }


}
