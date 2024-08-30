package acwing_Java_2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class acwing_Xi_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a <= b) {
            double temp = a;
            a = b;
            b = temp;
            if(a < c) {
                double temp1 = a;
                a = c;
                c = temp1;
            }
        }

        if(a <= c) {
            double temp = a;
            a = c;
            c = temp;
            if(a < b) {
                double temp1 = a;
                a = b;
                b = temp1;
            }
        }

        if(a >= b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if(pow(a,2) == pow(b,2) + pow(c,2)){
                System.out.println("TRIANGULO RETANGULO");
            } else if (pow(a,2) > pow(b,2) + pow(c,2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (pow(a,2) < pow(b,2) + pow(c,2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && a == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (
                    (a == b && a != c)||(a == c && a != b)||(b == c && b != a)
            ) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}

