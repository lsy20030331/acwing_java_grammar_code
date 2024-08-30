package acwing_Java_6;

import java.util.Scanner;

public class acwing_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.print(gcd(a1, b1));
    }

    private static int gcd(int m, int n) {
        if(m < n){
            int temp = m;
            m = n;
            n = temp;
        }
        if(n == 0) return m;
        int flag = m - n;
        if(n != 0){
            return gcd(n, flag);
        }
        else {
            return m;
        }
    }
}
