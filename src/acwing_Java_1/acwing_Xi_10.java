package acwing_Java_1;

import java.util.Scanner;

public class acwing_Xi_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double M = scan.nextDouble();
        int N = (int) (M * 100);
        int[] money = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        System.out.print("NOTAS:\n");
        for (int i = 0; i < 6; i++) {
            System.out.print(N / money[i] + " nota(s) de R$ " + String.format("%.2f\n", money[i] * 1.0 / 100));
            N %= money[i];
        }
        System.out.print("MOEDAS:\n");
        for (int i = 6; i < 12; i++) {
            System.out.print(N / money[i] + " moeda(s) de R$ " + String.format("%.2f\n", money[i] * 1.0 / 100));
            N %= money[i];
        }
    }
}
