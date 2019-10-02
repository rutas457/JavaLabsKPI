package com.training.lab1;

import java.util.Scanner;

public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processInput() {
        Scanner sc = new Scanner(System.in);
        rotateMatrixCounterClockwise(sc);
        createPyramid(sc);
    }

    private void createPyramid(Scanner sc) {
        int height = inputIntValueWithScanner(sc);
        ArrayUtils.printPyramid(height);
    }

    private void rotateMatrixCounterClockwise(Scanner sc) {
        int[][] array = inputMatrix(sc);
        ArrayUtils.rotateMatrix(array);
    }


    private int inputIntValueWithScanner(Scanner scanner) {
        String res;
        view.printStringInput(Messages.INPUT_PYRAMID_HEIGHT);
        while (!(scanner.hasNext() &&
                (res = scanner.next()).matches("[0-9]"))) {
            view.printWrongStringInput(Messages.INPUT_PYRAMID_HEIGHT);
            view.printMessage(" ");
        }
        return Integer.parseInt(res);
    }

    private int[][] inputMatrix(Scanner sc) {
        System.out.print("Введіть розмірність квадратної матриці:");
        int rows = sc.nextInt();

        System.out.println("Введіть елементи массиву");

        int[][] twoD = new int[rows][rows];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nВведений массив: \n");
        for (int[] x : twoD) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        return twoD;
    }
}

