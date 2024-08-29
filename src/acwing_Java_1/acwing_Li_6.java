package acwing_Java_1;

import java.util.Scanner;

public class acwing_Li_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        double fuel = sc.nextDouble();
        System.out.printf("%.3f km/l", distance / fuel);
    }
}
