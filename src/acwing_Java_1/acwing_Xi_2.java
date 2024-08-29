package acwing_Java_1;

import java.util.Scanner;

public class acwing_Xi_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();//code
        int b1 = sc.nextInt();//amount
        double c1 = sc.nextDouble();//price
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        double c2 = sc.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", b1*c1 + b2*c2);

    }
}
