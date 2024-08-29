package acwing_Java_1;

import java.util.Scanner;

public class acwing_Xi_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.printf("%d eh o maior", a);
        }
        else if(b > a && b > c){
            System.out.printf("%d eh o maior", b);
        }
        else if(c > a && c > b) {
            System.out.printf("%d eh o maior", c);
        }
    }
}
