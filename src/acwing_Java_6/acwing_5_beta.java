package acwing_Java_6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class acwing_5_beta {
    private static int[] path;
    private static boolean[] st;
    private static int n;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void dfs(int u) throws Exception {
        if(u == n){
            for(int i = 0; i < n; i++){
                bw.write(path[i]+1+" ");
            }
            bw.write("\n");
        }else{
            for(int i = 0; i < n; i++){
                if(st[i] == false){
                    path[u] = i;
                    st[i] = true;
                    dfs(u+1);
                    st[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        path = new int[n];
        st = new boolean[n];

        dfs(0);

        bw.flush();
    }
}
