package com.company;

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
//    public static void main(String []args){
//        int size;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the total numbers of names: ");
//        size = sc.nextInt();
//        String [] names = new String[size];
//        System.out.println("Enter the name: ");
//        sc.nextLine();
//        for(int i=0;i<size;i++){
//            String temp = sc.nextLine();
//            names[i]=temp;
//        }
//        for(int i=0;i<size;i++){
//            System.out.print("Place Name without Vowels:"+i+" ");
//            for(int j=0;j<names[i].length();j++){
//                char ch  = names[i].charAt(j);
//                if((ch!='a'&&ch!='A'&&ch!='e'&&ch!='E'&&ch!='o'&&ch!='O'
//                        &&ch!='u'&&ch!='U'&& ch!='i'&&ch!='I' )|| j==0){
//                    System.out.print(ch);
//                }
//            }
//            System.out.println();
//        }
//    }
}
