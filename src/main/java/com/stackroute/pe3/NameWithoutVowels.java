/*
* Write a program to set up an array of places, Loop round and remove the vowels.
 * Display the new words in console
 Input:
    India
    United States
    Germany
     Egypt
     czechoslovakia

Output:
    Place Name without Vowels:0 Ind
    Place Name without Vowels:1 Untd Stts
    Place Name without Vowels:2 Grmny
    Place Name without Vowels:3 Egypt
    Place Name without Vowels:4 czchslvk

* */
package com.stackroute.pe3;

import java.util.Scanner;

public class NameWithoutVowels {
    public  String nameWithoutVowels(String name){

        Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
        String [] names = name.split(",");
        String result = "";
        for(int i=0;i<size;i++){
            names[i]=names[i];
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<names[i].length();j++){
                char ch  = names[i].charAt(j);
                if((ch!='a'&&ch!='A'&&ch!='e'&&ch!='E'&&ch!='o'&&ch!='O'
                        &&ch!='u'&&ch!='U'&& ch!='i'&&ch!='I' )|| j==0){
                    result+=(ch);
                }
            }
            result+="\n";
        }
        return result;
    }
}
