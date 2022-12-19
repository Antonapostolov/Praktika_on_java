import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner f1=new Scanner(System.in);
        System.out.println("Задание 4");
        int k=0, s=0;
        System.out.println("k=");
        k=f1.nextInt();
        System.out.println("s=");
        s=f1.nextInt();
        System.out.println(brute(0, 0, k, s));
        System.out.println("Задание 5");
        int N;
        System.out.println("N=");
        N=f1.nextInt();
        System.out.println(sum(N));
        System.out.println("Задание 6");
        System.out.println("n=");
        N=f1.nextInt();
        if (IsPrime(N)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean IsPrime(int n) {
        int min_divisor = 1;
        int sqrt_n = (int) Math.sqrt((double)n);
        for (int i = 2; i <= sqrt_n; i++) {
            if (n % i == 0)
            {
                min_divisor = i;
                break;
            }
        }
        if (min_divisor == 1)
            return true;
        else
            return false;
    }
    public static int sum (int number)
    {
        return number>0 ? number%10 + sum(number/10) : 0;
    }
    public static int brute(int len, int sum, int k, int s) {
        if(len == k) {
            return sum = s;
        }

        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for(int i = c; i < 10; i++) {
            res += brute(len + 1, sum + i, k, s);

        }

        return res;
    }
}