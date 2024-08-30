package acwing_Java_6;

import java.util.Scanner;

public class acwing_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a1 = new int[110][110];
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        print2D(a1, r, c);

    }

    private static void print2D(int[][] a, int row, int col){
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
