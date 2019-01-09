package com.company;

import java.util.Scanner;

public class StudentMarks {

    public  float[][] studentMarks(int numOfStudents){

        Scanner sc = new Scanner(System.in);
        float [][] stuGrades= new float[numOfStudents][5];
        for(int i=0;i<numOfStudents;i++){
            int j=0;
            while (j<5) {
                try {
                    Exception e = new Exception("Not a valid grade.");
                    if(sc.hasNextFloat()){
                        float input = sc.nextFloat();
                        if(input<0 || input>100){
                            throw e;
                        }
                        stuGrades[i][j++]=input;
                    }else {
                        throw e;
                    }
                }
                catch (Exception e){
                    System.out.println(e.getMessage());

                    return null;
                }
            }
        }
        return stuGrades;
    }
//    public static void main(String[] args) {
//	// write your code here
//        int numOfStudents;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the total number of students: ");
//        numOfStudents = sc.nextInt();
//        float [][] stuGrades= new float[numOfStudents][5];
//        for(int i=0;i<numOfStudents;i++){
//            System.out.println("Enter the stuGrades of student "+(i+1)+" :");
//            int j=0;
//            while (j<5) {
//                try {
//                    Exception e = new Exception("Not a valid grade.");
//                    if(sc.hasNextFloat()){
//                        float input = sc.nextFloat();
//                        if(input<0 || input>100){
//                            throw e;
//                        }
//                        stuGrades[i][j++]=input;
//                    }else {
//                        throw e;
//                    }
//                }
//                catch (Exception e){
//                    System.out.println(e.getMessage());
//                    return;
//                }
//            }
//        }
//        for(int i=0;i<numOfStudents;i++){
//            for(int j=0;j<5;j++){
//                System.out.println(stuGrades[i][j]);
//            }
//        }

//    }
}
