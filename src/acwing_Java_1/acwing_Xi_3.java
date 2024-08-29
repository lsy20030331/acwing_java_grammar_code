package acwing_Java_1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class acwing_Xi_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        System.out.printf("VOLUME = %.3f", (4/3.0)*3.14159*pow(R, 3));
    }
}
