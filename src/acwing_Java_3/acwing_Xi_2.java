package acwing_Java_3;

import java.util.Scanner;

public class acwing_Xi_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 6;
        while(n != 0)
        {
            if(x%2==1){
                System.out.println(x);
                n--;
            }
            x++;
        }
    }
}
