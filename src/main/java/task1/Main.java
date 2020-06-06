package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int k = 1;

        double[] massiv = new double[100];

        for (int i = 0; i < n; i++) {
            massiv[i] = scan.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = k; j < n; j++) {
                if (massiv[j] == massiv[i]) {
                    massiv[j] = 0.1;
                    count++;
                }
            }
            k++;
            if (count == 1 && massiv[i] != 0.1) {
                System.out.print((int) massiv[i] + " ");
                index++;
            }
        }

        if (index == 0) {
            System.out.print("None");
        }
    }
}