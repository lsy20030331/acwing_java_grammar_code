package acwing_Java_3;

import java.util.Scanner;

public class acwing_Xi_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double a;
        char t;
        double totalanimals = 0;
        double totalconeys = 0;
        double totalrats = 0;
        double totalfrogs = 0;
        for (double i = 1; i <= n; i++) {
            a = sc.nextInt();
            t = sc.next().charAt(0);
            if (t == 'C') {
                totalanimals += a;
                totalconeys += a;
            } else if (t == 'R') {
                totalanimals += a;
                totalrats += a;
            } else if (t == 'F') {
                totalanimals += a;
                totalfrogs += a;
            }
        }
        System.out.printf("Total: %.0f animals\n", totalanimals);
        System.out.printf("Total coneys: %.0f\n", totalconeys);
        System.out.printf("Total rats: %.0f\n", totalrats);
        System.out.printf("Total frogs: %.0f\n", totalfrogs);
        System.out.printf("Percentage of coneys: %.2f %%\n",(totalconeys/totalanimals)*100.0);
        System.out.printf("Percentage of rats: %.2f %%\n",(totalrats/totalanimals)*100.0);
        System.out.printf("Percentage of frogs: %.2f %%\n",(totalfrogs/totalanimals)*100.0);
    }
}
