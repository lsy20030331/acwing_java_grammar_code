package acwing_Java_1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class acwing_Li_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.printf("%.4f" ,sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
}
