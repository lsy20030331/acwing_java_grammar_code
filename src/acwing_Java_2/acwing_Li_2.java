package acwing_Java_2;

import java.util.Scanner;

public class acwing_Li_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        if (x == 1){
            System.out.printf("Total: R$ %.2f", y*4.00);
        }
        else if (x == 2){
            System.out.printf("Total: R$ %.2f", y*4.50);
        }
        else if (x == 3){
            System.out.printf("Total: R$ %.2f", y*5.00);
        }
        else if (x == 4){
            System.out.printf("Total: R$ %.2f", y*2.00);
        }
        else if (x == 5){
            System.out.printf("Total: R$ %.2f", y*1.50);
        }
    }
}
