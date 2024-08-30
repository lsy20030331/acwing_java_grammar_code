package acwing_Java_2;

import java.util.Scanner;

public class acwing_Li_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(!((a % b == 0) || (b % a == 0)))
            System.out.println("Nao sao Multiplos");
        else
            System.out.print("Sao Multiplos");
    }
}
