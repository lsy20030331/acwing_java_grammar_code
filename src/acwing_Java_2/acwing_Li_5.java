package acwing_Java_2;

import java.util.Scanner;

public class acwing_Li_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            System.out.printf("O JOGO DUROU %d HORA(S)", b+24-a);

        }else if (a == b){
            System.out.print("O JOGO DUROU 24 HORA(S)");
        }else if(a < b){
            System.out.printf("O JOGO DUROU %d HORA(S)", b-a);
        }
    }
}
