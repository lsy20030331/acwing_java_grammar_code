package acwing_Java_6;

import java.util.Scanner;

public class acwing_5 {
    static int n;
    static int N = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] nums = new int[N];
        boolean[] st = new boolean[N];
        dfs(1, nums, st);

    }

    public static void dfs(int u, int[] nums, boolean[] st){
        if(u > n){
            for(int i  = 1; i <= n; i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }else {
            for(int i  = 1; i <= n; i++){
                if(st[i] == false){
                    st[i] = true;
                    nums[u] = i;
                    dfs(u + 1, nums, st);
                    st[i] = false;
                }
            }
        }
    }
}
