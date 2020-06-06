package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int m = size;
        int n = size;

        int a[][] = new int[size][size];


        int value = 1;

        int k = 0, l = 0;

        while (k < n && l < n) {

            for (int i = l; i < n; ++i) {
                a[k][i] = value++;
            }

            k++;

            for (int i = k; i < n; ++i) {
                a[i][n - 1] = value++;
            }
            n--;

            if (k < m) {
                for (int i = n - 1; i >= l; --i) {
                    a[m - 1][i] = value++;
                }
                m--;
            }

            if (l < n) {
                for (int i = m - 1; i >= k; --i) {
                    a[i][l] = value++;
                }
                l++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

