package acwing_Java_2;

import java.util.Scanner;

public class acwing_Xi_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(d < b) {
            c -= 1;
            d += 60;
        }
        if(c < a) c += 24;
        if(c - a == 0 && d - b == 0) c += 24;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", c-a, d-b);
    }
}
