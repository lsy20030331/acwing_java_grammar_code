package acwing_Java_1;

import java.util.Scanner;

public class acwing_Li_9 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int sec = cin.nextInt();
        int min = 0, hour = 0;
        while(sec >= 60){
            sec -= 60;
            min ++;
        }
        while(min >= 60){
            min -= 60;
            hour++;
        }
        System.out.printf("%d:%d:%d", hour, min, sec);
    }
}
