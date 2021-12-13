package com.vodzon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to show Task #1");
        scanner.nextLine();
        Task1();
        System.out.println("Press ENTER to show Task #2");
        scanner.nextLine();
        Task2();
    }

    private static void Task1() {
        PersonGenerator pGenerator = new PersonGenerator(100);
        pGenerator.print();
    }

    private static void Task2() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        System.out.println("Initial matrix: ");
        Matrix.print(matrix);
        System.out.println("\nSwapped rows [1 <-> 3]: ");
        Matrix.swapRows(matrix, 1, 3);
        Matrix.print(matrix);
        System.out.println("\nSwapped columns [3 <-> 5]: ");
        Matrix.swapColumns(matrix, 3, 5);
        Matrix.print(matrix);
        System.out.println("\nMultiplied by 2: ");
        Matrix.mul(matrix, 2);
        Matrix.print(matrix);
        System.out.println("\nMatrix converted into array: ");
        System.out.println(Arrays.toString(Matrix.toArray(matrix)));
        System.out.println("\nMatrix max: " + Matrix.max(matrix));
    }
}
