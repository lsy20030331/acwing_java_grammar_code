package acwing_Java_5;

import java.util.Scanner;

public class acwing_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        String a = sc.next(), b = sc.next();
        for(String str: strs){
            if(str.equals(a)){
                System.out.print(b+" ");
            }else
                System.out.print(str+" ");
        }
    }
}
