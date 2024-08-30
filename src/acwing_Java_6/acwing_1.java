package acwing_Java_6;

import java.util.Scanner;

public class acwing_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(max_(x, y));
    }

    private static int max_(int a, int b) {
        return a > b ? a : b;
    }
}
