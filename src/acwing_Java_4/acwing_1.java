package acwing_Java_4;

import java.util.Scanner;

public class acwing_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(x[i] <= 0){
                x[i] = 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("X["+i+"] = " + x[i]);
        }

    }
}
