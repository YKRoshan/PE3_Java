/* Write a program to find out if a series of 7 digits are consecutive numbers.
 To make this easier, assume the digits are a string and use split()
 Input: 98,96,95,94,93
 Output: 98,96,95,94,93 non consecutive numbers

 Input: 54,53,52,51,50,49,48
 Output : 54,53,52,51,50,49,48 are consecutive numbers

 Input: 1,2,3,4,5,6,6
 Output: 1,2,3,4,5,6,6 non consecutive numbers
*/
package com.stackroute.pe3;

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

}
