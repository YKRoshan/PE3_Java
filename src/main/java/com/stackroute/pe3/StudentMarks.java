/*
 * Create a class called StudentMarks, which prompts user for the number of students,
 * reads it from the keyboard, and saves it in an int variable called numOfStudents.
 * It then prompts user for the grades of each of the students and saves them in an
 * int array called stuGrades. Your program shall check that the grade is between 0 and
 * 100 else has to trow an error message.
 * */
package com.stackroute.pe3;

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
}
