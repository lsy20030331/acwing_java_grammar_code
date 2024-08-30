package acwing_Java_5;

import java.util.Scanner;

public class acwing_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        for(int i = str.length - 1; i >= 0; i--)
            System.out.print(str[i]+" ");
    }
}
