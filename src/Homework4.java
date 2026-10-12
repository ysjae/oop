import java.util.Scanner;
public class Homework4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1,num2));
    }
    public static int gcd(int m, int n)
    {
        if (n == 0)
        {
            return m;
        }
        int small = Math.min(m, n);
        int big = Math.max(m, n);

        return gcd(small, big % small);
    }
}
