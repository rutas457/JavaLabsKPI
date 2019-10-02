package com.training.lab1;

class ArrayUtils {

    private static final View view = new View();

    static void printPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }

    static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int x = 0; x < matrix.length / 2; x++) {
            for (int y = x; y < matrix.length - x - 1; y++) {
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][n - 1 - x];
                matrix[y][n - 1 - x] = matrix[n - 1 - x][n - 1 - y];
                matrix[n - 1 - x][n - 1 - y] = matrix[n - 1 - y][x];
                matrix[n - 1 - y][x] = temp;
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        System.out.print("\nОбернена матриця:\n");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}