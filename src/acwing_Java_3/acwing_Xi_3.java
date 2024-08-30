package acwing_Java_3;

import java.util.Scanner;

public class acwing_Xi_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}
