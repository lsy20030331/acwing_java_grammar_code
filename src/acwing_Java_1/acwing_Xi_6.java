package acwing_Java_1;

import java.util.Scanner;

public class acwing_Xi_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        float dixin = sc.nextFloat();
        float xiaoshoue = sc.nextFloat();
        System.out.printf("TOTAL = R$ %.2f", dixin + 0.15*xiaoshoue);
    }
}
