package acwing_Java_4;

import java.util.Scanner;

public class acwing_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        char ch = sc.next().charAt(0);
        double[][] arr = new double[12][12];
        for(int i = 0; i < 12; i++)
            for(int j = 0; j < 12; j++){
                arr[i][j] = sc.nextDouble();
            }

        if (ch == 'S') {
            double sum = 0;
            for(int i = 0; i < 12; i++)
                sum += arr[L][i];
            System.out.printf("%.1f",sum);
        }
        if (ch == 'M') {
            double sum = 0;
            for(int i = 0; i < 12; i++)
                sum += arr[L][i];

            System.out.printf("%.1f",sum/12);
        }
    }
}
