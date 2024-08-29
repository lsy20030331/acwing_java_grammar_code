package acwing_Java_1;

import java.util.Scanner;

public class acwing_Xi_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.printf("%d ano(s)\n", day / 365);
        day = day % 365;
        System.out.printf("%d mes(es)\n", day / 30);
        day = day % 30;
        System.out.printf("%d dia(s)\n", day);
    }
}
