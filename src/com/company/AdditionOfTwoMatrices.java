package com.company;

import java.util.Scanner;

public class AdditionOfTwoMatrices {
    public float[][] additionOfTwoMatrices(int row, int col) {
        Scanner sc = new Scanner(System.in);
        float[][] matrix1 = new float[row][col];
        float[][] matrix2 = new float[row][col];
        float[][] matrix3 = new float[row][col];
        Exception exception = new Exception("Not a valid input.");
        //System.out.println("Input elements of first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                try {
                    if (sc.hasNextFloat()) {
                        matrix1[i][j] = sc.nextFloat();
                    } else {
                        throw exception;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            }
        }
        //System.out.println("Input elements of second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                try {
                    if (sc.hasNextFloat()) {
                        matrix2[i][j] = sc.nextFloat();
                    } else {
                        throw exception;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int row;
//        int col;
//        System.out.println("Enter the number of rows:");
//        row = sc.nextInt();
//        System.out.println("Enter the number of columns:");
//        col = sc.nextInt();
//        float [][] matrix1 = new float[row][col];
//        float [][] matrix2 = new float[row][col];
//        float [][] matrix3 = new float[row][col];
//        Exception exception = new Exception("Not a valid input.");
//        System.out.println("Input elements of first matrix: ");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++) {
//                try {
//                    if (sc.hasNextFloat()) {
//                        matrix1[i][j] = sc.nextFloat();
//                    } else {
//                        throw exception;
//                    }
//                }
//                catch (Exception e){
//                    System.out.println(e.getMessage());
//                    return;
//                }
//            }
//        }
//        System.out.println("Input elements of second matrix: ");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++) {
//                try {
//                    if (sc.hasNextFloat()) {
//                        matrix2[i][j] = sc.nextFloat();
//                    } else {
//                        throw exception;
//                    }
//                }
//                catch (Exception e){
//                    System.out.println(e.getMessage());
//                    return;
//                }
//            }
//        }
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//        for(int i=0;i<col;i++){
//            for(int j=0;j<row;j++){
//                System.out.print((int)(matrix3[j][i])+ " ");
//            }
//            System.out.println();
//        }
//    }
}
