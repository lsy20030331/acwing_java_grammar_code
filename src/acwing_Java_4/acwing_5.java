package acwing_Java_4;

import java.util.Scanner;

public class acwing_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 110;
        int n, m;
        int[][] q = new int[N][N];

        n = sc.nextInt();
        m = sc.nextInt();
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        for (int i = 1; i <= n * m; i++) {
            q[x][y] = i;
            int a = x + dx[d], b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b >= m || q[a][b] != 0){
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(q[i][j] + " ");
            }
            System.out.println();
        }
    }
}
