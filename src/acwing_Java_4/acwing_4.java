package acwing_Java_4;

import java.util.Scanner;

public class acwing_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char t = sc.next().charAt(0);
        double[][] m = new double[12][12];
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                m[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;
        double c = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j <= 10 - i; j++){
                c++;
                sum+=m[i][j];
            }
        }

        if(t == 'S'){
            System.out.printf("%.1f", sum);
        }else{
            System.out.printf("%.1f", sum/c);
        }
    }
}
