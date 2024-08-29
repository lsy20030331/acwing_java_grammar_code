package acwing_Java_1;

import java.util.Scanner;

public class acwing_Li_8 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int M = N;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int two = 0;
        int one = 0;
        while (N >= 100){
            N -= 100;
            hundred++;
        }
        while(N>=50){
            N -= 50;
            fifty++;
        }
        while(N>=20){
            N -= 20;
            twenty++;
        }
        while(N>=10){
            N -= 10;
            ten++;
        }
        while(N>=5){
            N -= 5;
            five++;
        }
        while(N>=2){
            N -= 2;
            two++;
        }
        while(N>=1){
            N -= 1;
            one++;
        }
        System.out.println(M);
        System.out.printf("%d nota(s) de R$ 100,00\n", hundred);
        System.out.printf("%d nota(s) de R$ 50,00\n", fifty);
        System.out.printf("%d nota(s) de R$ 20,00\n", twenty);
        System.out.printf("%d nota(s) de R$ 10,00\n", ten);
        System.out.printf("%d nota(s) de R$ 5,00\n", five);
        System.out.printf("%d nota(s) de R$ 2,00\n", two);
        System.out.printf("%d nota(s) de R$ 1,00\n", one);

    }
}
