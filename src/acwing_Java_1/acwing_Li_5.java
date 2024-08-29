package acwing_Java_1;

import java.util.Scanner;

public class acwing_Li_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//员工编号
        int b = sc.nextInt();//工作时长
        double c = sc.nextDouble();//时薪
        System.out.printf("NUMBER = %d\n", a);
        System.out.printf("SALARY = U$ %.2f", b * c);
    }
}
