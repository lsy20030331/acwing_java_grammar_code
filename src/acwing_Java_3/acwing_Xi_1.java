package acwing_Java_3;

import java.util.Scanner;

public class acwing_Xi_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < 10000; i++) {
            if(i % n == 2){
                System.out.println(i);
            }
        }
    }
}
