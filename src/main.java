import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int S = 0;
        while(a > 0)
        {
            int m = a % 10;
            S = S + m*m;
            a = (a - m)/10;
            m = 0;
        }
        System.out.print(S);
    }*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = 0;
        for (int j = 0; j < n; j++)
            s = s + a[j] * a[j];
        System.out.print(s);
    }
}
