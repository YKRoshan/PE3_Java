package com.company;

import java.util.Scanner;

public class CheckConsecutiveNumbers {
    public String checkConsecutiveNumbers(String line){
        String  [] numb = line.split(",");
        int [] numbers = new int[numb.length];
        for(int i=0;i<numb.length;i++){
            numbers[i]=new Integer(numb[i]);
        }

        if(numbers.length>2 && numbers[0]>numbers[1]) {
            int flag = 0;
            for (int i = 0; i < numb.length - 1; i++) {
                if (numbers[i] != numbers[i + 1]+1) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return("Consecutive numbers");
            } else {
                return("Non consecutive numbers.");
            }
        }
        else {
            return("Non consecutive numbers.");
        }

    }
//    public static void main(String []args){
//        String line;
//        System.out.println("Enter the numbers: ");
//
//        Scanner sc = new Scanner(System.in);
//        line=sc.nextLine();
//        String  [] numb = line.split(",");
//        int [] numbers = new int[numb.length];
//        for(int i=0;i<numb.length;i++){
//            numbers[i]=new Integer(numb[i]);
//        }
//
//        if(numbers.length>2 && numbers[0]>numbers[1]) {
//            int flag = 0;
//            for (int i = 0; i < numb.length - 1; i++) {
//                if (numbers[i] != numbers[i + 1]+1) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) {
//                System.out.println("Consecutive numbers");
//            } else {
//                System.out.println("Non consecutive numbers.");
//            }
//        }
//        else {
//            System.out.println("Non consecutive numbers.");
//        }
//
//
//    }
}
