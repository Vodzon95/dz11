package com.vodzon;

import java.util.Arrays;

public class Matrix {

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void swapColumns(int[][] matrix, int col1, int col2) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length < Math.max(col1, col2) || Math.min(col1, col2) <= 0) {
                return;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == matrix[i][col1 - 1]) {
                    int tmp = matrix[i][col2 - 1];
                    matrix[i][col2 - 1] = matrix[i][j];
                    matrix[i][j] = tmp;
                    break;
                }
            }
        }
    }

    public static void swapRows(int[][] matrix, int row1, int row2) {
        if (matrix.length < Math.max(row1, row2) || Math.min(row1, row2) <= 0) {
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (i == row1 - 1) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int[] tmp = matrix[row1 - 1];
                    matrix[i] = matrix[row2 - 1];
                    matrix[row2 - 1] = tmp;
                }
                break;
            }
        }
    }

    public static void mul(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * value;
            }
        }
    }

    public static int[] toArray(int[][] matrix) {
        int size = matrix.length * matrix[0].length;
        int[] array = new int[size];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        return array;
    }

    public static int max(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(matrix[i][j], max);
            }
        }

        return max;
    }
}