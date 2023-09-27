package main.java.solution.dataStructure;

import java.util.Scanner;

public class ArrayData2 {
    public static double solution() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            sum += A[i];
        }
        return (sum * 100.0 / max / N);
    }
}
