import java.util.Scanner;
public class Homework1
{
    public static void main(String[] args)
    {
        int sum=0;
        System.out.println("입력:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sum+=num;
        System.out.printf("현재까지 합:%d\n",sum);


        for(int i=0;i<4;i++)
        {
            System.out.println("입력:");
            num=sc.nextInt();
            sum+=num;
            System.out.printf("현재까지 합:%d\n",sum);
        }


    }

}
