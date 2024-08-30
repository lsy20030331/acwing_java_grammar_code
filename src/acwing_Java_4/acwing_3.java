package acwing_Java_4;

import java.util.Scanner;

import static java.lang.Math.min;

public class acwing_3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[][] arr = new int[110][110];
         while(n != 0){
             for(int i = 1; i <= n; i++){
                 for(int j = 1; j <= n; j++){
                     int up = i;
                     int down = n - i + 1;
                     int left = j;
                     int right = n - j + 1;

                     System.out.print(min(min(up, down), min(left, right)));
                     System.out.print(" ");
                 }
                 System.out.print("\n");
             }
             System.out.print("\n");
             n = sc.nextInt();
         }
    }
}
