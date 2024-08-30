package acwing_Java_5;

import java.util.Scanner;

public class acwing_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] cnt = new int[26];
        for(char c:str.toCharArray()){
            cnt[c-'a']++;
        }
        for(char c:str.toCharArray()){
            if(cnt[c-'a'] == 1){
                System.out.println(c);
                return;
            }
        }

        System.out.println("no");
    }
}
